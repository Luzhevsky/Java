package com.Chapter02Arrays;

class Array{
    private int[] a;
    private int nElements;

    Array(int size){
        a = new int[size];
        nElements = 0;
    }

    /** Метод добавления элемента массива
     * @param index Индекс элемента
     * @param element Переданное значение
     * */
    public void setElem(int index, int element){
        if(index >= a.length){
            System.out.println("Ошибка индекса, выход за приделы массива.");
        } else {
            a[index] = element;
            nElements++;
        }
    }
    /** Метод получение элемента по индексу возвращаемое значение int.
     * @param  index индекс элемента.
     * @return элемент массива с индексом index;
     * */
    public int getElem(int index){
        if(index > a.length){
            System.out.println("Ошибка индекса, выход за приделы массива.");
            return 0;
        } else {
            return a[index];
        }
    }

    /** Метод вывода массива в консоль.
     *
     */
    public void display(){
        for (int i = 0; i < a.length; i++) {
            System.out.print("a[" + i + "]=" + a[i]);
            System.out.println();
        }
        System.out.println("Количество заполненных элементов = " + nElements);

    }

    /** Существует ли элемент в массиве.
     * @param searchKey передаем значение элемента массива.
     * @return true если элемент найден
     */
    public boolean find(int searchKey){
        int i;
        for (i = 0; i < a.length; i++) {
            if(a[i] == searchKey){
                break;
            }
        }
        if(i == nElements){
            return false;
        } else {
            return true;
        }
    }

    /** Удаление элемента массива.
     *
     * @param value значение которое нужно удалить
     * @return true или false в зависимости удалось ли удалить элемента.
     */

    public boolean delete(int value){
        int j;
        for (j = 0; j < nElements; j++) {
            if(a[j] == value) break;
        }
        if(j == nElements){
            return false;
        } else {
            for (int i = j; i < nElements ; i++) {
                if(i == nElements - 1){
                    a[i] = 0;
                } else {
                    a[i] = a[i+1];
                }
            }
            nElements--;
            return true;
        }
    }

    /** Сортировки пузырьком
     *
     */
    public void sortBubble(){
        //нужно отсортировать только элементы которые заполнены в массиве.
        int m = 0;
        boolean sorted = false;
        while(!sorted) {
            sorted = true;
            for (int i = 0; i < nElements - 1; i++) {
                if (a[i] > a[i + 1]) {
                    m = a[i];
                    a[i] = a[i + 1];
                    a[i + 1] = m;
                    sorted = false;
                }
            }
        }
    }
    public void sortBubbleDESC(){
        //нужно отсортировать только элементы которые заполнены в массиве.
        int m = 0;
        boolean sorted = false;
        while(!sorted) {
            sorted = true;
            for (int i = 0; i < nElements - 1; i++) {
                if (a[i] < a[i + 1]) {
                    m = a[i];
                    a[i] = a[i + 1];
                    a[i + 1] = m;
                    sorted = false;
                }
            }
        }
    }
    public void sortBubble2() {
        //нужно отсортировать только элементы которые заполнены в массиве.
        int m = 0;
        for (int i = 0; i < nElements; i++) {
            for (int j = 0; j < nElements - 1; j++) {
                if (a[j] > a[j + 1]) {
                    m = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = m;
                }

            }
        }
    }

//    /**
//     * Работает только в упорядоченном массиве. Тоесть элемента 1 23 667 25555; по возрастанию.
//     * @param searchKey
//     * @return
//     */
//
    public int findBinary(int value){
        int lowerBorder = 0;
        int upperBorder = nElements - 1;
        int center;
        while (true) {
            center = (lowerBorder + upperBorder) / 2;
            if (a[center] == value) {
                return center; //номер
            } else if (lowerBorder > upperBorder) {
                return -1;
            } else {
                if (value > a[center]) {
                    lowerBorder = center + 1;
                } else {
                    upperBorder = center - 1;
                }
            }
        }

    }

    /**
     * Метод getMax возвращает наибольший элемент массива.
     * @return возвращает элемент массива типа int или -1 если массив пуст.
     */
    public int getMax(){
        int max = a[0];
        if(nElements > 1){
            for (int i = 0; i < nElements; i++) {
                if(a[i] > max){
                    max = a[i];
                }
            }
            return max;
        } else {
            return -1;
        }
    }

    /**Удаляет максимальный элеымент массива
     *
     * @return возвращает элемент массива и удаляет его
     */
    public int maxRemove(){
        int max = a[0];
        if(nElements > 1){
            for (int i = 0; i < nElements; i++) {
                if(a[i] > max){
                    max = a[i];
                }
            }
            delete(max);
            return max;
        } else {
            return -1;
        }
    }

    /**
     * С
     */
}

class Person {
    private String firstName;
    private String lastName;
    int age;

    public Person(String lastName, String firstName, int age){
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }
    public void displayPerson(){
        System.out.print(firstName + " ");
        System.out.print(lastName);
        System.out.println(", Возраст " + age + " года");
    }
    public String getLastName(){
        return lastName;
    }
}

class Dota2Team {
    private String name;
    private String region;
    private String organization = "Not";
    public Dota2Team(String name, String region, String organization){
        this.name = name;
        this.region = region;
        this.organization = organization;
    }
    public Dota2Team(String name, String region){
        this.name = name;
        this.region = region;
    }

}

class DataPersonArray{
    private Person[] a;
    private int nElements;

    public DataPersonArray(int max){
        a = new Person[max];
        nElements = 0;
    }


    public void insert(String lastName, String firstName, int age){
            a[nElements] = new Person(lastName, firstName, age);
            nElements++;
    }

    /** Метод получение элемента по индексу возвращаемое значение int.
     * @param  index индекс элемента.
     * @return элемент массива с индексом index;
     * */
    public Person getElem(int index){
        if(index > a.length){
            System.out.println("Ошибка индекса, выход за приделы массива.");
            return null;
        } else {
            return a[index];
        }
    }

    /** Метод вывода массива в консоль.
     *
     */
    public void display(){
        for (int i = 0; i < nElements; i++) {
            System.out.print("a[" + i + "]=");
            a[i].displayPerson();
        }
        System.out.println("Количество заполненных элементов = " + nElements);

    }

    /** Существует ли элемент в массиве.
     * @param searchLastName сверяем фамилию.
     * @return true если элемент найден
     */
    public Person find(String searchLastName){
        int i;
        for (i = 0; i < a.length; i++) {
            if(a[i].getLastName().equals(searchLastName)){
                break;
            }
        }
        if(i == nElements){
            return null;
        } else {
            return a[i];
        }
    }


    public boolean delete(String searchLastName){
        int j;
        for (j = 0; j < nElements; j++) {
            if(a[j].getLastName().equals(searchLastName)) break;
        }
        if(j == nElements){
            return false;
        } else {
            for (int i = j; i < nElements ; i++) {
                if(i == nElements - 1){
                    a[i] = null;
                } else {
                    a[i] = a[i+1];
                }
            }
            nElements--;
            return true;
        }
    }

    public int findBinary(int value){

        return 0;
    }


}

public class Main {
    public static void main(String[] args) {
        Array a = new Array(10);
        a.setElem(0, 631);
        a.setElem(1,1);
        a.setElem(2,102);
        a.setElem(3,144);
        a.setElem(4,467);
        a.setElem(5,292);
        a.setElem(6,230);
        a.setElem(7,231);
        a.setElem(8,232);
        a.setElem(9,832);

        a.display();
        a.sortBubble();
        a.display();

        System.out.println(a.getMax());
        System.out.println(a.maxRemove());
        a.display();

//        a.display();
//        a.delete(443);
//        a.display();
//
//        Person p = new Person("Лужевский", "Иван" , 24);
//
//        DataPersonArray personArray = new DataPersonArray(10);
//
//        personArray.insert("Лужевский", "Дмитрий", 26);
//        personArray.insert("Иванов", "Олег", 29);
//        personArray.insert("Турский", "Алексей", 33);
//        personArray.insert("Хусейнов", "Анатолий", 20);
//        personArray.insert("Хусе", "Анатолий", 41);
//        personArray.insert("Сидоров", "Константин", 31);
//        personArray.display();
//        System.out.println();
//        personArray.delete("Иванов");
//        personArray.display();
    }

}
