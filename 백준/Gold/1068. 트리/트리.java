import java.io.*;
import java.util.*;

public class Main {
    static int n, root, erased;
    static ArrayList<Integer>[] child;
    static int[] leaf;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        child = new ArrayList[n];
        leaf = new int[n];
        for (int i = 0; i < n; i++) {
            child[i] = new ArrayList();
        }

        for (int i = 0; i < n; i++) {
            int par = sc.nextInt();
            // root
            if (par == -1) {
                root = i;
                continue;
            }
            child[par].add(i);
        }
        erased = sc.nextInt();

        for (int i = 0; i < n; i++) {
            if (child[i].contains(erased)) {
                child[i].remove(child[i].indexOf(erased));
            }
        }

        
        if (root != erased) dfs(root);
        // 정답 출력하기
        System.out.println(leaf[root]);
    }

    static void dfs(int x) {
        if (child[x].isEmpty()) {
            leaf[x] = 1;
        }
        for (int y : child[x]) {
            dfs(y);
            // leaf[y]가 계산 된 상태에서 leaf[x]에 누적
            leaf[x] += leaf[y];
        }
    }
}