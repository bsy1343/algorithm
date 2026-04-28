# [Platinum IV] Moo Network - 24616

[문제 링크](https://www.acmicpc.net/problem/24616)

### 성능 요약

시간 제한: 4 초, 메모리 제한: 1024 MB

### 통계

제출: 566, 정답: 195, 맞힌 사람: 148, 정답 비율: 35.663%

### 분류

그래프 이론, 최소 스패닝 트리

### 문제 설명

<p>Farmer John&#39;s $N$ cows ($1 \leq N \leq 10^5$) are spread far apart on his farm and would like to build a communication network so they can more easily exchange electronic text messages (all of which of course contain variations of &quot;moo&quot;).</p>

<p>The $i$th cow is located at a distinct location $(x_i,y_i)$ where $0 \leq x_i \leq 10^6$ and $0 \leq y_i \leq 10$. The cost of building a communication link between cows $i$ and $j$ is the squared distance between them: $(x_i-x_j)^2 + (y_i-y_j)^2$.</p>

<p>Please calculate the minimum cost required to build a communication network across which all the cows can communicate. Two cows can communicate if they are directly connected by a link, or if there is a sequence of links along which their message can travel.</p>

### 입력

<p>The first line of input contains $N$, and the next $N$ lines each describe the $x$ and $y$ coordinates of a cow, all integers.</p>

### 출력

<p>Please output the minimum cost of a network that will allow all cows to communicate. Note that this cost might be too large to fit into a 32-bit integer and may require use of 64-bit integers (e.g., &quot;long long&quot; integers in C++).</p>