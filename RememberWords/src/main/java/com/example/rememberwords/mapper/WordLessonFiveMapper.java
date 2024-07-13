package com.example.rememberwords.mapper;

import com.example.rememberwords.entity.WordLessonFive;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface WordLessonFiveMapper {
    List<WordLessonFive> findAll();
    List<WordLessonFive> findOrderData(Integer pageNum, Integer pageSize);
    boolean add(WordLessonFive wordLessonFive);
    boolean mod(WordLessonFive wordLessonFive);
    boolean addOrMod(WordLessonFive wordLessonFive);
    boolean delete(Integer id);
    List<WordLessonFive> likeFindAll(String mean, Integer pageNum, Integer pageSize);
}
