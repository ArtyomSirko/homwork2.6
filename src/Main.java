import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
        for (int i = 0; i < nums.size(); i++) {
            if (nums.get(i) % 2 == 1) {
                System.out.print(nums.get(i) + " ");
            }
        }
        System.out.println(" ");
        List<Integer> nums2 = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
        Set<Integer> numsSet = new HashSet<>();

        for (int i = 0; i < nums2.size(); i++) {
            if (nums2.get(i) % 2 == 0) {

                numsSet.add(nums2.get(i));
            }
        }

        for (Integer numSets : numsSet) {
            System.out.print(numSets);
        }
        System.out.println("");
        List<String> slovo = new ArrayList<>(List.of("авакадо", "яблоко", "яблоко", "банан", "мандарин", "дыня", "банан", "яблоко"));
        slovo.sort(Comparator.naturalOrder());
        System.out.println(slovo);
        for (int i = 0; i < slovo.size(); i++) {
            if (i == 0) {
                if (!slovo.get(i).equals(slovo.get(i + 1))) {
                    System.out.println(slovo.get(i));
                }
            } else if (!slovo.get(i).equals(slovo.get(i - 1)) && !slovo.get(i).equals(slovo.get(i + 1))) {
                    System.out.println(slovo.get(i));
                }
        }
//        for (int i = 0; i < slovo.size(); i++) {
//            for (int j = i + 1; j < slovo.size(); j++) {
//
//            }
        Set<String> doule = new HashSet<>();
        for (int i = 0; i < slovo.size(); i++) {
            if (i == 0) {
                if (slovo.get(i).equals(slovo.get(i + 1))) {
                    doule.add(slovo.get(i));
                }
            } else if (slovo.get(i).equals(slovo.get(i - 1)) || slovo.get(i).equals(slovo.get(i + 1))) {
                doule.add(slovo.get(i));
            }
        }
        System.out.println(doule.size() + "количество дублей");

    }
}