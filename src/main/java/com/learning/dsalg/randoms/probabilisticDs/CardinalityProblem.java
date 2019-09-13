package com.learning.dsalg.randoms.probabilisticDs;


import com.clearspring.analytics.stream.cardinality.HyperLogLog;

import java.util.HashSet;
import java.util.Set;

// problem to find the cardinality i.e. number of unique items added or present
public class CardinalityProblem {

    public static void main(String[] args) {
        countUniqueVisitors();
        countUniqueVisitorsUsingHyperLogLog();
    }


    // naive solution using Set, but this will have a great memory footprint if used with over million records
    private static void countUniqueVisitors() {
        Set<String> visitors = new HashSet<>();
        visitors.add("192.169.0.1");
        visitors.add("74.245.10.1");
        visitors.add("10.124.22.19");
        visitors.add("74.245.10.1");

        System.out.println("number of unique visitors : " + visitors.size());
    }


    private static void countUniqueVisitorsUsingHyperLogLog() {
        HyperLogLog visitors = new HyperLogLog(0.03);

        visitors.offer("192.169.0.1");
        visitors.offer("74.245.10.1");
        visitors.offer("10.124.22.19");
        visitors.offer("74.245.10.1");

        System.out.println("number of unique  visitors using optimized process : " + visitors.cardinality());

    }

}
