# [Gold II] I Would Walk 500 Miles - 17193

[문제 링크](https://www.acmicpc.net/problem/17193)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 686, 정답: 240, 맞힌 사람: 176, 정답 비율: 33.270%

### 분류

수학, 그래프 이론, 그리디 알고리즘, 최소 스패닝 트리

### 문제 설명

<p>Farmer John wants to divide his $N$ cows $(N \leq 7500)$, conveniently numbered $1 \ldots N$, into $K$ non-empty groups ($2 \leq K \leq N$) such that no two cows from two different groups can interact with each other without walking some number of miles. Cow $x$ and Cow $y$ (where $1 \leq x &lt; y \leq N$) are willing to walk $(2019201913x + 2019201949y)\text{ mod } 2019201997$ miles to see each other.</p>

<p>Given a division of the $N$ cows into $K$ non-empty groups, let $M$ be the minimum of the number of miles any two cows in two different groups are willing to walk to see each other. To test the cows&#39; devotion to each other, Farmer John wants to optimally divide the $N$ cows into $K$ groups such that $M$ is as large as possible.</p>

### 입력

<p>The input is just one line, containing $N$ and $K$, separated by a space.</p>

### 출력

<p>Print out $M$ in an optimal solution.</p>

### 힌트

<p>In this example, Cow 1 and Cow 2 are willing to walk 2019201817 miles to see each other. Cow 2 and Cow 3 are willing to walk 2019201685 miles. And Cow 1 and Cow 3 are willing to walk 2019201769 miles. Thus, by grouping the cows such that 1 is by herself and 2 and 3 are grouped together, $M = \min(2019201817,2019201769) = 2019201769$ (which is the best we can do here).</p>