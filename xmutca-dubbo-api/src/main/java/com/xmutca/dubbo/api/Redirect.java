package com.xmutca.dubbo.api;


/**
 * 重定向对象
 * @author: weihuang.peng
 * @version Revision: 0.0.1
 * @Date: 04 Jan,2016
 */
public class Redirect extends Result<Object> {

	private static final long serialVersionUID = 1238939917009600532L;
	
	private String url;

    public Redirect() {
        setStatus(Status.REDIRECT);
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public static class Builder {

        private String message;
        private Object result;
        private long timestamp;
        private String url;

        public Builder message(String message) {
            this.message = message;
            return this;
        }

        public Builder result(Object result) {
            this.result = result;
            return this;
        }

        public Builder timestamp(long timestamp) {
            this.timestamp = timestamp;
            return this;
        }

        public Builder url(String url) {
            this.url = url;
            return this;
        }

        public Builder result(Result<?> result) {
            this.message = result.getMessage();
            this.timestamp = result.getTimestamp();
            return this;
        }

        public Redirect build() {
            Redirect redirect = new Redirect();
            redirect.url = url;
            redirect.setMessage(message);
            redirect.setResult(result);
            redirect.setTimestamp(timestamp);
            return redirect;
        }
    }
}