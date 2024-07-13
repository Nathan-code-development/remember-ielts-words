package com.example.rememberwords.controller;

import com.example.rememberwords.entity.WordLessonTwo;
import com.example.rememberwords.service.WordLessonTwoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/WordLessonTwo")
public class WordLessonTwoControlled {
    @Autowired
    private WordLessonTwoService wordLessonTwoService;
    @GetMapping("/findAll")
    public Map<String, Object> findAll(){
        List<WordLessonTwo> list = wordLessonTwoService.findAll();
        return getStringObjectMap(list);
    }

    @GetMapping("/findOrderData")
    public Map<String, Object> findOrderData(@RequestParam Integer pageNum, @RequestParam Integer pageSize){
        List<WordLessonTwo> list = wordLessonTwoService.findOrderData(pageNum, pageSize);
        return getStringObjectMap(list);
    }

    @PostMapping("/add")
    public boolean add(@RequestBody WordLessonTwo wordLessonTwo){
        return wordLessonTwoService.add(wordLessonTwo);
    }

    @PostMapping("/mod")
    public boolean mod(@RequestBody WordLessonTwo wordLessonTwo){
        return wordLessonTwoService.mod(wordLessonTwo);
    }

    @PostMapping("/addOrMod")
    public boolean addOrMod(@RequestBody WordLessonTwo wordLessonTwo){
        return wordLessonTwoService.addOrMod(wordLessonTwo);
    }

    @GetMapping("/delete")
    public boolean delete(@RequestParam Integer id){
        return wordLessonTwoService.delete(id);
    }

    @GetMapping("/likeFindAll")
    public Map<String, Object> likeFindAll(@RequestParam String mean, @RequestParam Integer pageNum, @RequestParam Integer pageSize){
        List<WordLessonTwo> list = wordLessonTwoService.likeFindAll(mean, pageNum, pageSize);
        return getStringObjectMap(list);
    }

    private Map<String, Object> getStringObjectMap(List<WordLessonTwo> list) {
        Map<String, Object> map = new LinkedHashMap<>();
        map.put("code", 200);
        map.put("msg", "success");
        map.put("total", list.size());
        map.put("data", list);
        return map;
    }
}
