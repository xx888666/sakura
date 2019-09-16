package org.sakura.service;

import org.sakura.pojo.NewMenu;
import org.sakura.vo.SysResult;

import java.util.List;

public interface NewMenuService {

    List<NewMenu> findAllMenu();


    void saveNewMenu(NewMenu newMenu);
}
