package com.jancal.list.repository_api;

import com.jancal.list.domain.Item;

import java.util.List;


public interface IItemDao {

    void insertItem(Item item);

    void delItem(int id);

    void updateItem(Item item);

    Item getItem(int id);

    List<Item> findItems();
}
