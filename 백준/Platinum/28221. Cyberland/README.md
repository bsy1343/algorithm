# [Platinum III] Cyberland - 28221

[문제 링크](https://www.acmicpc.net/problem/28221)

### 성능 요약

시간 제한: 7 초, 메모리 제한: 1024 MB

### 통계

제출: 216, 정답: 35, 맞힌 사람: 21, 정답 비율: 15.328%

### 분류

그래프 이론, 최단 경로, 데이크스트라

### 문제 설명

<p>The year 3742 has arrived, and now it is Cyberland&#39;s turn to host the APIO. In this world, there are $N$ countries indexed from $0$ to $N - 1$, along with $M$ bidirectional roads (allowing travel in both directions) indexed from $0$ to $M - 1$. The $i$-th road ($0 &le; i &lt; M$) connects two different countries, $x[i]$ and $y[i]$, and requires a certain amount of time $c[i]$ to pass the road. All participants have gathered in Cyberland for the APIO, except for your country. You are living in country $0$, and Cyberland is country $H$. As the cleverest person in your country, your assistance is urgently needed once again. To be more specific, you are asked to determine the minimum time required to reach Cyberland from your country.</p>

<p>Some countries can clear your total passing time. Also, some countries can divide your total passing time by $2$ (divide-by-$2$ ability). You can visit a country repeatedly. Every time you visit a country, <strong>you may choose whether to use the special ability in the country</strong>. But you can use the special ability at most once in a single visit (which means that special ability can be used multiple times by visiting the country multiple times). Moreover, you can only use the divide-by-$2$ ability <strong>at most $K$ times</strong> in case of being caught by Cyberland Chemistry Foundation. <strong>Once you reached Cyberland, you cannot move anywhere</strong> because the great APIO contest will be held soon.</p>

<p>An array $arr$ is given, where $arr_i$ ($0 &le; i &lt; N$) shows the special abilities of country $i$. There are $3$ types of special abilities:</p>

<ul>
	<li>$arr_i = 0$, means this country makes the passing time $0$.</li>
	<li>$arr_i = 1$, means the passing time remains unchanged at this country.</li>
	<li>$arr_i = 2$, means this country divides the passing time by $2$.</li>
</ul>

<p>It is guaranteed that $arr_0 = arr_H = 1$ holds. In other words, Cyberland and your country do not have any special abilities.</p>

<p>Your country does not want to miss any moment of APIO, so you need to find the minimum time to reach Cyberland. If you cannot reach to Cyberland, your answer should be $-1$.</p>

### 입력



### 출력



### 제한

<ul>
	<li>$2 &le; N &le; 10^5$, and $\sum{N} &le; 10^5$.</li>
	<li>$0 &le; M &le; \min{\{10^5, \frac{N(N-1)}{2}\}}$, and $\sum{M} &le; 10^5$.</li>
	<li>$1 &le; K &le; 10^6$.</li>
	<li>$1 &le; H &lt; N$.</li>
	<li>$0 &le; x[i], y[i] &lt; N$, and $x[i] \ne y[i]$.</li>
	<li>$1 &le; c[i] &le; 10^9$.</li>
	<li>$arr[i] &isin; \{0, 1, 2\}$.</li>
	<li>It is guaranteed that every pair of countries is connected by at most one road.</li>
</ul>