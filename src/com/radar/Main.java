package com.radar;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            Integer input = Integer.valueOf(scanner.nextLine());
            if (input == -1)
                break;
            list.add(input);
        }
        Collections.sort(list);

        int greatestNum = list.get(list.size() - 1);

        System.out.println(greatestNum);
    }

}