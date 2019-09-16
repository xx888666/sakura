package org.sakura.serviceImpl;

import org.sakura.exception.ServiceException;
import org.sakura.mapper.NewMenuListMapper;
import org.sakura.pojo.NewMenuList;
import org.sakura.service.NewMenuListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NewMenuListServiceImpl implements NewMenuListService{

    @Autowired
    private NewMenuListMapper newMenuListMapper;


    @Override
    public List<NewMenuList> findAllMenuList() {

        List<NewMenuList> list = newMenuListMapper.selectList(null);
        return list;
    }

    @Override
    public void saveNewMenuList(NewMenuList newMenuList) {

        int row = newMenuListMapper.insert(newMenuList);
        if (row == 0) {

            throw new ServiceException("添加失败!!!");
        }
    }
}
