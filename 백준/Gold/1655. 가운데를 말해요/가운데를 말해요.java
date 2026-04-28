import java.io.*;
import java.util.*;

public class Main {

    static int n;
    // 왼쪽 절반: 최대힙 (가장 큰 값이 top > 중앙값 후보)
    // 오른쪽 절반: 최소힙 (가장 작은 값이 top)
    // left.size() == right.size() 또는 left.size() == right.size() + 1 유지
    // 항상 left.peek() <= right.peek() 유지 > left.peek()이 중앙값
    static PriorityQueue<Integer> left = new PriorityQueue<>(Collections.reverseOrder());
    static PriorityQueue<Integer> right = new PriorityQueue<>();
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            int x = Integer.parseInt(br.readLine());

            // 1. 균형 유지: 크기 같으면 left에 추가, 그 외 right에 추가
            if (left.size() == right.size()) {
                left.add(x);
            } else {
                right.add(x);
            }

            // 2. 정렬 유지: left.peek() > right.peek() 이면 swap
            if (!right.isEmpty() && left.peek() > right.peek()) {
                int a = left.poll();
                int b = right.poll();
                left.add(b);
                right.add(a);
            }

            // 3. 중앙값은 항상 left.peek()
            sb.append(left.peek()).append("\n");
        }

        System.out.println(sb);
    }
}
