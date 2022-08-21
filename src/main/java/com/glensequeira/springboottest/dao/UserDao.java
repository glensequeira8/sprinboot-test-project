package com.glensequeira.springboottest.dao;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity

public class UserDao {
    @Id    
    private long userId;
    private String userName;
    private String password;
    private String email;
}
