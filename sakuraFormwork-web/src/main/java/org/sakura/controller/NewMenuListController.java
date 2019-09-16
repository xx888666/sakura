package org.sakura.controller;


import org.sakura.pojo.NewMenu;
import org.sakura.pojo.NewMenuList;
import org.sakura.service.NewMenuListService;
import org.sakura.vo.SysResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("newMenuList")
public class NewMenuListController {


    @Autowired
    private NewMenuListService newMenuListService;


    @RequestMapping("/findAllMenuList")
    @ResponseBody
    public SysResult findAllMenuList() {

        List<NewMenuList> list = newMenuListService.findAllMenuList();
        return new SysResult(list);
    }

    @RequestMapping("/saveNewMenuList")
    @ResponseBody
    public SysResult saveNewMenuList(NewMenuList newMenuList) {

        newMenuListService.saveNewMenuList(newMenuList);
        return SysResult.success();

    }
}
