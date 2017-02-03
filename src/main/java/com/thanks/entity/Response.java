package com.thanks.entity;

/**
 * Created by Administrator on 2017/2/3.
 */
public class Response {

	private Object data;
	private Integer errorCode;
	private String msg;

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}

	public Integer getErrorCode() {
		return errorCode;
	}

	public void setErrorCode(Integer errorCode) {
		this.errorCode = errorCode;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}
}
