package org.sakura.service;

import org.sakura.pojo.NewMenuList;

import java.util.List;

public interface NewMenuListService {


    List<NewMenuList> findAllMenuList();

    void saveNewMenuList(NewMenuList newMenuList);
}
