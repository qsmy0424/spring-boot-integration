package com.qsmy.integration.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author qsmy
 * @date 2019/11/4
 */
@Entity
@Table(name = "U_USER")
public class User {

    @Id
    @Column(name = "USERID")
    private String userId;
    @Column(name = "USERNAME")
    private String username;
    @Column(name = "PASSWORD")
    private String password;

    //Getter&Setters
}
