package ru.geekbrains.oop.core;

public class Start1 {
    public static void main(String[] args) throws FileNotFoundException {

        int[][] arr = new int[4][4];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = j;
                System.out.print(arr[i][j] + " ");
            }
            System.out.println("");
            File file = new File("src/main/java/ru/geekbrains/oop/core.file");
            System.out.println("Сообщение до создания Scanner");
            Scanner scanner = new Scanner(file);
            System.out.println("Сообщение после создания Scanner");
            try {
                String name = null;
                name.equals("Имя");

                Scanner scanner = new Scanner(file);

            } catch (Throwable e) {
                e.printStackTrace();
            }

        }
    }

    int array[] = {4,4};
    int sum = Array.stream(array).sum();
}
