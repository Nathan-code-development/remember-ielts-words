package com.example.rememberwords.controller;

import com.example.rememberwords.entity.WordLessonOne;
import com.example.rememberwords.service.WordLessonOneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/WordLessonOne")
public class WordLessonOneControlled {
    @Autowired
    private WordLessonOneService wordLessonOneService;
    @GetMapping("/findAll")
    public Map<String, Object> findAll(){
        List<WordLessonOne> list = wordLessonOneService.findAll();
        return getStringObjectMap(list);
    }

    @GetMapping("/findOrderData")
    public Map<String, Object> findOrderData(@RequestParam Integer pageNum, @RequestParam Integer pageSize){
        List<WordLessonOne> list = wordLessonOneService.findOrderData(pageNum, pageSize);
        return getStringObjectMap(list);
    }

    @PostMapping("/add")
    public boolean add(@RequestBody WordLessonOne wordLessonOne){
        return wordLessonOneService.add(wordLessonOne);
    }

    @PostMapping("/mod")
    public boolean mod(@RequestBody WordLessonOne wordLessonOne){
        return wordLessonOneService.mod(wordLessonOne);
    }

    @PostMapping("/addOrMod")
    public boolean addOrMod(@RequestBody WordLessonOne wordLessonOne){
        return wordLessonOneService.addOrMod(wordLessonOne);
    }

    @GetMapping("/delete")
    public boolean delete(@RequestParam Integer id){
        return wordLessonOneService.delete(id);
    }

    @GetMapping("/likeFindAll")
    public Map<String, Object> likeFindAll(@RequestParam String mean, @RequestParam Integer pageNum, @RequestParam Integer pageSize){
        List<WordLessonOne> list = wordLessonOneService.likeFindAll(mean, pageNum, pageSize);
        return getStringObjectMap(list);
    }

    private Map<String, Object> getStringObjectMap(List<WordLessonOne> list) {
        Map<String, Object> map = new LinkedHashMap<>();
        map.put("code", 200);
        map.put("msg", "success");
        map.put("total", list.size());
        map.put("data", list);
        return map;
    }
}
