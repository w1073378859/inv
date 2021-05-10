package cn.inv.service;

import cn.inv.pojo.Product;


import java.util.List;

/**
 * @Package: cn.inv.service
 * @Description:
 * @Author Wh
 * @Create 2021年05月07日 10时34分07秒
 */
public interface ProductService {

    List<Product> getProList();

    boolean updatePro(Product product);

    Product getProNum(Integer id);
}
