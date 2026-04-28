# [Platinum III] Allowed Swaps - 18919

[문제 링크](https://www.acmicpc.net/problem/18919)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 96, 정답: 25, 맞힌 사람: 25, 정답 비율: 36.765%

### 분류

그래프 이론, 그래프 탐색, 트리, 해 구성하기, 최소 스패닝 트리

### 문제 설명

<p>You are given a permutation of length $N$ and a list of <em>allowed swaps</em>. Each swap is defined by two distinct integers between 1 and $N$, inclusive --- positions in the permutation that can be swapped.</p>

<p>Your task is to sort the permutation using no more than $5 \cdot 10^5$ allowed swaps or determine that it is impossible. Note that each allowed swap can be used more than once.</p>

### 입력

<p>The first line contains a single integer $N$ --- the length of the permutation ($3 \le N \le 1000$).</p>

<p>The second line contains $N$ distinct integers between 1 and $N$, inclusive --- the permutation itself.</p>

<p>The third line contains a single integer $S$ ($1 \le S \le 2 \cdot 10^5$) --- the number of allowed swaps. Then $S$ lines follow, each containing two integers $p_i$ and $q_i$ ($1 \le p_i, q_i \le N$; $p_i \ne q_i$), denoting that elements on positions $p_i$ and $q_i$ can be swapped.</p>

<p>You may assume that no two allowed swaps coincide.</p>

### 출력

<p>If it is impossible to sort the array using no more than $5 \cdot 10^5$ swaps from the given list, print $-1$.&nbsp;</p>

<p>Otherwise, print the number of swaps used, $K$, followed by $K$ pairs of integers $x_j$ and $y_j$ ($1 \le x_j, y_j \le N$; $x_j \ne y_j$) describing the sequence of swaps. Each pair must belong to the list of allowed swaps (formally, for each $j$, there must exist $i$ such that either $x_j = p_i$ and $y_j = q_i$, or $x_j = q_i$ and $y_j = p_i$).</p>

<p>If there is more than one solution, print any of them. The number of swaps does not have to be minimized.</p>