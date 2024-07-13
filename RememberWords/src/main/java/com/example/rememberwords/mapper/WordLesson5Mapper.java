package com.example.rememberwords.mapper;

import com.example.rememberwords.entity.WordLesson5;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface WordLesson5Mapper {
    List<WordLesson5> findAll();
    List<WordLesson5> findOrderData(Integer pageNum, Integer pageSize);
    boolean add(WordLesson5 wordLesson5);
    boolean mod(WordLesson5 wordLesson5);
    boolean addOrMod(WordLesson5 wordLesson5);
    boolean delete(Integer id);
    List<WordLesson5> likeFindAll(String mean, Integer pageNum, Integer pageSize);
}
