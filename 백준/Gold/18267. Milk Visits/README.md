# [Gold II] Milk Visits - 18267

[문제 링크](https://www.acmicpc.net/problem/18267)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 512 MB

### 통계

제출: 859, 정답: 348, 맞힌 사람: 295, 정답 비율: 41.963%

### 분류

자료 구조, 트리, 분리 집합

### 문제 설명

<p>Farmer John is planning to build $N$ ($1 \leq N \leq 10^5$) farms that will be connected by $N-1$ roads, forming a tree (i.e., all farms are reachable from each-other, and there are no cycles). Each farm contains a cow, whose breed is either Guernsey or Holstein.</p>

<p>Farmer John&#39;s $M$ friends ($1 \leq M \leq 10^5$) often come to visit him. During a visit with friend $i$, Farmer John will walk with his friend along the unique path of roads from farm $A_i$ to farm $B_i$ (it may be the case that $A_i = B_i$). Additionally, they can try some milk from any cow along the path they walk. Since most of Farmer John&#39;s friends are also farmers, they have very strong preferences regarding milk. Some of his friends will only drink Guernsey milk, while the remainder will only drink Holstein milk. Any of Farmer John&#39;s friends will only be happy if they can drink their preferred type of milk during their visit.</p>

<p>Please determine whether each friend will be happy after visiting.</p>

### 입력

<p>The first line contains the two integers $N$ and $M$.</p>

<p>The second line contains a string of length $N$. The $i$th character of the string is &#39;G&#39; if the cow in the $i$th farm is a Guernsey, or &#39;H&#39; if the cow in the $i$th farm is a Holstein.</p>

<p>The next $N-1$ lines each contain two distinct integers $X$ and $Y$ ($1 \leq X, Y \leq N$), indicating that there is a road between farms $X$ and $Y$.</p>

<p>The next $M$ lines contain integers $A_i$, $B_i$, and a character $C_i$. $A_i$ and $B_i$ represent the endpoints of the path walked during friend $i$&#39;s visit, while $C_i$ is either G or H if the $i$th friend prefers Guernsey milk or Holstein milk.</p>

### 출력

<p>Print a binary string of length $M$. The $i$th character of the string should be &#39;1&#39; if the $i$th friend will be happy, or &#39;0&#39; otherwise.</p>

### 힌트

<p>Here, the path from farm 1 and farm 4 involves farms 1, 2, and 4. All of these contain Holsteins, so the first friend will be satisfied while the second one will not.</p>