package cn.com.octopus.demos.mybatis;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

import cn.com.octopus.demos.mybatis.mapper.CityMapper;

/**
   *	@author  liang
   *	@since 2017年6月27日
**/
@SpringBootApplication
public class Application implements CommandLineRunner{
	public static void main(String[] args) {
		new SpringApplicationBuilder(Application.class).web(false).run(args);
	}
	
	@Autowired
	private  CityMapper cityMapper;



	@Override
	public void run(String... args) throws Exception {
		System.out.println(this.cityMapper.findByState("CA"));
	}
}
