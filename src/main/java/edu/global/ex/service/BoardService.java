package edu.global.ex.service;

import edu.global.ex.vo.BoardVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface BoardService {

    public List<BoardVO> getList();
}
