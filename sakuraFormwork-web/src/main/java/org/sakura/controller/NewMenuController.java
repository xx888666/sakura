package org.sakura.controller;


import org.sakura.pojo.NewMenu;
import org.sakura.service.NewMenuService;
import org.sakura.vo.SysResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
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
    public SysResult saveNewMenu(NewMenu newMenu) throws IOException {

        newMenuService.saveNewMenu(newMenu);

        //右侧显示的初始网页信息
        String page = "<input type=\"file\" value=\"上传图片\">\n" +
                "\n" +
                "\n" +
                "        <div>\n" +
                "            <button id=\"lingcunwei\" onclick=\"load()\">保存本地</button>\n" +
                "\n" +
                "        </div>\n" +
                "\n" +
                "        <!--所有的图片和配套的文字都在这个标签中显示-->\n" +
                "        <section class=\"featured-items\">\n" +
                "\n" +
                "            <!-- <div class=\"item\">\n" +
                "                <div class=\"mobile-hidden\">\n" +
                "                    <a href=\"https://www.starbucks.com.cn/menu/#lto-items\"\n" +
                "                       class=\"block relative\"> <img src=\"./index_files/banner-2.jpg\"\n" +
                "                                                    class=\"img\">\n" +
                "                    </a>\n" +
                "                    <div class=\"description text wrapper\">\n" +
                "                        <h2>唤醒新一天</h2>\n" +
                "                        <p>有趣创意的DIY早餐，香酥吐司、浓郁抹酱、趣味调料的随心搭配，用每天不重样的选择唤醒繁忙的早晨，扫走初秋的倦意。</p>\n" +
                "                    </div>\n" +
                "                </div>\n" +
                "                <div class=\"show-mobile tablet-hidden\">\n" +
                "                    <a href=\"https://www.starbucks.com.cn/menu/#lto-items\"\n" +
                "                       class=\"block relative\"> <img\n" +
                "                            src=\"./index_files/banner-2-mobile.jpg\" class=\"img\">\n" +
                "                    </a>\n" +
                "                    <div class=\"description text wrapper collapsed\">\n" +
                "                        <h2>唤醒新一天</h2>\n" +
                "                        <div class=\"body\">\n" +
                "                            <p>有趣创意的DIY早餐，香酥吐司、浓郁抹酱、趣味调料的随心搭配，用每天不重样的选择唤醒繁忙的早晨，扫走初秋的倦意。</p>\n" +
                "                        </div>\n" +
                "                        <span class=\"icon\"></span>\n" +
                "                    </div>\n" +
                "                </div>\n" +
                "            </div>  -->\n" +
                "\n" +
                "        </section>";

        //将模板代码写入html文件, html文件的名是新建菜单的menuId
        FileWriter file = null;
            file = new FileWriter("sakuraFormwork-web/src/main/resources/templates/pages/" + newMenu.getMenuId() + ".html");
            BufferedWriter bw = new BufferedWriter(file);
            bw.write(page);

        bw.close();
        file.close();
        return SysResult.success();

    }



}
