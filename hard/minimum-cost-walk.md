# Minimum Cost Walk (Hard) - Solution Explanation

## Problem Understanding
We have an **undirected weighted graph** with `n` vertices, where each edge has a weight.  
The goal is to find the **minimum cost** of a walk between two nodes, where the cost is defined as the **bitwise AND** of all edge weights in the path.

## Solution Approach
1. **Disjoint Set Union (DSU)** (Union-Find) is used to group connected nodes into components.
2. **Component Cost Calculation**: For each component, we calculate the minimum possible AND value using **bitwise AND of all edges in that component**.
3. **Query Processing**:  
   - If `start` and `end` are in **different components**, return `-1` (no path exists).  
   - Otherwise, return the **precomputed AND value** of the component.

## Time Complexity
- **Union-Find operations**: `O(α(n))` (almost constant time)
- **Processing edges**: `O(E)`
- **Answering queries**: `O(Q)`

Overall complexity: **`O(N + E + Q)`**, which is efficient for large constraints.

## Example Walkthrough
### Example 1:
**Input**:
n = 5, edges = [[0,1,7],[1,3,7],[1,2,1]], query = [[0,3],[3,4]]

makefile
Copy
Edit
**Output**:
[1, -1]

yaml
Copy
Edit
**Explanation**:
- **0 → 1 → 2 → 1 → 3** gives AND cost `1`.
- **No path exists from 3 → 4**.

---

### Example 2:
**Input**:
n = 3, edges = [[0,2,7],[0,1,15],[1,2,6],[1,2,1]], query = [[1,2]]
**Output**:
[0]


**Explanation**:
- **1 → 2 → 1 → 2** results in AND cost `0`.

---

### **Code**
Refer to [`minimum-cost-walk.java`](./minimum-cost-walk.java) for implementation.