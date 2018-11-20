package com.zb.zber.data.model;

import com.zb.zber.common.core.persistence.entity.EntityObject;

/**
 * Created by cuixt on 2018/8/2.
 */
public class ExpressType extends EntityObject {
    private static final long serialVersionUID = -5532011693604574812L;
    private String name;
    private String introduce;

    public String getName()
    {
        return this.name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getIntroduce()
    {
        return this.introduce;
    }

    public void setIntroduce(String introduce)
    {
        this.introduce = introduce;
    }
}
