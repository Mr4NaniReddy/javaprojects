class Solution
{
    static int[] topoSort(int V, ArrayList<ArrayList<Integer>> adj) {
    ArrayList<Integer> ans = new ArrayList<>();
    ArrayList<Integer> vis = new ArrayList<>(V);
    Stack<Integer> st = new Stack<>();
    
    for(int i=0;i<V;i++){
        vis.add(0);
    }
    
    for (int i = 0; i < V; i++) {
        if (vis.get(i) == 0) {
            TSDFS(i, vis, st, adj);
        }
    }
    
    while (!st.isEmpty()) {
        ans.add(st.pop());
    }
    
    int[] result = new int[ans.size()];
    for (int i = 0; i < ans.size(); i++) {
        result[i] = ans.get(i);
    }
    
    return result;
}

static void TSDFS(int v, ArrayList<Integer> vis, Stack<Integer> st, ArrayList<ArrayList<Integer>> adj) {
    vis.set(v, 1);
    
    for (int i : adj.get(v)) {
        if (vis.get(i) == 0) {
            TSDFS(i, vis, st, adj);
        }
    }
    
    st.push(v);
}
    
}
