package ge.tbc.testautomation.generics;

import java.util.Arrays;

public class AnyPair<E,T>{
    private E elementOne;
    private T elementTwo;

    public AnyPair(E elementOne, T elementTwo){
        this.elementOne = elementOne;
        this.elementTwo = elementTwo;
    }

    // Getter
    public E getElementOne() {
        return elementOne;
    }
    public T getElementTwo() {
        return elementTwo;
    }

    // Setter
    public void setElementOne(E elementOne) {
        this.elementOne = elementOne;
    }

    public void setElementTwo(T elementTwo) {
        this.elementTwo = elementTwo;
    }

    public String toString() {
        return "AnyPair{" +
                "elementOne=" + Arrays.asList(elementOne) +
                ", elementTwo=" + Arrays.asList(elementTwo) +
                '}';
    }

}
