package org.curitis.bean;

public class LayuiResult<T> {

    private Integer code;

    private String msg;

    private Long count;

    private T data;

    public LayuiResult() {
    }

    public LayuiResult(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public LayuiResult(Integer code, String msg, Long count, T data) {
        this.code = code;
        this.msg = msg;
        this.count = count;
        this.data = data;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public Long getCount() {
        return count;
    }

    public void setCount(Long count) {
        this.count = count;
    }
}
