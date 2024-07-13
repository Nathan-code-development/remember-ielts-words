package com.example.rememberwords.service;

import com.example.rememberwords.entity.WordLesson4;
import com.example.rememberwords.mapper.WordLesson4Mapper;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WordLesson4Service {
    @Resource
    private WordLesson4Mapper wordLesson4Mapper;
    public List<WordLesson4> findAll(){
        return wordLesson4Mapper.findAll();
    }

    public List<WordLesson4> findOrderData(Integer pageNum, Integer pageSize){
        int currentNum = (pageNum - 1) * pageSize;
        return wordLesson4Mapper.findOrderData(currentNum, pageSize);
    }

    public boolean add(WordLesson4 wordLesson4) {
        return wordLesson4Mapper.add(wordLesson4);
    }

    public boolean mod(WordLesson4 wordLesson4) {
        return wordLesson4Mapper.mod(wordLesson4);
    }

    public boolean addOrMod(WordLesson4 wordLesson4) {
        return wordLesson4Mapper.addOrMod(wordLesson4);
    }

    public boolean delete(Integer id) {
        return wordLesson4Mapper.delete(id);
    }

    public List<WordLesson4> likeFindAll(String mean, Integer pageNum, Integer pageSize) {
        Integer currentPageNum = (pageNum - 1) * pageSize;
        return wordLesson4Mapper.likeFindAll(mean, currentPageNum, pageSize);
    }

}
