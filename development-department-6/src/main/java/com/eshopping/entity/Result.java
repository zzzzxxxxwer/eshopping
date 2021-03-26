package com.eshopping.entity;

/**
 * @author ThisPC
 * @date 2021/3/19
 */
public class Result<T> {
    private int flag;
    private String code;
    private T data;

    public Result(int flag, String code, T data) {
        this.flag = flag;   this.code = code;   this.data = data;
    }

    public Result() {
    }

    public int getFlag() { return flag; }
    public void setFlag(int flag) { this.flag = flag; }

    public String getCode() { return code; }
    public void setCode(String code) { this.code = code; }

    public T getData() { return data; }
    public void setData(T data) { this.data = data; }

    @Override
    public String toString() {
        return "Result{" + "flag=" + flag + ", code='" + code + '\'' +
                ", data=" + data + '}';
    }
}
