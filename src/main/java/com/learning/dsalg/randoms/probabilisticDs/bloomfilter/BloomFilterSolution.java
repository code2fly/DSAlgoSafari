package com.learning.dsalg.randoms.probabilisticDs.bloomfilter;

import com.google.common.hash.BloomFilter;
import com.google.common.hash.Funnels;

import java.nio.charset.Charset;

public class BloomFilterSolution {

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
