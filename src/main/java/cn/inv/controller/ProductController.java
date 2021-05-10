package cn.inv.controller;

import cn.inv.pojo.Product;
import cn.inv.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @Package: cn.inv.controller
 * @Description: 商品控制器
 * @Author Wh
 * @Create 2021年05月07日 10时35分14秒
 */
@Controller
public class ProductController {

    @Autowired
    ProductService productService;

    /**
     * @Author: W
     * @Date: 2021年05月127日 10时05分45秒
     * @Description: 添加商品页面

     * @return java.lang.String
     **/
    @RequestMapping("addSale")
    public String addSale(){

        return "addSale";
    }

    /**
     * @Author: W
     * @Date: 2021年05月127日 14时05分54秒
     * @Description: 获取商品列表

     * @return java.util.List<cn.inv.pojo.Product>
     **/
    @ResponseBody
    @RequestMapping("getProList")
    public List<Product> getProList(){

        return productService.getProList();
    }

    /**
     * @Author: W 
     * @Date: 2021年05月127日 14时05分22秒
     * @Description: 查看库存页面
    
     * @return java.lang.String
     **/
    @RequestMapping("getProNum")
    public String getProNumLink(){

        return "getProNum";
    }
    
    /**
     * @Author: W
     * @Date: 2021年05月127日 14时05分33秒
     * @Description: 获取商品数量

     * @return java.util.List<cn.inv.pojo.Product>
     **/
    @ResponseBody
    @RequestMapping("getPNums")
    public Product getProNum(Integer id){

        return productService.getProNum(id);
    }
}
