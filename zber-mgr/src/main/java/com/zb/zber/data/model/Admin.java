package com.zb.zber.data.model;
import com.zb.zber.common.core.persistence.entity.EntityObject;

/**
 * 登陆使用
 */
public class Admin extends EntityObject {

    private static final long serialVersionUID = 1695595289893476767L;

    private String password;
    private String name;
    private String nick;
    private String remember;

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = (password == null ? null : password.trim());
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = (name == null ? null : name.trim());
    }

    public String getNick() {
        return this.nick;
    }

    public void setNick(String nick) {
        this.nick = (nick == null ? null : nick.trim());
    }

    public String getRemember() {
        return remember;
    }

    public void setRemember(String remember) {
        this.remember = remember;
    }
}