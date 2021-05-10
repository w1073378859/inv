package cn.inv.service;

import cn.inv.pojo.Sale;

import java.util.List;
import java.util.Map;

/**
 * @Package: cn.inv.service
 * @Description:
 * @Author Wh
 * @Create 2021年05月06日 16时52分25秒
 */
public interface SaleService {

    List<Map<String,Object>> getSalProList(Integer num);

    boolean addSale(Sale sale);
}
