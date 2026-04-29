# [Gold V] Orecart Boba Hard - 34293

[문제 링크](https://www.acmicpc.net/problem/34293)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 2048 MB

### 통계

제출: 11, 정답: 11, 맞힌 사람: 11, 정답 비율: 100.000%

### 분류

그리디 알고리즘, 매개 변수 탐색, 물리학, 수학, 이분 탐색

### 문제 설명

<p><strong>The only difference between this version and the easy version is that in this version, you must determine the minimum required speed $v$ yourself.</strong></p>

<p>Eugin and Kelly are celebrating E-Days at the Colorado School of Mines by participating in the annual Orecart Pull. This is an event where everyone walks the Orecart down Colfax Avenue all the way to downtown Denver. Eugin and Kelly can go faster than the group, so they have decided to break off and grab boba from every stop along the route!</p>

<p>The walk is $l$ meters long, and the Orecart moves at a constant speed of $1$ meter per second. Eugin and Kelly can run at a speed of at most $v$ meters per second, but they are not allowed to move ahead of the Orecart at any time.</p>

<p>There are $n$ boba stops along the route, the $i$-th of which is located at distance $d_i$ along the route. Additionally, at the $i$-th boba stop, they must wait at least $w_i$ seconds to receive their boba before continuing.</p>

<p>Eugin and Kelly need to visit all $n$ boba stops while ensuring that they reach the end at exactly the same time as the Orecart. Determine the minimum required speed $v$ for them to accomplish this.</p>

<p>If it is impossible for any finite speed to allow them to reach the end on time, or if the required speed would need to exceed the speed of light ($3 \cdot 10^8$ meters per second), output <code>IMPOSSIBLE</code>. Otherwise, print the minimum required speed $v$ with a relative error of at most $10^{-4}$.</p>

### 입력

<p>The input consists of multiple lines:</p>

<ul>
	<li>The first line contains two integers $n$ and $l$ $(1 \leq n \leq 10^5, 2 \leq l \leq 10^8)$---the number of boba stops and the length of the route.</li>
	<li>The second line contains $n$ integers $d_1, d_2, \dots, d_n$ $(0 &lt; d_1 &lt; d_2 &lt; \dots &lt; d_n &lt; l)$---the distances at which each of the boba stops are located.</li>
	<li>The third line contains $n$ integers $w_1, w_2, \dots, w_n$ $(0 \leq w_i \leq 10^8)$---the waiting times at each boba stop.</li>
</ul>

### 출력

<p>If it is impossible to reach the end on time no matter the speed, or if the required speed would need to exceed $3 \times 10^8$ meters per second, print <code>IMPOSSIBLE</code>. Otherwise, print the minimum required speed $v$ such that the relative error does not exceed $10^{-4}$.</p>