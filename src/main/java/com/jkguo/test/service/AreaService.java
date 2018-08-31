package com.jkguo.test.service;

import com.jkguo.test.resp.bean.AreaBean;

import java.util.List;

public interface AreaService {

    /**
     * 获取省份数据
     *
     * @return
     */
    List<AreaBean> getProvinces();

    /**
     * 根据省份code获取城市数据
     *
     * @param provinceCode
     * @return
     */
    List<AreaBean> getCitysByProvince(String provinceCode);


    /**
     * 根据市ID获取县级市
     *
     * @param cityCode
     * @return
     */
    List<AreaBean> getCountiesByCity(String cityCode);
}
