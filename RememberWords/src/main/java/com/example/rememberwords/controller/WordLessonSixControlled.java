package com.example.rememberwords.controller;

import com.example.rememberwords.entity.WordLessonSix;
import com.example.rememberwords.service.WordLessonSixService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/WordLessonSix")
public class WordLessonSixControlled {
    @Autowired
    private WordLessonSixService wordLessonSixService;
    @GetMapping("/findAll")
    public Map<String, Object> findAll(){
        List<WordLessonSix> list = wordLessonSixService.findAll();
        return getStringObjectMap(list);
    }

    @GetMapping("/findOrderData")
    public Map<String, Object> findOrderData(@RequestParam Integer pageNum, @RequestParam Integer pageSize){
        List<WordLessonSix> list = wordLessonSixService.findOrderData(pageNum, pageSize);
        return getStringObjectMap(list);
    }

    @PostMapping("/add")
    public boolean add(@RequestBody WordLessonSix wordLessonSix){
        return wordLessonSixService.add(wordLessonSix);
    }

    @PostMapping("/mod")
    public boolean mod(@RequestBody WordLessonSix wordLessonSix){
        return wordLessonSixService.mod(wordLessonSix);
    }

    @PostMapping("/addOrMod")
    public boolean addOrMod(@RequestBody WordLessonSix wordLessonSix){
        return wordLessonSixService.addOrMod(wordLessonSix);
    }

    @GetMapping("/delete")
    public boolean delete(@RequestParam Integer id){
        return wordLessonSixService.delete(id);
    }

    @GetMapping("/likeFindAll")
    public Map<String, Object> likeFindAll(@RequestParam String mean, @RequestParam Integer pageNum, @RequestParam Integer pageSize){
        List<WordLessonSix> list = wordLessonSixService.likeFindAll(mean, pageNum, pageSize);
        return getStringObjectMap(list);
    }

    private Map<String, Object> getStringObjectMap(List<WordLessonSix> list) {
        Map<String, Object> map = new LinkedHashMap<>();
        map.put("code", 200);
        map.put("msg", "success");
        map.put("total", list.size());
        map.put("data", list);
        return map;
    }
}
