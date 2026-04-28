# [Platinum V] Dr. Bill Poucher - 23706

[문제 링크](https://www.acmicpc.net/problem/23706)

### 성능 요약

시간 제한: 2 초 (추가 시간 없음), 메모리 제한: 512 MB

### 통계

제출: 53, 정답: 30, 맞힌 사람: 29, 정답 비율: 58.000%

### 분류

그래프 이론, 그래프 탐색, 애드 혹, 깊이 우선 탐색, 방향 비순환 그래프, 위상 정렬

### 문제 설명

<p>There are $n$ people. Each person sees some of the other people. Each of them will be given a black or white hat. After that each person will simultaneously name a color. Everyone who doesn&#39;t guess the color on his hat will die. <em>Horribly</em>.&nbsp;</p>

<p>Is there a deterministic strategy which guarantees that at least one person will survive? &nbsp; &nbsp; &nbsp;&nbsp;</p>

### 입력

<p>The first line contains two integers $n$ and $m$ ($2 \leq n \leq 3 \cdot 10^5, 1 \leq m \leq 3 \cdot 10^5$), the number of people and the number of relations of seeing someone (see below), respectively.</p>

<p>$m$ lines follow. $i$-th of them contains two integers $a_i$ and $b_i$ ($0 \leq a_i, b_i &lt; &nbsp; n, a_i \neq b_i$) meaning that $a_i$-th person sees $b_i$-th person. For all $i \neq j$, $a_i \neq a_j$ or $b_i \neq b_j$ holds.</p>

### 출력

<p>Print <code>1</code> if there exists such strategy and <code>0</code> otherwise.</p>