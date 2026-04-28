# [Gold II] Train Splitting - 27603

[문제 링크](https://www.acmicpc.net/problem/27603)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 1024 MB

### 통계

제출: 96, 정답: 50, 맞힌 사람: 45, 정답 비율: 51.136%

### 분류

그래프 이론, 자료 구조, 해 구성하기, 분리 집합

### 문제 설명

<p>There are $n$ big cities in Italy, and there are $m$ train routes between pairs of cities. Each route connects two different cities bidirectionally. Moreover, using the trains one can reach every city starting from any other city.</p>

<p>Right now, all the routes are operated by the government-owned Italian Carriage Passenger Company, but the government wants to privatize the routes. The government does not want to give too much power to a single company, but it also does not want to make people buy a lot of different subscriptions. Also, it would like to give a fair chance to all companies. In order to formalize all these wishes, the following model was proposed.</p>

<p>There will be $k &ge; 2$ private companies indexed by $1, 2, \dots , k$. Each train route will be operated by exactly one of the $k$ companies. Then:</p>

<ul>
	<li>For any company, there should exist two cities such that it is impossible to reach one from the other using only routes operated by that company.</li>
	<li>On the other hand, for any two companies, it should be possible to reach every city from any other city using only routes operated by these two companies.</li>
</ul>

<p>Find a plan satisfying all these criteria. It can be shown that a viable plan always exists. Please note that you can choose the number $k$ and you do not have to minimize or maximize it.</p>

### 입력

<p>Each test contains multiple test cases. The first line contains an integer $t$ ($1 &le; t &le; 1000$) &mdash; the number of test cases. The descriptions of the $t$ test cases follow.</p>

<p>The first line of each test case contains two integers $n$ and $m$ ($3 &le; n &le; 50$, $n-1 &le; m &le; n(n-1)/2$) &mdash; the number of cities and the number of train routes.</p>

<p>The next $m$ lines contain two integers $u_i$ and $v_i$ each ($1 &le; u_i , v_i &le; n$, $u_i \ne v_i$) &mdash; the $i$-th train route connects cities $u_i$ and $v_i$.</p>

<p>It is guaranteed that the routes connect $m$ distinct pairs of cities. It is guaranteed that using the trains one can reach every city starting from any other city.</p>

<p>The sum of the values of $n$ over all test cases does not exceed $5000$.</p>

### 출력

<p>For each test case, on the first line print an integer $k$ ($2 &le; k &le; m$) &mdash; the number of companies in your plan; on the second line print $m$ integers $c_1, c_2, \dots , c_m$ ($1 &le; c_i &le; k$) &mdash; in your plan company $c_i$ operates the $i$-th route.</p>

<p>If there are multiple valid plans, you may print any of them.</p>

### 힌트

<p>In the <strong>first test case</strong>, the output is illustrated in the following picture, where different colors correspond to different companies (blue for 1, red for 2, green for 3, and yellow for 4):</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/27603.%E2%80%85Train%E2%80%85Splitting/9709c697.png" data-original-src="%EB%B0%B1%EC%A4%80/Gold/27603.%E2%80%85Train%E2%80%85Splitting/9709c697.png" data-original-src="https://upload.acmicpc.net/747301f9-8671-4185-8f9b-bdedeb0cdfc4/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 194px; height: 129px;" /></p>

<p>If we consider, for example, only companies $2$ and $3$, we can see that from any city it is possible to reach every other city (picture on the left below). However, if we restrict to company $2$ alone, it becomes impossible to reach city $5$ from city $1$ (picture on the right).</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/27603.%E2%80%85Train%E2%80%85Splitting/c1daab85.png" data-original-src="%EB%B0%B1%EC%A4%80/Gold/27603.%E2%80%85Train%E2%80%85Splitting/c1daab85.png" data-original-src="https://upload.acmicpc.net/4fa61bc7-6d36-4512-9310-d3515ecf0b2b/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 425px; height: 129px;" /></p>

<p>In the <strong>second test case</strong>, the output is illustrated in the following picture:</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/27603.%E2%80%85Train%E2%80%85Splitting/cf326fe3.png" data-original-src="%EB%B0%B1%EC%A4%80/Gold/27603.%E2%80%85Train%E2%80%85Splitting/cf326fe3.png" data-original-src="https://upload.acmicpc.net/8e0de716-6309-4716-9dae-d7f145c17f5d/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 89px; height: 92px;" /></p>