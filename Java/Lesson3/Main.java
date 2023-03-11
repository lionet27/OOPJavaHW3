// Создать сет компонентов, и сделать так, чтобы в нем не было 2 одинаковых. 
// (Специально создать два одинаковых компонента в Main и попытаться их добавить в сет)
// * Set<Component> result = new HashSet<>(components); (подсказка переопределить методы equals и hashCode).
// Переписать compareTo так, чтобы если power лекарств равны, сравнение шло еще и по названиям компонентов лекарства


package Lesson3;

import Lesson3.drugs.Component;
import Lesson3.drugs.impl.CatDrug;
import Lesson3.drugs.impl.components.Azitron;
import Lesson3.drugs.impl.components.Pinecilin;
import Lesson3.drugs.impl.components.Water;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        
        List<Component> componentsCat = List.of(new Azitron("Азитрон", "2", 4),
                new Water("Вода", "15", 1));
        CatDrug drug = new CatDrug("rotec",componentsCat);
        // for (Component component : drug) {
        //     // System.out.println(component);
        // }
        List<Component> componentCat1 = List.of(new Azitron("Азитрон","4",4),
                new Pinecilin("Пинецилин", "18", 6));
        List<Component> componentCat2 = List.of(new Water("Вода", "20", 12),
                new Azitron("Азитрон", "10", 9));
        List<Component> componentCat4 = List.of(new Water("Вода", "20", 12),
                new Azitron("Азитрон", "10", 100));
        List<Component> componentCat3 = List.of(new Water("Вода", "20", 1),
                new Azitron("Азитрон", "10", 4));
        List<Component> componentCat5 = List.of(new Pinecilin("Пинецелин","17",2),
                new Water("Вода", "5", 3));
        

                
        CatDrug drug1 = new CatDrug("pineazitron",componentCat1);
        CatDrug drug2 = new CatDrug("azitric",componentCat2);
        CatDrug drug4 = new CatDrug("wazitric",componentCat4);
        CatDrug drug3 = new CatDrug("azitricin",componentCat3);
        CatDrug drug5 = new CatDrug("pinecilbrom",componentCat5);


        List<CatDrug> drugs = new ArrayList<>();
        drugs.add(drug);
        drugs.add(drug1);
        drugs.add(drug2);
        drugs.add(drug4);
        drugs.add(drug3);
        drugs.add(drug5);
        System.out.println("Список лекарств:");
       System.out.println(drugs);

        Collections.sort(drugs);
        System.out.println("Список отсортированных лекарств:");
        System.out.println(drugs);

        Set<Component> result = new HashSet<>();
        Component component1=new Azitron("Азитрон","4",4);
        Component component2=new Azitron("Азитрон","4",4);
        Component component3=new Azitron("Азитрон","19",20);
        Component component4=new Azitron("Азитрон","19",20);
        Component component5=new Pinecilin("Пеницилин","19",20);


        result.add(component1);
        result.add(component2);
        result.add(component3);
        result.add(component4);
        result.add(component5);
        System.out.println("Сет компонентов:");
        System.out.println(result);





    }
}
