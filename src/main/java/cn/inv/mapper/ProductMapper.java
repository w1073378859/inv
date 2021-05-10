package cn.inv.mapper;

import cn.inv.pojo.Product;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @Package: cn.inv.mapper
 * @Description:商品
 * @Author Wh
 * @Create 2021年05月07日 10时30分57秒
 */
@Mapper
@Repository
public interface ProductMapper {

    /**
     * @Author: W
     * @Date: 2021年05月127日 10时05分51秒
     * @Description: 商品列表

     * @return java.util.List<cn.inv.pojo.Product>
     **/
    List<Product> getProList();

    /**
     * @Author: W
     * @Date: 2021年05月127日 13时05分44秒
     * @Description: 修改商品内容
     * @param product
     * @return java.lang.Integer
     **/
    Integer updatePro(Product product);

    /**
     * @Author: W
     * @Date: 2021年05月127日 13时05分44秒
     * @Description: 按商品编号查询商品数量
     * @param id
     * @return java.lang.Integer
     **/
    Product getProNum(@Param("id")Integer id);
}
