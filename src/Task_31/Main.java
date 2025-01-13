package Task_31;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Integer> positiveList = new ArrayList<>();
        List<Integer> negativeList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        String srt = scanner.next();
        while (!srt.equals("finish")) {
            try {
                Integer numb = Integer.parseInt(srt);
                if (numb >= 0) {
                    positiveList.add(numb);
                } else {
                    negativeList.add(numb);
                }
                srt = scanner.next();
            } catch (NumberFormatException ex) {
                positiveList.add(0);
                srt = scanner.next();
            }
        }

        if (!positiveList.isEmpty()){
            Collections.sort(positiveList);
            for (Integer item: positiveList){
                System.out.print(item + " ");
            }
        }else{
            System.out.print("Пустой список");
        }

        System.out.println();

        if (!negativeList.isEmpty()){
            Collections.sort(negativeList);
            for (Integer item: negativeList){
                System.out.print(item + " ");
            }
        }else{
            System.out.print("Пустой список");
        }
    }
}

