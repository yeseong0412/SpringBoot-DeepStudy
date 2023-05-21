package com.start.myHome.repository;

import com.start.myHome.model.Board;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BoardRepository extends JpaRepository<Board,Long> {
    List<Board> findByTitle(String title);
    List<Board> findByTitleorContent(String title, String content);
}
