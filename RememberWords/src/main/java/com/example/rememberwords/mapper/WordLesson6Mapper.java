package com.example.rememberwords.mapper;

import com.example.rememberwords.entity.WordLesson6;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface WordLesson6Mapper {
    List<WordLesson6> findAll();
    List<WordLesson6> findOrderData(Integer pageNum, Integer pageSize);
    boolean add(WordLesson6 wordLesson6);
    boolean mod(WordLesson6 wordLesson6);
    boolean addOrMod(WordLesson6 wordLesson6);
    boolean delete(Integer id);
    List<WordLesson6> likeFindAll(String mean, Integer pageNum, Integer pageSize);
}
