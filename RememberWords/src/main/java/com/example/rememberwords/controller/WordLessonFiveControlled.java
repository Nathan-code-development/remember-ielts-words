package com.example.rememberwords.controller;

import com.example.rememberwords.entity.WordLessonFive;
import com.example.rememberwords.service.WordLessonFiveService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/WordLessonFive")
public class WordLessonFiveControlled {
    @Autowired
    private WordLessonFiveService wordLessonFiveService;
    @GetMapping("/findAll")
    public Map<String, Object> findAll(){
        List<WordLessonFive> list = wordLessonFiveService.findAll();
        return getStringObjectMap(list);
    }

    @GetMapping("/findOrderData")
    public Map<String, Object> findOrderData(@RequestParam Integer pageNum, @RequestParam Integer pageSize){
        List<WordLessonFive> list = wordLessonFiveService.findOrderData(pageNum, pageSize);
        return getStringObjectMap(list);
    }

    @PostMapping("/add")
    public boolean add(@RequestBody WordLessonFive wordLessonFive){
        return wordLessonFiveService.add(wordLessonFive);
    }

    @PostMapping("/mod")
    public boolean mod(@RequestBody WordLessonFive wordLessonFive){
        return wordLessonFiveService.mod(wordLessonFive);
    }

    @PostMapping("/addOrMod")
    public boolean addOrMod(@RequestBody WordLessonFive wordLessonFive){
        return wordLessonFiveService.addOrMod(wordLessonFive);
    }

    @GetMapping("/delete")
    public boolean delete(@RequestParam Integer id){
        return wordLessonFiveService.delete(id);
    }

    @GetMapping("/likeFindAll")
    public Map<String, Object> likeFindAll(@RequestParam String mean, @RequestParam Integer pageNum, @RequestParam Integer pageSize){
        List<WordLessonFive> list = wordLessonFiveService.likeFindAll(mean, pageNum, pageSize);
        return getStringObjectMap(list);
    }

    private Map<String, Object> getStringObjectMap(List<WordLessonFive> list) {
        Map<String, Object> map = new LinkedHashMap<>();
        map.put("code", 200);
        map.put("msg", "success");
        map.put("total", list.size());
        map.put("data", list);
        return map;
    }
}
