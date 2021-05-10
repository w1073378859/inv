package cn.inv.pojo;

import java.util.Date;
import lombok.Data;

/**
 * @Package: cn.ins.pojo
 * @Description: ${description}
 * @Author Wh
 * @Create 2021年04月06日 15时19分49秒
 */
@Data
public class Sale {
    /**
     * 记录id
     */
    private Integer id;

    /**
     * 销售单价
     */
    private Double price;

    /**
     * 数量
     */
    private Integer quantity;

    /**
     * 总价
     */
    private Double totalprice;

    /**
     * 销售日期
     */
    private Date saledate;

    /**
     * 销售员id
     */
    private Integer userid;

    /**
     * 商品id
     */
    private Integer productid;
}