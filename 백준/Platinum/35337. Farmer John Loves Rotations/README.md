# [Platinum IV] Farmer John Loves Rotations - 35337

[문제 링크](https://www.acmicpc.net/problem/35337)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 2048 MB

### 통계

제출: 18, 정답: 8, 맞힌 사람: 8, 정답 비율: 44.444%

### 분류

누적 합, 두 포인터, 우선순위 큐, 자료 구조

### 문제 설명

<p>Farmer John has an array $A$ containing $N$ integers ($1 \leq N \leq 5 \cdot 10^5, 1 \leq A_i \leq N$). He picks his favorite index $j$ and take out a sheet of paper with only $A_j$ written on it. He can then perform the following operation some number of times:</p>

<ul>
<li>Cyclically shift all elements in $A$ one spot to the left or one spot to the right. Then, write down $A_j$ on a piece of paper.</li>
</ul>

<p>Let $S$ denote the set of distinct integers that occur in $A$. Farmer John wonders what the minimum number of operations he must perform is so that the paper contains all integers that appear in $S$.</p>

<p>Since it is unclear what FJ's favorite index is, output the answer for all possible favorite indices $1 \leq j \leq N$. Note for each index, $A$ is reset to its original form before performing any operations.</p>

### 입력

<p>The first line contains $N$.</p>

<p>The following line contains $A_1, A_2, \ldots, A_N$.</p>

### 출력

<p>Output $N$ space-separated integers, where the $i$'th integer is the answer for his favorite index $j = i$.</p>