# [Platinum III] Building a Ski Course - 9876

[문제 링크](https://www.acmicpc.net/problem/9876)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 48, 정답: 21, 맞힌 사람: 19, 정답 비율: 61.290%

### 분류

다이나믹 프로그래밍, 누적 합

### 문제 설명

<p>Farmer John is helping to turn his large field into a ski course for the upcoming winter Moolympics. The field has dimensions M x N (1 &lt;= M,N &lt;= 100), and its intended final composition is described by an M x N grid of characters like this:</p>

<pre>
RSRSSS
RSRSSS
RSRSSS</pre>

<p>Each character describes how the snow in a unit square of the field should be groomed: either &#39;R&#39; for &#39;rough&#39; or &#39;S&#39; for &#39;smooth&#39; (the Moolympics organizers think that a course is more interesting if it has a mixture of rough and smooth patches).</p>

<p>To build the desired course, Farmer John plans to modify his tractor so that it can stamp any B x B patch of the field (B &lt;= M, B &lt;= N) with either entirely smooth snow or entirely rough snow. Since it takes a long time to reset the tractor between each of these stamps, FJ wants to make B as large as possible. With B = 1, he can clearly create the desired ski course by stamping each individual square with either R or S, as intended. However, for larger values of B, it may no longer be possible to create the desired course design. Every unit square of the course must at some point be stamped by FJ&#39;s tractor; it cannot be left in its default state.</p>

<p>Please help FJ determine the largest possible value of B he can successfully use.</p>

### 입력

<ul>
	<li>Line 1: Two space-separated integers M and N.</li>
	<li>Lines 2..M+1: M lines of exactly N characters (each R or S), describing the desired ski course design.</li>
</ul>

### 출력

<ul>
	<li>Line 1: The maximum value of B Farmer John can use to create the desired course pattern.</li>
</ul>

### 힌트

<h4>Output Details</h4>

<p>FJ can stamp a rough patch spanning columns 1-3, followed by a smooth patch spanning columns 2-4, then a rough patch spanning columns 3-5, and finally a smooth patch spanning columns 4-6.</p>