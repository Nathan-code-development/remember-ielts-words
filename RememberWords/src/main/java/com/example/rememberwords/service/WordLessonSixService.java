package com.example.rememberwords.service;

import com.example.rememberwords.entity.WordLessonSix;
import com.example.rememberwords.mapper.WordLessonSixMapper;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WordLessonSixService {
    @Resource
    private WordLessonSixMapper wordLessonSixMapper;
    public List<WordLessonSix> findAll(){
        return wordLessonSixMapper.findAll();
    }

    public List<WordLessonSix> findOrderData(Integer pageNum, Integer pageSize){
        int currentNum = (pageNum - 1) * pageSize;
        return wordLessonSixMapper.findOrderData(currentNum, pageSize);
    }

    public boolean add(WordLessonSix wordLessonSix) {
        return wordLessonSixMapper.add(wordLessonSix);
    }

    public boolean mod(WordLessonSix wordLessonSix) {
        return wordLessonSixMapper.mod(wordLessonSix);
    }

    public boolean addOrMod(WordLessonSix wordLessonSix) {
        return wordLessonSixMapper.addOrMod(wordLessonSix);
    }

    public boolean delete(Integer id) {
        return wordLessonSixMapper.delete(id);
    }

    public List<WordLessonSix> likeFindAll(String mean, Integer pageNum, Integer pageSize) {
        Integer currentPageNum = (pageNum - 1) * pageSize;
        return wordLessonSixMapper.likeFindAll(mean, currentPageNum, pageSize);
    }

}
