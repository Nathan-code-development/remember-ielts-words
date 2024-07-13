package com.example.rememberwords.controller;

import com.example.rememberwords.entity.WordLesson4;
import com.example.rememberwords.service.WordLesson4Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/WordLesson4")
public class WordLesson4Controlled {
    @Autowired
    private WordLesson4Service wordLesson4Service;
    @GetMapping("/findAll")
    public Map<String, Object> findAll(){
        List<WordLesson4> list = wordLesson4Service.findAll();
        return getStringObjectMap(list);
    }

    @GetMapping("/findOrderData")
    public Map<String, Object> findOrderData(@RequestParam Integer pageNum, @RequestParam Integer pageSize){
        List<WordLesson4> list = wordLesson4Service.findOrderData(pageNum, pageSize);
        return getStringObjectMap(list);
    }

    @PostMapping("/add")
    public boolean add(@RequestBody WordLesson4 wordLesson4){
        return wordLesson4Service.add(wordLesson4);
    }

    @PostMapping("/mod")
    public boolean mod(@RequestBody WordLesson4 wordLesson4){
        return wordLesson4Service.mod(wordLesson4);
    }

    @PostMapping("/addOrMod")
    public boolean addOrMod(@RequestBody WordLesson4 wordLesson4){
        return wordLesson4Service.addOrMod(wordLesson4);
    }

    @GetMapping("/delete")
    public boolean delete(@RequestParam Integer id){
        return wordLesson4Service.delete(id);
    }

    @GetMapping("/likeFindAll")
    public Map<String, Object> likeFindAll(@RequestParam String mean, @RequestParam Integer pageNum, @RequestParam Integer pageSize){
        List<WordLesson4> list = wordLesson4Service.likeFindAll(mean, pageNum, pageSize);
        return getStringObjectMap(list);
    }

    private Map<String, Object> getStringObjectMap(List<WordLesson4> list) {
        Map<String, Object> map = new LinkedHashMap<>();
        map.put("code", 200);
        map.put("msg", "success");
        map.put("total", list.size());
        map.put("data", list);
        return map;
    }
}
