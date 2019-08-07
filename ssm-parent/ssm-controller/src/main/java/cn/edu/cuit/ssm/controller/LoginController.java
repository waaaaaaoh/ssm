package cn.edu.cuit.ssm.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import cn.edu.cuit.ssm.entity.User;
import cn.edu.cuit.ssm.service.UserService;

@Controller
public class LoginController {
	@Autowired
	private UserService userService;

	@RequestMapping("/toLogin")
	public String toLogin() {
		return "login";
	}
    @RequestMapping("/login")
	public String login(@RequestParam String name, @RequestParam String pass,Model model,@RequestParam  String validatecode,HttpSession session) {
		// 到数据库比对
        boolean ret=userService.login(name,pass);
      //登录之前首先判断一下用户输入的验证码是否正确
        String verifyCodeExpected = (String)session.getAttribute(com.google.code.kaptcha.Constants.KAPTCHA_SESSION_KEY);
        //这里相当于 request.getParameter("verifyCodeActual");
        //String verifyCodeActual = HttpServletRequestUtil.getString(request, "verifyCodeActual");
        String verifyCodeActual = validatecode;

        if (ret) {
        	if(verifyCodeActual == null || !verifyCodeActual.equals(verifyCodeExpected)){
             	model.addAttribute("msg1","验证码错误");
             	model.addAttribute("name", name);
             	return "login";
             }else {
            	 return "redirect:goodsList";
             }
			
		} else {
			
            model.addAttribute("msg", "用户名或密码错误");
            model.addAttribute("name", name);
			return "login";
		}

	}
    
    @RequestMapping("/toregister")
    public String toregister() {
    	return "register";
    }
    @RequestMapping("/register")
    public String register(@RequestParam String name,@RequestParam String pass,@RequestParam String address,@RequestParam String phone,Model model) {
    	System.out.println("register已经运行");
    	User user =  new User(name, pass, address, phone);
    	System.out.println(user.toString());
    	boolean ret =userService.register(user);
    	if (ret) {
			return "login";
		}else {
			 model.addAttribute("msg", "用户名或者密码错误");
			 return "register";
		}
    	
    }
    
    
}
