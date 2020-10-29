package com.company;

//1. Обработать непроверяемое исключение ArrayIndexOutOfBoundsException.
//        • Создать класс ArrayExceptionTest
//        • Создать main метод
//        • Создать и проинициализировать произвольный массив из 5-6 элементов.
//        • Создать статический метод printArray(array, start, end),который выводит на
//        экран элементы массива от индекса start до индекса end.
//        • Добавить обработку исключения ArrayIndexOutOfBoundsException, для
//        операции получения элемента массива по индексу. При возникновении ошибки
//        выводить на экран сообщение вид: «Ошибка. Попытка обращения к
//        несуществующему индексу: текущий индекс = i; размер массива = s;»
//        • Вызвать несколько раз (с разными значениями) метод printArray в методе main
//        для созданного ранее массива.

public class ArrayExceptionTest {


    public static void main(String[] args) {
        int[] Array = new int[]{3, 4, 5, 2, 3};
        printArray(Array, 2, 10);


    }

    public static void printArray(int[] array, int start, int end) {
        int i = 0;
        try {
            for (i = start; i <= end; i++) {
                System.out.println(array[i]);
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("«Ошибка. Попытка обращения к несуществующему индексу: текущий индекс = " +
                    i + ", размер массива = " + array.length);
        }


    }
}


