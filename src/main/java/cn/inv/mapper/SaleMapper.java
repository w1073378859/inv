package cn.inv.mapper;

import cn.inv.pojo.Sale;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

/**
 * @Package: cn.inv.mapper
 * @Description: 销量
 * @Author Wh
 * @Create 2021年05月06日 16时48分27秒
 */
@Mapper
@Repository
public interface SaleMapper {

    /**
     * @Author: W 
     * @Date: 2021年05月126日 16时05分31秒
     * @Description: 查询销售信息
     * @param num
     * @return java.util.List<java.util.Map<java.lang.String,java.lang.Object>>
     **/
    List<Map<String,Object>> getSalProList(@Param("num") Integer num);

    /**
     * @Author: W
     * @Date: 2021年05月127日 10时05分21秒
     * @Description: 添加销售
     * @param sale
     * @return java.lang.Integer
     **/
    Integer addSale(Sale sale);
}
