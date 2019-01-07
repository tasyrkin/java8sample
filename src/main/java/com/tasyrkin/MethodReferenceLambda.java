package com.tasyrkin;

import com.google.common.base.Joiner;
import com.google.common.collect.Lists;

import java.util.Collections;
import java.util.List;

public class MethodReferenceLambda {
    public static void main(String[] args) {
        final List<String> strList = Lists.newArrayList("a", "b", "c", "A", "C");

        Collections.sort(strList, String::compareToIgnoreCase);
        //Collections.sort(strList, (s1, s2)-> s1.compareToIgnoreCase(s2));

        //String::

        System.out.println(Joiner.on(",").join(strList));
    }
}
