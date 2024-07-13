package com.example.rememberwords.mapper;

import com.example.rememberwords.entity.WordLessonTwo;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface WordLessonTwoMapper {
    List<WordLessonTwo> findAll();
    List<WordLessonTwo> findOrderData(Integer pageNum, Integer pageSize);
    boolean add(WordLessonTwo wordLessonTwo);
    boolean mod(WordLessonTwo wordLessonTwo);
    boolean addOrMod(WordLessonTwo wordLessonTwo);
    boolean delete(Integer id);
    List<WordLessonTwo> likeFindAll(String mean, Integer pageNum, Integer pageSize);
}
