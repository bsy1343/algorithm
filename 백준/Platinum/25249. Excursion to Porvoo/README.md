# [Platinum V] Excursion to Porvoo - 25249

[문제 링크](https://www.acmicpc.net/problem/25249)

### 성능 요약

시간 제한: 5 초 (추가 시간 없음), 메모리 제한: 1024 MB

### 통계

제출: 54, 정답: 41, 맞힌 사람: 38, 정답 비율: 76.000%

### 분류

자료 구조, 정렬, 우선순위 큐, 오프라인 쿼리

### 문제 설명

<p>It is a lovely summer day, and Alice wants to do a day trip. She lives in Tampere, and wants to travel to Porvoo to enjoy the Old Town and the surrounding nature. Alice does not only love travelling, but also planning.</p>

<p>She has created a map of the most beautiful paths to Porvoo. On her trip she needs to visit $n$ cities in order, where Tampere is the first city and Porvoo is the last city. The cities are connected by roads, with each road connecting two consecutive cities, and there is always at least one road between each pair of consecutive cities.</p>

<p>When driving from one city to the next, Alice needs to choose which road to take. Some of these roads have a tarmac surface, while others are just gravel roads and some roads have bridges which will not support vehicles that are too heavy. For each road it is known how long it takes to traverse it and what is the maximal weight of vehicles that can safely drive on it.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/25249.%E2%80%85Excursion%E2%80%85to%E2%80%85Porvoo/798a778d.png" data-original-src="%EB%B0%B1%EC%A4%80/Platinum/25249.%E2%80%85Excursion%E2%80%85to%E2%80%85Porvoo/798a778d.png" data-original-src="https://upload.acmicpc.net/72928c8f-5f65-4951-9970-dabedfe8e4d4/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 768px; height: 58px;" /></p>

<p style="text-align: center;">Figure E.1: Illustration of the second sample input. The red path from Tampere to Porvoo is the optimal choice for a car of weight $31$.</p>

<p>Alice collects many different cars of different weights, but she is not sure yet which car she will use for the day trip. As she wants to enjoy as much time in Porvoo as possible, she wants you to help her find the minimal travel time for each car.</p>

### 입력

<p>The input consists of:</p>

<ul>
	<li>Two integers $n$ and $m$ $(2 \leq n \leq 10^5, n - 1 \leq m \leq 10^5)$, the number of cities and the number of connections, respectively. The cities are numbered from $1$ to $n$, Tampere is city $1$, and Porvoo is city $n$.</li>
	<li>$m$ lines, each containing three integers $i$, $d$ and $c$ $(1 \leq i &lt; n, 1 \leq d \leq 10^4, 1 \leq c \leq 10^6)$, which each describe a connection between city $i$ and city $i + 1$ which takes $d$ minutes to traverse and can can be used by vehicles of weight $c$ kilograms or less.</li>
	<li>One integer $q$ $(1 \leq q \leq 10^5)$, the number of cars that Alice has collected.</li>
	<li>$q$ lines, where the $i$th line contains one integer $w_i$ $(1 \leq w_i \leq 10^6)$, the weight of the $i$th car in kilograms.</li>
</ul>

<p>There is at least one connection from city $i$ to city $i+1$ for each $i$ ($1 \le i &lt; n$).</p>

### 출력

<p>Output $q$ lines, where the $i$th line describes the shortest time in minutes Alice needs to drive to get from Tampere to Porvoo with the $i$th car. If there is no feasible path for the $i$th car, output <code>impossible</code>.</p>