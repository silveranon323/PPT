import java.util.*;

class TaskManager {
    // Store latest info for each taskId
    private Map<Integer, int[]> taskMap; // taskId -> [userId, priority]

    // Max-Heap (priority first, then taskId for tie-breaking)
    private PriorityQueue<int[]> maxHeap;

    public TaskManager(List<List<Integer>> tasks) {
        taskMap = new HashMap<>();
        maxHeap = new PriorityQueue<>((a, b) -> {
            if (a[1] != b[1]) return b[1] - a[1]; // higher priority first
            return b[0] - a[0]; // tie-break: higher taskId first
        });

        for (List<Integer> task : tasks) {
            add(task.get(0), task.get(1), task.get(2));
        }
    }

    // O(log n)
    public void add(int userId, int taskId, int priority) {
        taskMap.put(taskId, new int[]{userId, priority});
        maxHeap.offer(new int[]{taskId, priority});
    }

    // O(log n)
    public void edit(int taskId, int newPriority) {
        if (!taskMap.containsKey(taskId)) return;
        int userId = taskMap.get(taskId)[0];
        taskMap.put(taskId, new int[]{userId, newPriority});
        maxHeap.offer(new int[]{taskId, newPriority}); // old version stays (lazy deletion)
    }

    // O(1)
    public void rmv(int taskId) {
        taskMap.remove(taskId); // lazy deletion (stale entry remains in heap)
    }

    // O(log n)
    public int execTop() {
        while (!maxHeap.isEmpty()) {
            int[] top = maxHeap.poll();
            int taskId = top[0];
            int priority = top[1];

            // Check if still valid
            if (taskMap.containsKey(taskId) && taskMap.get(taskId)[1] == priority) {
                int userId = taskMap.get(taskId)[0];
                taskMap.remove(taskId); // remove after execution
                return userId;
            }
            // else stale entry, skip
        }
        return -1; // no tasks left
    }
}


/**
 * Your TaskManager object will be instantiated and called as such:
 * TaskManager obj = new TaskManager(tasks);
 * obj.add(userId,taskId,priority);
 * obj.edit(taskId,newPriority);
 * obj.rmv(taskId);
 * int param_4 = obj.execTop();
 */
