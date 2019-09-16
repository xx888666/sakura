package org.sakura.serviceImpl;

import org.sakura.exception.ServiceException;
import org.sakura.mapper.NewMenuMapper;
import org.sakura.pojo.NewMenu;
import org.sakura.service.NewMenuService;
import org.sakura.vo.SysResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class NewMenuServiceImpl implements NewMenuService {

    @Autowired
    private NewMenuMapper newMenuMapper;

    @Override
    public List<NewMenu> findAllMenu() {


        List<NewMenu> listMenu = newMenuMapper.selectList(null);
        return listMenu;
    }



    @Override
    public void saveNewMenu(NewMenu newMenu) {


        int row = newMenuMapper.insert(newMenu);

        if (row == 0) {

            throw new ServiceException("添加失败!!!");
        }

    }
}
