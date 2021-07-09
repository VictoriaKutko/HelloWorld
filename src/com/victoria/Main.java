package com.victoria;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.*;
import java.util.List;
public class Main {

    private static int[] arr = new int[]{1, 2, 3, 4, 6, 7, 8};
    private static List<Integer> list = new ArrayList<Integer>();


    private static Integer[] arrtwovalues = new Integer[arr.length];
    private static Integer solve;


    static Integer find(final int[] array) {
        int[] temp = new int[array.length];
        int possition = array[0];


        for (int i = 0; i < array.length - 1; i++) {
            temp[i] = array[i + 1];
        }


        for (int i = 0; i < temp.length; i++) {
            if (temp[i] == 0) {
                temp[i] = possition;
            }
        }

        for (int i = 0; i < array.length; i++) {
            if (temp[i] - array[i] == 2) {
                arrtwovalues[i] = temp[i];
            }
        }


        for (int i = 0; i < array.length; i++) {
            if (temp[i] - array[i] == 2) {
                arrtwovalues[i] = temp[i];
            }
        }
        int counter = 0;
        for (int i = 0; i < arrtwovalues.length; i++) {
            if (arrtwovalues[i] != null) {
                counter++;
            }
        }

        for (int i = 0; i < arrtwovalues.length; i++) {
            if (arrtwovalues[i] != null) {
                list.add(arrtwovalues[i]);
            }
        }


        for (int i = 0; i < list.size(); i++) {
            if (list.size() > 0) {
                solve = list.get(0);
            }
        }


        System.out.println(solve);
        if (list.size() > 0) {
            return solve;
        }

        else return null;

    }


    public static void main(String[] args) {
        find(arr);

    }
}