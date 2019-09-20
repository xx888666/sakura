package org.sakura.controller;


import org.sakura.pojo.NewMenuList;
import org.sakura.service.NewMenuListService;
import org.sakura.vo.SysResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.io.*;
import java.util.HashSet;
import java.util.List;

@Controller
@RequestMapping("newMenuList/")
public class NewMenuListController {


    @Autowired
    private NewMenuListService newMenuListService;

    //根据menuId去数据库查询list的图片和文字
    @RequestMapping("/findMenuListDetailsByMenuId")
    @ResponseBody
    public SysResult findMenuListDetailsByMenuId(String menuId) {

        List<NewMenuList> list = newMenuListService.findAllMenuListDetails(menuId);
        return new SysResult(list);
    }

    @RequestMapping("/saveNewMenuList")
    @ResponseBody
    public SysResult saveNewMenuList(NewMenuList newMenuList) {

        newMenuListService.saveNewMenuList(newMenuList);
        return SysResult.success();

    }


    //前台传过来一个网页字符串, 后台将这个字符串另存到一个html页面
    @RequestMapping("/saveMenuList")
    @ResponseBody
    public SysResult saveMenuList(String menuList) throws IOException {

        FileWriter file = new FileWriter("sakuraFormwork-web/src/main/resources/templates/pages/test123.html");
        BufferedWriter bw = new BufferedWriter(file);
        bw.write(menuList);

        bw.close();
        file.close();

        return SysResult.success();

        HashSet
    }
}
