package com.honey.service;

import com.honey.dto.ItemBoardDTO;

public interface ItemBoardService {

	public ItemBoardDTO get(Long id);

	public Long register(ItemBoardDTO itemBoardDTO);

}
