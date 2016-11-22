package com.jancal.list.service;

import com.jancal.list.domain.AddItemParam;
import com.jancal.list.service_api.IItemOperateService;

import junit.framework.Assert;

import java.util.List;

public class ItemOperateService implements IItemOperateService {
    @Override
    public void addItem(AddItemParam item) {
        Assert.assertNotNull(item);
        System.out.println(item.getLabel() + "," + item.getSum());
    }

    @Override
    public List<AddItemParam> findAllItems() {
        return null;
    }
}
