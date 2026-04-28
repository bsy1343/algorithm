# [Platinum I] Cover the Paths - 19326

[문제 링크](https://www.acmicpc.net/problem/19326)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 256 MB

### 통계

제출: 94, 정답: 43, 맞힌 사람: 31, 정답 비율: 39.744%

### 분류

그래프 이론, 자료 구조, 그리디 알고리즘, 트리, 세그먼트 트리, 최소 공통 조상, Heavy-light 분할

### 문제 설명

<p>You are given an undirected unweighted tree consisting of $n$ vertices labeled by integers $1$, $2$, $\ldots$, $n$. A total of $m$ simple paths are chosen in this tree. Each path is described as a pair of its endpoints $(a_i, b_i)$.</p>

<p>Let $V$ be the set of all vertices of the tree. We say that subset $S$ of $V$ is <em>good</em>&nbsp;if for every $i$ such that $1 \le i \le m$, the simple path from $a_i$ to $b_i$ contains at least one vertex from $S$. We say that subset $T$ be <em>the best</em>&nbsp;subset if $T$ is a <em>good</em>&nbsp;subset and there is no <em>good</em>&nbsp;subset $X$ such that $|X| &lt; |T|$.</p>

<p>You have to find <em>the best</em>&nbsp;subset of $V$.</p>

### 입력

<p>The first line contains an integer $n$, the number of vertices in the tree ($1 \le n \le 10^5$).</p>

<p>Each of the next $n - 1$ lines describes an edge of the tree. Edge $i$ is denoted by two integers $u_i$ and $v_i$, the labels of vertices it connects ($1 \le u_i, v_i \le n$, $u_i \ne v_i$). It is guaranteed that the given edges form a tree.</p>

<p>The next line contains an integer $m$, the number of paths ($1 \le m \le 10^5$).</p>

<p>Each of the next $m$ lines describes a path in the tree. Path $i$ is denoted by two integers $a_i$ and $b_i$, the labels of the endpoints ($1 \le a_i, b_i \le n$).&nbsp;<strong>For some paths, it may be that $a_i = b_i$.</strong>&nbsp;It is <strong>not</strong>&nbsp;guaranteed that all paths are pairwise distinct.</p>

### 출력

<p>On the first line, print the size of <em>the best</em>&nbsp;subset of $V$. On the second line, print the labels of vertices belonging to <em>the best</em>&nbsp;subset of $V$ in any order.</p>

<p>If there are several possible solutions, print any one of them.</p>