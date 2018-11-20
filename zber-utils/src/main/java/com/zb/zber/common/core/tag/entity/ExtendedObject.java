package com.zb.zber.common.core.tag.entity;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import org.apache.commons.collections.CollectionUtils;

import java.util.Collection;
import java.util.List;
import java.util.Map;

/**
 * po的横向扩展
 * @author jiangxia
 * @date 2016年12月28日 下午3:48:39 
 * @version V1.1.0
 */
public class ExtendedObject {
    
    private List<SubTag> subTagList;  //后台具体po的标签值

    private Map<String, SubTag> subTagMap;  //为便于前台处理，后台将subTagList 转换为 subTagMap

    

    public List<SubTag> getSubTagList() {
        return subTagList;
    }

    public void setSubTagList(List<SubTag> subTagList) {
        this.subTagList = subTagList;
    }

    public Map<String, SubTag> getSubTagMap() {
        return subTagMap;
    }

    public void setSubTagMap(Map<String, SubTag> subTagMap) {
        this.subTagMap = subTagMap;
    }
    
  //后台返回给前台时， 将list转map，
    public void prepareReply()
    {
        if(!CollectionUtils.isEmpty(this.subTagList))
        {
            Map<String, SubTag> subTagMap = Maps.newHashMap();
            for(SubTag subTag:this.subTagList)
            {
                subTagMap.put(subTag.getTagId(), subTag);
            }
            this.setSubTagMap(subTagMap);
            this.setSubTagList(null);
        }
    }
    
    //前台传到后台时时， 将map转list，
    public void prepareRrocess()
    {
        if(this.subTagMap != null)
        {
            Collection<SubTag> subTagCol = this.subTagMap.values();
            if(!CollectionUtils.isEmpty(subTagCol))
            {
                List<SubTag> subTagList = Lists.newArrayList();
                subTagList.addAll(subTagCol);
                this.setSubTagList(subTagList);
            }
        }
        this.setSubTagMap(null);
    }
    
//    /**
//     * 创建之前检查参数，tagId和tagValue 不能为空
//     */
//    public boolean checkArgumentBeforeCreate()
//    {
//        if(CollectionUtils.isEmpty(this.subTagList))
//        {
//            return true;
//        }
//        for(SubTag subTag:this.subTagList)
//        {
//            if(StringUtilies.isNullOrEmpty(subTag.getTagId()) || StringUtilies.isNullOrEmpty(subTag.getTagValue()))
//            {
//                return false;
//            }
//        }
//        return true;
//    }
//
//    /**
//     * 修改之前检查参数，id和tagValue 不能为空
//     * @author jiangxia
//     * @throws BusinessException
//     */
//    public boolean checkArgumentBeforeUpdate()
//    {
//        if(CollectionUtils.isEmpty(this.subTagList))
//        {
//            return true;
//        }
//        for(SubTag subTag:this.subTagList)
//        {
//            if(StringUtilies.isNullOrEmpty(subTag.getId()) || StringUtilies.isNullOrEmpty(subTag.getTagValue()))
//            {
//                return false;
//            }
//        }
//        return true;
//    }
//
    public static void main(String[] args)
    {
        Map<String, SubTag> subTagMap = Maps.newHashMap();
          SubTag s = new SubTag();
          s.setTagId("001_001_001");
          s.setTagValue("question");
          subTagMap.put(s.getTagId(), s);
          
          s = new SubTag();
          s.setTagId("001_001_002");
          s.setTagValue("answer");
          subTagMap.put(s.getTagId(), s);
          
//          System.out.println(JacksonObjectMapper.toJsonString(subTagMap));
    }
}
