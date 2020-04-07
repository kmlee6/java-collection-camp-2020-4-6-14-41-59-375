package com.thoughtworks.collection;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Add {
    public int getSumOfProcessedOdds(List<Integer> arrayList) {
        return arrayList.stream().filter(i -> i%2==1).mapToInt(i -> i*3+5).sum();
    }

    public List<Integer> sortByEvenAndOdd(List<Integer> arrayList) {
        List<Integer> oddArray = arrayList.stream().filter(i -> i%2==1).sorted(Collections.reverseOrder()).collect(Collectors.toList());
        List<Integer> evenArray = arrayList.stream().filter(i -> i%2==0).sorted().collect(Collectors.toList());
        return new ArrayList<Integer>() {{addAll(evenArray); addAll(oddArray);}};
    }


    public boolean isIncludedInEven(List<Integer> arrayList, Integer specialElement) {
        return arrayList.stream().filter(i -> i%2==0 && i==specialElement).count()>0;
    }

    public List<Integer> getTripleOfOddAndAddTwo(List<Integer> arrayList) {
        return arrayList.stream().map(i -> {
            if(i%2==1){
              return i*3+2;
            }
            return i;
        }).collect(Collectors.toList());
    }

    public int getSumTripleAndAddTwo(List<Integer> arrayList) {
        return arrayList.stream().mapToInt(i -> i*3+2).sum();
    }

    public int getSumOfEvens(int leftBorder, int rightBorder) {
        int upperBound = Math.max(leftBorder, rightBorder)+1;
        int lowerBound = Math.min(leftBorder, rightBorder);
        return IntStream.range(lowerBound, upperBound).filter(i -> i%2==0).sum();
    }

    public int getSumOfOdds(int leftBorder, int rightBorder) {
        int upperBound = Math.max(leftBorder, rightBorder)+1;
        int lowerBound = Math.min(leftBorder, rightBorder);
        return IntStream.range(lowerBound, upperBound).filter(i -> i%2==1).sum();
    }

}
