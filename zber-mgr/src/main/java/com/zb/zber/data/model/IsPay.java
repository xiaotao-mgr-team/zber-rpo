package com.zb.zber.data.model;

import com.thoughtworks.xstream.annotations.XStreamAlias;

/**
 * Created by cuixt on 2018/8/10.
 */
public class IsPay {
    @XStreamAlias("id")
    private String id;
    @XStreamAlias("name")
    private String name;

    public String getId()
    {
        return this.id;
    }

    public void setId(String id)
    {
        this.id = id;
    }

    public String getName()
    {
        return this.name;
    }

    public void setName(String name)
    {
        this.name = name;
    }
}
