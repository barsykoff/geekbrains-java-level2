package Lesson1;

public class Team {
    String name;

    Competitor[] competitors;
    Obstacle[] course;

    public Team(String name, Competitor[] competitors, Obstacle[] course) {
        this.name = name;
        this.competitors = competitors;
        this.course = course;
    }

    public void teamInfo() {

        System.out.println("Члены команды \"" + name + "\":");
        for (Competitor c: competitors) {
            c.info();
        }
        System.out.println();
    }

    public void go() {

        System.out.println("Результаты:");
        for (Obstacle o : course) {
            o.doIt(this);
        }
    }

    public void showResults() {

        System.out.println();
        System.out.println("Прошедшие дистанцию:");
        for (Competitor c: competitors) {
            c.showResult();
        }
    }
}
