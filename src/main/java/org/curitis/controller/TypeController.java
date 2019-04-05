package org.curitis.controller;

import com.github.pagehelper.PageInfo;
import org.curitis.bean.LayuiResult;
import org.curitis.service.TypeService;
import org.curitis.to.Type;
import org.curitis.util.ResultUtil;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

@Controller
@RequestMapping("/type")
public class TypeController {

    @Resource
    private TypeService typeService;

    @RequestMapping("/")
    public String index(){
        return "type/index";
    }

    @RequestMapping("/list")
    @ResponseBody
    public LayuiResult list(
            @RequestParam(value = "page",defaultValue = "1") Integer pageNum,
            @RequestParam(value = "limit",defaultValue = "10")Integer pageSize
    ){
        PageInfo<Type> pages = typeService.getTypePage(pageNum, pageSize);
        return ResultUtil.getLayUIPageResult(pages);
    }
}
