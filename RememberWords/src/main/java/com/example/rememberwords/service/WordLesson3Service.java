package com.example.rememberwords.service;

import com.example.rememberwords.entity.WordLesson3;
import com.example.rememberwords.mapper.WordLesson3Mapper;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WordLesson3Service {
    @Resource
    private WordLesson3Mapper wordLesson3Mapper;
    public List<WordLesson3> findAll(){
        return wordLesson3Mapper.findAll();
    }

    public List<WordLesson3> findOrderData(Integer pageNum, Integer pageSize){
        int currentNum = (pageNum - 1) * pageSize;
        return wordLesson3Mapper.findOrderData(currentNum, pageSize);
    }

    public boolean add(WordLesson3 wordLesson3) {
        return wordLesson3Mapper.add(wordLesson3);
    }

    public boolean mod(WordLesson3 wordLesson3) {
        return wordLesson3Mapper.mod(wordLesson3);
    }

    public boolean addOrMod(WordLesson3 wordLesson3) {
        return wordLesson3Mapper.addOrMod(wordLesson3);
    }

    public boolean delete(Integer id) {
        return wordLesson3Mapper.delete(id);
    }

    public List<WordLesson3> likeFindAll(String mean, Integer pageNum, Integer pageSize) {
        Integer currentPageNum = (pageNum - 1) * pageSize;
        return wordLesson3Mapper.likeFindAll(mean, currentPageNum, pageSize);
    }

}
