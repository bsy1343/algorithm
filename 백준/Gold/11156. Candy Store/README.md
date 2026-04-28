# [Gold IV] Candy Store - 11156

[문제 링크](https://www.acmicpc.net/problem/11156)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 256 MB

### 통계

제출: 74, 정답: 42, 맞힌 사람: 30, 정답 비율: 56.604%

### 분류

다이나믹 프로그래밍, 배낭 문제

### 문제 설명

<p>Little Anne loves candy and she wants to buy candy at the local candy store. Fortunately, she also happens to be extremely rich, which enables her to buy all the candy she could ever want. She wants to buy candy for at least C kroner, and she also wants to buy at most one of each type.</p>

<p>There are many ways to buy candy for at least C kroner, so she wants to consider the possibilities before buying. Since her parents think she is too young to use a computer, she has asked you to write a program that calculates the number of possibilities.</p>

<p>Anne doesn&rsquo;t like large numbers like 1,000,000,007, so you instead calculate the number of possibilities modulo 65537, a less intimidating number.</p>

### 입력

<p>The first line of the input consists of a single integer T, the number of test cases. Each test case begins with a line containing two integers N and C, the number of available candy types and the least amount of money Anne wants to spend. The next line contains N space-separated integers a<sub>i</sub>, the cost of candy type i in kroner.</p>

<ul>
	<li>0 &lt; T &le; 100</li>
	<li>0 &lt; N &le; 200</li>
	<li>0 &lt; C &le; 10000</li>
	<li>0 &lt; a<sub>i</sub> &le; 200</li>
</ul>

### 출력

<p>For each test case, output on its own line the number of ways Anne can buy candy for at least C kroner, modulo 65537.</p>