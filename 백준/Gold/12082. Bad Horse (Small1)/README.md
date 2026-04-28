# [Gold IV] Bad Horse (Small1) - 12082

[문제 링크](https://www.acmicpc.net/problem/12082)

### 성능 요약

시간 제한: 5 초, 메모리 제한: 512 MB

### 통계

제출: 286, 정답: 208, 맞힌 사람: 118, 정답 비율: 64.835%

### 분류

자료 구조, 그래프 이론, 그래프 탐색, 집합과 맵, 너비 우선 탐색, 깊이 우선 탐색, 해시를 사용한 집합과 맵, 이분 그래프

### 문제 설명

<p>As the leader of the Evil League of Evil, Bad Horse has a lot of problems to deal with. Most recently, there have been far too many arguments and far too much backstabbing in the League, so much so that Bad Horse has decided to split the league into two departments in order to separate troublesome members. Being the Thoroughbred of Sin, Bad Horse isn&#39;t about to spend his valuable time figuring out how to split the League members by himself. That what he&#39;s got you -- his loyal henchman -- for.</p>

### 입력

<p>The first line of the input gives the number of test cases,&nbsp;<strong>T</strong>.&nbsp;&nbsp;<strong>T</strong>&nbsp;test cases follow. Each test case starts with a positive integer&nbsp;<strong>M</strong>&nbsp;on a line by itself -- the number of troublesome pairs of League members. The next&nbsp;<strong>M</strong>&nbsp;lines each contain a pair of names, separated by a single space.</p>

<h3>Limits</h3>

<ul>
	<li>1 &le;&nbsp;<strong>T</strong>&nbsp;&le; 100.</li>
	<li>Each member name will consist of only letters and the underscore character.</li>
	<li>Names are case-sensitive.</li>
	<li>No pair will appear more than once in the same test case.</li>
	<li>Each pair will contain two distinct League members.</li>
	<li>1 &le;&nbsp;<strong>M</strong>&nbsp;&le; 10.</li>
</ul>

### 출력

<p>For each test case, output one line containing &quot;Case #x: y&quot;, where x is the case number (starting from 1) and y is either &quot;Yes&quot; or &quot;No&quot;, depending on whether the League members mentioned in the input can be split into two groups with neither of the groups containing a troublesome pair.</p>