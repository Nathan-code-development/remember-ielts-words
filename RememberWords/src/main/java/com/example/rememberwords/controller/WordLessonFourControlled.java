package com.example.rememberwords.controller;

import com.example.rememberwords.entity.WordLessonFour;
import com.example.rememberwords.service.WordLessonFourService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/WordLessonFour")
public class WordLessonFourControlled {
    @Autowired
    private WordLessonFourService wordLessonFourService;
    @GetMapping("/findAll")
    public Map<String, Object> findAll(){
        List<WordLessonFour> list = wordLessonFourService.findAll();
        return getStringObjectMap(list);
    }

    @GetMapping("/findOrderData")
    public Map<String, Object> findOrderData(@RequestParam Integer pageNum, @RequestParam Integer pageSize){
        List<WordLessonFour> list = wordLessonFourService.findOrderData(pageNum, pageSize);
        return getStringObjectMap(list);
    }

    @PostMapping("/add")
    public boolean add(@RequestBody WordLessonFour wordLessonFour){
        return wordLessonFourService.add(wordLessonFour);
    }

    @PostMapping("/mod")
    public boolean mod(@RequestBody WordLessonFour wordLessonFour){
        return wordLessonFourService.mod(wordLessonFour);
    }

    @PostMapping("/addOrMod")
    public boolean addOrMod(@RequestBody WordLessonFour wordLessonFour){
        return wordLessonFourService.addOrMod(wordLessonFour);
    }

    @GetMapping("/delete")
    public boolean delete(@RequestParam Integer id){
        return wordLessonFourService.delete(id);
    }

    @GetMapping("/likeFindAll")
    public Map<String, Object> likeFindAll(@RequestParam String mean, @RequestParam Integer pageNum, @RequestParam Integer pageSize){
        List<WordLessonFour> list = wordLessonFourService.likeFindAll(mean, pageNum, pageSize);
        return getStringObjectMap(list);
    }

    private Map<String, Object> getStringObjectMap(List<WordLessonFour> list) {
        Map<String, Object> map = new LinkedHashMap<>();
        map.put("code", 200);
        map.put("msg", "success");
        map.put("total", list.size());
        map.put("data", list);
        return map;
    }
}
