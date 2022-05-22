package com.Test;

public class OrdArray {
    private int[] a; // объевляем массив
    private int nElement = 0; //Количество элементов в массиве

    /** Конструктор с параметром определяющий количество элеметов в массиве.
     *
     * @param size количество элементов массиве.
     */
    public OrdArray(int size){
        a = new int[size];
    }

    /** метод выводящиий все элементы массива и их количество
     *
     */
    public void display(){
        for (int i = 0; i < nElement; i++) {
            System.out.println("a[" + i + "]=" + a[i]);
        }
        System.out.println("Количество элементов в массиве = " + nElement);
    }

    /** Insert с сортировкой
     * Сортировочная вставка элемента.
     * @param value передаем значение которое хотим занести в массив.
     */
    public void insert(int value) {
        int i;
        for (i = 0; i < nElement; i++) {
            if(a[i] > value){
                break;
            }
        }
        for (int j = nElement; i < j ; j--) {
            a[j] = a[j - 1];
        }
        a[i] = value;
        nElement++;
    }

    /** Insert с сортитовкой для поиска применялся двоичный поиск.
     *
     * @param value передаем значение которое хотим занести в массив.
     */
    public void insertFindBinary(int value) {
        int lowerBound = 0;
        int upperBound = nElement;
        int center;
        while(true){
            center = (lowerBound + upperBound) / 2;
            if(value >= a[center] && value <= a[center + 1]){
                center++;
                break;
            } else  if(lowerBound > upperBound){
               break;
            } else {
                if(value >= a[center]) {
                    lowerBound = center + 1;
                } else {
                    upperBound = center - 1;
                }
            }

        }

        for (int j = nElement; center < j; j--) {
            a[j] = a[j - 1];
        }
        a[center] = value;
        nElement++;

    }

    /** Удаление элемента массива с значением. Использовалась функция findBinary() для поиска элемента
     *
     * @param value Значение элемента которое надо удалить
     * @return  true если удалось удалить false если нет.
     */
    public boolean delete(int value){
        int f = findBinary(value);
        //f номер элемента
        if(f == -1) {
            return false;
        } else {

            for (int j = f; j < nElement; j++) {
                a[j] = a[j + 1];
            }
            nElement--;
            return true;
        }
    }

    /** Двоичный поиск элемента массива. В теории должен быть быстрее обычного.
     *
     * @param value Значение элемента которое хотим найти
     * @return возвращает ключ i или -1 если элемент не найден.
     */
    public int findBinary(int value){
        int lowerBound = 0;
        int upperBound = nElement;
        int center;
        while(true){
            center = (lowerBound + upperBound) / 2;
            if(value == a[center]) {
                return center;
            } else if(lowerBound > upperBound){
                return -1;
            } else {
                if(value > a[center]){
                    lowerBound = center + 1;
                } else {
                    upperBound = center - 1;
                }
            }
        }
    }

    /** Обычный поиск элемента массива.
     *
     * @param value Значение которое ищем.
     * @return i если нашли -1 если нет.
     */
    public int find(int value){
        int i;
        for (i = 0; i < nElement; i++) {
            if(a[i] == value){
                return i;
            }
        }
        return -1;
    }


}

class Main {
    public static void main(String[] args) {
        int n = 4;
        int m = 3;
        OrdArray a = new OrdArray(25);
        for (int i = 0; i < m ; i++) {
            a.insert(i);
        }

        a.display();
        System.out.println( a.delete(122));
        a.display();
        System.out.println(a.findBinary(18));
        System.out.println(a.find(888));
    }

}