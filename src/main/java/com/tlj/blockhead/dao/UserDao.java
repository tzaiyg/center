package com.tlj.blockhead.dao;

import com.tlj.blockhead.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface UserDao extends JpaRepository<User,String> {
    @Query(value = "select * from t_user where t_name=?1", nativeQuery = true)
    User findbyName(@Param("name") String name);
}
