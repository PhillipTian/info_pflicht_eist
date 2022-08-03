package de.tum.in.ase.eist;

import java.util.ArrayList;
import java.util.List;

public class BinarySearch implements SearchStrategy {


//    public static int binarySearch(List<Chapter> books, String name) {
//        // 1.定义一个变量，记录左边元素的索引，初始值为0
//        int left = 0;
//        // 2.定义一个变量，记录右边元素的索引，初始值为arr.length-1
//        int right = books.size() - 1;
//        // 3.while循环查找，循环的条件：记录左边元素的索引 <= 记录右边元素的索引
//        while (left <= right) {
//            // 4.计算中间元素的索引
//            int mid = (left + right) / 2;
//            // 5.判断中间索引对应的元素与要查找的元素进行比较判断
//            if (books.get(mid).getName() == name) {
//                // 6.如果中间索引对应的元素等于要查找的元素，那么就直接输出打印
//                return books.get(mid).getPageNumber();
//            } else if (Context.rightOrder(books.get(mid).getName(), name)) {
//                // 7.如果中间索引对应的元素 小于 要查找的元素，说明要查找的元素在右边，那么记录左边元素的索引就更改为 中间索引 +1（因为左侧不考虑）
//                left = mid + 1;
//            } else {
//                // 8.如果中间索引对应的元素 大于 要查找的元素，说明要查找的元素在左边，那么记录右边元素的索引就更改为 中间索引 -1（因为右侧不考虑）
//                right = mid - 1;
//            }
//        }
//        return -1;
//    }


//    public static void sort(List<Chapter> books) {
//        for (int i = 0; i < books.size() - 1; i++) {
//            for (int j = 0; j < books.size() - 1 - i; j++) {
//                Chapter temp;
//                if (Context.rightOrder(books.get(j + 1).getName(), books.get(j).getName())) {
//                    temp = books.get(j);
//                    books.set(j, books.get(j + 1));
//                    books.set(j + 1, temp);
//                }
//            }
//        }
//    }


    public int performSearch(List<Chapter> books, String name) {
//        sort(books);
//        return binarySearch(books, name);
        return -1;
    }


//    public static void main(String[] args) {
//        BinarySearch binarySearch = new BinarySearch();
//        Chapter chapter1 = new Chapter("pad", 3);
//        Chapter chapter2 = new Chapter("aada", 1);
//        Chapter chapter3 = new Chapter("sd", 10);
//        Chapter chapter4 = new Chapter("baid", 5);
//        List<Chapter> book = new ArrayList<>();
//        book.add(chapter1);
//        book.add(chapter2);
//        book.add(chapter3);
//        book.add(chapter4);
//        sort(book);
//        int i = book.get(0).getPageNumber();
//        i = book.get(1).getPageNumber();
//        i = book.get(2).getPageNumber();
//        i = book.get(3).getPageNumber();
//        int a = binarySearch.performSearch(book, "baid");
//    }

}
