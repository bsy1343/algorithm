# [Platinum III] Feng Shui - 33115

[문제 링크](https://www.acmicpc.net/problem/33115)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 2048 MB

### 통계

제출: 3, 정답: 2, 맞힌 사람: 2, 정답 비율: 66.667%

### 분류

그리디 알고리즘, 세그먼트 트리, 자료 구조

### 문제 설명

<p>You own $N$ flower pots (numbered from $1$ to $N$) displayed in order from west to east. Each flower pot has a different height; flower pot $i$ is the $A_i$<sup>th</sup> shortest flower pot by height. In other words, the array $[A_1, A_2, \dots , A_N ]$ is a permutation of $[1, 2, \dots , N]$.</p>

<p>After learning about Feng Shui (a practice of arranging pieces in living spaces to create balance), your house is healthier if you arrange the flower pots as follows. There should exist an integer $k$ such that $1 ≤ k ≤ N$, $A_i &gt; A_{i+1}$ for all $1 ≤ i &lt; k$, and $A_i &lt; A_{i+1}$ for all $k ≤ i &lt; N$. You are allowed to swap adjacent flower pots zero or more times.</p>

<p>As the flower pots are fragile, you want to minimize the number of swaps. Determine the minimum number of swaps such that the flower pots follow the Feng Shui rule.</p>

### 입력

<p>The first line consists of an integer $N$ ($1 ≤ N ≤ 300\, 000$).</p>

<p>The second line consists of $N$ integers $A_i$ ($1 ≤ A_i ≤ N$). The array $A$ is a permutation of $[1, 2, \dots , N]$.</p>

### 출력

<p>Output a single integer representing the minimum number of swaps such that the flower pots follow the Feng Shui rule.</p>