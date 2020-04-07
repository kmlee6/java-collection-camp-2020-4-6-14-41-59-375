package com.thoughtworks.collection;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.List;
import java.util.stream.Collectors;

public class Reduce {

    List<Integer> arrayList;

    public Reduce(List<Integer> arrayList) {
        this.arrayList = arrayList;
    }

    public double getAverage() {
        return arrayList.stream().mapToDouble(i -> i).average().orElse(0);
    }

    public int getIndexOfFirstEven() {
        int index= arrayList.stream().filter(i -> i%2==0).mapToInt(i -> i).findFirst().orElse(0);
        return arrayList.indexOf(index);
    }


    public int getLastOdd() {
        List<Integer> oddArray =  arrayList.stream().filter(i -> i%2==1).collect(Collectors.toList());
        return oddArray.get(oddArray.size()-1);
    }



}
