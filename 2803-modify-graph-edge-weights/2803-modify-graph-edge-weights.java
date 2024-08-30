class Solution {
    public int[][] modifiedGraphEdges(int n, int[][] edges, int source, int destination, int target) {
        final int INF = 2_000_000_000;
        List<int[]>[] graph = new List[n];
        for (int i = 0; i < n; i++) graph[i] = new ArrayList<>();
        
        // Build initial graph without unknown weights
        for (int[] edge : edges) {
            if (edge[2] != -1) {
                graph[edge[0]].add(new int[]{edge[1], edge[2]});
                graph[edge[1]].add(new int[]{edge[0], edge[2]});
            }
        }

        // Initial shortest path from source to destination
        if (dijkstra(graph, source, destination) < target) return new int[0][];
        if (dijkstra(graph, source, destination) == target) {
            for (int[] edge : edges) if (edge[2] == -1) edge[2] = INF;
            return edges;
        }

        // Modify edges to achieve the target distance
        for (int[] edge : edges) {
            if (edge[2] == -1) {
                edge[2] = 1;
                graph[edge[0]].add(new int[]{edge[1], 1});
                graph[edge[1]].add(new int[]{edge[0], 1});
                int newDist = dijkstra(graph, source, destination);
                if (newDist <= target) {
                    edge[2] += (target - newDist);
                    for (int[] e : edges) if (e[2] == -1) e[2] = INF;
                    return edges;
                }
            }
        }

        return new int[0][];
    }

    // Dijkstra's algorithm to find the shortest path
    private int dijkstra(List<int[]>[] graph, int src, int dst) {
        int[] dist = new int[graph.length];
        Arrays.fill(dist, Integer.MAX_VALUE);
        PriorityQueue<int[]> pq = new PriorityQueue<>(Comparator.comparingInt(a -> a[0]));
        dist[src] = 0;
        pq.offer(new int[]{0, src});

        while (!pq.isEmpty()) {
            int[] current = pq.poll();
            int u = current[1];
            if (current[0] > dist[u]) continue;
            for (int[] neighbor : graph[u]) {
                int v = neighbor[0], w = neighbor[1];
                if (dist[u] + w < dist[v]) {
                    dist[v] = dist[u] + w;
                    pq.offer(new int[]{dist[v], v});
                }
            }
        }
        return dist[dst];
    }
}