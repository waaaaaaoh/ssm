package cn.edu.cuit.ssm.controller;

import java.io.UnsupportedEncodingException;

import javax.jws.WebParam.Mode;

import org.apache.dubbo.remoting.exchange.Request;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.github.pagehelper.PageInfo;

import cn.edu.cuit.ssm.entity.Goods;
import cn.edu.cuit.ssm.service.GoodsService;

@Controller
public class GoodsController {
	@Autowired
	private GoodsService goodsService;
    @RequestMapping("/goodsList")
	public String list(Model model,@RequestParam(required=false,defaultValue="1") int pageNum) {
		PageInfo<Goods> ls = goodsService.findAll(pageNum,3);
		model.addAttribute("ls", ls);
		return "goodsList";
	}
    
    //按照类型查找
    @RequestMapping("/goodstypeList")
	public String list(Model model,@RequestParam(required=false,defaultValue="1") int pageNum,@RequestParam("type") int type) {
		System.out.println(type);
    	PageInfo<Goods> ls = goodsService.findAllbytype(pageNum,3,type);
    	model.addAttribute("ss",type);
		model.addAttribute("ls", ls);
		return "goodstypeList";
	}
    
    //按照页面传值ID进行商品删除
    @RequestMapping("/delete")
    public String delete(Model model,@RequestParam("id") int id) {
    	System.out.println("传过来的id值为"+id);
    	goodsService.delete(id);
    	
    	return "redirect:goodsList";
    }
    //跳转增加页面
    @RequestMapping("/toadd")
    public String toadd(){
    	return "add";
    }
    
    //增加商品
    @RequestMapping("/add")
    public String add(Model model,@RequestParam String name,@RequestParam Double price,@RequestParam int num,@RequestParam int type) {
    	String img = new String("pro15.png");
    	goodsService.insert(name,price,num,img,type);
    	return "redirect:goodsList";
    }
    
    //更新商品
    @RequestMapping("/toUpdate")
	public String toUpdate() {
    	
		return "updateGoods";
	}
   @RequestMapping("/update")
   public String update(@RequestParam int id,@RequestParam String name, @RequestParam double price,@RequestParam int num,Model model) {
	   Goods goods=new Goods(id,name,price,num);
	   System.out.println(id+name+price+num);
	int ret =goodsService.update(id,name,price,num); 
	 if (ret>0) {
			return "redirect:goodsList"; //重定向到goodsList
		} else {
        model.addAttribute("msg", "ahh cijiba");
			return "goodsUpdate";
		}
   
   }
   //按名称查询
   //取值时读取不到图片 页面无法显示 输出后goods.img为空
   @RequestMapping("/goodsnameList")
   public String search(@RequestParam("name") String name,Model model,@RequestParam(required=false,defaultValue="1") int pageNum) {
	   String str = null;
	try {
		//页面获取中文后转码，否则乱码
		str = new String(name.getBytes("ISO-8859-1"),"UTF-8");
	} catch (UnsupportedEncodingException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} 
	    PageInfo<Goods> ls = goodsService.findbyname(pageNum,3,str);
		model.addAttribute("ls", ls);
		model.addAttribute("str",str);
		return "goodsnameList";
	  
	   
   }
    
}
