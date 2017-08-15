package cn.diary.controller;

import cn.diary.service.IDiaryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import java.io.IOException;

@Controller
@RequestMapping("/diary/")
public class DiaryController extends BaseController {
    @Autowired
    private IDiaryService diaryService;

    @RequestMapping(value = "{diaryId}*", method = RequestMethod.GET)
    public String list(@PathVariable String diaryId, Model model) throws IOException {
        String hello = "hello";

        model.addAttribute("hello", diaryId);
        System.out.println("ss");

        return "/diary/diary";

    }
}
