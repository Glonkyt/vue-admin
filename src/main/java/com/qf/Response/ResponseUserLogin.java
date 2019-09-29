package com.qf.Response;

import lombok.Data;

import java.util.List;

@Data
public class ResponseUserLogin<T> {

    private List<T> list;

    private Long total;

    public List<T> getList() {
        return list;
    }

    public void setList(List<T> list) {
        this.list = list;
    }

    public Long getTotal() {
        return total;
    }

    public void setTotal(Long total) {
        this.total = total;
    }
}
