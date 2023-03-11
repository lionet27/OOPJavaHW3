package Lesson3.drugs;


import java.util.Iterator;
import java.util.List;


public abstract class Drug implements Iterable<Component>, Comparable<Drug> {
   
    public String name;
    private List<Component> components;
    int index;
    

    public Drug(String name,List<Component> component) {
        this.name = name;
        this.components = component;
        this.index = 0;
    }

    public int getDrugPower(){
        int power = 0;
        for (Component component: components) {
            power += component.getPower();
        }
        return power;
    }

    @Override
    public int compareTo( Drug o) {
        int power = getDrugPower();
        if (Integer.compare(power, o.getDrugPower())==0){

            return name.compareToIgnoreCase(o.name);
        } else  return Integer.compare(power, o.getDrugPower());
    }

   
    @Override
    public Iterator<Component> iterator() {
        return new Iterator<Component>() {
            public boolean hasNext() {
                return index < components.size();
            }
            public Component next() {
                return components.get(index++);
            }
        };
    }

    @Override
    public String toString() {
        return String.format(
                "%s {name:%s, components: %s, power: %s}%n",this.name, this.getClass().getSimpleName(), components, getDrugPower()
        );
    }
}
