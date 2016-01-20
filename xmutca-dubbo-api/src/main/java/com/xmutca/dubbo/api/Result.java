/**
 * Copyright 2015 Software innovation and R & D center. All rights reserved.
 * File Name: Result.java
 * Encoding UTF-8
 * Version: 0.0.1
 * History:	04 Jan,2016
 */
package com.xmutca.dubbo.api;

/**
 * 
 * @author: weihuang.peng
 * @version Revision: 0.0.1
 * @Date: 04 Jan,2016
 */
import java.io.Serializable;

/**
 * 底层消息对象
 * @author: weihuang.peng
 * @version Revision: 0.0.1
 * @Date: 04 Jan,2016
 */
public class Result<T> implements Serializable {

	private static final long serialVersionUID = -179266083267787723L;
	
    public static interface Status {
        /**
         * 业务处理成功
         */
        int SUCCESS = 200;

        // ========================

        // ===== 确定处理方式的状态码  =====
        /**
         * 需要进去登录授权
         */
        int LOGIN = 1001;
        /**
         * TICKET 过期或无效
         * **/
        int TICKET = 1002;

        /**
         * 服务SESSION过期无效
         */
        int SESSION = 1003;

        /**
         * 需要重定向
         */
        int REDIRECT = 302;

        // ========================
        /**
         * 权限异常
         */
        int AUTH = 403;

        // ========================

        /**
         * 出现错误
         */
        int ERROR = 500;
    }

    private String message;

    private int status = 200;

    private T result;

    private Long timestamp = System.currentTimeMillis();

    public Result() {
    }

    public Result(int status) {
        this.status = status;
    }

    public Result(T result) {
        this.result = result;
    }

    public Result(int status, T result) {
        this.status = status;
        this.result = result;
    }

    public Result(int status, String message) {
        this.message = message;
        this.status = status;
    }

    public Result<T> setStatusAndMessage(int status, String message) {
        this.message = message;
        this.status = status;
        return this;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public T getResult() {
        return result;
    }

    public void setResult(T result) {
        this.result = result;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(long timestamp) {
        this.timestamp = timestamp;
    }
}