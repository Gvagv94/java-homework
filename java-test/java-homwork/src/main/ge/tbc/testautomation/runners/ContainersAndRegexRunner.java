package ge.tbc.testautomation.runners;

import java.math.BigDecimal;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ContainersAndRegexRunner {
    public ContainersAndRegexRunner() {
        TreeSet<Object> circleTreeSet = new TreeSet<>();
    }

    private static boolean phoneNumberValidation(String phoneNumber) {
        phoneNumber = phoneNumber.replace("-", "");
        // თვალსაჩინოებისთვის
        System.out.println(phoneNumber);
        boolean found = false;
        Pattern pattern = Pattern.compile("(^(555)?([0-9]{1,6}$))");

        Matcher matcher = pattern.matcher(phoneNumber);
        if (matcher.find()) {
            found = true;
        }
        return found;
    }

    public static void main(String[] args) {
        ArrayList<String> arr = new ArrayList<>();
        arr.add("555-542-231");
        arr.add("555-887-987");
        arr.add("555-161-143");
        arr.add("555-189-6677");
        System.out.println(arr.size());

        //for
        for (int i = 0; i < arr.size(); i++) {
            System.out.println(arr.get(i));
        }

        //Iterator
        Iterator iter = arr.iterator();
        while (iter.hasNext()) {
            System.out.println(iter.next());
        }

        HashMap<String, String> hMap = new HashMap<>();
        hMap.put("Gvantsa", "555-542-231");
        hMap.put("Lily", "555-887-987");
        hMap.put("Nicolos", "555-161-143");
        hMap.put("Titsian", "555-189-6667");
        for (String key : hMap.keySet()) {
            Pattern pattern = Pattern.compile("8");
            Matcher matcher = pattern.matcher(hMap.get(key));
            if (matcher.find()) {
                System.out.println(key);

            }


          TreeSet<Circle> circleTreeSet = new TreeSet<>();
            circleTreeSet.add(new Circle(8));
            circleTreeSet.add(new Circle(43));
            circleTreeSet.add(new Circle(7));
            circleTreeSet.add(new Circle(9));
            circleTreeSet.add(new Circle(56));
            circleTreeSet.add(new Circle(71));
            circleTreeSet.add(new Circle(7));
            circleTreeSet.add(new Circle(69));
            circleTreeSet.add(new Circle(4));
            circleTreeSet.add(new Circle(9));

            System.out.println(circleTreeSet);

            HashSet<Circle> circleHashset = new HashSet<>();
            circleHashset.add(new Circle(5));
            circleHashset.add(new Circle(16));
            circleHashset.add(new Circle(7));
            circleHashset.add(new Circle(17));
            circleHashset.add(new Circle(20));
            circleHashset.add(new Circle(87));
            circleHashset.add(new Circle(43));
            circleHashset.add(new Circle(23));
            circleHashset.add(new Circle(5));
            circleHashset.add(new Circle(5));

            System.out.println(circleHashset);

            System.out.println("მეთორმეტე დავალება");
            for (int i = 0; i < arr.size(); i++) {
                System.out.println(phoneNumberValidation(arr.get(i)));
            }
        }
    }
}


