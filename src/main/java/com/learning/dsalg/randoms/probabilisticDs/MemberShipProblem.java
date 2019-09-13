package com.learning.dsalg.randoms.probabilisticDs;

import com.google.common.hash.BloomFilter;
import com.google.common.hash.Funnels;

import java.nio.charset.Charset;
import java.util.HashSet;
import java.util.Set;


// problem to check if an element is present in a set or a data structure
public class MemberShipProblem {

    public static void main(String[] args) {
        checkIPExists();
        checkIfIPExistsUsingBloom();
    }

    // naive solution using Set
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



    public static void checkIfIPExistsUsingBloom() {

        BloomFilter<String> visitors = BloomFilter.create(
                Funnels.stringFunnel(Charset.forName("UTF-8")), 100);

        visitors.put("192.169.0.1");
        visitors.put("74.245.10.1");
        visitors.put("10.124.22.19");

        System.out.println(visitors.mightContain("10.124.22.19"));
        System.out.println(visitors.mightContain("192.169.0.0"));
    }

}
