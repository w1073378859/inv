package cn.inv.controller;

import cn.inv.pojo.Product;
import cn.inv.pojo.Sale;
import cn.inv.service.ProductService;
import cn.inv.service.SaleService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;
import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * @Package: cn.inv.controller
 * @Description:
 * @Author Wh
 * @Create 2021年05月06日 16时54分19秒
 */
@Controller
public class SaleController {

    @Autowired
    SaleService saleService;

    @Autowired
    ProductService productService;

    /**
     * @Author: W
     * @Date: 2021年05月127日 11时05分16秒
     * @Description: 销售列表页面
     * @param model
     * @return java.lang.String
     **/
    @RequestMapping("list")
    public String List(Model model){
        List<Map<String, Object>> salProList = saleService.getSalProList(0);
        model.addAttribute("sale",salProList);
        return "list";
    }


    /**
     * @Author: W
     * @Date: 2021年05月127日 11时05分24秒
     * @Description: 销售列表
     * @param num
     * @return java.util.List<java.util.Map<java.lang.String,java.lang.Object>>
     **/
    @ResponseBody
    @RequestMapping("getSaleProlist")
    public List<Map<String, Object>> getSaleProList(@RequestParam(value = "num",required = false,defaultValue = "0") Integer num){
        return saleService.getSalProList(num);
    }

    /**
     * @Author: W
     * @Date: 2021年05月127日 11时05分32秒
     * @Description: 保存销售
     * @param sale
     * @return boolean
     **/
    @ResponseBody
    @PostMapping("addSaleSave")
    public boolean addSaleSave(Sale sale){
        //销售

        sale.setSaledate(new Date());
        //添加销售商品
        boolean b = saleService.addSale(sale);
        if(b){
            //查询商品数量
            Product product = productService.getProNum(sale.getUserid());
            product.setId(sale.getUserid());
            product.setQuantity(product.getQuantity()-sale.getQuantity());
            //更新商品
            boolean b1 = productService.updatePro(product);
            if(b1){
                System.out.println("更新商品成功");
                return true;
            }
            System.out.println("更新商品失败");
            return false;
        }
        System.out.println("销售商品失败");
        return false;
    }
}
