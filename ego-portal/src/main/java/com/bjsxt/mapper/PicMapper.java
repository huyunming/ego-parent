package com.bjsxt.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import com.bjsxt.pojo.Pic;

public interface PicMapper {
	@Select("select * from pic")
	List<Pic> selAll();
}
