package com.Patterns.Strategy;

/** Паттерн стратегия
    Решение, при котором поведение метода изменяется в зависимости от
    переданного объекта-аргумента, называется паттерном "Стратегия".
    Метод содержит фиксированную часть алгоритма, а объект стратегии - переменную
    часть. Под "объектом стратегии" поднимается передаваемый объект, который содержит
    выполняемый код. В данном случае объект Processor является объектом стратегии, а в методе main()
    мы видим три разные стратегии, применяемые к String s.

    В данном примере У нас есть Процесс Process, который определяет как будет изменяться строка.
    И есть статический метод, который принимает процесс и строку в качестве параметров.
 */
import java.util.Arrays;


class Processor {
    public String name() {
        return getClass().getSimpleName();
    }
    Object process(Object input) {
        return input;
    }
}

class UpCase extends Processor {
    String process(Object input){
        return ((String)input).toUpperCase();
    }
}

class DownCase extends Processor {
    String process(Object input) {
        return ((String)input).toLowerCase();
    }
}

class Splitter extends Processor {
    String process(Object input) {
        return Arrays.toString(((String)input).split(" "));
    }
}

public class Apply {

    public static void process(Processor p , Object s){
        System.out.println("Используем Processor " + p.name());
        System.out.println(p.process(s));
    }

    public static void main(String[] args) {
       String s = "Disagreement with beliefs is by definition incorrect";
       process(new Splitter(), s);
       process(new DownCase(), s);
       process(new UpCase(), s);

    }
}
