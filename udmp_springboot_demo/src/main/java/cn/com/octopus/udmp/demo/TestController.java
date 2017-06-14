package cn.com.octopus.udmp.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
   *	@author  za-liuliang
   *	@since 2017年6月14日
**/
@Controller
public class TestController {
	
	@RequestMapping("/")
	public String hello(){
		System.out.println("hello,welcome");
		return "welcome";
	}

}
