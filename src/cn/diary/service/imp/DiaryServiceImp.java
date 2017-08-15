package cn.diary.service.imp;

import cn.diary.pojo.User;
import cn.diary.pojo.Diary;
import cn.diary.service.IDiaryService;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class DiaryServiceImp implements IDiaryService {

    @Override
    public List<Diary> list(User user) {
        return null;
    }

    @Override
    public int add(Diary diary) {
        return 0;
    }

    @Override
    public int delete(Diary diary) {
        return 0;
    }

    @Override
    public int update(Diary diary) {
        return 0;
    }
}
