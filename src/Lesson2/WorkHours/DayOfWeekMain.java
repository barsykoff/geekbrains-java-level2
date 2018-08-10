package Lesson2.WorkHours;

public class DayOfWeekMain {

    public enum DayOfWeek {

        MONDAY("Понедельник", 8),
        TUESDAY("Вторник", 8),
        WEDNESDAY("Среда", 8),
        THURSDAY("Четверг", 8),
        FRIDAY("Пятница", 8),
        SATURDAY("Суббота", 0),
        SUNDAY("Воскресенье", 0);

        private String title;
        private int workHours;

        DayOfWeek(String title, int workHours) {
            this.title = title;
            this.workHours = workHours;
        }

        public String getTitle() {
            return title;
        }

        public int getWorkHours() {
            return workHours;
        }
    }

    // Вычисляем кол-во оставшихся рабочих часов до конца недели
    public static String getWorkingHours(DayOfWeek day) {
        int hours = 0;
        String result;

        for (DayOfWeek d: DayOfWeek.values()) {
            if (d.ordinal() >= day.ordinal()) {
                hours += d.getWorkHours();
            }
        }
        if (hours == 0) {
            result = "Сейчас выходные, отдыхайте спокойно.";
        } else {
            result = "Осталось продержаться " + hours + " часов.";
        }

        return result;
    }

    public static void main(String[] args) {

        System.out.println(getWorkingHours(DayOfWeek.TUESDAY));
    }
}
