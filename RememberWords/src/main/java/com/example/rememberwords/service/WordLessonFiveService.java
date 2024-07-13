package com.example.rememberwords.service;

import com.example.rememberwords.entity.WordLessonFive;
import com.example.rememberwords.mapper.WordLessonFiveMapper;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WordLessonFiveService {
    @Resource
    private WordLessonFiveMapper wordLessonFiveMapper;
    public List<WordLessonFive> findAll(){
        return wordLessonFiveMapper.findAll();
    }

    public List<WordLessonFive> findOrderData(Integer pageNum, Integer pageSize){
        int currentNum = (pageNum - 1) * pageSize;
        return wordLessonFiveMapper.findOrderData(currentNum, pageSize);
    }

    public boolean add(WordLessonFive wordLessonFive) {
        return wordLessonFiveMapper.add(wordLessonFive);
    }

    public boolean mod(WordLessonFive wordLessonFive) {
        return wordLessonFiveMapper.mod(wordLessonFive);
    }

    public boolean addOrMod(WordLessonFive wordLessonFive) {
        return wordLessonFiveMapper.addOrMod(wordLessonFive);
    }

    public boolean delete(Integer id) {
        return wordLessonFiveMapper.delete(id);
    }

    public List<WordLessonFive> likeFindAll(String mean, Integer pageNum, Integer pageSize) {
        Integer currentPageNum = (pageNum - 1) * pageSize;
        return wordLessonFiveMapper.likeFindAll(mean, currentPageNum, pageSize);
    }

}
