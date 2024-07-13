package com.example.rememberwords.controller;

import com.example.rememberwords.entity.WordLesson1;
import com.example.rememberwords.service.WordLesson1Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/WordLesson1")
public class WordLesson1Controlled {
    @Autowired
    private WordLesson1Service wordLesson1Service;
    @GetMapping("/findAll")
    public Map<String, Object> findAll(){
        List<WordLesson1> list = wordLesson1Service.findAll();
        return getStringObjectMap(list);
    }

    @GetMapping("/findOrderData")
    public Map<String, Object> findOrderData(@RequestParam Integer pageNum, @RequestParam Integer pageSize){
        List<WordLesson1> list = wordLesson1Service.findOrderData(pageNum, pageSize);
        return getStringObjectMap(list);
    }

    @PostMapping("/add")
    public boolean add(@RequestBody WordLesson1 wordLesson1){
        return wordLesson1Service.add(wordLesson1);
    }

    @PostMapping("/mod")
    public boolean mod(@RequestBody WordLesson1 wordLesson1){
        return wordLesson1Service.mod(wordLesson1);
    }

    @PostMapping("/addOrMod")
    public boolean addOrMod(@RequestBody WordLesson1 wordLesson1){
        return wordLesson1Service.addOrMod(wordLesson1);
    }

    @GetMapping("/delete")
    public boolean delete(@RequestParam Integer id){
        return wordLesson1Service.delete(id);
    }

    @GetMapping("/likeFindAll")
    public Map<String, Object> likeFindAll(@RequestParam String mean, @RequestParam Integer pageNum, @RequestParam Integer pageSize){
        List<WordLesson1> list = wordLesson1Service.likeFindAll(mean, pageNum, pageSize);
        return getStringObjectMap(list);
    }

    private Map<String, Object> getStringObjectMap(List<WordLesson1> list) {
        Map<String, Object> map = new LinkedHashMap<>();
        map.put("code", 200);
        map.put("msg", "success");
        map.put("total", list.size());
        map.put("data", list);
        return map;
    }
}
