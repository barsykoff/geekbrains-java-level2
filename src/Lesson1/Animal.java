package Lesson1;

public class Animal implements Competitor {

    String type;
    String name;
    String who;

    int maxRunDistance;
    int maxJumpHeight;
    int maxSwimDistance;

    boolean onDistance;

    public Animal(String type, String name, int maxRunDistance, int maxJumpHeight, int maxSwimDistance) {
        this.type = type;
        this.name = name;
        this.maxRunDistance = maxRunDistance;
        this.maxJumpHeight = maxJumpHeight;
        this.maxSwimDistance = maxSwimDistance;
        this.onDistance = true;
        this.who = type + " " + name + " ";
    }

    @Override
    public void run(int dist) {
        if(dist <= maxRunDistance) {
            System.out.println(who + "успех");
        } else {
            System.out.println(who + "провал");
            onDistance = false;
        }
    }

    @Override
    public void swim(int dist) {
        if(dist <= maxJumpHeight) {
            System.out.println(who + "успех");
        } else {
            System.out.println(who + "провал");
            onDistance = false;
        }
    }

    @Override
    public void jump(int height) {
        if(height <= maxSwimDistance) {
            System.out.println(who + "успех");
        } else {
            System.out.println(who + "провал");
            onDistance = false;
        }
    }

    @Override
    public boolean isOnDistance() {
        return onDistance;
    }

    @Override
    public void info() {
        System.out.println(who);
    }

    @Override
    public void showResult() {
        if (onDistance) {
            System.out.println(who + onDistance);
        }
    }
}
