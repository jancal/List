package com.jancal.list.service_api;

import com.jancal.list.domain.AddItemParam;

import java.util.List;

/**
 *
 */
public interface IItemOperateService {

    void addItem(AddItemParam item);

    List<AddItemParam> findAllItems();
}
