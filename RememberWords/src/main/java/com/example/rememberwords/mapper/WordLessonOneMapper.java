package com.example.rememberwords.mapper;

import com.example.rememberwords.entity.WordLessonOne;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface WordLessonOneMapper {
    List<WordLessonOne> findAll();
    List<WordLessonOne> findOrderData(Integer pageNum, Integer pageSize);
    boolean add(WordLessonOne wordLessonOne);
    boolean mod(WordLessonOne wordLessonOne);
    boolean addOrMod(WordLessonOne wordLessonOne);
    boolean delete(Integer id);
    List<WordLessonOne> likeFindAll(String mean, Integer pageNum, Integer pageSize);
}
