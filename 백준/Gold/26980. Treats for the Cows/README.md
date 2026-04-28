# [Gold IV] Treats for the Cows - 26980

[문제 링크](https://www.acmicpc.net/problem/26980)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 33, 정답: 28, 맞힌 사람: 25, 정답 비율: 86.207%

### 분류

다이나믹 프로그래밍

### 문제 설명

<p>FJ has purchased N (1 &le; N &le; 2000) yummy treats for the cows who get money for giving vast amounts of milk. FJ sells one treat per day and wants to maximize the money he receives over a given period time.</p>

<p>The treats are interesting for many reasons:</p>

<ul>
	<li>The treats are numbered 1..N and stored sequentially in single file in a long box that is open at both ends. On any day, FJ can retrieve one treat from either end of his stash of treats.</li>
	<li>Like fine wines and delicious cheeses, the treats improve with age and command greater prices.</li>
	<li>The treats are not uniform: some are better and have higher intrinsic value. Treat i has value v(i) (1 &le; v(i) &le; 1000).</li>
	<li>Cows pay more for treats that have aged longer: a cow will pay v(i)*a for a treat of age a.</li>
</ul>

<p>Given the values v(i) of each of the treats lined up in order of the index i in their box, what is the greatest value FJ can receive for them if he orders their sale optimally?</p>

<p>The first treat is sold on day 1 and has age a=1. Each subsequent day increases the age by 1.</p>

### 입력

<ul>
	<li>Line 1: A single integer, N</li>
	<li>Lines 2..N+1: Line i+1 contains the value of treat v(i)</li>
</ul>

### 출력

<ul>
	<li>Line 1: The maximum revenue FJ can achieve by selling the treats</li>
</ul>