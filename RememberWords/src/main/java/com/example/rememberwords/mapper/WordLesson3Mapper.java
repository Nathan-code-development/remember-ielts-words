package com.example.rememberwords.mapper;

import com.example.rememberwords.entity.WordLesson3;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface WordLesson3Mapper {
    List<WordLesson3> findAll();
    List<WordLesson3> findOrderData(Integer pageNum, Integer pageSize);
    boolean add(WordLesson3 wordLesson3);
    boolean mod(WordLesson3 wordLesson3);
    boolean addOrMod(WordLesson3 wordLesson3);
    boolean delete(Integer id);
    List<WordLesson3> likeFindAll(String mean, Integer pageNum, Integer pageSize);
}
