package com.Chapter6.AccessControl.AccessControlTask4;

import com.Chapter6.AccessControl.debug.ClassWithProtected;
import com.Chapter6.AccessControl.debugoff.ClassWithDifferentControl;

public class ClassAccessControl {
    public static void main(String[] args) {
        //Задание 4. Мы можем использовать метод bit с доступом protected так как класс находится в одном каталоге с нашим.
        ClassBit b = new ClassBit();
        b.bit();
        //Тут метод не можем использовать
        ClassWithProtected b2 = new ClassWithProtected();
        //b2.bit();
        //Задание 5.
        ClassWithDifferentControl control = new ClassWithDifferentControl();
        control.nicName();
//        control.userData(); java: userData() has private access in com.Chapter6.AccessControl.debugoff.ClassWithDifferentControl
//        control.userEmail(); java: userEmail() has protected access in com.Chapter6.AccessControl.debugoff.ClassWithDifferentControl
//        control.userName(); java: userName() is not public in com.Chapter6.AccessControl.debugoff.ClassWithDifferentControl; cannot be accessed from outside package
        //Задание 6.
        control.ClassWorkWithProtectedVariables();
    }


}

/*
* Самостоятельная проверка работы с наследованием. Отличие protected от неуказаня упровня доступа вообще.
* protected дает доступ в пакете и у наследников, если вообще не указывать уровень доступа, то
* метод или свойство будет доступно только в пределах пакета.
* */
class TestAccessControl extends ClassWithDifferentControl{

    public void user(){
        super.nicName(); //public
        super.userEmail(); //protected
//        super.userData(); private
//        super.userName(); Access in the package . Не публичный метод
    }
    @Override
    protected void userEmail() {
        super.userEmail();
    }

    @Override
    public void nicName() {
        super.nicName();
    }

}