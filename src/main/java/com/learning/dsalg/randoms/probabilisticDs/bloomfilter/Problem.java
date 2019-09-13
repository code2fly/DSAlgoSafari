package com.learning.dsalg.randoms.probabilisticDs.bloomfilter;

import java.util.HashSet;
import java.util.Set;

public class Problem {

    public static void main(String[] args) {
        checkIPExists();
        BloomFilterSolution.checkIfIPExistsUsingBloom();
    }

    public static void checkIPExists() {
        // storing few elements and checking the membership is fine with few elements but
        // what if there are thousands/millions of elements ?? this would then take up all the heap and even insertion would be crazy
        Set<String> visitors = new HashSet<>();
        visitors.add("192.169.0.1");
        visitors.add("74.245.10.1");
        visitors.add("10.124.22.19");

        System.out.println(visitors.contains("10.124.22.19"));
        System.out.println(visitors.contains("192.169.0.0"));
    }

}
