package com.honey.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.honey.dto.ItemBoardReplyDTO;
import com.honey.service.ItemBoardReplyService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/itemBoard/reply")
@RequiredArgsConstructor
public class ItemBoardReplyController {

	private final ItemBoardReplyService service;
	
	@GetMapping("/list/{id}")
	public List<ItemBoardReplyDTO> list(@PathVariable Long id){
		return service.list(id);
	}
	
	@PostMapping("/")
	public Long register(ItemBoardReplyDTO dto) {
		return service.register(dto);
	}
	
	@PutMapping("/{replyNo}")
	public void modify(@PathVariable Long replyNo, ItemBoardReplyDTO dto) {
		dto.setReplyNo(replyNo);
		
		service.modify(dto);
	}
	@GetMapping("/{replyNo}")
	public void remove(@PathVariable Long replyNo) {

		service.remove(replyNo);

	}
}
