package _1_javaExerciseForGithub._10_test._1_date;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        LocalDate data = LocalDate.of(1996, 12, 18);
        System.out.println(data);
        List<LocalTime> timeList = new ArrayList<>();

        timeList.add(LocalTime.of(13, 00));
        timeList.add(LocalTime.of(15, 00));

        FarmCalendarDto farmCalendarDto = new FarmCalendarDto(data, timeList);

    }

    public static void getSlotList(List<LocalTime> listTime) {



    }

}
