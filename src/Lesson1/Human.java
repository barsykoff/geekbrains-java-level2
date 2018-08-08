package Lesson1;

public class Human implements Competitor {
    String name;

    int maxRunDistance;
    int maxJumpHeight;
    int maxSwimDistance;

    boolean active;

    public Human(String name) {
        this.name = name;
        this.maxRunDistance = 5000;
        this.maxJumpHeight = 30;
        this.maxSwimDistance = 200;
        this.active = true;
    }

    @Override
    public void run(int dist) {
        if(dist <= maxRunDistance) {
            System.out.println(name + " успех");
        } else {
            System.out.println(name + " провал");
            active = false;
        }
    }

    @Override
    public void swim(int dist) {
        if(dist <= maxJumpHeight) {
            System.out.println(name + " успех");
        } else {
            System.out.println(name + " провал");
            active = false;
        }
    }

    @Override
    public void jump(int height) {
        if(height <= maxSwimDistance) {
            System.out.println(name + " успех");
        } else {
            System.out.println(name + " провал");
            active = false;
        }
    }

    @Override
    public boolean isOnDistance() {
        return active;
    }

    @Override
    public void info() {
        System.out.println(name);
    }

    @Override
    public void showResult() {
        if (active) {
            System.out.println(name + " " + active);
        }
    }
}
