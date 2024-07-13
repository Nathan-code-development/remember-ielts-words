package com.example.rememberwords.mapper;

import com.example.rememberwords.entity.WordLesson2;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface WordLesson2Mapper {
    List<WordLesson2> findAll();
    List<WordLesson2> findOrderData(Integer pageNum, Integer pageSize);
    boolean add(WordLesson2 wordLesson2);
    boolean mod(WordLesson2 wordLesson2);
    boolean addOrMod(WordLesson2 wordLesson2);
    boolean delete(Integer id);
    List<WordLesson2> likeFindAll(String mean, Integer pageNum, Integer pageSize);
}
