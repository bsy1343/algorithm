# [Platinum II] In Search of Gold - 20607

[문제 링크](https://www.acmicpc.net/problem/20607)

### 성능 요약

시간 제한: 4 초, 메모리 제한: 512 MB

### 통계

제출: 38, 정답: 9, 맞힌 사람: 6, 정답 비율: 18.750%

### 분류

다이나믹 프로그래밍, 트리에서의 다이나믹 프로그래밍, 그래프 이론, 매개 변수 탐색, 트리

### 문제 설명

<p>Sunset got a map of an abandoned gold mine in the border town. The map shows that the gold mine consists of $n$ rooms connected by $n-1$ bidirectional tunnels, forming a tree structure. The map is so strange that on the $i$-th tunnel, there are two numbers $a_i$ and $b_i$. The only thing Sunset knows is that there are exactly $k$ tunnels whose lengths are taken from $a$ while the lengths of other $n-k-1$ tunnels are taken from $b$.</p>

<p>Tomorrow Sunset will explore that gold mine. He is afraid of getting lost in the gold mine, so can you please tell him the diameter of the gold mine if he is lucky enough? In other words, please calculate the minimum possible length of the diameter from the information Sunset has.</p>

### 입력

<p>The first line contains a single integer $T$ ($1 \leq T \leq 10\,000$), the number of test cases. For each test case:</p>

<p>The first line contains two integers $n$ and $k$ ($2 \leq n \leq 20\,000$, $0 \leq k \leq n - 1$, $k \leq 20$) denoting the number of rooms and the parameter $k$.</p>

<p>Each of the following $n-1$ lines contains four integers $u_i$, $v_i$, $a_i$, $b_i$ ($1\leq u_i,v_i\leq n$, $u_i\neq v_i$, $1\leq a_i,b_i\leq 10^9$) denoting a bidirectional tunnel between the $u_i$-th room and the $v_i$-th room, the length of which is either $a_i$ or $b_i$.</p>

<p>It is guaranteed that the sum of all $n$ is at most $200\,000$.</p>

### 출력

<p>For each test case, output a single line containing an integer: the minimum possible length of the diameter.</p>