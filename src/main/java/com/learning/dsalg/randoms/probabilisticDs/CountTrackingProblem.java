package com.learning.dsalg.randoms.probabilisticDs;


import com.clearspring.analytics.stream.frequency.CountMinSketch;
import com.google.common.collect.HashMultiset;
import com.google.common.collect.Multiset;

// problem to count number of times a element was added or present
public class CountTrackingProblem {


    public static void main(String[] args) {
        countIpHits();
        countIpHitsUsingCountMinSketch();
    }

    // naive solution using Map or Multiset which internally user a hashmap
    private static void countIpHits() {

        Multiset<String> hits = HashMultiset.create();
        hits.add("192.169.0.1");
        hits.add("10.124.22.19");
        hits.add("74.245.10.1");
        hits.add("74.245.10.1");

        System.out.println(hits.count("74.245.10.1"));
        System.out.println(hits.count("192.169.0.0"));

    }


    private static void countIpHitsUsingCountMinSketch() {

        // less epsilon - means we are happy with less error
        // delta gives accuracy more delta more accurate , they control the width and depth
        CountMinSketch hits = new CountMinSketch(0.001, 0.99, 1);
        hits.add("192.169.0.1", 1);
        hits.add("10.124.22.19", 1);
        hits.add("74.245.10.1",1 );
        hits.add("74.245.10.1", 1);

        System.out.println(hits.estimateCount("74.245.10.1"));
        System.out.println(hits.estimateCount("192.169.0.0"));
    }


}
