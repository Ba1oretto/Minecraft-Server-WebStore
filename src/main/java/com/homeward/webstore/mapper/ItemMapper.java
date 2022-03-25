package com.homeward.webstore.mapper;

import com.homeward.webstore.java.bean.PO.ItemDetail;
import com.homeward.webstore.java.bean.PO.ItemShowCaseInfo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ItemMapper {
    String getItemName(Integer id);

    List<ItemShowCaseInfo> getItemList(String category);

    ItemDetail getSpecificItem(Integer id);

    String getRuleDetails(Integer ruleId);
}
