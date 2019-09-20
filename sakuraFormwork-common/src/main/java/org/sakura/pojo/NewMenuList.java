package org.sakura.pojo;


import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
@TableName("tb_newmenu_list")
public class NewMenuList {
    /**
     * 用户登录之后
     * 每当用户添加一个图片和配套的文字, 就在数据库中生成一条记录
     * 前端页面遍历数据库, 数据库中有一条记录, 前端就显示对应的图片和文字
     */
   // @TableId
    private String menuId;
    //private String userId;
    private String image;   //图片, 数据库中保存的是图片的路径
    private String title;   //图片下面的标题文字
    private String text;    //标题文字下面的文字

}
