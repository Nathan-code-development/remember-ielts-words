package com.example.rememberwords.mapper;

import com.example.rememberwords.entity.WordLessonThree;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface WordLessonThreeMapper {
    List<WordLessonThree> findAll();
    List<WordLessonThree> findOrderData(Integer pageNum, Integer pageSize);
    boolean add(WordLessonThree wordLessonThree);
    boolean mod(WordLessonThree wordLessonThree);
    boolean addOrMod(WordLessonThree wordLessonThree);
    boolean delete(Integer id);
    List<WordLessonThree> likeFindAll(String mean, Integer pageNum, Integer pageSize);
}
