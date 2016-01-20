package com.xmutca.dubbo.api;
/**
 * 回执 User:Adi Date: 2015/12/13 Time: 9:39
 */
public class Receipt extends Result<Object> {

	private static final long serialVersionUID = -6750090977686686435L;

	public Receipt() {
		setStatus(200);
	}

	public Receipt(int status, String msg) {
		super(status);
		setMessage(msg);
	}

	public Receipt(int status) {
		super(status);
	}

	public Receipt(String msg) {
		this();
		setMessage(msg);
	}
}