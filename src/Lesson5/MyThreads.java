package Lesson5;

public class MyThreads {

    private int size;

    // Я сделал исходный массив сразу float, иначе при копировании массивов возникает беда с преобразованием из int -> float
    private float[] arr;

    public MyThreads(int size) {
        this.size = size;

        arr = new float[size];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = 1;
        }
    }

    // Обработка массива в один поток
    public synchronized void oneThreadProcessing() {
        long a = System.currentTimeMillis();

        for (int i = 0; i < arr.length; i++) {
            arr[i] = (float) (arr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
        }

        System.out.println("Время выполнения метода в один поток: " + (System.currentTimeMillis() - a) + " мс.");
    }


    // Обработка массива в два потока
    public synchronized void twoThreadProcessing() {
        int h = size / 2;

        long a = System.currentTimeMillis();

        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                float[] tmpArr1 = new float[h];

                System.arraycopy(arr, 0, tmpArr1, 0, h);

                for (int i = 0; i < tmpArr1.length; i++) {
                    tmpArr1[i] = (float) (tmpArr1[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
                }

                System.arraycopy(tmpArr1, 0, arr, 0, tmpArr1.length);
            }
        });

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                float[] tmpArr2 = new float[size - h];

                System.arraycopy(arr, h, tmpArr2, 0, size - h);

                for (int i = 0; i < tmpArr2.length; i++) {
                    tmpArr2[i] = (float) (tmpArr2[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
                }

                System.arraycopy(tmpArr2, 0, arr, h, tmpArr2.length);
            }
        });

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Время выполнения метода в два потока: " + (System.currentTimeMillis() - a) + " мс.");

    }


//    // Обработка массива в несколько потоков
//    public synchronized void multiThreadProcessing(int num) {
//        if (num < 1) {
//            throw new IllegalArgumentException("Кол-во потоков не может быть меньше 1!");
//        }
//
//        Thread[] threads = new Thread[num];
//        float[][] arrays = new float[num][];
//
//        int h = size / num;
//        int i;
//
//        long a = System.currentTimeMillis();
//
//        // Делим массив на подмассивы и обрабатываем его
//        for (i = 0; i < num - 1; i++) {
//            System.arraycopy(arr, i * h, arrays[i], 0, h);
//
//            threads[i] = new Thread(new Runnable() {
//                @Override
//                public void run() {
//                    for (int j = 0; j < arrays[i].length; j++) {
//
//                    }
//                }
//            });
//        }
//        System.arraycopy(arr, i * h, arrays[i], 0, arr.length - i * h);
//
//
//
//    }
}
