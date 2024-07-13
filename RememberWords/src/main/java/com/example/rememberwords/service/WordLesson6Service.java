package com.example.rememberwords.service;

import com.example.rememberwords.entity.WordLesson6;
import com.example.rememberwords.mapper.WordLesson6Mapper;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WordLesson6Service {
    @Resource
    private WordLesson6Mapper wordLesson6Mapper;
    public List<WordLesson6> findAll(){
        return wordLesson6Mapper.findAll();
    }

    public List<WordLesson6> findOrderData(Integer pageNum, Integer pageSize){
        int currentNum = (pageNum - 1) * pageSize;
        return wordLesson6Mapper.findOrderData(currentNum, pageSize);
    }

    public boolean add(WordLesson6 wordLesson6) {
        return wordLesson6Mapper.add(wordLesson6);
    }

    public boolean mod(WordLesson6 wordLesson6) {
        return wordLesson6Mapper.mod(wordLesson6);
    }

    public boolean addOrMod(WordLesson6 wordLesson6) {
        return wordLesson6Mapper.addOrMod(wordLesson6);
    }

    public boolean delete(Integer id) {
        return wordLesson6Mapper.delete(id);
    }

    public List<WordLesson6> likeFindAll(String mean, Integer pageNum, Integer pageSize) {
        Integer currentPageNum = (pageNum - 1) * pageSize;
        return wordLesson6Mapper.likeFindAll(mean, currentPageNum, pageSize);
    }

}
