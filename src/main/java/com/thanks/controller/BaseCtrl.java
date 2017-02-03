package com.thanks.controller;

import com.thanks.entity.Demo;
import com.thanks.entity.Response;
import com.thanks.service.DemoDao;
import com.thanks.utils.SomeMthods;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

@Controller
public class BaseCtrl {

    @Resource
    private DemoDao demoDao;

    @Autowired
    private HttpServletRequest request;

    @RequestMapping(value = {"/","/one"},method = RequestMethod.GET)
    public String index() {

        String url = request.getRequestURI();

        if (url.equals("/")) {

            return "index";

        } else {

            return url.substring(1, url.indexOf("."));

        }

    }

    @ResponseBody
    @RequestMapping(value = "/save")
    public Response saveItem() {

        String name = request.getParameter("name");
        String addr = request.getParameter("addr");

        Demo demo = new Demo();
        demo.setAddr(addr);
        demo.setName(name);

        Demo demo1 = demoDao.saveNewDemo(demo);

        return SomeMthods.response(demo1, 1);

    }


    @ResponseBody
    @RequestMapping("/loadDatas")
    public Response loadDatas() {

        Integer pageNo = Integer.parseInt(request.getParameter("pageNo"));
        Integer pageSize = Integer.parseInt(request.getParameter("pageSize"));

        return SomeMthods.response(demoDao.loadDatas(pageNo, pageSize), 1);
    }

}
