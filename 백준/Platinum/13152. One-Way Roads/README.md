# [Platinum I] One-Way Roads - 13152

[문제 링크](https://www.acmicpc.net/problem/13152)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 195, 정답: 94, 맞힌 사람: 56, 정답 비율: 40.000%

### 분류

그래프 이론, 이분 탐색, 매개 변수 탐색, 최대 유량

### 문제 설명

<p>In the country of Via, the cities are connected by roads that can be used in both directions. However, this has been the cause of many accidents since the lanes are not separated: The drivers frequently look at their smartphones while driving, causing them to collide with the oncoming traffic. To alleviate the problem, the politicians of Via came up with the magnificent idea to have one-way roads only, i.e., the existing roads are altered such that each can be only used in one of two possible directions. They call this &ldquo;one-way-ification&rdquo;.</p>

<p>The mayors do not want too many one-way roads to lead to their cities because this can cause traffic jam within the city: they demand that the smallest integer d be found such that there is a &lsquo;one-way-ification&rsquo; in which for every city, the number of one-way roads leading to it is at most d.</p>

### 입력

<p>The input consists of:</p>

<ul>
	<li>one line with an integer n (1 &le; n &le; 500), where n is the number of cities labeled from 1 to n;</li>
	<li>one line with an integer m (0 &le; m &le; 2.5 &middot; 10<sup>3</sup>), where m is the number of (bi-directional) roads;</li>
	<li>m lines describing the roads. Each road is described by:
	<ul>
		<li>one line with two integers a and b (1 &le; a, b &le; n, a &ne;&nbsp;b) indicating a road between cities a and b.</li>
	</ul>
	</li>
</ul>

<p>There is at most one road between two cities.</p>

### 출력

<p>Output the minimum number d.</p>