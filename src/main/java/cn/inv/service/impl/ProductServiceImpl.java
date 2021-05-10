package cn.inv.service.impl;

import cn.inv.mapper.ProductMapper;
import cn.inv.pojo.Product;
import cn.inv.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Package: cn.inv.service.impl
 * @Description:
 * @Author Wh
 * @Create 2021年05月07日 10时34分27秒
 */
@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    ProductMapper productMapper;

    @Override
    public List<Product> getProList() {
        return productMapper.getProList();
    }

    @Override
    public boolean updatePro(Product product) {
        return productMapper.updatePro(product)>0?true:false;
    }

    @Override
    public Product getProNum(Integer id) {
        return productMapper.getProNum(id);
    }

}
