package org.sakura.serviceImpl;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import org.sakura.exception.ServiceException;
import org.sakura.mapper.NewMenuListMapper;
import org.sakura.mapper.NewMenuListMapper2;
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

        //List<NewMenuList> list = newMenuListMapper.selectList(null);
        return null;
    }

    @Override
    public void saveNewMenuList(NewMenuList newMenuList) {

        int row = newMenuListMapper.insert(newMenuList);
        if (row == 0) {

            throw new ServiceException("添加失败!!!");
        }
    }

    @Override
    public List<NewMenuList> findAllMenuListDetails(String menuId) {


        //ist<NewMenuList> list = newMenuListMapper2.findAllMenuListDetails(menuId);


        QueryWrapper<NewMenuList> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("menu_id", menuId);
        List<NewMenuList> list = newMenuListMapper.selectList(queryWrapper);
        return list;
    }
}
