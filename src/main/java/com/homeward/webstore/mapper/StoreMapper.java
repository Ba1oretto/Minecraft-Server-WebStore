package com.homeward.webstore.mapper;

import com.homeward.webstore.pojo.packages.ItemsList;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

public interface StoreMapper {
    //单个参数传递不加@Param
    List<ItemsList> getStoreItems(String type);
}