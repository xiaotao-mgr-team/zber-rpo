package com.zb.zber.data.controller;

import com.zb.zber.common.core.exception.BusinessException;
import com.zb.zber.common.core.persistence.db.pagination.PaginationOrdersList;
import com.zb.zber.common.utils.ParamCheckUtils;
import com.zb.zber.common.web.comp.ace.ResponseMessage;
import com.zb.zber.common.web.comp.ace.i18n.MessageResolver;
import com.zb.zber.data.model.StockRecord;
import com.zb.zber.data.service.IStockRecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

@RequestMapping({"/bgr/stockRecord"})
@Controller
public class StockRecordControllerApi {
    @Autowired
    private IStockRecordService stockRecordService;

    @RequestMapping(value={"/list-page"}, produces={"application/json"}, method={org.springframework.web.bind.annotation.RequestMethod.GET})
    @ResponseBody
    public ResponseMessage listStockPage(StockRecord stock, PaginationOrdersList<StockRecord> page, HttpServletRequest request)
    {
        page = stockRecordService.listStockDaoRecord(page, stock);
        return ResponseMessage.success(page);
    }

    @RequestMapping(value={"/add"}, produces={"application/json"})
    @ResponseBody
    public ResponseMessage addStock(StockRecord stock, HttpServletRequest request)
    {
        try
        {
            ParamCheckUtils.notAllNull(new Object[] { stock.getProductId() }, new String[] { "ProductId" });
            stockRecordService.insert(stock);
            return ResponseMessage.success();
        }
        catch (BusinessException e)
        {
            return ResponseMessage.error((String)e.getValue(),
                    MessageResolver.getMessage(request, (String)e.getValue(), e.getPlaceholders()));
        }
    }
}
