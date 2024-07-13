package com.example.rememberwords.service;

import com.example.rememberwords.entity.WordLesson1;
import com.example.rememberwords.mapper.WordLesson1Mapper;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WordLesson1Service {
    @Resource
    private WordLesson1Mapper wordLesson1Mapper;
    public List<WordLesson1> findAll(){
        return wordLesson1Mapper.findAll();
    }

    public List<WordLesson1> findOrderData(Integer pageNum, Integer pageSize){
        int currentNum = (pageNum - 1) * pageSize;
        return wordLesson1Mapper.findOrderData(currentNum, pageSize);
    }

    public boolean add(WordLesson1 wordLesson1) {
        return wordLesson1Mapper.add(wordLesson1);
    }

    public boolean mod(WordLesson1 wordLesson1) {
        return wordLesson1Mapper.mod(wordLesson1);
    }

    public boolean addOrMod(WordLesson1 wordLesson1) {
        return wordLesson1Mapper.addOrMod(wordLesson1);
    }

    public boolean delete(Integer id) {
        return wordLesson1Mapper.delete(id);
    }

    public List<WordLesson1> likeFindAll(String mean, Integer pageNum, Integer pageSize) {
        Integer currentPageNum = (pageNum - 1) * pageSize;
        return wordLesson1Mapper.likeFindAll(mean, currentPageNum, pageSize);
    }

}
