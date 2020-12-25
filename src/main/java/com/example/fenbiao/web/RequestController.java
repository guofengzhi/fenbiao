package com.example.fenbiao.web;

import com.example.fenbiao.service.FenBiaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 控制层
 *
 * @author: guofengzhi
 * @date: 2020/12/21 13:54
 * @version: 1.0
 */
@Controller
@RequestMapping("fenbiao")
public class RequestController {

    private final FenBiaoService fenBiaoService;

    public RequestController(FenBiaoService fenBiaoService) {
        this.fenBiaoService = fenBiaoService;
    }

    @RequestMapping("index")
    @ResponseBody
    public String index() {
        return "index";
    }

    @RequestMapping("getName")
    @ResponseBody
    public String getName(Long id) {
        return fenBiaoService.getName(id);
    }

    @RequestMapping("save")
    @ResponseBody
    public String save(String name, Integer sex) {
        fenBiaoService.save(name, sex);
        return "success";
    }
}
