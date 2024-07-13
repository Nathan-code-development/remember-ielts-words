package com.example.rememberwords.controller;

import com.example.rememberwords.entity.WordLesson5;
import com.example.rememberwords.service.WordLesson5Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/WordLesson5")
public class WordLesson5Controlled {
    @Autowired
    private WordLesson5Service wordLesson5Service;
    @GetMapping("/findAll")
    public Map<String, Object> findAll(){
        List<WordLesson5> list = wordLesson5Service.findAll();
        return getStringObjectMap(list);
    }

    @GetMapping("/findOrderData")
    public Map<String, Object> findOrderData(@RequestParam Integer pageNum, @RequestParam Integer pageSize){
        List<WordLesson5> list = wordLesson5Service.findOrderData(pageNum, pageSize);
        return getStringObjectMap(list);
    }

    @PostMapping("/add")
    public boolean add(@RequestBody WordLesson5 wordLesson5){
        return wordLesson5Service.add(wordLesson5);
    }

    @PostMapping("/mod")
    public boolean mod(@RequestBody WordLesson5 wordLesson5){
        return wordLesson5Service.mod(wordLesson5);
    }

    @PostMapping("/addOrMod")
    public boolean addOrMod(@RequestBody WordLesson5 wordLesson5){
        return wordLesson5Service.addOrMod(wordLesson5);
    }

    @GetMapping("/delete")
    public boolean delete(@RequestParam Integer id){
        return wordLesson5Service.delete(id);
    }

    @GetMapping("/likeFindAll")
    public Map<String, Object> likeFindAll(@RequestParam String mean, @RequestParam Integer pageNum, @RequestParam Integer pageSize){
        List<WordLesson5> list = wordLesson5Service.likeFindAll(mean, pageNum, pageSize);
        return getStringObjectMap(list);
    }

    private Map<String, Object> getStringObjectMap(List<WordLesson5> list) {
        Map<String, Object> map = new LinkedHashMap<>();
        map.put("code", 200);
        map.put("msg", "success");
        map.put("total", list.size());
        map.put("data", list);
        return map;
    }
}
