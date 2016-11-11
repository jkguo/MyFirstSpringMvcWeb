package com.jkguo.test.controller;

import com.jkguo.test.enums.RespResultEnum;
import com.jkguo.test.resp.BaseResp;
import com.jkguo.test.resp.bean.AreaBean;
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
    public BaseResp getProvince(){
        BaseResp resp = new BaseResp();
        try{
            List<AreaBean> provinces = new ArrayList<AreaBean>();
            AreaBean areaBean = new AreaBean();
            areaBean.setCode("0");
            areaBean.setName("北京");
            provinces.add(areaBean);

            resp.setData(provinces);
            resp.setResult(RespResultEnum.RESP_RESUlT_SUCCESS);
            return resp;
        }catch (Exception e){
            //请求失败
        }
        resp.setResult(RespResultEnum.RESP_RESUlT_FAILED);
        return resp;
    }
}
