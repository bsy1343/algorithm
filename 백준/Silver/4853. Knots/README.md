# [Silver II] Knots - 4853

[문제 링크](https://www.acmicpc.net/problem/4853)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 37, 정답: 23, 맞힌 사람: 21, 정답 비율: 61.765%

### 분류

수학, 조합론

### 문제 설명

<p>An even number N of strands are stuck through a wall. On one side of the wall, a girl ties N/2 knots between disjoint pairs of strands. On the other side of the wall, the girl&#39;s groom&minus;to&minus;be also ties N/2 knots between disjoint pairs of strands. You are to find the probability that the knotted strands form one big loop (in which case the couple will be allowed to marry).</p>

<p>For example, suppose that N = 4 and you number the strands 1, 2, 3, 4. Also suppose that the girl has created the following pairs of strands by tying knots: {(1, 4), (2,3)}. Then the groom&minus;to&minus;be has two choices for tying the knots on his side: {(1,2), {3,4)} or {(1,3), (2,4)}.</p>

### 입력

<p>The input file consists of one or more lines. Each line of the input file contains a positive even integer, less than or equal to 100. This integer represents the number of strands in the wall.</p>

### 출력

<p>For each line of input, the program will produce exactly one line of output: the probability that the knotted strands form one big loop, given the number of strands on the corresponding line of input. Print the probability to 5 decimal places.</p>