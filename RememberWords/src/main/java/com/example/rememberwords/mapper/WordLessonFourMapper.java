package com.example.rememberwords.mapper;

import com.example.rememberwords.entity.WordLessonFour;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface WordLessonFourMapper {
    List<WordLessonFour> findAll();
    List<WordLessonFour> findOrderData(Integer pageNum, Integer pageSize);
    boolean add(WordLessonFour wordLessonFour);
    boolean mod(WordLessonFour wordLessonFour);
    boolean addOrMod(WordLessonFour wordLessonFour);
    boolean delete(Integer id);
    List<WordLessonFour> likeFindAll(String mean, Integer pageNum, Integer pageSize);
}
