package cn.diary.pojo;

public class Diary {
    private String DiaryContext;
    private String date;

    public Diary() {
    }

    public String getDiaryContext() {
        return DiaryContext;
    }

    public void setDiaryContext(String diaryContext) {
        DiaryContext = diaryContext;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Diary{" +
                "DiaryContext='" + DiaryContext + '\'' +
                ", date='" + date + '\'' +
                '}';
    }
}
