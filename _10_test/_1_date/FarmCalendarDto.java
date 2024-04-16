package _1_javaExerciseForGithub._10_test._1_date;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

public class FarmCalendarDto {
    private LocalDate date;
    private List<LocalTime> timeList;

    public FarmCalendarDto(LocalDate date, List<LocalTime> timeList) {
        this.date = date;
        this.timeList = timeList;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public List<LocalTime> getTimeList() {
        return timeList;
    }

    public void setTimeList(List<LocalTime> timeList) {
        this.timeList = timeList;
    }
}
