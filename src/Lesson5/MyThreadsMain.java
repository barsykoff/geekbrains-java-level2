package Lesson5;

public class MyThreadsMain {

    public static void main(String[] args) {

        MyThreads myThreads = new MyThreads(10000000);

        myThreads.oneThreadProcessing();

        myThreads.twoThreadProcessing();
    }
}
