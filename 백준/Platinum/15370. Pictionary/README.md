# [Platinum I] Pictionary - 15370

[문제 링크](https://www.acmicpc.net/problem/15370)

### 성능 요약

시간 제한: 1.5 초, 메모리 제한: 64 MB

### 통계

제출: 72, 정답: 46, 맞힌 사람: 42, 정답 비율: 65.625%

### 분류

수학, 자료 구조, 정수론, 이분 탐색, 분리 집합, 병렬 이분 탐색, 조화수

### 문제 설명

<p>There is a planet, in a yet undiscovered part of the universe, with a country inhabited solely by mathematicians. In this country, there are a total of N mathematicians, and the interesting fact is that each mathematician lives in their own city. Is it also interesting that no two cities are connected with a road, because mathematicians can communicate online or by reviewing academic papers. Naturally, the cities are labeled with numbers from 1 to N.</p>

<p>Life was perfect until one mathematician decided to write an academic paper on their smartphone. The smartphone auto-corrected the word &ldquo;self-evident&rdquo; to &ldquo;Pictionary&rdquo; and the paper was published as such. Soon after, the entire country discovered pictionary and wanted to meet up and play, so construction work on roads between cities began shortly.</p>

<p>The road construction will last a total of M days, according to the following schedule: on the first day, construction is done on roads between all pairs of cities that have M as their greatest common divisor. On the second day, construction is done on roads between all pairs of cities that have M-1 as their greatest common divisor, and so on until the Mth day when construction is done on roads between all pairs of cities that are co-prime. More formally, on the ith day, construction is done on roads between cities a and b if gcd(a, b) = M - i + 1.</p>

<p>Since the mathematicians are busy with construction work, they&rsquo;ve asked you to help them determine the minimal number of days before a given pair of mathematicians can play pictionary together.</p>

### 입력

<p>The first line of input contains three positive integers N, M and Q (1 &le; N, Q &le; 100 000, 1 &le; M &le; N), the number of cities, the number of days it takes to build the roads, and the number of queries.</p>

<p>Each of the following Q lines contains two distinct positive integers A and B (1 &le; A, B &le; N) that denote the cities of the mathematicians who want to find out the minimal number of days before they can play pictionary together.</p>

### 출력

<p>The ith line must contain the minimal number of days before the mathematicians from the ith query can play pictionary together.</p>

### 힌트

<p>Clarification of the first test case:</p>

<p>On the first day, road (3, 6) is built. Therefore the answer to the second query is 1.</p>

<p>On the second day, roads (2, 4), (2, 6), (2, 8), (4, 6) and (6, 8) are built. Cities 4 and 8 are now connected (it is possible to get from the first to the second using city 6).</p>

<p>On the third day, roads between relatively prime cities are built, so cities 2 and 5 are connected.</p>

<p>Clarification of the second test case:</p>

<p>On the second day, road (20, 15) is built, whereas on the fourth day, road (15, 9) is built. After the fourth day, cities 20 and 9 are connected via city 15.</p>