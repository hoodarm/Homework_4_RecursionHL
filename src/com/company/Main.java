package com.company;

public class Main {

    public static void main(String[] args) {
        int [] test = {2,3,4,5,6,8};
        int length_test = test.length-1;
        System.out.println("The key was found at index " + recursiveSequentialSearch(test,length_test,0));
        System.out.println("The key was found at index " + recursiveBinarySearch(test,0,length_test,8));
    }

    static int recursiveSequentialSearch(int [] input, int index,int key)
    {
        if (index<0)
            return -1;
        if (input[index]==key)
            return index;
        return recursiveSequentialSearch(input,index-1,key);
    }

    static int recursiveBinarySearch(int [] input, int low, int high, int key)
    {
        if (low>high)
            return -1;
        int mid = (low+high)/2;
        if (key>input[mid])
        {
            low = mid + 1;
            return recursiveBinarySearch(input,low, high, key);
        }
        else if (key<input[mid]){
            high = mid - 1;
            return recursiveBinarySearch(input,low, high, key);
        }
        return mid;
    }
}
