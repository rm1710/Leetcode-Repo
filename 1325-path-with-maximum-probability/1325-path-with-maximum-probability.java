class Solution {
    public double maxProbability(int n, int[][] edges, double[] succProb, int start_node, int end_node) {
        double[] prob = new double[n];
        prob[start_node] = 1.0;

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < edges.length; j++) {
                int u = edges[j][0], v = edges[j][1];
                double sp = succProb[j];
                if (prob[u] * sp > prob[v]) prob[v] = prob[u] * sp;
                if (prob[v] * sp > prob[u]) prob[u] = prob[v] * sp;
            }
        }

        return prob[end_node];
    }
}
