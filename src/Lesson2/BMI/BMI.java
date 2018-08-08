package Lesson2.BMI;

import java.math.BigDecimal;

public class BMI {

    public enum Categories{

        UNDER("недостаточная масса", 18.5),
        NORMAL("норма", 25),
        OVER("избыточная масса", 30),
        OBESE("ожирение", Double.POSITIVE_INFINITY);

        private String title;
        private double minBMI;

        Categories(String title, double minBMI) {
            this.title = title;
            this.minBMI = minBMI;
        }

        public String getTitle() {
            return title;
        }

        public double getMinBMI() {
            return minBMI;
        }
    }

    // Метод расчета индекса массы тела
    public double getBMI(int weight, double height) {
        return weight / Math.pow(height, 2);
    }

    // Метод определения категории по рассчитанному индексу массы тела
    public void getCategoryBMI(Patient... patients) {
        double bmi;
        BigDecimal bd;

        for (Patient p: patients) {
            bmi = getBMI(p.getWeight(), p.getHeight());
            bd = new BigDecimal(bmi);
            for (Categories cat: Categories.values()) {
                if (bmi < cat.getMinBMI()) {
                    System.out.println("У пациента " + p.getName() + " " + cat.getTitle() + ", индекс массы тела равен " + bd.setScale(2, BigDecimal.ROUND_CEILING) + ".");
                    break;
                }
            }
        }
    }

}

