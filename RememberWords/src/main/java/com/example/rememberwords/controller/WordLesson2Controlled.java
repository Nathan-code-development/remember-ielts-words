package com.example.rememberwords.controller;

import com.example.rememberwords.entity.WordLesson2;
import com.example.rememberwords.service.WordLesson2Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/WordLesson2")
public class WordLesson2Controlled {
    @Autowired
    private WordLesson2Service wordLesson2Service;
    @GetMapping("/findAll")
    public Map<String, Object> findAll(){
        List<WordLesson2> list = wordLesson2Service.findAll();
        return getStringObjectMap(list);
    }

    @GetMapping("/findOrderData")
    public Map<String, Object> findOrderData(@RequestParam Integer pageNum, @RequestParam Integer pageSize){
        List<WordLesson2> list = wordLesson2Service.findOrderData(pageNum, pageSize);
        return getStringObjectMap(list);
    }

    @PostMapping("/add")
    public boolean add(@RequestBody WordLesson2 wordLesson2){
        return wordLesson2Service.add(wordLesson2);
    }

    @PostMapping("/mod")
    public boolean mod(@RequestBody WordLesson2 wordLesson2){
        return wordLesson2Service.mod(wordLesson2);
    }

    @PostMapping("/addOrMod")
    public boolean addOrMod(@RequestBody WordLesson2 wordLesson2){
        return wordLesson2Service.addOrMod(wordLesson2);
    }

    @GetMapping("/delete")
    public boolean delete(@RequestParam Integer id){
        return wordLesson2Service.delete(id);
    }

    @GetMapping("/likeFindAll")
    public Map<String, Object> likeFindAll(@RequestParam String mean, @RequestParam Integer pageNum, @RequestParam Integer pageSize){
        List<WordLesson2> list = wordLesson2Service.likeFindAll(mean, pageNum, pageSize);
        return getStringObjectMap(list);
    }

    private Map<String, Object> getStringObjectMap(List<WordLesson2> list) {
        Map<String, Object> map = new LinkedHashMap<>();
        map.put("code", 200);
        map.put("msg", "success");
        map.put("total", list.size());
        map.put("data", list);
        return map;
    }
}
