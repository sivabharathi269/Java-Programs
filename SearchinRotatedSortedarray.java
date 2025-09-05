class Solution {
    public int search(int[] nums, int target) {
        int pivot = piv(nums);

        // Case 1: Array not rotated
        if (pivot == -1) {
            return binary(nums, target, 0, nums.length - 1);
        }

        // Case 2: Pivot itself is target
        if (nums[pivot] == target) {
            return pivot;
        }

        // Case 3: Decide which side to search
        if (target >= nums[0]) {
            return binary(nums, target, 0, pivot - 1);
        }
        return binary(nums, target, pivot + 1, nums.length - 1);
    }

    // ✅ Find pivot (largest element index)
    public int piv(int[] nums) {
        int start = 0, end = nums.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;

            // case 1: mid > next → mid is pivot
            if (mid < end && nums[mid] > nums[mid + 1]) {
                return mid;
            }

            // case 2: mid < prev → prev is pivot
            if (mid > start && nums[mid] < nums[mid - 1]) {
                return mid - 1;
            }

            // case 3: left side sorted → pivot in right half
            if (nums[mid] >= nums[start]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1; // not rotated
    }

    // ✅ Standard binary search
    public int binary(int[] nums, int target, int start, int end) {
        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (nums[mid] == target) return mid;
            else if (nums[mid] > target) end = mid - 1;
            else start = mid + 1;
        }
        return -1;
    }
}
