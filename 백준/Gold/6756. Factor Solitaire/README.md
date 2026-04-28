# [Gold II] Factor Solitaire - 6756

[문제 링크](https://www.acmicpc.net/problem/6756)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 47, 정답: 24, 맞힌 사람: 22, 정답 비율: 62.857%

### 분류

수학, 그리디 알고리즘, 정수론, 소수 판정

### 문제 설명

<p>In the game of Factor Solitaire, you start with the number 1, and try to change it to some given target number n by repeatedly using the following operation. In each step, if c is your current number, you split it into two positive factors a, b of your choice such that c = a &lowast; b. You then add a to your current number c to get your new current number. Doing this costs you b points. You continue doing this until your current number is n, and you try to achieve this at the cost of a minimum total number of points.</p>

<p>For example, here is one way to get to 15:</p>

<ul>
	<li>start with 1</li>
	<li>change 1 to 1+1 = 2 &mdash; cost so far is 1</li>
	<li>change 2 to 2+1 = 3 &mdash; cost so far is 1+2</li>
	<li>change 3 to 3+3 = 6 &mdash; cost so far is 1+2+1</li>
	<li>change 6 to 6+6 = 12 &mdash; cost so far is 1+2+1+1</li>
	<li>change 12 to 12+3 = 15 &mdash; done, total cost is 1+2+1+1+4=9.</li>
</ul>

<p>In fact, this is the minimum possible total cost to get 15. You want to compute the minimum total cost for other target end numbers.</p>

### 입력

<p>The input consists of a single integer N &ge; 1. In at least half of the cases N &le; 50000, in at least another quarter of the cases N &le; 500000, and in the remaining cases N &le; 5000000.</p>

### 출력

<p>Compute the minimum cost that gets you to N.</p>