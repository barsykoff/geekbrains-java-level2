package Lesson1;

public abstract class Obstacle {
    public abstract void doIt(Team team);
}

class Wall extends Obstacle {
    int height;

    public Wall(int height) {
        this.height = height;
    }

    @Override
    public void doIt(Team team) {
        for (Competitor c: team.competitors) {
            c.jump(height);
        }
    }
}

class Water extends Obstacle {
    int length;

    public Water(int length) {
        this.length = length;
    }

    @Override
    public void doIt(Team team) {
        for (Competitor c: team.competitors) {
            c.swim(length);
        }
    }
}

class Cross extends Obstacle {
    int length;

    public Cross(int length) {
        this.length = length;
    }
    @Override
    public void doIt(Team team) {
        for (Competitor c: team.competitors) {
            c.run(length);
        }
    }
}


class MainCross {
    public static void main(String[] args) {
        Competitor[] competitors = {new Human("Bob"), new Human("Mary"), new Cat("Vaska"), new Dog("Murzik")};
        Obstacle[] course = {new Cross(80), new Wall(5), new Water(3)};

        Team team = new Team("Крылья Советов", competitors, course);

        team.teamInfo();

        team.go();

        team.showResults();
    }
}