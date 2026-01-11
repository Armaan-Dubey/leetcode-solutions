/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int start = 1;
        int end = n;

        while (start < end) {
            int mid = start + (end - start) / 2;

            if (isBadVersion(mid)) {
                // mid is bad, so first bad is at mid or before
                end = mid;
            } else {
                // mid is good, so first bad must be after mid
                start = mid + 1;
            }
        }
return start;
    }
}