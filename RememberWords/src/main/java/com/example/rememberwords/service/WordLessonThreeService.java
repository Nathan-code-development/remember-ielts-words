package com.example.rememberwords.service;

import com.example.rememberwords.entity.WordLessonThree;
import com.example.rememberwords.mapper.WordLessonThreeMapper;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WordLessonThreeService {
    @Resource
    private WordLessonThreeMapper wordLessonThreeMapper;
    public List<WordLessonThree> findAll(){
        return wordLessonThreeMapper.findAll();
    }

    public List<WordLessonThree> findOrderData(Integer pageNum, Integer pageSize){
        int currentNum = (pageNum - 1) * pageSize;
        return wordLessonThreeMapper.findOrderData(currentNum, pageSize);
    }

    public boolean add(WordLessonThree wordLessonThree) {
        return wordLessonThreeMapper.add(wordLessonThree);
    }

    public boolean mod(WordLessonThree wordLessonThree) {
        return wordLessonThreeMapper.mod(wordLessonThree);
    }

    public boolean addOrMod(WordLessonThree wordLessonThree) {
        return wordLessonThreeMapper.addOrMod(wordLessonThree);
    }

    public boolean delete(Integer id) {
        return wordLessonThreeMapper.delete(id);
    }

    public List<WordLessonThree> likeFindAll(String mean, Integer pageNum, Integer pageSize) {
        Integer currentPageNum = (pageNum - 1) * pageSize;
        return wordLessonThreeMapper.likeFindAll(mean, currentPageNum, pageSize);
    }

}
