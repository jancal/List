package com.jancal.list.service_api;

import com.jancal.list.domain.ItemInit;

import java.util.List;

/**
 * Created by Administrator on 2016/11/19.
 */

public interface IItemOperateService {

    void addItem(ItemInit item);

    List<ItemInit> findAllItems();
}
