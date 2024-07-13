package com.example.rememberwords.controller;

import com.example.rememberwords.entity.WordLesson3;
import com.example.rememberwords.service.WordLesson3Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/WordLesson3")
public class WordLesson3Controlled {
    @Autowired
    private WordLesson3Service wordLesson3Service;
    @GetMapping("/findAll")
    public Map<String, Object> findAll(){
        List<WordLesson3> list = wordLesson3Service.findAll();
        return getStringObjectMap(list);
    }

    @GetMapping("/findOrderData")
    public Map<String, Object> findOrderData(@RequestParam Integer pageNum, @RequestParam Integer pageSize){
        List<WordLesson3> list = wordLesson3Service.findOrderData(pageNum, pageSize);
        return getStringObjectMap(list);
    }

    @PostMapping("/add")
    public boolean add(@RequestBody WordLesson3 wordLesson3){
        return wordLesson3Service.add(wordLesson3);
    }

    @PostMapping("/mod")
    public boolean mod(@RequestBody WordLesson3 wordLesson3){
        return wordLesson3Service.mod(wordLesson3);
    }

    @PostMapping("/addOrMod")
    public boolean addOrMod(@RequestBody WordLesson3 wordLesson3){
        return wordLesson3Service.addOrMod(wordLesson3);
    }

    @GetMapping("/delete")
    public boolean delete(@RequestParam Integer id){
        return wordLesson3Service.delete(id);
    }

    @GetMapping("/likeFindAll")
    public Map<String, Object> likeFindAll(@RequestParam String mean, @RequestParam Integer pageNum, @RequestParam Integer pageSize){
        List<WordLesson3> list = wordLesson3Service.likeFindAll(mean, pageNum, pageSize);
        return getStringObjectMap(list);
    }

    private Map<String, Object> getStringObjectMap(List<WordLesson3> list) {
        Map<String, Object> map = new LinkedHashMap<>();
        map.put("code", 200);
        map.put("msg", "success");
        map.put("total", list.size());
        map.put("data", list);
        return map;
    }
}
