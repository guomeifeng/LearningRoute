package com.taotao.sso.common;

import java.util.concurrent.TimeUnit;

import org.apache.http.impl.conn.PoolingHttpClientConnectionManager;

public class IdleConnectionEvictor{
	
    private PoolingHttpClientConnectionManager manager;
    private Long l;
    private TimeUnit hours;
    public IdleConnectionEvictor(PoolingHttpClientConnectionManager manager, long l, TimeUnit hours) {
		this.manager = manager;
		this.l = l;
		this.hours = hours;
	}
	public IdleConnectionEvictor(PoolingHttpClientConnectionManager manager2) {
		this.manager = manager;
	}
	public PoolingHttpClientConnectionManager getManager() {
		return manager;
	}
	public void setManager(PoolingHttpClientConnectionManager manager) {
		this.manager = manager;
	}
	public Long getL() {
		return l;
	}
	public void setL(Long l) {
		this.l = l;
	}
	public TimeUnit getHours() {
		return hours;
	}
	public void setHours(TimeUnit hours) {
		this.hours = hours;
	}

}
