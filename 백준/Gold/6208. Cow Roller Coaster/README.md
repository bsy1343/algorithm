# [Gold IV] Cow Roller Coaster - 6208

[문제 링크](https://www.acmicpc.net/problem/6208)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 379, 정답: 170, 맞힌 사람: 131, 정답 비율: 45.486%

### 분류

다이나믹 프로그래밍

### 문제 설명

<p>The cows are building a roller coaster! They want your help to design as fun a roller coaster as possible, while keeping to the budget.</p>

<p>The roller coaster will be built on a long linear stretch of land of length L (1 &lt;= L &lt;= 1,000). The roller coaster comprises a collection of some of the N (1 &lt;= N &lt;= 10,000) different interchangable components. Each component i has a fixed length Wi (1 &lt;= Wi &lt;= L). Due to varying terrain, each component i can be only built starting at location Xi (0 &lt;= Xi &lt;= L-Wi). The cows want to string together various roller coaster components starting at 0 and ending at L so that the end of each component (except the last) is the start of the next component.</p>

<p>Each component i has a &quot;fun rating&quot; Fi (1 &lt;= Fi &lt;= 1,000,000) and a cost Ci (1 &lt;= Ci &lt;= 1000). The total fun of the roller coster is the sum of the fun from each component used; the total cost is likewise the sum of the costs of each component used. The cows&#39; total budget is B (1 &lt;= B &lt;= 1000). Help the cows determine the most fun roller coaster that they can build with their budget.</p>

### 입력

<ul>
	<li>Line 1: Three space-separated integers: L, N and B.</li>
	<li>Lines 2..N+1: Line i+1 contains four space-separated integers, respectively: Xi, Wi, Fi, and Ci.</li>
</ul>

<p>&nbsp;</p>

### 출력

<ul>
	<li>Line 1: A single integer that is the maximum fun value that a roller-coaster can have while staying within the budget and meeting all the other constraints. If it is not possible to build a roller-coaster within budget, output -1.</li>
</ul>

### 힌트

<p>Taking the 3rd, 5th and 6th components gives a connected roller-coaster with fun value 17 and cost 7. Taking the first two components would give a more fun roller-coaster (25) but would be over budget.</p>