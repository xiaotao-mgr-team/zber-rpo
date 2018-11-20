package com.zb.zber.data.model;

import com.zb.zber.common.core.persistence.entity.EntityObject;

/**
 * Created by cuixt on 2018/8/2.
 */
public class Owner  extends EntityObject {
    private static final long serialVersionUID = 7315570927330616973L;
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
