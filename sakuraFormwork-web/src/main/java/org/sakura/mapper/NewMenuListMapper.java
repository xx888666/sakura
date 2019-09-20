package org.sakura.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.sakura.pojo.NewMenuList;

import java.util.List;

@Mapper
public interface NewMenuListMapper extends BaseMapper<NewMenuList> {


    List<NewMenuList> findAllMenuListDetails(String menuId);
}
