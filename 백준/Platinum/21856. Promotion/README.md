# [Platinum V] Promotion - 21856

[문제 링크](https://www.acmicpc.net/problem/21856)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 512 MB

### 통계

제출: 17, 정답: 9, 맞힌 사람: 8, 정답 비율: 100.000%

### 분류

다이나믹 프로그래밍, 비트마스킹, 비트필드를 이용한 다이나믹 프로그래밍, 배낭 문제

### 문제 설명

<p>Gigel wants to test his cooking abilities and goes to the market to get some supplies. At the market, there are m types of objects sold as promotional packages for a period of n days. On the i<sup>th</sup> day, Gigel has two options: he either buys the promotional package available on that day or not. The promotional package is represented by a non-empty subset of the set of the m types of objects and it has a certain price.</p>

<p>Knowing m, n, the price and the composition of each of the n promotional packages, find the minimal price that Gigel should pay in order to buy at least one object of each of the m types.</p>

### 입력

<p>The first line of the input contains 2 numbers, m and n.</p>

<p>The next n lines will describe the n promotional packages in this way: the (i+1)<sup>th</sup> line (1 &le; i &le; n) contains nr and p, which stand for the number of objects in the promotional package from that day and its price. Then, on the same line, there are given nr numbers which represent the indexes of the objects that belong to that package.</p>

### 출력

<p>In the output print a positive integer number equal to the minimal price that should be paid in order to buy at least one object of every type.</p>

### 제한

<ul>
	<li>1 &le; m &le; 17, 1 &le; n &le;1,000, 1 &le; p &le;1,000,000</li>
	<li>All numbers found in the input file are positive integers.</li>
	<li>A promotional package shall be bought only completely.</li>
	<li>The indexes of the objects that describe a certain package have values from the following set: {1,2, &hellip; , m}.</li>
	<li>It is guaranteed that there is a solution for all test cases.</li>
</ul>

### 힌트

<p>The chosen packages are the first and the third ones, thus obtaining a minimal cost of 10+11 = 21. Note that Gigel buys one object of type 1, one object of type 2, two objects of type 3, one object of type 4 and one object of type 5.</p>