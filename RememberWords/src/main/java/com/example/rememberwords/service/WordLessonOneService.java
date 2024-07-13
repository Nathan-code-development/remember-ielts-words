package com.example.rememberwords.service;

import com.example.rememberwords.entity.WordLessonOne;
import com.example.rememberwords.mapper.WordLessonOneMapper;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WordLessonOneService {
    @Resource
    private WordLessonOneMapper wordLessonOneMapper;
    public List<WordLessonOne> findAll(){
        return wordLessonOneMapper.findAll();
    }

    public List<WordLessonOne> findOrderData(Integer pageNum, Integer pageSize){
        int currentNum = (pageNum - 1) * pageSize;
        return wordLessonOneMapper.findOrderData(currentNum, pageSize);
    }

    public boolean add(WordLessonOne wordLessonOne) {
        return wordLessonOneMapper.add(wordLessonOne);
    }

    public boolean mod(WordLessonOne wordLessonOne) {
        return wordLessonOneMapper.mod(wordLessonOne);
    }

    public boolean addOrMod(WordLessonOne wordLessonOne) {
        return wordLessonOneMapper.addOrMod(wordLessonOne);
    }

    public boolean delete(Integer id) {
        return wordLessonOneMapper.delete(id);
    }

    public List<WordLessonOne> likeFindAll(String mean, Integer pageNum, Integer pageSize) {
        Integer currentPageNum = (pageNum - 1) * pageSize;
        return wordLessonOneMapper.likeFindAll(mean, currentPageNum, pageSize);
    }

}
