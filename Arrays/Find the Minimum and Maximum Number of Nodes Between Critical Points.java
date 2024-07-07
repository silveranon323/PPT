class Solution {
    public int[] nodesBetweenCriticalPoints(ListNode head) {
        if (head == null || head.next == null || head.next.next == null) {
            return new int[]{-1, -1};
        }

        int firstCritical = -1, lastCritical = -1, minDistance = Integer.MAX_VALUE;
        int index = 1;
        ListNode prev = head, curr = head.next;

        while (curr.next != null) {
            if ((curr.val > prev.val && curr.val > curr.next.val) || 
                (curr.val < prev.val && curr.val < curr.next.val)) {
                if (firstCritical == -1) {
                    firstCritical = index;
                } else {
                    minDistance = Math.min(minDistance, index - lastCritical);
                }
                lastCritical = index;
            }
            prev = curr;
            curr = curr.next;
            index++;
        }

        if (firstCritical == lastCritical) {
            return new int[]{-1, -1};
        }

        return new int[]{minDistance, lastCritical - firstCritical};
    }
}
