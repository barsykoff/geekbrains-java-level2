package Lesson2.Exceptions;

public class MyExceptionsMain {

    public static void main(String[] args) {

        String[][] array1 = {
                {"123", "456", "789", "012"},
                {"345", "678", "901", "234"},
                {"5g7", "890", "123", "456"},
                {"789", "012", "345", "678"}
        };

        try {
            System.out.println(sumArray(array1));
        } catch (MyArraySizeException e) {
            e.printStackTrace();
        } catch (MyArrayDataException e) {
            e.printStackTrace();
        }
    }

    public static int sumArray(String[][] arr) throws MyArraySizeException, MyArrayDataException {
        int rows = 4;
        int columns = 4;
        int sum = 0;
        String str;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if(i > rows - 1) throw new MyArraySizeException("Превышен размер массива по вертикали - " + rows + "!");
                if(j > columns - 1) throw new MyArraySizeException("Превышен размер массива по горизонтали - " + columns + "!");

                str = arr[i][j];
                for (int k = 0; k < str.length(); k++) {
                    char c = str.charAt(k);
                    if (!Character.isDigit(c)) throw new MyArrayDataException("Массив содержит недопустимые символы в ячейке " + (j + 1) + "x" + (i + 1));
                }
                sum += Integer.parseInt(str);
            }
        }

        return sum;
    }
}
