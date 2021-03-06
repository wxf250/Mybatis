package com.wxf.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;
import java.util.Date;

@Getter
@Setter
@ToString
public class User implements Serializable {
    private Integer id;
    private String name;
    private String password;
    private String sex;
    private Date birthday;
    private Date registTime;
}
