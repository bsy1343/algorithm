# [Silver IV] Noisy Neighbors (Small) - 12155

[문제 링크](https://www.acmicpc.net/problem/12155)

### 성능 요약

시간 제한: 5 초, 메모리 제한: 512 MB

### 통계

제출: 88, 정답: 64, 맞힌 사람: 57, 정답 비율: 77.027%

### 분류

구현, 브루트포스 알고리즘

### 문제 설명

<p>You are a landlord who owns a building that is an&nbsp;<strong>R</strong>&nbsp;x&nbsp;<strong>C</strong>&nbsp;grid of apartments; each apartment is a unit square cell with four walls. You want to rent out&nbsp;<strong>N</strong>&nbsp;of these apartments to tenants, with exactly one tenant per apartment, and leave the others empty. Unfortunately, all of your potential tenants are noisy, so whenever any two occupied apartments share a wall (and not just a corner), this will add one point of&nbsp;<em>unhappiness</em>&nbsp;to the building. For example, a 2x2 building in which every apartment is occupied has four walls that are shared by neighboring tenants, and so the building&#39;s unhappiness score is 4.<br />
<br />
If you place your&nbsp;<strong>N</strong>&nbsp;tenants optimally, what is the minimum unhappiness value for your building?</p>

### 입력

<p>The first line of the input gives the number of test cases,&nbsp;<strong>T</strong>.&nbsp;<strong>T</strong>&nbsp;lines follow; each contains three space-separated integers:&nbsp;<strong>R</strong>,&nbsp;<strong>C</strong>, and&nbsp;<strong>N</strong>.</p>

<h3>Limits</h3>

<ul>
	<li>1 &le;&nbsp;<strong>T</strong>&nbsp;&le; 1000.</li>
	<li>0 &le;&nbsp;<strong>N</strong>&nbsp;&le;&nbsp;<strong>R*C</strong>.</li>
	<li>1 &le;&nbsp;<strong>R*C</strong>&nbsp;&le; 16.</li>
</ul>

### 출력

<p>For each test case, output one line containing &quot;Case #x: y&quot;, where x is the test case number (starting from 1) and y is the minimum possible unhappiness for the building.</p>

### 힌트

<p>In Case #1, every room is occupied by a tenant and all seven internal walls have tenants on either side.<br />
<br />
In Case #2, there are various ways to place the two tenants so that they do not share a wall. One is illustrated below.<br />
<br />
In Case #3, the optimal strategy is to place the eight tenants in a ring, leaving the middle apartment unoccupied.<br />
<br />
Here are illustrations of sample cases 1-3. Each red wall adds a point of unhappiness.<br />
<br />
<img src="%EB%B0%B1%EC%A4%80/Silver/12155.%E2%80%85Noisy%E2%80%85Neighbors%E2%80%85(Small)/37fc61f9.png" data-original-src="https://onlinejudgeimages.s3.amazonaws.com/problem/12155/images-75.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc"/></p>