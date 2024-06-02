package zaur_tregulov.generics;

import java.util.ArrayList;
import java.util.List;

public class Test1 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
//        list.add("OK");
//        list.add(5);
//        list.add(new StringBuffer("test"));
//        list.add(new Car());
        list.add("privet");
        list.add("poka");
        list.add("ok");
        list.add("rest");
//        list.add(new Car());

//        Exception in thread "main" java.lang.ClassCastException: class zaur_tregulov.generics.Car cannot be cast to class java.lang.String (zaur_tregulov.generics.Car is in unnamed module of loader 'app'; java.lang.String is in module java.base of loader 'bootstrap')
//        at zaur_tregulov.generics.Test1.main(Test1.java:20)

        for (Object o : list) {
            System.out.println(o + " dlina " + ((String)o).length());
        }

    }
}

class Car {

}
