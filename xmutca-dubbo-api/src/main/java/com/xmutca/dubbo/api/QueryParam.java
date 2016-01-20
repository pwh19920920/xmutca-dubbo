package com.xmutca.dubbo.api;

import java.io.Serializable;

/**
 * 分页参数对象
 * @author: weihuang.peng
 * @version Revision: 0.0.1
 * @Date: 2015年3月17日
 * update Description : 去除访问最后一页的限制
 * update Date : 2015年3月17日
 */
public class QueryParam implements Serializable {

	private static final long serialVersionUID = 7468721784590351690L;

	private int records;//总记录数
	
	private int size = 10;//页面条数
	
	private int count;//页面总数
	
	private int current = 1;//当前页面
	
	public QueryParam() {
	
	}

	public QueryParam(int size) {
		this.size = size;
	}

	public int getCurrent() {
		return current;
	}

	public void setCurrent(int current) {
		this.current = (current < 1 ? 1 : current);
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = Math.abs(size);
		if (size >= 50) {
			size = 50;
		}
	}

	public int getRecords() {
		return records;
	}

	public void setRecords(int records) {
		if (records == 0) {
			//pageCount = 1;
			return;
		}
			
		this.records = records;
		if (size > 0) {

			count = ((int) Math.ceil((records - 1) / size) + 1);
			
			if (current < 1) {
				current = 1;
			}
		}
	}

	public int getFirstPage() {
		return 1;
	}

	public int getPrePage() {
		return current - 1 >= 1 ? current - 1 : 1;
	}

	public int getNextPage() {
		return current + 1 > count ? count : current + 1;
	}

	public boolean isFirst() {
		return current == 1;
	}

	public boolean isLast() {
		return current == count;
	}

	public int getStartRow() {
		return (current - 1) * size;
	}
}