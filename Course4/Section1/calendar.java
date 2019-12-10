package Course4.Section1;

import java.time.DayOfWeek;
import java.time.LocalDate;
/**
 * 打印当前月份的日历
 * */
public class calendar {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        // 当前月份12
        int month = date.getMonthValue();
        // 当前日期10
        int today = date.getDayOfMonth();
        // 设置时间为月初
        date = date.minusDays(today - 1);
        // SUNDAY
        DayOfWeek week = date.getDayOfWeek();
        // 7
        int value = week.getValue();
        System.out.println("Mon Tue Wed Thu Fri Sat Sun");
        // 输出第一行缩进
        for (int i = 1; i < value; i++) {
            System.out.print("    ");
        }
        // 此时date记录的是月初日期
        while (date.getMonthValue() == month) {
            // 输出当前date相对当前月份的日期
            System.out.printf("%3d", date.getDayOfMonth());
            if (date.getDayOfMonth() == today) {
                System.out.print("*");
            } else {
                System.out.print(" ");
            }
            // date向后+1天
            date = date.plusDays(1);
            // 判断当前日期相对当前周的日期, 如果是一周的第一天,换行
            if (date.getDayOfWeek().getValue() == 1) {
                System.out.println();
            }
        }
        if (date.getDayOfWeek().getValue() != 1) {
            System.out.println();
        }
    }
}
