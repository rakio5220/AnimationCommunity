package com.anicommu.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import com.anicommu.domain.BoardVO;

public interface BoardMapper {

	@Select("select * from BOARD where BoardCode > 0")
	public List<BoardVO> getList();
}
