package com.Chapter10InnerClasses.TaskTwelve;

interface Monster {
    void menace();//угроза
}

interface DangerousMonster extends Monster {
    void destroy(); //уничтожать
}

interface Lethal {
    void kill();
}

class DragonZilla{

    public DangerousMonster dangerousMonster() {
        return new DangerousMonster() {
            @Override
            public void menace() {}
            @Override
            public void destroy() {}
        };
    }
}

interface Vampire extends DangerousMonster, Lethal {
    void drinkBlood();
}

class VeryBadVampire{

    public Vampire vampire() {
        return new Vampire() {
            @Override
            public void drinkBlood() {

            }
            @Override
            public void kill() {

            }
            @Override
            public void destroy() {

            }
            @Override
            public void menace() {

            }
        };
    }

}

public class HorrorShow {
    static void u(Monster b) { b.menace(); }
    static void v(DangerousMonster d) {
        d.destroy();
        d.menace();
    }
    static void w(Lethal l) { l.kill();  }

    public static void main(String[] args) {
        DangerousMonster barney = new DragonZilla().dangerousMonster();
        u(barney);
        v(barney);
        Vampire vlad = new VeryBadVampire().vampire();
        u(vlad);
        v(vlad);
        w(vlad);
    }
}
