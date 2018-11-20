package com.zb.zber.common.core.persistence.db.pagination;

import java.io.Serializable;
import java.util.List;

public class PaginationOrdersList<T> implements Serializable {
	private static final long serialVersionUID = -2390789109957405179L;

	private Pagination pagination = new Pagination();
	
	private Orders orders;
	
	private List<T> datas;

	public PaginationOrdersList() {
		super();
	}
	
	public static <K> PaginationOrdersList<K>  getInstance(){
	    return new PaginationOrdersList<K>();
	}
	
	public PaginationOrdersList(Pagination pagination) {
		super();
		this.pagination = pagination;
	}

	public PaginationOrdersList(List<T> datas, Pagination pagination, Orders orders) {
		super();
		this.pagination = pagination;
		this.orders = orders;
		this.datas = datas;
	}
	

	/**
	 * @return the pagination
	 */
	public Pagination getPagination() {
		return pagination;
	}

	/**
	 * @return the orders
	 */
	public Orders getOrders() {
		return orders;
	}
	
	/**
	 * @return the datas
	 */
	public List<T> getDatas() {
		return datas;
	}

	/**
	 * @param orders the orders to set
	 */
	public PaginationOrdersList<T> setOrders(Orders orders) {
		this.orders = orders;
		return this;
	}
	
	/**
	 * @param pagination the pagination to set
	 */
	public PaginationOrdersList<T> setPagination(Pagination pagination) {
		this.pagination = pagination;
		return this;
	}

	/**
	 * @param datas the datas to set
	 */
	public PaginationOrdersList<T> setDatas(List<T> datas) {
		this.datas = datas;
		return this;
	}
}
