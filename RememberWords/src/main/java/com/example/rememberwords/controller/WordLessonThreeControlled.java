package com.example.rememberwords.controller;

import com.example.rememberwords.entity.WordLessonThree;
import com.example.rememberwords.service.WordLessonThreeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/WordLessonThree")
public class WordLessonThreeControlled {
    @Autowired
    private WordLessonThreeService wordLessonThreeService;
    @GetMapping("/findAll")
    public Map<String, Object> findAll(){
        List<WordLessonThree> list = wordLessonThreeService.findAll();
        return getStringObjectMap(list);
    }

    @GetMapping("/findOrderData")
    public Map<String, Object> findOrderData(@RequestParam Integer pageNum, @RequestParam Integer pageSize){
        List<WordLessonThree> list = wordLessonThreeService.findOrderData(pageNum, pageSize);
        return getStringObjectMap(list);
    }

    @PostMapping("/add")
    public boolean add(@RequestBody WordLessonThree wordLessonThree){
        return wordLessonThreeService.add(wordLessonThree);
    }

    @PostMapping("/mod")
    public boolean mod(@RequestBody WordLessonThree wordLessonThree){
        return wordLessonThreeService.mod(wordLessonThree);
    }

    @PostMapping("/addOrMod")
    public boolean addOrMod(@RequestBody WordLessonThree wordLessonThree){
        return wordLessonThreeService.addOrMod(wordLessonThree);
    }

    @GetMapping("/delete")
    public boolean delete(@RequestParam Integer id){
        return wordLessonThreeService.delete(id);
    }

    @GetMapping("/likeFindAll")
    public Map<String, Object> likeFindAll(@RequestParam String mean, @RequestParam Integer pageNum, @RequestParam Integer pageSize){
        List<WordLessonThree> list = wordLessonThreeService.likeFindAll(mean, pageNum, pageSize);
        return getStringObjectMap(list);
    }

    private Map<String, Object> getStringObjectMap(List<WordLessonThree> list) {
        Map<String, Object> map = new LinkedHashMap<>();
        map.put("code", 200);
        map.put("msg", "success");
        map.put("total", list.size());
        map.put("data", list);
        return map;
    }
}
