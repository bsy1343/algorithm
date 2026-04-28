# [Gold III] Menu Tour - 15405

[문제 링크](https://www.acmicpc.net/problem/15405)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 6, 정답: 6, 맞힌 사람: 6, 정답 비율: 100.000%

### 분류

다이나믹 프로그래밍

### 문제 설명

<p>Rachid is in Barcelona for the first time, and wants to have a really good dinner. He heard that the ultimate dinner consists of C courses, which are numbered from 1 to C and have to be consumed in that order</p>

<p>The streets of Barcelona form a regular grid: west&ndash;east oriented streets crossing south&ndash;north oriented streets. There are R restaurants in the city and they are located at the crossings. Walking from crossing (i<sub>1</sub>, j<sub>1</sub>) to crossing (i<sub>2</sub>, j<sub>2</sub>) takes exactly |i<sub>1</sub> &minus; i<sub>2</sub>| + |j<sub>1</sub> &minus; j<sub>2</sub>| minutes, where |x| denotes the absolute value of x. Here, (i, j) means ith street from west to east, and jth street from south to north.</p>

<p>Unfortunately, restaurants do not offer all of the C courses. If a restaurant k offers course c then it costs P[k, c] euros. Otherwise the value P[k, c] = 0 indicates that the course is not offered. Rachid has B euros that he can spend on his dinner. He would like to choose a sequence of restaurants so that he can have his ultimate dinner without exceeding the available budget, while minimizing the total travel time between restaurants. The tour can start and end at an arbitrary crossing, and can visit the same restaurant several times.</p>

<p style="text-align:center"><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/15405.%E2%80%85Menu%E2%80%85Tour/3c9a0d86.png" data-original-src="%EB%B0%B1%EC%A4%80/Gold/15405.%E2%80%85Menu%E2%80%85Tour/3c9a0d86.png" data-original-src="https://onlinejudgeimages.s3-ap-northeast-1.amazonaws.com/problem/15405/1.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:265px; width:308px" /></p>

<p>On this example, there are three courses, whose prices are displayed in order, for every restaurant (a &ldquo;-&rdquo; corresponds to a dish that is not offered, i.e., when P[k, c] = 0). If Rachid has a budget of 9 euros, the optimal tour consists of the restaurants 1&ndash;4&ndash;3 for a cost of 6 euros and a total travel time of 12 minutes. There is a shorter tour of 2 minutes consisting of the restaurant sequence 1&ndash;2&ndash;2, but its cost is 17 euros, exceeding the available budget of 9 euros.</p>

### 입력

<p>The input begins with a line consisting of the integers C, R, B, separated by a single space. Then R lines follow. The k-th line describes the k-th restaurant and consists of 2 + C integers separated by a single space, namely i[k], j[k], P[k, 1], . . . , P[k, C], where (i[k], j[k]) defines the location of the restaurant.</p>

<p>Limits</p>

<ul>
	<li>1 &le; C &le; 20;</li>
	<li>1 &le; R &le; 100;</li>
	<li>0 &le; B &le; 100;</li>
	<li>for every 1 &le; k &le; R:
	<ul>
		<li>1 &le; i[k] &le; 1 000;</li>
		<li>1 &le; j[k] &le; 1 000;</li>
		<li>for every 1 &le; c &le; C, 0 &le; P[k, c] &le; 40.</li>
	</ul>
	</li>
</ul>

### 출력

<p>The output should consist of a single integer y: the minimum total travel time of an optimal restaurant tour for Rachid. If there is no feasible tour, the value -1 should be printed.</p>