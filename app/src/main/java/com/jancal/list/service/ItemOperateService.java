package com.jancal.list.service;

import com.jancal.list.domain.ItemInit;
import com.jancal.list.service_api.IItemOperateService;

import java.util.List;

public class ItemOperateService implements IItemOperateService {
    @Override
    public void addItem(ItemInit item) {
        System.out.println(item.getLabel() + "," + item.getSum());
    }

    @Override
    public List<ItemInit> findAllItems() {
        return null;
    }
}
