//package leetcode.one;
//
//import java.util.HashMap;
//import java.util.Map;
//
///**
// * 运用你所掌握的数据结构，设计和实现一个  LRU (最近最少使用) 缓存机制。它应该支持以下操作： 获取数据 get 和 写入数据 put 。
// * 获取数据 get(key) - 如果密钥 (key) 存在于缓存中，则获取密钥的值（总是正数），否则返回 -1。
// * 写入数据 put(key, value) - 如果密钥不存在，则写入其数据值。当缓存容量达到上限时，它应该在写入新数据之前删除最近最少使用的数据值，从而为新的数据值留出空间。
// * <p>
// * 进阶:
// * 你是否可以在 O(1) 时间复杂度内完成这两种操作？
// */
//public class FortySix {
//
//}
//
//class LRUCache {
//    private int[] arr;
//    private
//
//    public LRUCache(int capacity) {
//        arr = new int[capacity];
//    }
//
//    public int get(int key) {
//
//    }
//
//    public void put(int key, int value) {
//
//    }
//}
//
////class LRUCache {
////    private int count;
////    private Map<Integer, Integer> map = new HashMap<>();
////    private Map<Integer, Integer> time = new HashMap<>();
////
////    public LRUCache(int capacity) {
////        count = capacity;
////    }
////
////    public int get(int key) {
////        return map.containsKey(key) ? map.get(key) : -1;
////    }
////
////    public void put(int key, int value) {
////        if (map.size() == count) {
////
////        }
////    }
////}