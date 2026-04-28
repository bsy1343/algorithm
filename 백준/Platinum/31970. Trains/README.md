# [Platinum II] Trains - 31970

[문제 링크](https://www.acmicpc.net/problem/31970)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 1024 MB

### 통계

제출: 83, 정답: 41, 맞힌 사람: 32, 정답 비율: 50.794%

### 분류

다이나믹 프로그래밍, 누적 합, 제곱근 분할법

### 문제 설명

<p>You have arrived in Vilnius and want to visit various cities in Lithuania.</p>

<p>Cities in Lithuania are located on a straight line and numbered from $1$ to $N$ sequentially. Vilnius is assigned the number $1$.</p>

<p>Each city has a train station with a single train route that operates from that station. You can only get on a train at the start of its route, though you can get off at any of its stops. Trains starting their route at the $i$-th city make a stop every $d_i$ cities, and their route consists of $x_i$ stops (not including the starting city). If $d_i = 0$, the trains operating from the $i$-th city are currently out of service, so you cannot get on them.</p>

<p>To be more precise, if you get on a train in the $i$-th city, you can get off the train in any city numbered $i + t \cdot d_i$, where $1 &le; t &le; x_i$. Note that since you only want to visit cities in Lithuania, you won&#39;t ride further than the $N$-th city, even if the train has more stops on its route.</p>

<p>You are going to visit some cities, using trains to travel between them. As you plan your trip, you start to wonder how many different options you have for your journey that starts at Vilnius. Two journeys are different if they make stops at different sequences of cities.</p>

<p>Calculate this number and print the answer modulo $10^9 + 7$.</p>

### 입력

<p>The first line contains one integer $N$ &ndash; the number of cities.</p>

<p>Then $N$ lines follow. The $i$-th of them contains two integers $d_i$ and $x_i$ &ndash; the numbers describing the route starting in the $i$-th city.</p>

### 출력

<p>Output a single integer &ndash; the number of ways you can visit some of the $N$ cities taken modulo $10^9 + 7$.</p>

### 제한

<ul>
	<li>$1 &le; N &le; 10^5$</li>
	<li>$0 &le; d_i &le; 10^9$ (for each $1 &le; i &le; N$)</li>
	<li>$0 &le; x_i &le; 10^9$ (for each $1 &le; i &le; N$)</li>
</ul>