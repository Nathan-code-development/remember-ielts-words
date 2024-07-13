package com.example.rememberwords.service;

import com.example.rememberwords.entity.WordLessonTwo;
import com.example.rememberwords.mapper.WordLessonTwoMapper;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WordLessonTwoService {
    @Resource
    private WordLessonTwoMapper wordLessonTwoMapper;
    public List<WordLessonTwo> findAll(){
        return wordLessonTwoMapper.findAll();
    }

    public List<WordLessonTwo> findOrderData(Integer pageNum, Integer pageSize){
        int currentNum = (pageNum - 1) * pageSize;
        return wordLessonTwoMapper.findOrderData(currentNum, pageSize);
    }

    public boolean add(WordLessonTwo wordLessonTwo) {
        return wordLessonTwoMapper.add(wordLessonTwo);
    }

    public boolean mod(WordLessonTwo wordLessonTwo) {
        return wordLessonTwoMapper.mod(wordLessonTwo);
    }

    public boolean addOrMod(WordLessonTwo wordLessonTwo) {
        return wordLessonTwoMapper.addOrMod(wordLessonTwo);
    }

    public boolean delete(Integer id) {
        return wordLessonTwoMapper.delete(id);
    }

    public List<WordLessonTwo> likeFindAll(String mean, Integer pageNum, Integer pageSize) {
        Integer currentPageNum = (pageNum - 1) * pageSize;
        return wordLessonTwoMapper.likeFindAll(mean, currentPageNum, pageSize);
    }

}
