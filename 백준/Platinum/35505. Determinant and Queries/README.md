# [Platinum III] Determinant and Queries - 35505

[문제 링크](https://www.acmicpc.net/problem/35505)

### 성능 요약

시간 제한: 4 초 (추가 시간 없음), 메모리 제한: 1024 MB (추가 메모리 없음)

### 통계

제출: 42, 정답: 25, 맞힌 사람: 16, 정답 비율: 48.485%

### 분류

가우스 소거법, 모듈로 곱셈 역원, 선형대수학, 수학, 정수론

### 문제 설명

<p>행렬식은 선형대수학에서 다루는 중요한 대상 중 하나이다.</p>

<ul>
<li>양의 정수 $N$에 대하여, $S_N$은 $\{1,2,\cdots,N\}$에서 $\{1,2,\cdots,N\}$으로 가는 모든 전단사함수의 집합이다.</li>
<li>$\sigma\in S_N$에 대하여, $\operatorname{inv}(\sigma)$는 $1\le i&lt;j\le N$과 $\sigma(i)&gt;\sigma(j)$를 모두 만족하는 $(i,j)$의 개수이다.</li>
<li>이때 $N\times N$ 행렬 $A$의 $i$행 $j$열 원소를 $a_{i,j}$라 하면, $A$의 행렬식은 $\det(A)=\sum_{\sigma\in S_N}(-1)^{\operatorname{inv}(\sigma)}\prod_{i=1}^Na_{i,\sigma(i)}$이다.</li>
</ul>

<p>행렬식이 소수 $p=10^9+7$의 배수가 아니고, 각 원소가 정수인 $N\times N$ 행렬 $A$가 있을 때, 다음 쿼리를 $Q$개 처리해보자.</p>

<ul>
<li><span style="color:#e74c3c;"><code>row</code> $i$ $x_1$ $x_2$ $\cdots$ $x_N$</span>: $A$의 $i$번째 행의 각 원소에 순서대로 $x_1,x_2,\cdots,x_N$을 더한 행렬 $A'$의 행렬식 $\det(A')$을 출력한다.</li>
<li><span style="color:#e74c3c;"><code>col</code></span> <span style="color:#e74c3c;">$i$ $x_1$ $x_2$ $\cdots$ $x_N$</span>: $A$의 $i$번째 열의 각 원소에 순서대로 $x_1,x_2,\cdots,x_N$을 더한 행렬 $A'$의 행렬식 $\det(A')$을 출력한다.</li>
</ul>

<p>단, 답이 매우 커질 수 있으므로 소수인 $p$로 나눈 나머지를 출력하도록 한다. 즉, $\det(A')\equiv r\pmod{p}$인 $0$ 이상 $p$ 미만의 정수 $r$을 출력한다.</p>

### 입력

<p>첫 번째 줄에 행렬의 크기 $N$과 쿼리의 개수 $Q$가 공백으로 구분되어 주어진다. $(1\le N\le 500;$ $1\le Q\le 10\,000)$</p>

<p>두 번째 줄부터 $N$개의 줄에 걸쳐, 그중 $i$번째 줄에 행렬 $A$의 $i$번째 행의 원소들 $a_{i,1}, a_{i,2}, \cdots, a_{i,N}$이 공백으로 구분되어 주어진다. $(0\le a_{i,j}&lt;10^9+7)$</p>

<p>$N+2$번째 줄부터 $Q$개의 줄에 걸쳐 쿼리가 차례대로 주어진다. $(1\le i\le N;$ $0\le x_j&lt;10^9+7)$</p>

<p>입력으로 주어지는 모든 수는 정수이다.</p>

### 출력

<p>$Q$개의 줄에 걸쳐 각 쿼리의 답을 순서대로 출력한다.</p>

### 힌트

<p>쿼리를 처리하는 중 행렬 $A$가 갱신되지 않음에 유의하라.</p>