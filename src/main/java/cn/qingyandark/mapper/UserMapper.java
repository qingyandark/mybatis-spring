package cn.qingyandark.mapper;

import cn.qingyandark.pojo.User;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface UserMapper {
    @Select("select * from tb_mybatis")
    List<User> selectALL();
}
