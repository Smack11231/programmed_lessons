import java.util.*;

public class ArrayPractice {
    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<>(Arrays.asList("apple", "blueberry", "strawberry", "blackberry","banana", "orange", "grapefruit","kiwi","grapes"));
        ArrayList<String> fruits2 = new ArrayList<>(Arrays.asList("apple", "blueberry", "strawberry", "blackberry","watermelon", "orange", "tomato","kiwi","grapes"));
        ArrayList<String> veggies = new ArrayList<>(Arrays.asList("carrot", "celery", "cucumber", "pepper","jalapeno", "leek", "potato","chives","onion"));
        ArrayList<String> animals = new ArrayList<>(Arrays.asList("rabbit", "dog", "horse", "dog","cat", "horse", "penguin","bear","horse"));

        System.out.println(sortAndCombine(fruits, veggies));
        System.out.println(similarItems(fruits, fruits2));
        System.out.println(deleteDouble(animals));
    }
    public static ArrayList<String> sortAndCombine(ArrayList<String> fruit, ArrayList<String> veggie) {
        ArrayList<String> newe = new ArrayList<String>();
        newe.addAll(fruit);
        newe.addAll(veggie);
        Collections.sort(newe);
        return newe;
    }
    public static ArrayList<String> similarItems(ArrayList<String> fruit, ArrayList<String> fruit2) {
        ArrayList<String> newe = new ArrayList<String>();
        newe.addAll(fruit);
		newe.retainAll(fruit2);
		return newe;
    }
    public static ArrayList<String> deleteDouble(ArrayList<String> animals) {
        Collections.sort(animals);
        for (int i = 0; i<animals.size()-1;i++) {
            if (animals.get(i).equals(animals.get(i+1))) {
                animals.remove(i);
            }
        }
        return animals;
    }

}

