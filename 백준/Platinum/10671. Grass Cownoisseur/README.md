# [Platinum I] Grass Cownoisseur - 10671

[문제 링크](https://www.acmicpc.net/problem/10671)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 256 MB

### 통계

제출: 198, 정답: 81, 맞힌 사람: 58, 정답 비율: 38.667%

### 분류

다이나믹 프로그래밍, 그래프 이론, 방향 비순환 그래프, 위상 정렬, 강한 연결 요소

### 문제 설명

<p>In an effort to better manage the grazing patterns of his cows, Farmer John has installed one-way cow paths all over his farm. &nbsp;The farm consists of N fields, conveniently numbered 1..N, with each one-way cow path connecting a pair of fields. &nbsp;For example, if a path connects from field X to field Y, then cows are allowed to travel from X to Y but not from Y to X.</p>

<p>Bessie the cow, as we all know, enjoys eating grass from as many fields as possible. &nbsp;She always starts in field 1 at the beginning of the day and visits a sequence of fields, returning to field 1 at the end of the day. &nbsp;She tries to maximize the number of distinct fields along her route, since she gets to eat the grass in each one (if she visits a field multiple times, she only eats the grass there once).</p>

<p>As one might imagine, Bessie is not particularly happy about the one-way restriction on FJ&#39;s paths, since this will likely reduce the number of distinct fields she can possibly visit along her daily route. &nbsp;She wonders how much grass she will be able to eat if she breaks the rules and follows up to one path in the wrong direction. Please compute the maximum number of distinct fields she can visit along a route starting and ending at field 1, where she can follow up to one path along the route in the wrong direction. &nbsp;Bessie can only travel backwards at most once in her journey. &nbsp;In particular, she cannot even take the same path backwards twice.&nbsp;</p>

### 입력

<p>The first line of input contains N and M, giving the number of fields and the number of one-way paths (1 &lt;= N, M &lt;= 100,000).</p>

<p>The following M lines each describe a one-way cow path. &nbsp;Each line contains two distinct field numbers X and Y, corresponding to a cow path from X to Y. &nbsp;The same cow path will never appear more than once.</p>

### 출력

<p>A single line indicating the maximum number of distinct fields Bessie can visit along a route starting and ending at field 1, given that she can follow at most one path along this route in the wrong direction.</p>

### 힌트

<p>Here is an ASCII drawing of the sample input:</p>

<pre>
v---3--&gt;6
7   |\  |
^\  v \ |
| \ 1  \|
|  \|   v
|   v   5
4&lt;--2---^
</pre>

<p>Bessie can visit pastures 1, 2, 4, 7, 2, 5, 3, 1 by traveling backwards on the path between 5 and 3. &nbsp;When she arrives at 3 she cannot reach 6 without following another backwards path.</p>