package com.jkguo.test.controller;

import com.jkguo.test.bean.AreaBean;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by jkguo on 2016/11/11.
 *
 * 地区接口类
 */
@Controller
@RequestMapping("area")
public class AreaController {

    /**
     * 获取省份列表
     *
     * @return
     */
    @ResponseBody
    @RequestMapping("getProvince")
    public List<AreaBean> getProvince(){
        List<AreaBean> provinces = new ArrayList<AreaBean>();
        AreaBean areaBean = new AreaBean();
        areaBean.setCode("0");
        areaBean.setName("北京");
        provinces.add(areaBean);
        return provinces;
    }
}
