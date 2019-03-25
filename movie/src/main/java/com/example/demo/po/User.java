package com.example.demo.po;



import lombok.Data;

/**
 * @Author zhongxiancai
 * @Description
 * @Date: Created in 2019/3/25 10:46.
 * @Modified By:
 */
@Data
public class User {

    /**
     * 主键
     */
    private String id;
    /**
     * 用户名
     */
    private String username;
    /**
     * 手机号码
     */
    private String phoneNo;
    /**
     * 密码
     */
    private String passwd;
    /**
     * 创建时间
     */
    private String createTime;

    /**
     * 别名
     */
    private String aliasName;
    /**
     * 状态
     */
    private String status;

    private String orgId;

  }

