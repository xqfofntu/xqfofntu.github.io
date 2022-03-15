package Javalearn;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class CalendarTest {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        int month = date.getMonthValue();
        int today = date.getDayOfMonth();

        date = date.minusDays(today - 1);//获取本月第一天的日期，当前日期 - 已过去的天数（today - 1）
        DayOfWeek weekday = date.getDayOfWeek();//获取日期是星期几
        int value = weekday.getValue();//1-monday,...,7-sunday

        System.out.println("Mon Tue Wed Thu Fir Sat Sun");
        for (int i = 1; i < value; i++) {
            System.out.print("    ");
        }
        while (date.getMonthValue() == month) {
            System.out.printf("%3d", date.getDayOfMonth());//字符确定内容式样，输出
            if (date.getDayOfMonth() == today) {
                System.out.print("*");
            } else {
                System.out.print(" ");
            }
            date = date.plusDays(1);//日期加一天
            if (date.getDayOfWeek().getValue() == 1) {
                System.out.println();
            }
        }
//        if(date.getDayOfWeek().getValue() != 1){
//            System.out.println();
//        }
    }
}
