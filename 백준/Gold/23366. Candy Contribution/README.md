# [Gold IV] Candy Contribution - 23366

[문제 링크](https://www.acmicpc.net/problem/23366)

### 성능 요약

시간 제한: 3 초 (추가 시간 없음), 메모리 제한: 1024 MB

### 통계

제출: 164, 정답: 89, 맞힌 사람: 79, 정답 비율: 53.378%

### 분류

그래프 이론, 최단 경로, 데이크스트라

### 문제 설명

<p>While you were out travelling, you won the lottery. As it happened, the top prize of this lottery was not cash, but candies! Now you are stuck with a big pile of candies which you would like to take home. Fortunately, you have been able to acquire a truck, so now all you have to do is drive home.</p>

<p>Going from one country to another with such a big pile of candies in your truck is not allowed without paying some taxes. And because everybody likes candies, you are allowed to pay these taxes with candies.</p>

<p>After searching a bit on the internet, you have found a list that tells you exactly which borders you can cross with a truck and for each such border what percentage of tax you have to pay to cross it. You cannot pay with fractional candies and the candies are quite nice, so customs will always round up. You only have to pay taxes on the number of candies you bring across the border.</p>

<p>What is the maximum number of candies you can bring home?</p>

### 입력

<p>The input consists of:</p>

<ul>
	<li>One line containing two integers $n$ ($2\leq n\leq 1\cdot 10^5$), the number of countries, and $m$ ($1 \leq m \leq 2\cdot 10^5$), the number of borders.&nbsp;</li>
	<li>One line containing three integers $s$ ($1\leq s\leq n$), the country where you won the lottery, $t$ ($1 \leq t \leq n$, $t\neq s$), your home country and $c$ ($1\leq c \leq 10^9$) the number of candies you won in the lottery.</li>
	<li>Then follow $m$ lines containing three integers $u, v$ ($1\leq u, v \leq n$, $u\neq v$) and $p$ ($0 \leq p \leq 100$) where $p$ is the percentage of tax you have to pay when travelling from country $u$ to $v$ or vice versa.</li>
</ul>

<p>It is guaranteed you can drive home with your truck, and that each pair of countries is listed at most once.</p>

### 출력

<p>Output the maximum number of candies you can arrive home with.</p>