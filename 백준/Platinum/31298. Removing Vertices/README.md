# [Platinum II] Removing Vertices - 31298

[문제 링크](https://www.acmicpc.net/problem/31298)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 1024 MB

### 통계

제출: 32, 정답: 21, 맞힌 사람: 20, 정답 비율: 66.667%

### 분류

그리디 알고리즘, 트리

### 문제 설명

<p>You are given an bidirectional graph with $(n + 1)$ vertices numbered from $0$ to $n$. There are no loops and no multiple edges in this graph. Additionally, all cycles pass through vertex 0. Your task is to remove the minimum possible number of vertices so that there are no cycles in the graph. You can not remove the vertex number 0.</p>

### 입력

<p>On the first line, there are two integers $n$ and $m$: the number of vertices excluding vertex $0$ and the number of edges ($1 \le n \le 10^5$, $1 \le m \le 10^6$).</p>

<p>Each of next $m$ lines contains two integers $a$ and $b$: the numbers of vertices connected by an edge ($0 \le a, b \le n$).</p>

<p>It is guaranteered that all cycles pass through vertex $0$.</p>

### 출력

<p>On the first line, print one integer $k$: the minimum possible number of vertices to remove. On the second line, print $k$ integers: the numbers of the vertices to remove in any order. If there are several optimal answers, print any one of them.</p>