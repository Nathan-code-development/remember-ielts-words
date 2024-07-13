package com.example.rememberwords.controller;

import com.example.rememberwords.entity.WordLesson6;
import com.example.rememberwords.service.WordLesson6Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/WordLesson6")
public class WordLesson6Controlled {
    @Autowired
    private WordLesson6Service wordLesson6Service;
    @GetMapping("/findAll")
    public Map<String, Object> findAll(){
        List<WordLesson6> list = wordLesson6Service.findAll();
        return getStringObjectMap(list);
    }

    @GetMapping("/findOrderData")
    public Map<String, Object> findOrderData(@RequestParam Integer pageNum, @RequestParam Integer pageSize){
        List<WordLesson6> list = wordLesson6Service.findOrderData(pageNum, pageSize);
        return getStringObjectMap(list);
    }

    @PostMapping("/add")
    public boolean add(@RequestBody WordLesson6 wordLesson6){
        return wordLesson6Service.add(wordLesson6);
    }

    @PostMapping("/mod")
    public boolean mod(@RequestBody WordLesson6 wordLesson6){
        return wordLesson6Service.mod(wordLesson6);
    }

    @PostMapping("/addOrMod")
    public boolean addOrMod(@RequestBody WordLesson6 wordLesson6){
        return wordLesson6Service.addOrMod(wordLesson6);
    }

    @GetMapping("/delete")
    public boolean delete(@RequestParam Integer id){
        return wordLesson6Service.delete(id);
    }

    @GetMapping("/likeFindAll")
    public Map<String, Object> likeFindAll(@RequestParam String mean, @RequestParam Integer pageNum, @RequestParam Integer pageSize){
        List<WordLesson6> list = wordLesson6Service.likeFindAll(mean, pageNum, pageSize);
        return getStringObjectMap(list);
    }

    private Map<String, Object> getStringObjectMap(List<WordLesson6> list) {
        Map<String, Object> map = new LinkedHashMap<>();
        map.put("code", 200);
        map.put("msg", "success");
        map.put("total", list.size());
        map.put("data", list);
        return map;
    }
}
