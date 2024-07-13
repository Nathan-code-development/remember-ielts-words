package com.example.rememberwords.mapper;

import com.example.rememberwords.entity.WordLesson4;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface WordLesson4Mapper {
    List<WordLesson4> findAll();
    List<WordLesson4> findOrderData(Integer pageNum, Integer pageSize);
    boolean add(WordLesson4 wordLesson4);
    boolean mod(WordLesson4 wordLesson4);
    boolean addOrMod(WordLesson4 wordLesson4);
    boolean delete(Integer id);
    List<WordLesson4> likeFindAll(String mean, Integer pageNum, Integer pageSize);
}
