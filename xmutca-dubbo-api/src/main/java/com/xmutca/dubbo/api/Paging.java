package com.xmutca.dubbo.api;

/**
 * 分页参数对象
 * Created by peter on 12/31/2015.
 */
public class Paging {

    private int count;

    private int size;

    private int current;

    private int length;

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
        this.size = size;
    }

    public int getCurrent() {
        return current;
    }

    public void setCurrent(int current) {
        this.current = current;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public Paging() {

    }

    public Paging(int count, int size, int current, int length) {
        this.count = count;
        this.size = size;
        this.current = current;
        this.length = length;
    }
}
