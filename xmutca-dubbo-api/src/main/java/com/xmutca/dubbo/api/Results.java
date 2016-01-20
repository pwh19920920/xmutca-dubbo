package com.xmutca.dubbo.api;
import java.util.Collection;

/**
 * User: Adi Date: 2015/12/13 Time: 9:21
 */
public class Results<T> extends Result<Collection<T>> {

	private static final long serialVersionUID = 4971991028596527524L;

	/** 分页信息 */
	private Paging paging;

	public Results() {
		super();
	}
 
	public Results(Collection<T> result) {
		super(result);
	}

	public Results(int status, Collection<T> result) {
		super(status, result);
	}

	public Results(Collection<T> result, Paging paging) {
		super(result);
		this.paging = paging;
	}

	public Results(int status, Collection<T> result, Paging paging) {
		super(status, result);
		this.paging = paging;
	}

	public Results(int status) {
		super(status);
	}

	@Deprecated
	public Collection<T> getResult() {
		return super.getResult();
	}

	@Deprecated
	public void setResult(Collection<T> results) {
		super.setResult(results);
	}

	public Collection<T> getResults() {
		return super.getResult();
	}

	public void setResults(Collection<T> results) {
		super.setResult(results);
	}

	public Paging getPaging() {
		return paging;
	}

	public void setPaging(Paging paging) {
		this.paging = paging;
	}
}