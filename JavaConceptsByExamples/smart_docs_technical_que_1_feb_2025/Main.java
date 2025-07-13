/** Smart Docs Technical Round Que */
package com.nit.smart_docs_technical_que_1_feb_2025;

import java.io.*;
import java.util.*;

class Solution {
        public static int[] solve(int[] arr) {
          int maxVal = Integer.MIN_VALUE;
          
          for(int num: arr)
          {
        	  if (num > maxVal) maxVal = num; 
          }
          return new int[] {maxVal}; 	
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        n = sc.nextInt();
        int arr1[] = new int[n];
        for(int i=0;i<n;i++)
            arr1[i] = sc.nextInt();
        Solution Obj = new Solution();
        int[] result = Obj.solve(arr1);
        for (int i=0;i<result.length;i++){
            System.out.print(result[i] + " ");
        }
        System.out.println('\n');
    }
}


/**
#Technical Round Question
-------------------------s

Problem Statement:  
You are given an array of integers. Your task is to write a function `solve(int[] arr)` that finds the **maximum element** in the array and returns it as a single-element array.  
Function Signature:  
```java
public static int[] solve(int[] arr)
```
- Input: An integer array `arr` of size `n` (1 ≤ n ≤ 10^6), where `arr[i]` (−10^9 ≤ arr[i] ≤ 10^9) represents the `i-th` element.  
- Output: A single-element array containing the maximum value in `arr`.  

Example 1:  
✅ Input:  
```
5
1 4 3 7 2
```
✅ Output:  
```
7
```

Example 2:
✅ Input:  
```
4
-5 -3 -10 -1
```
✅ Output:  
```
-1
```

#Constraints:  
1. The array will contain at least one element.  
2. The numbers in the array can be negative, zero, or positive.  
3. The solution must run in **O(n) time complexity.  
*/