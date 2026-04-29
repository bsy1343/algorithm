# [Platinum III] Compatible Pairs - 33767

[문제 링크](https://www.acmicpc.net/problem/33767)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 2048 MB

### 통계

제출: 130, 정답: 45, 맞힌 사람: 38, 정답 비율: 33.628%

### 분류

그래프 이론, 그리디 알고리즘

### 문제 설명

<p>Deep in the countryside, Farmer John’s cows aren’t just ordinary farm animals—they are part of a clandestine bovine intelligence network. Each cow carries an ID number, carefully assigned by the elite cow cryptographers. However, due to Farmer John's rather haphazard tagging system, some cows ended up with the same ID.</p>

<p>Farmer John noted that there are $N$ ($1\le N\le 2\cdot 10^5$) unique ID numbers, and for each unique ID $d_i$ ($0\le d_i\le 10^9$), there are $n_i$ ($1\le n_i\le 10^9$) cows who shared it.</p>

<p>The cows can only communicate in pairs, and their secret encryption method has one strict rule: two cows can only exchange information if they are not the same cow and the sum of their ID numbers equals either $A$ or $B$ ($0\le A\le B\le 2\cdot 10^9$). A cow can only engage in one conversation at a time (i.e., no cow can be part of more than one pair).</p>

<p>Farmer John would like to maximize the number of disjoint communication pairs to ensure the best information flow. Can you determine the largest number of conversations that can happen at once?</p>

### 입력

<p>The first line contains $N$, $A$, $B$.</p>

<p>The next $N$ lines each contain $n_i$ and $d_i$. No two $d_i$ are the same.</p>

### 출력

<p>The maximum number of disjoint communicating pairs that can be formed at the same time.</p>

<p><strong>Note that the large size of integers involved in this problem may require the use of 64-bit integer data types (e.g., a "long long" in C/C++).</strong></p>