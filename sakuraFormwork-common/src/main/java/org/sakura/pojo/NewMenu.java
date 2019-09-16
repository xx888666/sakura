package org.sakura.pojo;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;


/**
 * 新建菜单
 * 菜单名
 * 菜单类型(大图还是小图)
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
@TableName("tb_NewMenu")
public class NewMenu implements Serializable {
    private static final long serialVersionUID = 5219561045938500862L;

    private int menuId;
    private String menuName;
    private String menuModel;   //1大图   2小图
}
