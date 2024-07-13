package com.example.rememberwords.service;

import com.example.rememberwords.entity.WordLesson2;
import com.example.rememberwords.mapper.WordLesson2Mapper;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WordLesson2Service {
    @Resource
    private WordLesson2Mapper wordLesson2Mapper;
    public List<WordLesson2> findAll(){
        return wordLesson2Mapper.findAll();
    }

    public List<WordLesson2> findOrderData(Integer pageNum, Integer pageSize){
        int currentNum = (pageNum - 1) * pageSize;
        return wordLesson2Mapper.findOrderData(currentNum, pageSize);
    }

    public boolean add(WordLesson2 wordLesson2) {
        return wordLesson2Mapper.add(wordLesson2);
    }

    public boolean mod(WordLesson2 wordLesson2) {
        return wordLesson2Mapper.mod(wordLesson2);
    }

    public boolean addOrMod(WordLesson2 wordLesson2) {
        return wordLesson2Mapper.addOrMod(wordLesson2);
    }

    public boolean delete(Integer id) {
        return wordLesson2Mapper.delete(id);
    }

    public List<WordLesson2> likeFindAll(String mean, Integer pageNum, Integer pageSize) {
        Integer currentPageNum = (pageNum - 1) * pageSize;
        return wordLesson2Mapper.likeFindAll(mean, currentPageNum, pageSize);
    }

}
