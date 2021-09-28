package com.muzhi.strategy;

import java.util.ArrayList;
import java.util.List;

/**
 * <h3>DesignPatterns</h3>
 * <p></p>
 *
 * @author : zwmuzhi
 * @date : 2021-06-17 15:54
 **/
public enum TestEnum {
    ARTICLE("sdaasd",new ArrayList<>()),
    ;

    private String name;
    private List<Integer> idList;

    TestEnum(String name, List<Integer> idList) {
        this.name = name;
        this.idList = idList;

    }

    public List<Integer> getIdList() {
        return idList;
    }

    public void addId(Integer id) {
        this.idList.add(id);
    }
}
