package LeetCode;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.Stack;

public class KeysAndRooms__841 {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        Stack<Integer> dfs = new Stack<>(); dfs.add(0);
        HashSet<Integer> seen = new HashSet<Integer>(); seen.add(0);
        while (!dfs.isEmpty()) {
            int i = dfs.pop();
            for (int j : rooms.get(i))
                if (!seen.contains(j)) {
                    dfs.add(j);
                    seen.add(j);
                    if (rooms.size() == seen.size()) return true;
                }
        }
        return rooms.size() == seen.size();
    }

    public boolean canVisitAllRooms2(List<List<Integer>> rooms) {
        Set<Integer> visited=new HashSet<>();
        addKey(0, rooms,visited);
        return visited.size() == rooms.size();
    }

    private void addKey(int room, List<List<Integer>> rooms,Set<Integer> visited) {
        visited.add(room);
        for (int key: rooms.get(room))
            if (!visited.contains(key)) addKey(key, rooms,visited);
        return;
    }

}
