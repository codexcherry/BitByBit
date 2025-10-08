
# 📚 Array Problems Collection

> A comprehensive collection of 50 essential array problems with detailed solutions, explanations, and complexity analysis.

## 📋 Table of Contents

### Basic Operations (1-10)
1. [Find Maximum Element in an Array](#1-find-maximum-element-in-an-array)
2. [Find Minimum Element in an Array](#2-find-minimum-element-in-an-array)
3. [Reverse an Array In-Place](#3-reverse-an-array-in-place)
4. [Check if Array is Sorted](#4-check-if-array-is-sorted)
5. [Find Second Largest Element](#5-find-second-largest-element)
6. [Rotate Array by k Steps](#6-rotate-array-by-k-steps)
7. [Remove Duplicates from Sorted Array](#7-remove-duplicates-from-sorted-array)
8. [Find Missing Number (1 to n)](#8-find-missing-number-1-to-n)
9. [Move Zeros to End](#9-move-zeros-to-end)
10. [Find Pair with Given Sum](#10-find-pair-with-given-sum)

### Advanced Algorithms (11-20)
11. [Kadane's Algorithm (Max Subarray Sum)](#11-kadanes-algorithm-max-subarray-sum)
12. [Find First Duplicate](#12-find-first-duplicate)
13. [Find Intersection of Two Sorted Arrays](#13-find-intersection-of-two-sorted-arrays)
14. [Merge Two Sorted Arrays](#14-merge-two-sorted-arrays)
15. [Find Majority Element](#15-find-majority-element)
16. [Find First and Last Position of Element](#16-find-first-and-last-position-of-element)
17. [Find Peak Element](#17-find-peak-element)
18. [Find Kth Largest Element](#18-find-kth-largest-element)
19. [Find Minimum in Rotated Sorted Array](#19-find-minimum-in-rotated-sorted-array)
20. [Search in Rotated Sorted Array](#20-search-in-rotated-sorted-array)

### Complex Problems (21-30)
21. [Find Duplicate Number](#21-find-duplicate-number)
22. [Find All Duplicates in Array](#22-find-all-duplicates-in-array)
23. [Find Common Elements in Three Sorted Arrays](#23-find-common-elements-in-three-sorted-arrays)
24. [Find Leaders in Array](#24-find-leaders-in-array)
25. [Find Maximum Product Subarray](#25-find-maximum-product-subarray)
26. [Find Trapped Water](#26-find-trapped-water)
27. [Find Next Greater Element](#27-find-next-greater-element)
28. [Find Subarray with Given Sum](#28-find-subarray-with-given-sum)
29. [Find Longest Consecutive Sequence](#29-find-longest-consecutive-sequence)
30. [Find Smallest Positive Missing Number](#30-find-smallest-positive-missing-number)

### Optimization Problems (31-40)
31. [Find Maximum Difference Between Two Elements](#31-find-maximum-difference-between-two-elements)
32. [Find Maximum Sum Circular Subarray](#32-find-maximum-sum-circular-subarray)
33. [Find Element in Sorted Rotated Array with Duplicates](#33-find-element-in-sorted-rotated-array-with-duplicates)
34. [Find Minimum Length Subarray with Sum >= k](#34-find-minimum-length-subarray-with-sum--k)
35. [Find Maximum Length of Subarray with Equal 0s and 1s](#35-find-maximum-length-of-subarray-with-equal-0s-and-1s)
36. [Find Maximum Sum of K Consecutive Elements](#36-find-maximum-sum-of-k-consecutive-elements)
37. [Find Number of Subarrays with Sum K](#37-find-number-of-subarrays-with-sum-k)
38. [Find Pivot Index](#38-find-pivot-index)
39. [Find Equilibrium Index](#39-find-equilibrium-index)
40. [Find Maximum Average Subarray of Size K](#40-find-maximum-average-subarray-of-size-k)

### Specialized Problems (41-50)
41. [Find All Subarrays with Zero Sum](#41-find-all-subarrays-with-zero-sum)
42. [Find Maximum Length of Subarray with Positive Product](#42-find-maximum-length-of-subarray-with-positive-product)
43. [Find Minimum Operations to Make Array Equal](#43-find-minimum-operations-to-make-array-equal)
44. [Find Maximum Sum of Non-Adjacent Elements](#44-find-maximum-sum-of-non-adjacent-elements)
45. [Find Stock Buy Sell to Maximize Profit](#45-find-stock-buy-sell-to-maximize-profit)
46. [Find Maximum Sum of Two Non-Overlapping Subarrays](#46-find-maximum-sum-of-two-non-overlapping-subarrays)
47. [Find Number of Pairs with Difference K](#47-find-number-of-pairs-with-difference-k)
48. [Find Maximum Length of Repeated Subarray](#48-find-maximum-length-of-repeated-subarray)
49. [Find Maximum Sum Increasing Subsequence](#49-find-maximum-sum-increasing-subsequence)
50. [Find Maximum Sum of Subarray with Length K](#50-find-maximum-sum-of-subarray-with-length-k)

---

## 🔥 Basic Operations

### 1. Find Maximum Element in an Array

**Problem:** Find the largest element in an array of integers. This is a fundamental operation used in many algorithms. It's often asked to test basic traversal skills.

```java
public class ArrayProblems {
    // Time: O(n), Space: O(1)
    public static int findMaxElement(int[] arr) {
        if (arr == null || arr.length == 0) return -1; // Handle empty or null array
        int max = arr[0]; // Initialize max with first element
        for (int i = 1; i < arr.length; i++) { // Iterate from second element
            if (arr[i] > max) max = arr[i]; // Update max if current is larger
        }
        return max;
    }
}
```

**Explanation:** The code first checks for null or empty arrays to avoid errors. It initializes the maximum with the first element as a baseline. A loop iterates through the remaining elements, updating max when a larger value is found. This ensures a single pass through the array, achieving O(n) time complexity. The space complexity is O(1) since only one variable is used. This straightforward approach is easy for beginners to grasp.

### 2. Find Minimum Element in an Array

**Problem:** Identify the smallest element in an array. This is a basic problem testing array traversal. It's foundational for understanding comparisons in DSA.

```java
public class ArrayProblems {
    // Time: O(n), Space: O(1)
    public static int findMinElement(int[] arr) {
        if (arr == null || arr.length == 0) return -1; // Handle edge cases
        int min = arr[0]; // Start with first element
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) min = arr[i]; // Update if smaller
        }
        return min;
    }
}
```

**Explanation:** The function checks for invalid inputs to prevent crashes. It sets the minimum to the first element initially. A loop compares each element, updating min if a smaller value is found. This linear scan is optimal, visiting each element once. The approach uses constant space, making it efficient. Beginners can easily follow the comparison logic.

### 3. Reverse an Array In-Place

**Problem:** Reverse the elements of an array without extra space. This is key for understanding in-place operations. It's used in problems like rotations.

```java
public class ArrayProblems {
    // Time: O(n/2), Space: O(1)
    public static void reverseArray(int[] arr) {
        if (arr == null || arr.length == 0) return; // Edge case
        int start = 0, end = arr.length - 1; // Two pointers
        while (start < end) {
            int temp = arr[start]; // Swap using temp
            arr[start] = arr[end];
            arr[end] = temp;
            start++; end--; // Move pointers
        }
    }
}
```

**Explanation:** The code handles edge cases like null or empty arrays. It uses two pointers, one from the start and one from the end. Elements are swapped using a temporary variable until pointers meet. The loop runs for half the array length, ensuring O(n) time. No extra array is used, keeping space at O(1). This swapping logic is intuitive for beginners.

### 4. Check if Array is Sorted

**Problem:** Determine if an array is sorted in non-decreasing order. Essential for validating binary search inputs. Tests basic comparison skills.

```java
public class ArrayProblems {
    // Time: O(n), Space: O(1)
    public static boolean isSorted(int[] arr) {
        if (arr == null || arr.length <= 1) return true; // Edge cases
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[i - 1]) return false; // Check order
        }
        return true;
    }
}
```

**Explanation:** The code returns true for arrays with one or fewer elements. It iterates from the second element, comparing with the previous. If any element is smaller, it returns false immediately. This single-pass approach ensures O(n) time. No additional space is needed, keeping O(1) space. The logic is clear for beginners to follow.

### 5. Find Second Largest Element

**Problem:** Find the second largest unique element in an array. Common in interviews to test edge case handling. Assumes at least two elements.

```java
public class ArrayProblems {
    // Time: O(n), Space: O(1)
    public static int secondLargest(int[] arr) {
        if (arr.length < 2) return -1;
        int first = Integer.MIN_VALUE, second = Integer.MIN_VALUE;
        for (int num : arr) {
            if (num > first) { // Update if larger than first
                second = first;
                first = num;
            } else if (num > second && num != first) {
                second = num; // Update second
            }
        }
        return second == Integer.MIN_VALUE ? -1 : second;
    }
}
```

**Explanation:** The code checks for insufficient elements first. It tracks the largest and second largest using two variables. If a number exceeds the largest, it shifts values; else it checks for second largest. Duplicates are skipped to ensure uniqueness. A single pass gives O(n) time and O(1) space. Beginners understand through simple comparisons.

### 6. Rotate Array by k Steps

**Problem:** Rotate an array right by k positions in-place. Used in cyclic problems like scheduling. Optimal solution uses reversal.

```java
public class ArrayProblems {
    // Time: O(n), Space: O(1)
    public static void rotateArray(int[] arr, int k) {
        if (arr == null || arr.length == 0) return;
        k = k % arr.length; // Handle large k
        reverse(arr, 0, arr.length - 1); // Full reverse
        reverse(arr, 0, k - 1); // First part
        reverse(arr, k, arr.length - 1); // Second part
    }
    private static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start++] = arr[end];
            arr[end--] = temp;
        }
    }
}
```

**Explanation:** The code normalizes k to avoid redundant rotations. It reverses the entire array, then the first k elements, and finally the rest. The reverse helper swaps elements using two pointers. This achieves rotation in-place with O(n) time. No extra space is used, maintaining O(1) space. The reversal trick is insightful yet clear for beginners.

### 7. Remove Duplicates from Sorted Array

**Problem:** Remove duplicates in-place from a sorted array and return new length. Maintains relative order. Common in data cleaning tasks.

```java
public class ArrayProblems {
    // Time: O(n), Space: O(1)
    public static int removeDuplicates(int[] arr) {
        if (arr.length == 0) return 0;
        int writeIndex = 1; // Position for unique
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[i - 1]) { // New unique
                arr[writeIndex++] = arr[i];
            }
        }
        return writeIndex;
    }
}
```

**Explanation:** The code starts with the first element as unique. It uses a writeIndex to place unique elements. Each element is compared with the previous; unique ones are copied. The loop runs once, giving O(n) time. No extra space is needed, keeping O(1) space. Beginners see how sorted order simplifies the task.

### 8. Find Missing Number (1 to n)

**Problem:** Find the missing number in an array of 1 to n. Uses mathematical summation. Common in number sequence problems.

```java
public class ArrayProblems {
    // Time: O(n), Space: O(1)
    public static int findMissingNumber(int[] arr, int n) {
        int expectedSum = (n * (n + 1)) / 2; // Gauss formula
        int actualSum = 0;
        for (int num : arr) actualSum += num; // Calculate actual
        return expectedSum - actualSum; // Difference is missing
    }
}
```

**Explanation:** The code calculates the expected sum using the formula n*(n+1)/2. It sums all array elements to get the actual sum. The difference gives the missing number. This approach takes O(n) time for one pass. No extra space is used, ensuring O(1) space. The mathematical trick is elegant and beginner-friendly.

### 9. Move Zeros to End

**Problem:** Move all zeros to the end of an array, preserving non-zero order. In-place operation. Used in array rearrangement tasks.

```java
public class ArrayProblems {
    // Time: O(n), Space: O(1)
    public static void moveZerosToEnd(int[] arr) {
        int nonZeroPos = 0; // Track non-zero
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) arr[nonZeroPos++] = arr[i]; // Place non-zero
        }
        while (nonZeroPos < arr.length) arr[nonZeroPos++] = 0; // Fill zeros
    }
}
```

**Explanation:** A pointer tracks the position for non-zero elements. Non-zero elements are moved forward in one pass. Remaining positions are filled with zeros. The algorithm runs in O(n) time with two passes. It uses O(1) space by modifying in-place. The logic is straightforward for beginners to follow.

### 10. Find Pair with Given Sum

**Problem:** Check if two numbers in an array sum to a target. Common in two-sum problems. Hash set provides optimal solution.

```java
import java.util.HashSet;
import java.util.Set;

public class ArrayProblems {
    // Time: O(n), Space: O(n)
    public static boolean findPairWithSum(int[] arr, int sum) {
        Set<Integer> set = new HashSet<>(); // Store seen
        for (int num : arr) {
            if (set.contains(sum - num)) return true; // Complement found
            set.add(num);
        }
        return false;
    }
}
```

**Explanation:** A hash set stores numbers as they are processed. For each number, it checks if its complement (sum - num) exists. If found, a pair is confirmed, returning true. The single pass gives O(n) time with O(n) space for the set. Average O(1) lookups make it efficient. Beginners learn hash-based lookup simplicity.

---

## 🚀 Advanced Algorithms

### 11. Kadane's Algorithm (Max Subarray Sum)

**Problem:** Find the contiguous subarray with the largest sum. Handles negative numbers. Common in optimization problems.

```java
public class ArrayProblems {
    // Time: O(n), Space: O(1)
    public static int maxSubArraySum(int[] arr) {
        int maxSoFar = arr[0], currMax = arr[0];
        for (int i = 1; i < arr.length; i++) {
            currMax = Math.max(arr[i], currMax + arr[i]); // Reset or continue
            maxSoFar = Math.max(maxSoFar, currMax);
        }
        return maxSoFar;
    }
}
```

**Explanation:** The code tracks the maximum sum ending at the current position and globally. For each element, it decides to start anew or extend the subarray. The global max is updated accordingly. This dynamic programming approach runs in O(n) time. It uses O(1) space with two variables. Beginners grasp the reset-or-extend logic easily.

### 12. Find First Duplicate

**Problem:** Find the first number that repeats in an array. Assumes positives in range 1 to n. Uses array as hash.

```java
public class ArrayProblems {
    // Time: O(n), Space: O(1)
    public static int firstDuplicate(int[] arr) {
        for (int num : arr) {
            int index = Math.abs(num) - 1; // Map to index
            if (arr[index] < 0) return Math.abs(num); // Already seen
            arr[index] = -arr[index]; // Mark visited
        }
        return -1;
    }
}
```

**Explanation:** The array is used as a hash by negating values at indices. Each number maps to an index (num-1). If the index is already negative, that number is a duplicate. The loop stops at the first duplicate, ensuring O(n) time. No extra space is used, achieving O(1) space. Beginners learn this clever in-place marking technique.

### 13. Find Intersection of Two Sorted Arrays

**Problem:** Find common elements in two sorted arrays. Maintains sorted order. Used in set operations.

```java
import java.util.ArrayList;
import java.util.List;

public class ArrayProblems {
    // Time: O(min(n,m)), Space: O(1) excl output
    public static List<Integer> intersection(int[] arr1, int[] arr2) {
        List<Integer> result = new ArrayList<>();
        int i = 0, j = 0;
        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] == arr2[j]) { // Match
                result.add(arr1[i]);
                i++; j++;
            } else if (arr1[i] < arr2[j]) i++;
            else j++;
        }
        return result;
    }
}
```

**Explanation:** Two pointers traverse both arrays, advancing the smaller value. Equal elements are added to the result. The process stops when either array ends. Time is O(min(n,m)) due to sorted order. Space is O(1) excluding output. Beginners see how sorted arrays enable efficient pointer movement.

### 14. Merge Two Sorted Arrays

**Problem:** Merge two sorted arrays into the first in-place, with extra space in arr1. Common in merge sort. Uses backward merging.

```java
public class ArrayProblems {
    // Time: O(n+m), Space: O(1)
    public static void mergeSortedArrays(int[] arr1, int m, int[] arr2, int n) {
        int p1 = m - 1, p2 = n - 1, p = m + n - 1; // End pointers
        while (p2 >= 0) { // Until arr2 done
            if (p1 >= 0 && arr1[p1] > arr2[p2]) arr1[p--] = arr1[p1--];
            else arr1[p--] = arr2[p2--];
        }
    }
}
```

**Explanation:** The code fills arr1 from the end to avoid overwriting. It compares elements from both arrays' ends, placing the larger one. Pointers move backward accordingly. The process continues until arr2 is exhausted. Time is O(n+m) for all elements. Space is O(1) due to in-place merging.

### 15. Find Majority Element

**Problem:** Find the element appearing more than n/2 times. Assumes it exists. Moore's voting algorithm is optimal.

```java
public class ArrayProblems {
    // Time: O(n), Space: O(1)
    public static int majorityElement(int[] arr) {
        int count = 0, candidate = 0;
        for (int num : arr) {
            if (count == 0) candidate = num; // New candidate
            count += (num == candidate) ? 1 : -1; // Vote
        }
        return candidate;
    }
}
```

**Explanation:** The algorithm picks a candidate and counts votes. Matching elements increment, others decrement. When count reaches zero, a new candidate is chosen. The final candidate is the majority due to the problem's guarantee. Time is O(n) with one pass, space is O(1). Beginners see how pairing cancels minorities.

### 16. Find First and Last Position of Element

**Problem:** Find start and end indices of a target in a sorted array. Used in range queries. Binary search twice.

```java
public class ArrayProblems {
    // Time: O(log n), Space: O(1)
    public static int[] searchRange(int[] arr, int target) {
        int[] result = {-1, -1};
        result[0] = binarySearch(arr, target, true); // First pos
        result[1] = binarySearch(arr, target, false); // Last pos
        return result;
    }
    private static int binarySearch(int[] arr, int target, boolean first) {
        int left = 0, right = arr.length - 1, res = -1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == target) {
                res = mid;
                if (first) right = mid - 1; // Search left
                else left = mid + 1; // Search right
            } else if (arr[mid] < target) left = mid + 1;
            else right = mid - 1;
        }
        return res;
    }
}
```

**Explanation:** Two binary searches find the first and last occurrences. The boolean flag controls search direction on match. If found, it continues left or right for bounds. Time is O(log n) per search, total O(log n). Space is O(1) with minimal variables. Beginners learn binary search adaptation.

### 17. Find Peak Element

**Problem:** Find an element larger than its neighbors. Assumes peaks exist. Binary search on slope.

```java
public class ArrayProblems {
    // Time: O(log n), Space: O(1)
    public static int findPeakElement(int[] arr) {
        int left = 0, right = arr.length - 1;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] < arr[mid + 1]) left = mid + 1; // Ascending
            else right = mid; // Descending
        }
        return left;
    }
}
```

**Explanation:** The code uses binary search to find a peak. It compares mid with the next element to determine slope. It moves toward the higher side, narrowing the range. A peak is guaranteed, so left converges to it. Time is O(log n), space is O(1). Beginners see how binary search applies beyond exact matches.

### 18. Find Kth Largest Element

**Problem:** Find the kth largest element in an array. Quickselect is optimal. Common in order statistics.

```java
public class ArrayProblems {
    // Time: O(n) avg, Space: O(1)
    public static int findKthLargest(int[] arr, int k) {
        return quickSelect(arr, 0, arr.length - 1, arr.length - k);
    }
    private static int quickSelect(int[] arr, int left, int right, int k) {
        if (left == right) return arr[left];
        int pivotIndex = partition(arr, left, right);
        if (k == pivotIndex) return arr[k];
        else if (k < pivotIndex) return quickSelect(arr, left, pivotIndex - 1, k);
        else return quickSelect(arr, pivotIndex + 1, right, k);
    }
    private static int partition(int[] arr, int left, int right) {
        int pivot = arr[right], i = left - 1;
        for (int j = left; j < right; j++) {
            if (arr[j] <= pivot) {
                i++;
                swap(arr, i, j);
            }
        }
        swap(arr, i + 1, right);
        return i + 1;
    }
    private static void swap(int[] arr, int a, int b) {
        int temp = arr[a]; arr[a] = arr[b]; arr[b] = temp;
    }
}
```

**Explanation:** Quickselect partitions around a pivot, placing it correctly. It recurses on the side containing the kth element. The partition moves smaller elements left, using the rightmost as pivot. Average time is O(n), worst O(n²). Space is O(1) with in-place swaps. Beginners learn quicksort-like partitioning.

### 19. Find Minimum in Rotated Sorted Array

**Problem:** Find the smallest element in a rotated sorted array. No duplicates assumed. Binary search finds pivot.

```java
public class ArrayProblems {
    // Time: O(log n), Space: O(1)
    public static int findMinInRotatedArray(int[] arr) {
        int left = 0, right = arr.length - 1;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] > arr[right]) left = mid + 1; // Min right
            else right = mid;
        }
        return arr[left];
    }
}
```

**Explanation:** The code uses binary search to find the rotation point. It compares mid with right to determine the unsorted side. The minimum lies in the unsorted half, so pointers adjust. It converges to the minimum in O(log n) time. Space is O(1) with no extra storage. Beginners see binary search for min.

### 20. Search in Rotated Sorted Array

**Problem:** Find a target in a rotated sorted array. No duplicates. Modified binary search.

```java
public class ArrayProblems {
    // Time: O(log n), Space: O(1)
    public static int searchRotatedArray(int[] arr, int target) {
        int left = 0, right = arr.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == target) return mid;
            if (arr[left] <= arr[mid]) { // Left sorted
                if (target >= arr[left] && target < arr[mid]) right = mid - 1;
                else left = mid + 1;
            } else { // Right sorted
                if (target > arr[mid] && target <= arr[right]) left = mid + 1;
                else right = mid - 1;
            }
        }
        return -1;
    }
}
```

**Explanation:** The code identifies the sorted half using mid and left comparison. It checks if the target lies in the sorted half. Pointers adjust to narrow the search. Time is O(log n) for binary search. Space is O(1) with no extra storage. Beginners learn to handle rotated arrays.

---

## 🧠 Complex Problems

### 21. Find Duplicate Number

**Problem:** Find the duplicate in an array of 1 to n+1. Floyd's cycle detection. No array modification.

```java
public class ArrayProblems {
    // Time: O(n), Space: O(1)
    public static int findDuplicate(int[] arr) {
        int slow = arr[0], fast = arr[0];
        do { // Find cycle
            slow = arr[slow];
            fast = arr[arr[fast]];
        } while (slow != fast);
        slow = arr[0];
        while (slow != fast) { // Find start
            slow = arr[slow];
            fast = arr[fast];
        }
        return slow;
    }
}
```

**Explanation:** The array is treated as a linked list where values point to indices. Slow and fast pointers find a cycle caused by the duplicate. Resetting slow finds the cycle's start, the duplicate. Time is O(n) for cycle detection. Space is O(1) with no extra storage. Beginners learn Floyd's tortoise-hare algorithm.

### 22. Find All Duplicates in Array

**Problem:** Find all duplicates in an array of 1 to n. Uses array as hash. In-place marking.

```java
import java.util.ArrayList;
import java.util.List;

public class ArrayProblems {
    // Time: O(n), Space: O(1)
    public static List<Integer> findAllDuplicates(int[] arr) {
        List<Integer> result = new ArrayList<>();
        for (int num : arr) {
            int index = Math.abs(num) - 1;
            if (arr[index] < 0) result.add(Math.abs(num)); // Duplicate
            arr[index] = -arr[index];
        }
        return result;
    }
}
```

**Explanation:** Numbers map to indices (num-1). Negating marks a number as seen. If already negative, it's a duplicate. The loop processes each element once, giving O(n) time. Space is O(1) excluding output. Beginners see how arrays can act as hash tables.

### 23. Find Common Elements in Three Sorted Arrays

**Problem:** Find elements common to three sorted arrays. Uses three pointers. Common in multi-set operations.

```java
import java.util.ArrayList;
import java.util.List;

public class ArrayProblems {
    // Time: O(n1+n2+n3), Space: O(1) excl output
    public static List<Integer> commonElements(int[] arr1, int[] arr2, int[] arr3) {
        List<Integer> result = new ArrayList<>();
        int i = 0, j = 0, k = 0;
        while (i < arr1.length && j < arr2.length && k < arr3.length) {
            if (arr1[i] == arr2[j] && arr2[j] == arr3[k]) {
                result.add(arr1[i++]); j++; k++;
            } else if (arr1[i] <= arr2[j] && arr1[i] <= arr3[k]) i++;
            else if (arr2[j] <= arr1[i] && arr2[j] <= arr3[k]) j++;
            else k++;
        }
        return result;
    }
}
```

**Explanation:** Three pointers traverse each array, advancing the smallest. Equal elements across all are added to the result. The process continues until any array ends. Time is linear across all elements, O(n1+n2+n3). Space is O(1) excluding output. Beginners learn synchronized pointer movement.

### 24. Find Leaders in Array

**Problem:** Find elements greater than all to their right. Scan backward. Used in ranking problems.

```java
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayProblems {
    // Time: O(n), Space: O(1) excl output
    public static List<Integer> findLeaders(int[] arr) {
        List<Integer> result = new ArrayList<>();
        int maxFromRight = arr[arr.length - 1];
        result.add(maxFromRight);
        for (int i = arr.length - 2; i >= 0; i--) {
            if (arr[i] > maxFromRight) {
                maxFromRight = arr[i];
                result.add(maxFromRight);
            }
        }
        Collections.reverse(result);
        return result;
    }
}
```

**Explanation:** The code starts with the last element as a leader. It scans backward, tracking the maximum seen. Elements exceeding this max are leaders. The result is reversed for correct order. Time is O(n) for one pass, space is O(1) excluding output. Beginners understand right-to-left scanning.

### 25. Find Maximum Product Subarray

**Problem:** Find contiguous subarray with maximum product. Handles negatives and zeros. Dynamic approach.

```java
public class ArrayProblems {
    // Time: O(n), Space: O(1)
    public static int maxProductSubarray(int[] arr) {
        int maxSoFar = arr[0], maxEnding = arr[0], minEnding = arr[0];
        for (int i = 1; i < arr.length; i++) {
            int temp = maxEnding;
            maxEnding = Math.max(arr[i], Math.max(maxEnding * arr[i], minEnding * arr[i]));
            minEnding = Math.min(arr[i], Math.min(temp * arr[i], minEnding * arr[i]));
            maxSoFar = Math.max(maxSoFar, maxEnding);
        }
        return maxSoFar;
    }
}
```

**Explanation:** Tracks maximum and minimum products due to negatives. For each element, it computes new max/min considering multiplication. A temporary variable preserves max for min calculation. The global max is updated each step. Time is O(n) for one pass, space is O(1). Beginners see how negatives complicate products.

### 26. Find Trapped Water

**Problem:** Calculate water trapped between bars of heights. Two-pointer technique. Common in geometry problems.

```java
public class ArrayProblems {
    // Time: O(n), Space: O(1)
    public static int trapWater(int[] arr) {
        int left = 0, right = arr.length - 1, leftMax = 0, rightMax = 0, water = 0;
        while (left < right) {
            if (arr[left] < arr[right]) {
                if (arr[left] >= leftMax) leftMax = arr[left];
                else water += leftMax - arr[left];
                left++;
            } else {
                if (arr[right] >= rightMax) rightMax = arr[right];
                else water += rightMax - arr[right];
                right--;
            }
        }
        return water;
    }
}
```

**Explanation:** Two pointers move inward, tracking max heights on both sides. Water is added based on the smaller side's max minus current height. Max heights are updated as needed. The process continues until pointers meet. Time is O(n), space is O(1). Beginners visualize water trapping via bounds.

### 27. Find Next Greater Element

**Problem:** Find the next greater element to the right for each element. Uses monotonic stack. Common in stack-based problems.

```java
import java.util.Stack;

public class ArrayProblems {
    // Time: O(n), Space: O(n)
    public static int[] nextGreaterElement(int[] arr) {
        int[] result = new int[arr.length];
        Stack<Integer> stack = new Stack<>();
        for (int i = arr.length - 1; i >= 0; i--) {
            while (!stack.isEmpty() && stack.peek() <= arr[i]) stack.pop(); // Pop smaller
            result[i] = stack.isEmpty() ? -1 : stack.peek();
            stack.push(arr[i]);
        }
        return result;
    }
}
```

**Explanation:** A stack maintains elements in decreasing order. Scanning backward, smaller elements are popped until a larger one is found. The top of the stack or -1 is assigned as the result. Each element is pushed after processing. Time is O(n) amortized, space is O(n) for the stack. Beginners learn stack's monotonic property.

### 28. Find Subarray with Given Sum

**Problem:** Find a subarray summing to a target value. Returns start and end indices. Prefix sum with hash map.

```java
import java.util.HashMap;
import java.util.Map;

public class ArrayProblems {
    // Time: O(n), Space: O(n)
    public static int[] subarraySum(int[] arr, int sum) {
        Map<Integer, Integer> map = new HashMap<>();
        int currSum = 0;
        for (int i = 0; i < arr.length; i++) {
            currSum += arr[i];
            if (currSum == sum) return new int[]{0, i};
            if (map.containsKey(currSum - sum)) return new int[]{map.get(currSum - sum) + 1, i};
            map.put(currSum, i); // Store index
        }
        return new int[]{-1, -1};
    }
}
```

**Explanation:** The code tracks cumulative sums in a hash map with their indices. If the current sum equals the target, it returns the range from 0. If a sum minus target exists, it finds a valid subarray. The map stores the earliest index for each sum. Time is O(n), space is O(n). Beginners see prefix sum utility.

### 29. Find Longest Consecutive Sequence

**Problem:** Find the length of the longest consecutive number sequence. Hash set approach. Common in sequence problems.

```java
import java.util.HashSet;
import java.util.Set;

public class ArrayProblems {
    // Time: O(n), Space: O(n)
    public static int longestConsecutive(int[] arr) {
        Set<Integer> set = new HashSet<>();
        for (int num : arr) set.add(num);
        int maxLength = 0;
        for (int num : set) {
            if (!set.contains(num - 1)) { // Start of sequence
                int curr = num, len = 1;
                while (set.contains(curr + 1)) { curr++; len++; }
                maxLength = Math.max(maxLength, len);
            }
        }
        return maxLength;
    }
}
```

**Explanation:** All numbers are added to a hash set for O(1) lookups. For each number, it checks if it starts a sequence (no num-1). It extends the sequence while consecutive numbers exist. The longest sequence is tracked. Time is O(n) due to set operations, space is O(n). Beginners learn efficient sequence checking.

### 30. Find Smallest Positive Missing Number

**Problem:** Find the smallest positive integer missing from the array. In-place index mapping. Common in number range problems.

```java
public class ArrayProblems {
    // Time: O(n), Space: O(1)
    public static int firstMissingPositive(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) { // Place numbers
            while (arr[i] > 0 && arr[i] <= n && arr[arr[i] - 1] != arr[i]) {
                swap(arr, i, arr[i] - 1);
            }
        }
        for (int i = 0; i < n; i++) {
            if (arr[i] != i + 1) return i + 1;
        }
        return n + 1;
    }
    private static void swap(int[] arr, int a, int b) {
        int temp = arr[a]; arr[a] = arr[b]; arr[b] = temp;
    }
}
```

**Explanation:** The code places each positive number at its index (num-1). It swaps until numbers are correctly placed or out of range. A second pass finds the first mismatch, indicating the missing number. If all are placed, n+1 is returned. Time is O(n), space is O(1). Beginners see in-place cyclic sorting.

---

## ⚡ Optimization Problems

### 31. Find Maximum Difference Between Two Elements

**Problem:** Find max arr[j] - arr[i] where j > i. Tracks minimum element. Like stock profit.

```java
public class ArrayProblems {
    // Time: O(n), Space: O(1)
    public static int maxDifference(int[] arr) {
        int minElement = arr[0], maxDiff = arr[1] - arr[0];
        for (int i = 1; i < arr.length; i++) {
            maxDiff = Math.max(maxDiff, arr[i] - minElement);
            minElement = Math.min(minElement, arr[i]);
        }
        return maxDiff;
    }
}
```

**Explanation:** The code tracks the minimum element seen so far. For each element, it calculates the potential difference with the min. The maximum difference is updated accordingly. Time is O(n) for one pass, space is O(1). It assumes at least two elements. Beginners understand tracking min for max profit.

### 32. Find Maximum Sum Circular Subarray

**Problem:** Find max sum of a contiguous subarray, allowing wrap-around. Combines Kadane's algorithm. Handles circular cases.

```java
public class ArrayProblems {
    // Time: O(n), Space: O(1)
    public static int maxSumCircularSubarray(int[] arr) {
        int maxStraight = maxSubArraySum(arr);
        if (maxStraight < 0) return maxStraight;
        int totalSum = 0;
        for (int i = 0; i < arr.length; i++) {
            totalSum += arr[i];
            arr[i] = -arr[i];
        }
        int maxCircular = totalSum + maxSubArraySum(arr); // Min sub negative
        return Math.max(maxStraight, maxCircular);
    }
    private static int maxSubArraySum(int[] arr) {
        int maxSoFar = arr[0], currMax = arr[0];
        for (int i = 1; i < arr.length; i++) {
            currMax = Math.max(arr[i], currMax + arr[i]);
            maxSoFar = Math.max(maxSoFar, currMax);
        }
        return maxSoFar;
    }
}
```

**Explanation:** The code computes the max non-circular sum using Kadane's. It inverts the array to find the min subarray sum. The circular sum is total minus min subarray. The max of straight and circular is returned. Time is O(n) for two Kadane's passes, space is O(1). Beginners see how inversion handles wrap-around.

### 33. Find Element in Sorted Rotated Array with Duplicates

**Problem:** Search a target in a rotated sorted array with duplicates. Modified binary search. Handles ambiguity from duplicates.

```java
public class ArrayProblems {
    // Time: O(log n) avg, Space: O(1)
    public static boolean searchRotatedArrayDuplicates(int[] arr, int target) {
        int left = 0, right = arr.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == target) return true;
            if (arr[left] == arr[mid] && arr[mid] == arr[right]) { // Skip duplicates
                left++; right--;
            } else if (arr[left] <= arr[mid]) {
                if (target >= arr[left] && target < arr[mid]) right = mid - 1;
                else left = mid + 1;
            } else {
                if (target > arr[mid] && target <= arr[right]) left = mid + 1;
                else right = mid - 1;
            }
        }
        return false;
    }
}
```

**Explanation:** The code checks for target using binary search. If bounds equal mid, duplicates are skipped by incrementing/decrementing. Otherwise, it identifies the sorted half and adjusts pointers. Time is O(log n) average, O(n) worst due to duplicates. Space is O(1). Beginners see handling of ambiguous cases.

### 34. Find Minimum Length Subarray with Sum >= k

**Problem:** Find shortest subarray with sum at least k. Sliding window technique. Common in optimization.

```java
public class ArrayProblems {
    // Time: O(n), Space: O(1)
    public static int minSubArrayLen(int k, int[] arr) {
        int minLength = Integer.MAX_VALUE, currSum = 0, left = 0;
        for (int right = 0; right < arr.length; right++) {
            currSum += arr[right]; // Expand
            while (currSum >= k) { // Shrink
                minLength = Math.min(minLength, right - left + 1);
                currSum -= arr[left++];
            }
        }
        return minLength == Integer.MAX_VALUE ? 0 : minLength;
    }
}
```

**Explanation:** A sliding window expands by adding elements. When the sum meets or exceeds k, it shrinks from the left. The minimum length is updated during shrinking. Time is O(n) as each element is added/removed once. Space is O(1) with pointers. Beginners learn sliding window dynamics.

### 35. Find Maximum Length of Subarray with Equal 0s and 1s

**Problem:** Find longest subarray with equal zeros and ones. Uses prefix sum with hash map. Balances binary sequences.

```java
import java.util.HashMap;
import java.util.Map;

public class ArrayProblems {
    // Time: O(n), Space: O(n)
    public static int findMaxLength(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, -1);
        int maxLen = 0, sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i] == 1 ? 1 : -1; // Balance
            if (map.containsKey(sum)) maxLen = Math.max(maxLen, i - map.get(sum));
            else map.put(sum, i);
        }
        return maxLen;
    }
}
```

**Explanation:** Zeros are treated as -1, ones as +1 for balance. Prefix sums are stored with their indices. Equal sums indicate a balanced subarray, length is i - prev_index. The map stores the first occurrence of each sum. Time is O(n), space is O(n). Beginners see prefix sum for balance.

### 36. Find Maximum Sum of K Consecutive Elements

**Problem:** Find maximum sum of k consecutive elements. Sliding window approach. Common in window-based problems.

```java
public class ArrayProblems {
    // Time: O(n), Space: O(1)
    public static int maxSumKConsecutive(int[] arr, int k) {
        int maxSum = 0;
        for (int i = 0; i < k; i++) maxSum += arr[i]; // Initial
        int currSum = maxSum;
        for (int i = k; i < arr.length; i++) {
            currSum += arr[i] - arr[i - k]; // Slide
            maxSum = Math.max(maxSum, currSum);
        }
        return maxSum;
    }
}
```

**Explanation:** The first k elements form the initial window sum. The window slides by adding the next element and subtracting the first. The maximum sum is updated each slide. Time is O(n) for one pass after initial sum. Space is O(1) with two variables. Beginners see efficient window sliding.

### 37. Find Number of Subarrays with Sum K

**Problem:** Count subarrays with sum equal to k. Prefix sum with hash map. Handles negatives.

```java
import java.util.HashMap;
import java.util.Map;

public class ArrayProblems {
    // Time: O(n), Space: O(n)
    public static int subarraySumEqualsK(int[] arr, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, 1); // Empty sub
        int sum = 0, count = 0;
        for (int num : arr) {
            sum += num;
            count += map.getOrDefault(sum - k, 0); // Previous
            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }
        return count;
    }
}
```

**Explanation:** The code tracks prefix sums and their frequencies. If sum-k exists, it adds the count of such sums. Each sum is recorded with its frequency. The empty subarray is initialized for sum 0. Time is O(n), space is O(n). Beginners learn counting with prefix sums.

### 38. Find Pivot Index

**Problem:** Find index where left and right sums are equal. Includes current element in right. Prefix sum approach.

```java
public class ArrayProblems {
    // Time: O(n), Space: O(1)
    public static int pivotIndex(int[] arr) {
        int totalSum = 0, leftSum = 0;
        for (int num : arr) totalSum += num;
        for (int i = 0; i < arr.length; i++) {
            if (leftSum == totalSum - leftSum - arr[i]) return i;
            leftSum += arr[i];
        }
        return -1;
    }
}
```

**Explanation:** The total sum is computed first. For each index, left sum is checked against right (total - left - current). If equal, the index is returned. The left sum accumulates as it iterates. Time is O(n) for two passes, space is O(1). Beginners see balance point logic.

### 39. Find Equilibrium Index

**Problem:** Find index where left and right sums are equal, excluding current. Similar to pivot. Prefix sum method.

```java
public class ArrayProblems {
    // Time: O(n), Space: O(1)
    public static int equilibriumIndex(int[] arr) {
        int totalSum = 0, leftSum = 0;
        for (int num : arr) totalSum += num;
        for (int i = 0; i < arr.length; i++) {
            totalSum -= arr[i];
            if (leftSum == totalSum) return i;
            leftSum += arr[i];
        }
        return -1;
    }
}
```

**Explanation:** Total sum is calculated first. For each index, the right sum is total minus current, left sum accumulates. If they match, the index is returned. The process is linear with O(n) time. Space is O(1) with minimal variables. Beginners see slight variation from pivot.

### 40. Find Maximum Average Subarray of Size K

**Problem:** Find k-length subarray with maximum average. Equivalent to max sum. Sliding window.

```java
public class ArrayProblems {
    // Time: O(n), Space: O(1)
    public static double maxAverage(int[] arr, int k) {
        double sum = 0;
        for (int i = 0; i < k; i++) sum += arr[i];
        double maxSum = sum;
        for (int i = k; i < arr.length; i++) {
            sum += arr[i] - arr[i - k];
            maxSum = Math.max(maxSum, sum);
        }
        return maxSum / k;
    }
}
```

**Explanation:** The initial k-element sum is computed. The window slides, adding new and subtracting old elements. The maximum sum is tracked. Dividing by k gives the average at the end. Time is O(n), space is O(1). Beginners see average as scaled sum.

---

## 🎯 Specialized Problems

### 41. Find All Subarrays with Zero Sum

**Problem:** Find all subarrays with sum zero. Prefix sum with index lists. Common in sum-based problems.

```java
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ArrayProblems {
    // Time: O(n), Space: O(n)
    public static List<int[]> findZeroSumSubarrays(int[] arr) {
        List<int[]> result = new ArrayList<>();
        Map<Integer, List<Integer>> map = new HashMap<>();
        map.put(0, new ArrayList<>(List.of(-1)));
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            if (map.containsKey(sum)) {
                for (int start : map.get(sum)) result.add(new int[]{start + 1, i});
            }
            map.computeIfAbsent(sum, v -> new ArrayList<>()).add(i);
        }
        return result;
    }
}
```

**Explanation:** Prefix sums are stored with lists of indices. Repeated sums indicate zero-sum subarrays between indices. The empty subarray is handled with sum 0 at -1. Each sum adds a new index. Time is O(n), space is O(n). Beginners learn multi-index prefix sums.

### 42. Find Maximum Length of Subarray with Positive Product

**Problem:** Find longest subarray with positive product. Tracks positive/negative lengths. Handles zeros and negatives.

```java
public class ArrayProblems {
    // Time: O(n), Space: O(1)
    public static int getMaxLen(int[] arr) {
        int pos = 0, neg = 0, maxLen = 0;
        for (int num : arr) {
            if (num == 0) { pos = neg = 0; } // Reset
            else if (num > 0) {
                pos++; neg = neg == 0 ? 0 : neg + 1;
            } else {
                int temp = pos; pos = neg == 0 ? 0 : neg + 1; neg = temp + 1;
            }
            maxLen = Math.max(maxLen, pos);
        }
        return maxLen;
    }
}
```

**Explanation:** Tracks lengths of subarrays with positive and negative products. Zeros reset both lengths. Positives increment positive length, extend negative if exists. Negatives swap lengths with increment. Max positive length is updated. Time is O(n), space is O(1).

### 43. Find Minimum Operations to Make Array Equal

**Problem:** Minimum operations to make all elements equal to a target. Sum of absolute differences. Optimization problem.

```java
public class ArrayProblems {
    // Time: O(n), Space: O(1)
    public static int minOperations(int[] arr, int target) {
        int operations = 0;
        for (int num : arr) operations += Math.abs(num - target); // Diffs
        return operations;
    }
}
```

**Explanation:** The code sums absolute differences between each element and the target. Each difference represents operations needed (add or subtract). A single pass computes the total, giving O(n) time. Space is O(1) with one variable. Assumes target is given. Beginners see simple accumulation logic.

### 44. Find Maximum Sum of Non-Adjacent Elements

**Problem:** Find maximum sum of non-adjacent elements. Dynamic programming optimized. Like house robber problem.

```java
public class ArrayProblems {
    // Time: O(n), Space: O(1)
    public static int maxSumNonAdjacent(int[] arr) {
        int incl = arr[0], excl = 0;
        for (int i = 1; i < arr.length; i++) {
            int temp = incl;
            incl = excl + arr[i]; // Include
            excl = Math.max(temp, excl); // Exclude
        }
        return Math.max(incl, excl);
    }
}
```

**Explanation:** Tracks sums including and excluding the current element. Include takes previous exclude plus current. Exclude takes max of previous states. Updates alternate each step. Time is O(n), space is O(1). Beginners see DP with minimal variables.

### 45. Find Stock Buy Sell to Maximize Profit

**Problem:** Maximize profit with one buy and sell. Track minimum price. Common in trading problems.

```java
public class ArrayProblems {
    // Time: O(n), Space: O(1)
    public static int maxProfit(int[] prices) {
        int minPrice = Integer.MAX_VALUE, maxProfit = 0;
        for (int price : prices) {
            minPrice = Math.min(minPrice, price);
            maxProfit = Math.max(maxProfit, price - minPrice);
        }
        return maxProfit;
    }
}
```

**Explanation:** Tracks the minimum price seen. For each price, it computes potential profit against the min. The maximum profit is updated. Time is O(n) for one pass, space is O(1). Assumes sell after buy. Beginners see greedy min tracking.

### 46. Find Maximum Sum of Two Non-Overlapping Subarrays

**Problem:** Find max sum of two non-overlapping subarrays of given lengths. Prefix sums optimize. Complex window problem.

```java
public class ArrayProblems {
    // Time: O(n), Space: O(n)
    public static int maxSumTwoNoOverlap(int[] arr, int firstLen, int secondLen) {
        int n = arr.length;
        int[] prefix = new int[n + 1];
        for (int i = 0; i < n; i++) prefix[i + 1] = prefix[i] + arr[i];
        int maxSum = 0;
        for (int i = firstLen; i <= n; i++) {
            int first = prefix[i] - prefix[i - firstLen];
            for (int j = secondLen; j <= i - firstLen; j++) {
                int second = prefix[j] - prefix[j - secondLen];
                maxSum = Math.max(maxSum, first + second);
            }
            for (int j = i + secondLen; j <= n; j++) {
                int second = prefix[j] - prefix[j - secondLen];
                maxSum = Math.max(maxSum, first + second);
            }
        }
        return maxSum;
    }
}
```

**Explanation:** Prefix sums precompute range sums. For each first subarray, it checks second subarrays before and after. The sum of both is computed using prefix differences. The maximum sum is tracked. Time is O(n) with prefix, space is O(n). Beginners see prefix sum for ranges.

### 47. Find Number of Pairs with Difference K

**Problem:** Count pairs with absolute difference k. Hash map approach. Common in pair counting.

```java
import java.util.HashMap;
import java.util.Map;

public class ArrayProblems {
    // Time: O(n), Space: O(n)
    public static int countPairsWithDiff(int[] arr, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        int count = 0;
        for (int num : arr) {
            count += map.getOrDefault(num - k, 0) + map.getOrDefault(num + k, 0);
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        return count;
    }
}
```

**Explanation:** A hash map stores frequency of numbers. For each number, it counts pairs with difference k by checking num-k and num+k. The frequency is updated after checking. Time is O(n), space is O(n). Handles zero k carefully. Beginners learn pair counting with hash.

### 48. Find Maximum Length of Repeated Subarray

**Problem:** Find longest common subarray between two arrays. Dynamic programming. Used in string matching analogs.

```java
public class ArrayProblems {
    // Time: O(n*m), Space: O(n*m)
    public static int findLength(int[] arr1, int[] arr2) {
        int n = arr1.length, m = arr2.length;
        int[][] dp = new int[n + 1][m + 1]; // Len ending
        int maxLen = 0;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                if (arr1[i - 1] == arr2[j - 1]) {
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                    maxLen = Math.max(maxLen, dp[i][j]);
                }
            }
        }
        return maxLen;
    }
}
```

**Explanation:** A DP table tracks lengths of common subarrays. If elements match, it extends the previous diagonal value. The maximum length is updated during computation. Time is O(nm) for nested loops, space is O(nm). Beginners see 2D DP for sequences. Table logic is clear.

### 49. Find Maximum Sum Increasing Subsequence

**Problem:** Find maximum sum of an increasing subsequence. Dynamic programming. Tests sequence optimization.

```java
public class ArrayProblems {
    // Time: O(n^2), Space: O(n)
    public static int maxSumIncreasingSubsequence(int[] arr) {
        int[] dp = new int[arr.length];
        System.arraycopy(arr, 0, dp, 0, arr.length); // Init self
        int maxSum = dp[0];
        for (int i = 1; i < arr.length; i++) {
            for (int j = 0; j < i; j++) {
                if (arr[i] > arr[j]) dp[i] = Math.max(dp[i], dp[j] + arr[i]);
            }
            maxSum = Math.max(maxSum, dp[i]);
        }
        return maxSum;
    }
}
```

**Explanation:** A DP array stores max sums ending at each index. For each element, it checks previous smaller elements to extend. The sum is updated if larger. The global max is tracked. Time is O(n²) for nested loops, space is O(n). Beginners learn sequence DP.

### 50. Find Maximum Sum of Subarray with Length K

**Problem:** Find maximum sum of a k-length subarray. Sliding window. Fixed-size optimization.

```java
public class ArrayProblems {
    // Time: O(n), Space: O(1)
    public static int maxSumSubarrayK(int[] arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) sum += arr[i];
        int maxSum = sum;
        for (int i = k; i < arr.length; i++) {
            sum += arr[i] - arr[i - k];
            maxSum = Math.max(maxSum, sum);
        }
        return maxSum;
    }
}
```

**Explanation:** The initial k-element sum is computed. The window slides by adding the next and subtracting the first. The maximum sum is updated each slide. Time is O(n) after initial sum, space is O(1). Fixed window size simplifies logic. Beginners see sliding window efficiency.

---

## 🎉 Conclusion

This comprehensive collection covers 50 essential array problems with detailed solutions, explanations, and complexity analysis. Each problem is designed to build upon fundamental concepts while introducing new techniques and patterns.

### Key Learning Outcomes:
- **Basic Operations**: Array traversal, searching, and manipulation
- **Advanced Algorithms**: Binary search, two pointers, and dynamic programming
- **Complex Problems**: Cycle detection, in-place operations, and optimization
- **Specialized Techniques**: Sliding windows, prefix sums, and hash-based solutions

### Practice Tips:
1. Start with basic operations and gradually move to complex problems
2. Focus on understanding the underlying patterns and techniques
3. Practice implementing solutions from scratch
4. Analyze time and space complexity for each approach
5. Try to optimize solutions and explore alternative approaches

Happy coding! 🚀
