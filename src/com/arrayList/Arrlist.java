package com.arrayList;

import java.util.ArrayList;

public class Arrlist {

    public static void main(String[] args) {


        ArrayList <Integer> arrayList = new ArrayList<>();


        arrayList.add(0,1);
        arrayList.add(1,2);
        arrayList.add(2,3);
        arrayList.add(3,4);

        System.out.println("Hello Doni");

        try {
            System.out.println(arrayList.get(3));
        }catch (Exception e){
            e.getMessage();
        }finally {
            System.out.println("END");
        }


//        for (int i = 0; i < arrayList.size(); i++) {
//
//            if (arrayList.isEmpty()) {
//                System.out.println(arrayList.get(0));
//            }
//
//////                if (arrayList.get(i).equals(17)) {
////                    arrayList.set(0, 26);
////                    arrayList.remove(3);
////                    arrayList.clear();
////                }
////            }
//
//        }
//        for (Integer i:arrayList) {
//            System.out.println(i);
//
//        }
//

    }
}
