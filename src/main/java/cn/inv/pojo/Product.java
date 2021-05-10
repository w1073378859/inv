package cn.inv.pojo;

import lombok.Data;

/**  
* @Package: cn.ins.pojo
* @Description: ${description}
* @Author Wh
* @Create 2021年04月06日 14时27分28秒
*/
@Data
public class Product {
    /**
    * 商品id
    */
    private Integer id;

    /**
    * 商品名称
    */
    private String productname;

    /**
    * 库存量
    */
    private Integer quantity;
}