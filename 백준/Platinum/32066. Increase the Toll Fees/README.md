# [Platinum I] Increase the Toll Fees - 32066

[문제 링크](https://www.acmicpc.net/problem/32066)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 1024 MB

### 통계

제출: 53, 정답: 32, 맞힌 사람: 31, 정답 비율: 60.784%

### 분류

자료 구조, 그래프 이론, 트리, 분리 집합, 최소 스패닝 트리, 최소 공통 조상, 희소 배열

### 문제 설명

<p>The ICPC Kingdom is a big kingdom with $N$ cities, numbered from $1$ to $N$. The charm of the ICPC Kingdom lies in its beautiful sceneries in the kingdom. To promote those sceneries, the King of the ICPC Kingdom decided to make $M$ toll roads, numbered from $1$ to $M$, near the scenic views for the tourists to enjoy. To use toll road $i$ that connects city $U_i$ to $V_i$ bidirectionally, one must pay $W_i$. It is possible to travel from one city to any other city using these toll roads.</p>

<p>Although those toll roads have been built and can be used, they still do not attract tourists. The King decided to make a promotion, where one can <strong>pay in advance</strong> for the toll roads they want to use and can use it <strong>multiple times</strong> as long as they do not leave the ICPC Kingdom.</p>

<p>This idea can finally attract tourists, but there&rsquo;s a strange behaviour happening. All of the tourists only pay for the set of toll roads that gives the minimum total pay which allows them to travel from one city to any other city regardless of the distance. Interestingly, such a set of toll roads is <strong>unique</strong> under current toll pricing. This strange behaviour does not fully expose the kingdom&rsquo;s scenery to the tourists.</p>

<p>To promote more scenery, the King decided to increase the price of some toll roads. If toll road $i$ is used by the tourists&rsquo; strange behaviour before the toll price increase, then after the price increase, the King <strong>must ensure</strong> toll road $i$ is <strong>not used</strong> by the tourists&rsquo; strange behaviour. For stability, the King also wants the total price increase across all toll roads to be as small as possible.</p>

<p>The King asked you to calculate what is the minimum total price increase to fulfill the King&rsquo;s plan or report that it is impossible to do so.</p>

### 입력

<p>Input begins with two integers $N$ $M$ ($2 &le; N &le; 100\, 000$; $N - 1 &le; M &le; 200\, 000$) representing the number of cities and toll roads. Each of the next $M$ lines contains $3$ integers $U_i$ $V_i$ $W_i$ ($1 &le; U_i &lt; V_i &le; N$; $1 &le; W_i &le; 10^9$) representing toll i that connects city $U_i$ and $V_i$ with price $W_i$. There exists a unique set of toll roads that allow travel between any two cities with minimum total pay before the price increase.</p>

### 출력

<p>If the King&rsquo;s plan is possible to achieve, then output an integer representing the minimum total increase to fulfill the King&rsquo;s plan. Otherwise, output <code>-1</code> in a single line.</p>