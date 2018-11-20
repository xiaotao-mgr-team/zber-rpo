package com.zb.zber.common.web.comp.ace.select2;

import java.io.Serializable;
import java.util.List;

/**
 * select2响应对象
 * 
 * @date 2016年7月27日 下午5:27:25
 * @version V1.1.0
 */
public class Select2AjaxResponse implements Serializable
{
    /**
     * 注释内容
     */
    private static final long serialVersionUID = 1L;
    private Integer total_count;
    private boolean incomplete_results;
    private List<?> items;
    /**
     * @return 返回 total_count
     */
    public Integer getTotal_count()
    {
        return total_count;
    }
    /**
     */
    public void setTotal_count(Integer total_count)
    {
        this.total_count = total_count;
    }
    /**
     * @return 返回 incomplete_results
     */
    public boolean isIncomplete_results()
    {
        return incomplete_results;
    }
    /**
     */
    public void setIncomplete_results(boolean incomplete_results)
    {
        this.incomplete_results = incomplete_results;
    }
    /**
     * @return 返回 items
     */
    public List<?> getItems()
    {
        return items;
    }
    /**
     */
    public void setItems(List<?> items)
    {
        this.items = items;
    }
    
    
    
}
