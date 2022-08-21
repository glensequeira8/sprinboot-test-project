package com.glensequeira.springboottest.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.glensequeira.springboottest.dao.UserDao;
@Repository
public interface UserRepo extends JpaRepository<UserDao,Long>{

    UserDao findByUserName(String username);
    
}
