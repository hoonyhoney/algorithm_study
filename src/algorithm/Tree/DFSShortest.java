package algorithm.Tree;

import java.util.LinkedList;
import java.util.Queue;

//최단거리탐색

public class DFSShortest {

  Node root;

  public static void main(String args[]) {
    int L = 0;
    DFSShortest tree = new DFSShortest();
    tree.root = new Node(1);
    tree.root.lt = new Node(2);
    tree.root.rt = new Node(3);
    tree.root.lt.lt = new Node(4);
    tree.root.lt.rt = new Node(5);
    int dfs = tree.DFS(L, tree.root);
    System.out.println("dfs = " + dfs);
  }

  public int DFS(int L, Node root) {
    if (root.lt == null && root.rt == null) {
      return L;
    } else {
      L = Math.min(DFS(L + 1, root.lt), DFS(L + 1, root.rt));
    }
    return L;
  }
}

