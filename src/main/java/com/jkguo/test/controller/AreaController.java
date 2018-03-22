package com.jkguo.test.controller;

import com.jkguo.test.resp.BaseResp;
import com.jkguo.test.resp.bean.AreaBean;
import com.jkguo.test.service.AreaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.*;

/**
 * Created by jkguo on 2016/11/11.
 * 地区接口类
 */
@Controller
@RequestMapping("area")
public class AreaController {

    @Autowired
    AreaService areaService;
    /**
     * 获取省份接口
     *
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "getProvince",method= RequestMethod.POST)
    public BaseResp getProvince(HttpServletRequest request,HttpServletResponse response) {
        response.setHeader("Access-Control-Allow-Origin", "*");
        BaseResp resp = new BaseResp();
        try {
            List<AreaBean> provinces = areaService.getProvinces();
            resp.setData(provinces);
            resp.setResult(BaseResp.RespResult.RESP_RESUlT_SUCCESS);
            return resp;
        } catch (Exception e) {
            //请求失败
            System.out.println("获取省份列表,请求失败:" + e);
        }
        resp.setResult(BaseResp.RespResult.RESP_RESUlT_FAILED);
        return resp;
    }

    /**
     * 获取城市接口
     *
    // * @param params 省份code
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "getCity")
    public BaseResp getCity(HttpServletResponse response, @RequestBody Map<String,Object> params) {
        response.setHeader("Access-Control-Allow-Origin", "*");
        BaseResp resp = new BaseResp();
        try {
            String provinceCode = (String) params.get("provinceCode");
            List<AreaBean> citys = areaService.getCitysByProvince(provinceCode);
            resp.setData(citys);
            resp.setResult(BaseResp.RespResult.RESP_RESUlT_SUCCESS);
            return resp;
        } catch (Exception e) {
            //请求失败
            System.out.println("获取城市列表,请求失败:" + e);
        }
        resp.setResult(BaseResp.RespResult.RESP_RESUlT_FAILED);
        return resp;
    }

    /**
     * 获取县级市
     * @param response
     * @param params
     * @return
     */
    @ResponseBody
    @RequestMapping("getCounty")
    public BaseResp getCounty(HttpServletResponse response, @RequestBody Map<String,Object> params){
        response.setHeader("Access-Control-Allow-Origin", "*");
        BaseResp resp = new BaseResp();
        try{
            String cityCode = (String) params.get("cityCode");
            List<AreaBean> countiesByCity = areaService.getCountiesByCity(cityCode);
            resp.setData(countiesByCity);
            resp.setResult(BaseResp.RespResult.RESP_RESUlT_SUCCESS);
            return resp;
        }catch (Exception e){
            //请求失败
            System.out.println("获取县级市列表,请求失败:" + e);
        }
        resp.setResult(BaseResp.RespResult.RESP_RESUlT_FAILED);
        return resp;
    }
}
