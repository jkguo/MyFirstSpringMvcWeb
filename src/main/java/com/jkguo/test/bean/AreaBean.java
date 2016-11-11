package com.jkguo.test.bean;

/**
 * Created by jkguo on 2016/11/11.
 *
 * 地区基础类
 */
public class AreaBean {
    private String code;//地区码
    private String name;//地区名

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "AreaBean{" +
                "code='" + code + '\'' +
                ", name='" + name + '\'' +
                '}';
    }

}
