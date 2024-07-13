package com.example.rememberwords.mapper;

import com.example.rememberwords.entity.WordLessonSix;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface WordLessonSixMapper {
    List<WordLessonSix> findAll();
    List<WordLessonSix> findOrderData(Integer pageNum, Integer pageSize);
    boolean add(WordLessonSix wordLessonSix);
    boolean mod(WordLessonSix wordLessonSix);
    boolean addOrMod(WordLessonSix wordLessonSix);
    boolean delete(Integer id);
    List<WordLessonSix> likeFindAll(String mean, Integer pageNum, Integer pageSize);
}
