package cn.inv.service.impl;

import cn.inv.mapper.SaleMapper;
import cn.inv.pojo.Sale;
import cn.inv.service.SaleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * @Package: cn.inv.service.impl
 * @Description:
 * @Author Wh
 * @Create 2021年05月06日 16时53分08秒
 */
@Service
public class SaleServiceImpl implements SaleService {

    @Autowired
    SaleMapper saleMapper;

    @Override
    public List<Map<String, Object>> getSalProList(Integer num) {
        return saleMapper.getSalProList(num);
    }

    @Override
    public boolean addSale(Sale sale) {
        return saleMapper.addSale(sale)>0?true:false;
    }
}
