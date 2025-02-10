package Tip;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class listSort {
    public static void main(String[] args) {
        // 리스트 생성
        List<int[]> list = new ArrayList<>();
        list.add(new int[]{1, 3});
        list.add(new int[]{2, 1});
        list.add(new int[]{3, 2});

        // 첫 번째 수 기준 오름차순
        Collections.sort(list, (a, b) -> a[0] - b[0]);
        for(int[] arr : list) {
            System.out.println(arr[0] + " " + arr[1]);
        }
        System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
        System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
        System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");

        // 첫 번째 수 기준 내림차순
        Collections.sort(list, (a, b) -> b[0] - a[0]);
        for(int[] arr : list) {
            System.out.println(arr[0] + " " + arr[1]);
        }
        System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
        System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
        System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");

        // 두 번째 수 기준 오름차순
        Collections.sort(list, (a, b) -> a[1] - b[1]);
        for(int[] arr : list) {
            System.out.println(arr[0] + " " + arr[1]);
        }
        System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
        System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
        System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");

        // 두 번째 수 기준 내림차순
        Collections.sort(list, (a, b) -> b[1] - a[1]);
        for(int[] arr : list) {
            System.out.println(arr[0] + " " + arr[1]);
        }
        System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
        System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
        System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");



        // 배열이 아닐경우
        List<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);

        // 오름차순
        Collections.sort(arr);
        for(Integer integer : arr) {
            System.out.println(integer);
        }

        System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
        System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
        System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");

        // 내림차순
        Collections.reverse(arr);
        for(Integer integer : arr) {
            System.out.println(integer);
        }

    }
}
