package icu.insomniac.dao;

import icu.insomniac.main.User;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

public interface UserDao {
    @Select("select username, password, nickname, gender from userinfo where username=#{username} and password=#{password}")
    User selectByCondition(@Param("username") String username, @Param("password") String password);

    @Select("select username, nickname, gender from userinfo where username=#{username}")
    User selectByUsername(@Param("username") String username);
}
