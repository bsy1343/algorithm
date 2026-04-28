# [Platinum V] Ronald - 14412

[문제 링크](https://www.acmicpc.net/problem/14412)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 64 MB

### 통계

제출: 134, 정답: 102, 맞힌 사람: 86, 정답 비율: 76.786%

### 분류

애드 혹, 그래프 이론

### 문제 설명

<p>There are N cities in one country that are connected with two-way air links. One crazy airline president, Ronald Krump, often changes the flight schedule. More precisely, every day he does the following:</p>

<ul>
	<li>chooses one of the cities,</li>
	<li>introduces flights from that city towards all other cities where these flights do not currently exist, and at the same time cancels all existing flights from that city</li>
</ul>

<p>For instance, if from city 5 flights exist towards cities 1 and 2, but not towards cities 3 and 4, after Krump&rsquo;s change, there will exist flights from city 5 towards cities 3 and 4, but not towards cities 1 and 2.</p>

<p>The citizens of this country are wondering if a day could come when the flight schedule will be complete. In other words, when between each two different cities a (direct) flight will exist. Write a programme that will, based on the current flight schedule, determine whether it is possible to have a Complete Day, or whether this will never happen, no matter what moves Krump makes.</p>

### 입력

<p>The first line of input contains the integer N (2 &le; N &le; 1000), the number of cities. The cities are labeled with numbers from 1 to N.</p>

<p>The second line contains the integer M (0 &le; M &lt; N*(N-1)/2), the number of current flights.</p>

<p>Each of the following M lines contains two different numbers, the labels of the cities that are currently connected.</p>

### 출력

<p>The first and only line of output must contain DA (Croatian for &ldquo;yes&rdquo;) or NE (Croatian for &ldquo;no&rdquo;).</p>

### 힌트

<p>​In the first step, Krump will introduce the (only possible) line 1-2.</p>