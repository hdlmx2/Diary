package cn.diary.service;

import cn.diary.pojo.User;
import cn.diary.pojo.Diary;
import org.springframework.stereotype.Service;

import java.util.List;

public interface IDiaryService {
    List<Diary> list(User user);

    int add(Diary diary);

    int delete(Diary diary);

    int update(Diary diary);
}
