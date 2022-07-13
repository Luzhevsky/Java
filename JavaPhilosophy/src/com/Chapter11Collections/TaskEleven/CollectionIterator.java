package com.Chapter11Collections.TaskEleven;

import java.util.*;

public class CollectionIterator {
    public static void display(Collection<Integer> collection) {
        Iterator<Integer>  iCollection = collection.iterator();
        while(iCollection.hasNext()) {
            Integer c = iCollection.next();
            System.out.print(c.toString() + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {

        Collection<Integer> cAL = new ArrayList<>(Arrays.asList(1, 3, 7, 2, 34, 123));
        Collection<Integer> cLL = new LinkedList<>(cAL);
        Collection<Integer> cHS = new HashSet<>(cAL);
        Collection<Integer> cTS = new TreeSet<>(cAL);
        Collection<Integer> cLHS = new LinkedHashSet<>(cAL);

        System.out.println(cAL);
        display(cAL);
        display(cLL);
        display(cHS);
        display(cTS);
        display(cLHS);
    }
}
