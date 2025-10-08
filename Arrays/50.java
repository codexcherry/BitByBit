import java.util.*;

// Collection of 50 classic array problems with optimal Java solutions
public class ArrayProblems50 {

    // 1. Find Maximum Element
    // Time: O(n), Space: O(1)
    public static int findMaxElement(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) max = Math.max(max, arr[i]);
        return max;
    }

    // 2. Find Minimum Element
    // Time: O(n), Space: O(1)
    public static int findMinElement(int[] arr) {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) min = Math.min(min, arr[i]);
        return min;
    }

    // 3. Reverse Array In-Place
    // Time: O(n/2), Space: O(1)
    public static void reverseArray(int[] arr) {
        int start = 0, end = arr.length - 1;
        while (start < end) {
            int temp = arr[start];
            arr[start++] = arr[end];
            arr[end--] = temp;
        }
    }

    // 4. Check if Array is Sorted
    // Time: O(n), Space: O(1)
    public static boolean isSorted(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[i - 1]) return false;
        }
        return true;
    }

    // 5. Find Second Largest Element
    // Time: O(n), Space: O(1)
    public static int secondLargest(int[] arr) {
        int first = Integer.MIN_VALUE, second = Integer.MIN_VALUE;
        for (int num : arr) {
            if (num > first) {
                second = first;
                first = num;
            } else if (num > second && num != first) {
                second = num;
            }
        }
        return second == Integer.MIN_VALUE ? -1 : second;
    }

    // 6. Rotate Array by k Steps
    // Time: O(n), Space: O(1)
    public static void rotateArray(int[] arr, int k) {
        k = k % arr.length;
        reverse(arr, 0, arr.length - 1);
        reverse(arr, 0, k - 1);
        reverse(arr, k, arr.length - 1);
    }
    private static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start++] = arr[end];
            arr[end--] = temp;
        }
    }

    // 7. Remove Duplicates from Sorted Array
    // Time: O(n), Space: O(1)
    public static int removeDuplicates(int[] arr) {
        if (arr.length == 0) return 0;
        int writeIndex = 1;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[i - 1]) arr[writeIndex++] = arr[i];
        }
        return writeIndex;
    }

    // 8. Find Missing Number (1 to n)
    // Time: O(n), Space: O(1)
    public static int findMissingNumber(int[] arr, int n) {
        int expectedSum = (n * (n + 1)) / 2;
        int actualSum = 0;
        for (int num : arr) actualSum += num;
        return expectedSum - actualSum;
    }

    // 9. Move Zeros to End
    // Time: O(n), Space: O(1)
    public static void moveZerosToEnd(int[] arr) {
        int nonZeroPos = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) arr[nonZeroPos++] = arr[i];
        }
        while (nonZeroPos < arr.length) arr[nonZeroPos++] = 0;
    }

    // 10. Find Pair with Given Sum
    // Time: O(n), Space: O(n)
    public static boolean findPairWithSum(int[] arr, int sum) {
        Set<Integer> set = new HashSet<>();
        for (int num : arr) {
            if (set.contains(sum - num)) return true;
            set.add(num);
        }
        return false;
    }

    // 11. Kadane's Algorithm (Max Subarray Sum)
    // Time: O(n), Space: O(1)
    public static int maxSubArraySum(int[] arr) {
        int maxSoFar = arr[0], currMax = arr[0];
        for (int i = 1; i < arr.length; i++) {
            currMax = Math.max(arr[i], currMax + arr[i]);
            maxSoFar = Math.max(maxSoFar, currMax);
        }
        return maxSoFar;
    }

    // 12. Find First Duplicate
    // Time: O(n), Space: O(1) (using array as hash map)
    public static int firstDuplicate(int[] arr) {
        for (int num : arr) {
            int index = Math.abs(num) - 1;
            if (arr[index] > 0) arr[index] = -arr[index];
            else return Math.abs(num);
        }
        return -1;
    }

    // 13. Find Intersection of Two Sorted Arrays
    // Time: O(min(n, m)), Space: O(1) (excluding output)
    public static List<Integer> intersection(int[] arr1, int[] arr2) {
        List<Integer> result = new ArrayList<>();
        int i = 0, j = 0;
        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] == arr2[j]) {
                result.add(arr1[i]);
                i++;
                j++;
            } else if (arr1[i] < arr2[j]) i++;
            else j++;
        }
        return result;
    }

    // 14. Merge Two Sorted Arrays
    // Time: O(n + m), Space: O(1) (in-place)
    public static void mergeSortedArrays(int[] arr1, int m, int[] arr2, int n) {
        int p1 = m - 1, p2 = n - 1, p = m + n - 1;
        while (p2 >= 0 && p1 >= 0) {
            arr1[p--] = arr1[p1] > arr2[p2] ? arr1[p1--] : arr2[p2--];
        }
        while (p2 >= 0) arr1[p--] = arr2[p2--];
    }

    // 15. Find Majority Element (Moore's Voting Algorithm)
    // Time: O(n), Space: O(1)
    public static int majorityElement(int[] arr) {
        int count = 0, candidate = 0;
        for (int num : arr) {
            if (count == 0) candidate = num;
            count += (num == candidate) ? 1 : -1;
        }
        return candidate;
    }

    // 16. Find First and Last Position of Element
    // Time: O(log n), Space: O(1)
    public static int[] searchRange(int[] arr, int target) {
        int[] result = {-1, -1};
        result[0] = binarySearch(arr, target, true);
        result[1] = binarySearch(arr, target, false);
        return result;
    }
    private static int binarySearch(int[] arr, int target, boolean first) {
        int left = 0, right = arr.length - 1, result = -1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == target) {
                result = mid;
                if (first) right = mid - 1;
                else left = mid + 1;
            } else if (arr[mid] < target) left = mid + 1;
            else right = mid - 1;
        }
        return result;
    }

    // 17. Find Peak Element
    // Time: O(log n), Space: O(1)
    public static int findPeakElement(int[] arr) {
        int left = 0, right = arr.length - 1;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] < arr[mid + 1]) left = mid + 1;
            else right = mid;
        }
        return left;
    }

    // 18. Find Kth Largest Element
    // Time: O(n) average (QuickSelect), Space: O(1)
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
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[i + 1];
        arr[i + 1] = arr[right];
        arr[right] = temp;
        return i + 1;
    }

    // 19. Find Minimum in Rotated Sorted Array
    // Time: O(log n), Space: O(1)
    public static int findMinInRotatedArray(int[] arr) {
        int left = 0, right = arr.length - 1;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] > arr[right]) left = mid + 1;
            else right = mid;
        }
        return arr[left];
    }

    // 20. Search in Rotated Sorted Array
    // Time: O(log n), Space: O(1)
    public static int searchRotatedArray(int[] arr, int target) {
        int left = 0, right = arr.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == target) return mid;
            if (arr[left] <= arr[mid]) {
                if (target >= arr[left] && target < arr[mid]) right = mid - 1;
                else left = mid + 1;
            } else {
                if (target > arr[mid] && target <= arr[right]) left = mid + 1;
                else right = mid - 1;
            }
        }
        return -1;
    }

    // 21. Find Duplicate Number (Floyd's Cycle Detection)
    // Time: O(n), Space: O(1)
    public static int findDuplicate(int[] arr) {
        int slow = arr[0], fast = arr[0];
        do {
            slow = arr[slow];
            fast = arr[arr[fast]];
        } while (slow != fast);
        slow = arr[0];
        while (slow != fast) {
            slow = arr[slow];
            fast = arr[fast];
        }
        return slow;
    }

    // 22. Find All Duplicates in Array
    // Time: O(n), Space: O(1)
    public static List<Integer> findAllDuplicates(int[] arr) {
        List<Integer> result = new ArrayList<>();
        for (int num : arr) {
            int index = Math.abs(num) - 1;
            if (arr[index] > 0) arr[index] = -arr[index];
            else result.add(Math.abs(num));
        }
        return result;
    }

    // 23. Find Common Elements in Three Sorted Arrays
    // Time: O(n1 + n2 + n3), Space: O(1) (excluding output)
    public static List<Integer> commonElements(int[] arr1, int[] arr2, int[] arr3) {
        List<Integer> result = new ArrayList<>();
        int i = 0, j = 0, k = 0;
        while (i < arr1.length && j < arr2.length && k < arr3.length) {
            if (arr1[i] == arr2[j] && arr2[j] == arr3[k]) {
                result.add(arr1[i]);
                i++;
                j++;
                k++;
            } else if (arr1[i] <= arr2[j] && arr1[i] <= arr3[k]) i++;
            else if (arr2[j] <= arr1[i] && arr2[j] <= arr3[k]) j++;
            else k++;
        }
        return result;
    }

    // 24. Find Leaders in Array
    // Time: O(n), Space: O(1) (excluding output)
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

    // 25. Find Maximum Product Subarray
    // Time: O(n), Space: O(1)
    public static int maxProductSubarray(int[] arr) {
        int maxSoFar = arr[0], maxEndingHere = arr[0], minEndingHere = arr[0];
        for (int i = 1; i < arr.length; i++) {
            int temp = maxEndingHere;
            maxEndingHere = Math.max(arr[i], Math.max(maxEndingHere * arr[i], minEndingHere * arr[i]));
            minEndingHere = Math.min(arr[i], Math.min(temp * arr[i], minEndingHere * arr[i]));
            maxSoFar = Math.max(maxSoFar, maxEndingHere);
        }
        return maxSoFar;
    }

    // 26. Find Trapped Water
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

    // 27. Find Next Greater Element
    // Time: O(n), Space: O(n)
    public static int[] nextGreaterElement(int[] arr) {
        int[] result = new int[arr.length];
        Stack<Integer> stack = new Stack<>();
        for (int i = arr.length - 1; i >= 0; i--) {
            while (!stack.isEmpty() && stack.peek() <= arr[i]) stack.pop();
            result[i] = stack.isEmpty() ? -1 : stack.peek();
            stack.push(arr[i]);
        }
        return result;
    }

    // 28. Find Subarray with Given Sum
    // Time: O(n), Space: O(n)
    public static int[] subarraySum(int[] arr, int sum) {
        Map<Integer, Integer> map = new HashMap<>();
        int currSum = 0;
        for (int i = 0; i < arr.length; i++) {
            currSum += arr[i];
            if (currSum == sum) return new int[]{0, i};
            if (map.containsKey(currSum - sum)) return new int[]{map.get(currSum - sum) + 1, i};
            map.put(currSum, i);
        }
        return new int[]{-1, -1};
    }

    // 29. Find Longest Consecutive Sequence
    // Time: O(n), Space: O(n)
    public static int longestConsecutive(int[] arr) {
        Set<Integer> set = new HashSet<>();
        for (int num : arr) set.add(num);
        int maxLength = 0;
        for (int num : set) {
            if (!set.contains(num - 1)) {
                int currNum = num, currLength = 1;
                while (set.contains(currNum + 1)) {
                    currNum++;
                    currLength++;
                }
                maxLength = Math.max(maxLength, currLength);
            }
        }
        return maxLength;
    }

    // 30. Find Smallest Positive Missing Number
    // Time: O(n), Space: O(1)
    public static int firstMissingPositive(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            while (arr[i] > 0 && arr[i] <= n && arr[arr[i] - 1] != arr[i]) {
                int temp = arr[arr[i] - 1];
                arr[arr[i] - 1] = arr[i];
                arr[i] = temp;
            }
        }
        for (int i = 0; i < n; i++) {
            if (arr[i] != i + 1) return i + 1;
        }
        return n + 1;
    }

    // 31. Find Maximum Difference Between Two Elements
    // Time: O(n), Space: O(1)
    public static int maxDifference(int[] arr) {
        int minElement = arr[0], maxDiff = arr[1] - arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] - minElement > maxDiff) maxDiff = arr[i] - minElement;
            if (arr[i] < minElement) minElement = arr[i];
        }
        return maxDiff;
    }

    // 32. Find Maximum Sum Circular Subarray
    // Time: O(n), Space: O(1)
    public static int maxSumCircularSubarray(int[] arr) {
        int maxStraight = maxSubArraySum(arr);
        int totalSum = 0;
        for (int i = 0; i < arr.length; i++) {
            totalSum += arr[i];
            arr[i] = -arr[i];
        }
        int maxCircular = totalSum + maxSubArraySum(arr);
        return maxCircular == 0 ? maxStraight : Math.max(maxStraight, maxCircular);
    }

    // 33. Find Element in Sorted Rotated Array with Duplicates
    // Time: O(log n) average, O(n) worst case, Space: O(1)
    public static boolean searchRotatedArrayDuplicates(int[] arr, int target) {
        int left = 0, right = arr.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == target) return true;
            if (arr[left] == arr[mid] && arr[mid] == arr[right]) {
                left++;
                right--;
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

    // 34. Find Minimum Length Subarray with Sum >= k
    // Time: O(n), Space: O(1)
    public static int minSubArrayLen(int k, int[] arr) {
        int minLength = Integer.MAX_VALUE, currSum = 0, left = 0;
        for (int right = 0; right < arr.length; right++) {
            currSum += arr[right];
            while (currSum >= k) {
                minLength = Math.min(minLength, right - left + 1);
                currSum -= arr[left++];
            }
        }
        return minLength == Integer.MAX_VALUE ? 0 : minLength;
    }

    // 35. Find Maximum Length of Subarray with Equal 0s and 1s
    // Time: O(n), Space: O(n)
    public static int findMaxLength(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, -1);
        int maxLen = 0, sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i] == 1 ? 1 : -1;
            if (map.containsKey(sum)) maxLen = Math.max(maxLen, i - map.get(sum));
            else map.put(sum, i);
        }
        return maxLen;
    }

    // 36. Find Maximum Sum of K Consecutive Elements
    // Time: O(n), Space: O(1)
    public static int maxSumKConsecutive(int[] arr, int k) {
        int maxSum = 0;
        for (int i = 0; i < k; i++) maxSum += arr[i];
        int currSum = maxSum;
        for (int i = k; i < arr.length; i++) {
            currSum += arr[i] - arr[i - k];
            maxSum = Math.max(maxSum, currSum);
        }
        return maxSum;
    }

    // 37. Find Number of Subarrays with Sum K
    // Time: O(n), Space: O(n)
    public static int subarraySumEqualsK(int[] arr, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);
        int sum = 0, count = 0;
        for (int num : arr) {
            sum += num;
            if (map.containsKey(sum - k)) count += map.get(sum - k);
            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }
        return count;
    }

    // 38. Find Pivot Index
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

    // 39. Find Equilibrium Index
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

    // 40. Find Maximum Average Subarray of Size K
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

    // 41. Find All Subarrays with Zero Sum
    // Time: O(n), Space: O(n)
    public static List<int[]> findZeroSumSubarrays(int[] arr) {
        List<int[]> result = new ArrayList<>();
        Map<Integer, List<Integer>> map = new HashMap<>();
        map.put(0, new ArrayList<>(List.of(-1)));
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            if (map.containsKey(sum)) {
                for (int start : map.get(sum)) {
                    result.add(new int[]{start + 1, i});
                }
            }
            map.computeIfAbsent(sum, k -> new ArrayList<>()).add(i);
        }
        return result;
    }

    // 42. Find Maximum Length of Subarray with Positive Product
    // Time: O(n), Space: O(1)
    public static int getMaxLen(int[] arr) {
        int pos = 0, neg = 0, maxLen = 0, negCount = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                pos = 0;
                neg = 0;
                negCount = 0;
            } else {
                if (arr[i] > 0) pos++;
                else {
                    neg++;
                    negCount++;
                    int temp = pos;
                    pos = neg;
                    neg = temp + 1;
                }
                if (negCount % 2 == 0) maxLen = Math.max(maxLen, pos + neg);
                else maxLen = Math.max(maxLen, neg);
            }
        }
        return maxLen;
    }

    // 43. Find Minimum Operations to Make Array Equal
    // Time: O(n), Space: O(1)
    public static int minOperations(int[] arr, int target) {
        int operations = 0;
        for (int num : arr) operations += Math.abs(num - target);
        return operations;
    }

    // 44. Find Maximum Sum of Non-Adjacent Elements
    // Time: O(n), Space: O(1)
    public static int maxSumNonAdjacent(int[] arr) {
        int incl = arr[0], excl = 0;
        for (int i = 1; i < arr.length; i++) {
            int temp = incl;
            incl = Math.max(incl, excl + arr[i]);
            excl = temp;
        }
        return incl;
    }

    // 45. Find Stock Buy Sell to Maximize Profit
    // Time: O(n), Space: O(1)
    public static int maxProfit(int[] prices) {
        int minPrice = Integer.MAX_VALUE, maxProfit = 0;
        for (int price : prices) {
            if (price < minPrice) minPrice = price;
            else maxProfit = Math.max(maxProfit, price - minPrice);
        }
        return maxProfit;
    }

    // 46. Find Maximum Sum of Two Non-Overlapping Subarrays
    // Time: O(n), Space: O(n)
    public static int maxSumTwoNoOverlap(int[] arr, int firstLen, int secondLen) {
        int n = arr.length;
        int[] prefixSum = new int[n + 1];
        for (int i = 0; i < n; i++) prefixSum[i + 1] = prefixSum[i] + arr[i];
        int maxSum = 0;
        for (int i = firstLen; i <= n; i++) {
            int first = prefixSum[i] - prefixSum[i - firstLen];
            for (int j = secondLen; j <= i - firstLen; j++) {
                int second = prefixSum[j] - prefixSum[j - secondLen];
                maxSum = Math.max(maxSum, first + second);
            }
            for (int j = i + secondLen; j <= n; j++) {
                int second = prefixSum[j] - prefixSum[j - secondLen];
                maxSum = Math.max(maxSum, first + second);
            }
        }
        return maxSum;
    }

    // 47. Find Number of Pairs with Difference K
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

    // 48. Find Maximum Length of Repeated Subarray
    // Time: O(n * m), Space: O(n * m)
    public static int findLength(int[] arr1, int[] arr2) {
        int n = arr1.length, m = arr2.length;
        int[][] dp = new int[n + 1][m + 1];
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

    // 49. Find Maximum Sum Increasing Subsequence
    // Time: O(n^2), Space: O(n)
    public static int maxSumIncreasingSubsequence(int[] arr) {
        int[] dp = new int[arr.length];
        System.arraycopy(arr, 0, dp, 0, arr.length);
        int maxSum = dp[0];
        for (int i = 1; i < arr.length; i++) {
            for (int j = 0; j < i; j++) {
                if (arr[i] > arr[j]) dp[i] = Math.max(dp[i], dp[j] + arr[i]);
            }
            maxSum = Math.max(maxSum, dp[i]);
        }
        return maxSum;
    }

    // 50. Find Maximum Sum of Subarray with Length K
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

    // Main method to test the solutions
    public static void main(String[] args) {
        // Test cases for a few problems
        int[] arr1 = {1, 3, 5, 7, 9};
        int[] arr2 = {1, 2, 2, 3, 3, 4};
        int[] arr3 = {0, 1, 0, 3, 12};
        int[] arr4 = {1, 4, 2, 6, 8};
        int[] arr5 = {-2, -3, 4, -1, -2, 1, 5, -3};

        System.out.println("Max Element: " + findMaxElement(arr1));
        System.out.println("Min Element: " + findMinElement(arr1));
        reverseArray(arr1);
        System.out.print("Reversed Array: ");
        for (int num : arr1) System.out.print(num + " ");
        System.out.println("\nIs Sorted: " + isSorted(arr1));
        System.out.println("Second Largest: " + secondLargest(arr4));
        rotateArray(arr4, 2);
        System.out.print("Rotated Array: ");
        for (int num : arr4) System.out.print(num + " ");
        System.out.println("\nRemove Duplicates: " + removeDuplicates(arr2));
        System.out.println("Missing Number: " + findMissingNumber(new int[]{1, 2, 4, 6, 3, 7, 8}, 8));
        moveZerosToEnd(arr3);
        System.out.print("Move Zeros: ");
        for (int num : arr3) System.out.print(num + " ");
        System.out.println("\nPair with Sum 12: " + findPairWithSum(arr4, 12));
        System.out.println("Max Subarray Sum: " + maxSubArraySum(arr5));
    }
}
