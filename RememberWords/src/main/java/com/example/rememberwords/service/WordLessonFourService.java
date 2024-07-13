package com.example.rememberwords.service;

import com.example.rememberwords.entity.WordLessonFour;
import com.example.rememberwords.mapper.WordLessonFourMapper;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WordLessonFourService {
    @Resource
    private WordLessonFourMapper wordLessonFourMapper;
    public List<WordLessonFour> findAll(){
        return wordLessonFourMapper.findAll();
    }

    public List<WordLessonFour> findOrderData(Integer pageNum, Integer pageSize){
        int currentNum = (pageNum - 1) * pageSize;
        return wordLessonFourMapper.findOrderData(currentNum, pageSize);
    }

    public boolean add(WordLessonFour wordLessonFour) {
        return wordLessonFourMapper.add(wordLessonFour);
    }

    public boolean mod(WordLessonFour wordLessonFour) {
        return wordLessonFourMapper.mod(wordLessonFour);
    }

    public boolean addOrMod(WordLessonFour wordLessonFour) {
        return wordLessonFourMapper.addOrMod(wordLessonFour);
    }

    public boolean delete(Integer id) {
        return wordLessonFourMapper.delete(id);
    }

    public List<WordLessonFour> likeFindAll(String mean, Integer pageNum, Integer pageSize) {
        Integer currentPageNum = (pageNum - 1) * pageSize;
        return wordLessonFourMapper.likeFindAll(mean, currentPageNum, pageSize);
    }

}
