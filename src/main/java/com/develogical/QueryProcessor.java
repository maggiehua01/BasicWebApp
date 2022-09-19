package com.develogical;

import java.util.*;

public class QueryProcessor {

    public String process(String query) {
        if (query.toLowerCase().contains("shakespeare") || query.toLowerCase().contains("Shakespeare")) {
            return "William Shakespeare (26 April 1564 - 23 April 1616) was an " +
                    "English poet, playwright, and actor, widely regarded as the greatest " +
                    "writer in the English language and the world's pre-eminent dramatist.";
        }
        if (query.toLowerCase().contains("which of the following numbers is the largest")) {
            int numberOfNums = query.toLowerCase().split(":")[0].split(",").length;
            int[] nums = new int[numberOfNums];
            for (int i = 0; i < numberOfNums; i++) {
                nums[i] = Integer.parseInt(query.toLowerCase().split(":")[0].split(",")[i]);
            }
            return Collections.max(Arrays.asList(nums), null).toString();
        }
        return "";
    }
}
