package com.example.rememberwords.mapper;

import com.example.rememberwords.entity.WordLesson1;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface WordLesson1Mapper {
    List<WordLesson1> findAll();
    List<WordLesson1> findOrderData(Integer pageNum, Integer pageSize);
    boolean add(WordLesson1 wordLesson1);
    boolean mod(WordLesson1 wordLesson1);
    boolean addOrMod(WordLesson1 wordLesson1);
    boolean delete(Integer id);
    List<WordLesson1> likeFindAll(String mean, Integer pageNum, Integer pageSize);
}
