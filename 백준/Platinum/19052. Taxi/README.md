# [Platinum II] Taxi - 19052

[문제 링크](https://www.acmicpc.net/problem/19052)

### 성능 요약

시간 제한: 1.5 초, 메모리 제한: 256 MB

### 통계

제출: 16, 정답: 10, 맞힌 사람: 9, 정답 비율: 64.286%

### 분류

수학, 그래프 이론, 그래프 탐색, 트리, 조합론, 깊이 우선 탐색

### 문제 설명

<p>You are given an undirected tree on $N$ vertices. Each edge has a length, which is a strictly positive integer. $M$ taxis and $M$ customers will appear in this tree, each taxi and each customer appearing in exactly one node. It is possible that a node will contain multiple taxis and/or multiple customers.</p>

<p>A taxi-app will match customers with taxis. These days, the customer must pay for the distance that the taxi travels just to pick them up. The taxi-app is mischievously greedy, so it will match customers with taxis such that the total distance travelled by taxis to their respective customers is as high as possible. Note that each taxi gets assigned to exactly one customer and each customer is assigned to exactly one taxi.</p>

<p>There are $N^{2M}$ different ways in which the taxis and customers may appear in the tree. For each of these ways, we can find the total distance travelled by taxis according to the mischievously greedy matching picked by the taxi-app. Your task is to add all these distances together and compute this sum modulo $10^9 + 7$.</p>

### 입력

<p>The first line contains two integers, $N$ and $M$ ($1 \le N, M \le 2500$).</p>

<p>Each of the next $N - 1$ lines contains three integers: $x$, $y$ and $l$. This means that there exists an undirected edge between nodes $x$ and $y$ of length $l$ ($1 \le l \le 10\,000$). It is guaranteed that the given edges form a tree.</p>

### 출력

<p>Print a single line containing a single integer: the required sum modulo $10^9 + 7$.</p>