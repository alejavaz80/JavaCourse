package Ejercicios.gradescollections;

import java.util.HashMap;
import java.util.Map;

public class TestResults {

    public static Map getOriginalGrades() {

        Map grades1 = new HashMap();
        grades1.put("Angie", 24);
        grades1.put("Angie", 32);
        grades1.put("Angie", 80);
        grades1.put("Angie", 50);
        grades1.put("Angie", 79);

        return grades1;

    }

    public static Map getMakeUpgrades(){

        Map grades1 = new HashMap();
        grades1.put("Angie", 97);
        grades1.put("Angie", 80);
        grades1.put("Angie", 78);
        grades1.put("Angie", 25);
        grades1.put("Angie", 82);

        return grades1;
    }
}
