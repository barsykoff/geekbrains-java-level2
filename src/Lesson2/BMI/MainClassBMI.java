package Lesson2.BMI;

public class MainClassBMI {

    public static void main(String[] args) {

        Patient[] patients = {
                new Patient("Росен", 118, 2.05)
                , new Patient("Тотка", 106, 1.77)
                , new Patient("Златко", 87, 1.83)
                , new Patient("Роза", 45, 1.12)
                , new Patient("Светлин", 70, 1.87)
                , new Patient("Гергана", 54, 1.57)
                , new Patient("Владислав", 105, 1.76)
                , new Patient("Евгения", 50, 1.96)
                , new Patient("Марин", 114, 1.76)
                , new Patient("Миглена", 72, 2.45)
                , new Patient("Николай", 53, 2.10)
                , new Patient("Минка", 66, 2.25)
                , new Patient("Емил", 54, 1.50)
                , new Patient("Димитринка", 95, 1.62)
                , new Patient("Динко", 86, 1.72)
                , new Patient("Божанка", 62, 1.57)
                , new Patient("Апостол", 65, 2.24)
                , new Patient("Петранка", 72, 1.43)
                , new Patient("Цветко", 93, 2.01)
                , new Patient("Стоянка", 109, 3.01)
                , new Patient("Милко", 106, 2.97)
                , new Patient("Атанаска", 77, 1.69)
                , new Patient("Димитьр", 114, 2.09)
                , new Patient("Маринка", 98, 1.72)
                , new Patient("Добромир", 85, 2.46)
                , new Patient("Райна", 113, 1.94)
                , new Patient("Бончо", 53, 1.77)
                , new Patient("Румяна", 106, 2.30)};

        BMI bmi = new BMI();

        // Выводим данные о пациентах
        bmi.getCategoryBMI(patients);
    }
}
