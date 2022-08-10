package icu.insomniac.dao;

import icu.insomniac.main.UserBank;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

public interface UserBankDao {
    @Update("update user_bank set balance = balance + #{amount} where username = #{username}")
    void inMoney(@Param("username") String username, @Param("amount") int amount);

    @Update("update user_bank set balance = balance - #{amount} where username = #{username}")
    void outMoney(@Param("username") String username, @Param("amount") int amount);

    @Select("select username, balance from user_bank where username = #{username}")
    UserBank selectByUsername(@Param("username") String username);

    @Select("select username, password, balance from user_bank where username = #{username}")
    UserBank selectByCondition(@Param("username") String username, @Param("password") String password);

    @Insert("insert into user_bank(username, password, balance) values(#{username}, #{password}, #{money})")
    void newAccount(@Param("username") String username, @Param("password") String password, @Param("money") int money);
}
