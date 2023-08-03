package ge.tbc.testautomation.javaoop.runners;

import ge.tbc.testautomation.javaoop.figures.Circle;

import java.util.*;

public class ContainersAndComparing {
    public static void main(String[] args){
//        Tasks #2-3
        ArrayList<String> numbersArrayList = new ArrayList<>();
        Collections.addAll(numbersArrayList , "555-542-231", "555-887-987", "555-161-143", "555-189-6667");
        System.out.println("** ArrayList elements Using for loop **");
        for(int i = 0; i < numbersArrayList .size(); i++){
            System.out.print(numbersArrayList .get(i) + "; ");
        }

        System.out.println("\n** ArrayList elements Using iterator(While loop) **");
        Iterator<String> iter = numbersArrayList.iterator();
        while(iter.hasNext()){
            System.out.print(iter.next() + "; ");
        }

//        Task #4-5
        HashMap<String, String> numbersHashMap = new HashMap<>();
        numbersHashMap.put("გიორგი", "555-542-231");
        numbersHashMap.put("მარიამი", "555-887-987");
        numbersHashMap.put("ლუკა", "555-161-143");
        numbersHashMap.put("ანა", "555-189-6667");

        System.out.println("\n** Names, whose numbers contain 8 **");
        for(String name : numbersHashMap.keySet()){
            if (numbersHashMap.get(name).contains("8")) System.out.print(name + "; ");
        }

//        Task 7
        System.out.println("\n** TreeSet of Circles **");
        TreeSet<Circle> circleTreeSet = new TreeSet<>();
        Collections.addAll(circleTreeSet,  new Circle(1), new Circle(11), new Circle(121),
                                           new Circle(1331), new Circle(14641),
                                           new Circle(14641), new Circle(1331),
                                           new Circle(121), new Circle(11), new Circle(1));
        System.out.println(circleTreeSet);

//        Task 8
        System.out.println("** HashSet of Circles **");
        HashSet<Circle> circleHashSet = new HashSet<>();
        Collections.addAll(circleHashSet,  new Circle(2), new Circle(22), new Circle(44),
                                           new Circle(66), new Circle(88),
                                           new Circle(88), new Circle(66),
                                           new Circle(44), new Circle(22), new Circle(2));
        System.out.println(circleHashSet);

    }
}
