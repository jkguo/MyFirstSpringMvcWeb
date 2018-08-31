package com.jkguo.test.resp;

import java.util.List;

public class BaseListResp extends BaseResp {
    private List data;

    @Override
    public List getData() {
        return data;
    }

    public void setData(List data) {
        this.data = data;
    }
}
