# [Silver V] Cow Parade - 27022

[문제 링크](https://www.acmicpc.net/problem/27022)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 35, 정답: 31, 맞힌 사람: 28, 정답 비율: 90.323%

### 분류

구현

### 문제 설명

<p>Farmer John&#39;s cows are participating in the annual Bovington, Wisconsin Cow Parade.  The streets in this city form a rectangular grid: they all run north-south or east-west and are equally spaced. Farmer John&#39;s cattle parade through the streets.</p>

<p>The cows, being meticulous record keepers, recorded the path of their parade.  They wrote exactly a series of D (1 &le; D &le; 1,000) directions, such as &quot;north for 3 blocks&quot;, then &quot;east for 2 blocks&quot;, etc. The distance traveled was always in the range 1..10,000. See the sample data for some of the silly ways the cows recorded their march.</p>

<p>After the parade, the cows wanted to know how many different streets they paraded on. If they paraded on one street, left it, and later paraded on the same street, they only count that street once.</p>

### 입력

<ul>
	<li>Line 1: A single integer, D</li>
	<li>Lines 2..N+1: Each line describes a sequence part of the parade route and contains:
	<ul>
		<li>A character representing the direction (&#39;N&#39;, &#39;S&#39;, &#39;E&#39;, or &#39;W&#39;)</li>
		<li>the number of blocks travelled in that direction.</li>
	</ul>
	</li>
</ul>

### 출력

<ul>
	<li>Line 1: A single integer containing the number of unique streets visited by the cows.</li>
</ul>

### 힌트

<p>[The &quot;N 1&quot;, &quot;N 4&quot;, and &quot;S 4&quot; are all on the same street.  The others are on different unique streets.</p>