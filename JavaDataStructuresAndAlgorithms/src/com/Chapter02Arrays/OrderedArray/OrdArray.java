package com.Chapter02Arrays.OrderedArray;

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

    public void insert(int value) {
        int i;
        for (i = 0; i < nElement ; i++) {
            if(value < a[i]){
                break;
            }
        }
        for (int j = nElement; j > i; j--) {
            a[j] = a[j-1];
        }
        a[i] = value;
        nElement++;
    }

    public boolean delete(int value){

        return true;
    }


}

class Main {
    public static void main(String[] args) {
        OrdArray a = new OrdArray(5);
        a.insert(15);
        a.insert(12);
        a.insert(55);
        a.insert(18);

        a.display();
    }
}