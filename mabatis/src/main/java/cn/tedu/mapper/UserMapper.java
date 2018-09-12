package cn.tedu.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Insert;

import cn.tedu.pojo.User;

public interface UserMapper {

	List<User> find();
	
	@Insert("insert user set ")
	void insert(User user);

}
