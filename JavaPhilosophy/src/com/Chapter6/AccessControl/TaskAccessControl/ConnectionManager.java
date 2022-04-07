package com.Chapter6.AccessControl.TaskAccessControl;

class Connection{
    private Connection() {}
    private static Connection[] massConnection = new Connection[5];
    private static int j = -1;

    public static Connection instantiation(){
        j++;

        if (j >= massConnection.length){
            return null;
        }

        return massConnection[j] = new Connection();
    }
}

public class ConnectionManager {
    public static void main(String[] args) {
        //Задание 8.
        for (int i = 0; i < 8; i++) {
            System.out.println(Connection.instantiation());
        }

    }
}
