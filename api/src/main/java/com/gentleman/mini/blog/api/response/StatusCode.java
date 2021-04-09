package com.gentleman.mini.blog.api.response;

/**
 * @author 一粒尘埃
 * @date 2021/4/9/21:43
 */
public enum StatusCode {
      SUCCESS(1,"成功"),
      FAIL(0,"失败"),
      INVALID(2,"参数不合法")
    ;
    private Integer code;
    private String msg;

    StatusCode(){
    }
    StatusCode(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }
    public Integer getCode() {
        return code;
    }
    public String getMsg() {
        return msg;
    }
}
