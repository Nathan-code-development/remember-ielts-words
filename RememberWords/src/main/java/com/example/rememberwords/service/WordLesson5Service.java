package com.example.rememberwords.service;

import com.example.rememberwords.entity.WordLesson5;
import com.example.rememberwords.mapper.WordLesson5Mapper;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WordLesson5Service {
    @Resource
    private WordLesson5Mapper wordLesson5Mapper;
    public List<WordLesson5> findAll(){
        return wordLesson5Mapper.findAll();
    }

    public List<WordLesson5> findOrderData(Integer pageNum, Integer pageSize){
        int currentNum = (pageNum - 1) * pageSize;
        return wordLesson5Mapper.findOrderData(currentNum, pageSize);
    }

    public boolean add(WordLesson5 wordLesson5) {
        return wordLesson5Mapper.add(wordLesson5);
    }

    public boolean mod(WordLesson5 wordLesson5) {
        return wordLesson5Mapper.mod(wordLesson5);
    }

    public boolean addOrMod(WordLesson5 wordLesson5) {
        return wordLesson5Mapper.addOrMod(wordLesson5);
    }

    public boolean delete(Integer id) {
        return wordLesson5Mapper.delete(id);
    }

    public List<WordLesson5> likeFindAll(String mean, Integer pageNum, Integer pageSize) {
        Integer currentPageNum = (pageNum - 1) * pageSize;
        return wordLesson5Mapper.likeFindAll(mean, currentPageNum, pageSize);
    }

}
