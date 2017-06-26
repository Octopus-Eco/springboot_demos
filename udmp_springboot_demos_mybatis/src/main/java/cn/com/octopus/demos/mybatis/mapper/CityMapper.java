package cn.com.octopus.demos.mybatis.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import cn.com.octopus.demos.mybatis.domain.City;

/**
   *	@author  liang
   *	@since 2017年6月27日
**/
@Mapper
public interface CityMapper {
	@Select("select * from city where state = #{state}")
	City findByState(@Param("state") String state);
}
