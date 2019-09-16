package org.sakura.controller;


import org.sakura.pojo.NewMenu;
import org.sakura.service.NewMenuService;
import org.sakura.vo.SysResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("newMenu")
public class NewMenuController {


    @Autowired
    private NewMenuService newMenuService;


    @RequestMapping("/findAllMenu")
    @ResponseBody
    public SysResult findAllMenu() {

        List<NewMenu> list = newMenuService.findAllMenu();

        return new SysResult(list);

    }


    @RequestMapping("/saveNewMenu")
    @ResponseBody
    public SysResult saveNewMenu(NewMenu newMenu) {

        newMenuService.saveNewMenu(newMenu);
        return SysResult.success();

    }



}
