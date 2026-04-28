# [Gold V] Bulls and Cows - 6096

[문제 링크](https://www.acmicpc.net/problem/6096)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 108, 정답: 58, 맞힌 사람: 56, 정답 비율: 55.446%

### 분류

다이나믹 프로그래밍

### 문제 설명

<p>Farmer John wants to position N (1 &lt;= N &lt;= 100,000) cows and bulls in a single row to present at the annual fair.</p>

<p>FJ has observed that the bulls have been quite pugnacious lately; if two bulls too close together in the line, they will argue and begin to fight, ruining the presentation. Ever resourceful, FJ calculated that any two bulls must have at least K (0 &lt;= K &lt; N) cows between them in order to avoid a fight.</p>

<p>FJ would like you to help him by counting the number of possible sequences of N bulls and cows that avoid any fighting. FJ considers all bulls the to be the same and all cows to be the same; thus, two sequences are only different if they have different kinds of cattle in some position.</p>

### 입력

<ul>
	<li>Line 1: Two space-separated integers: N and K</li>
</ul>

<p>&nbsp;</p>

### 출력

<ul>
	<li>Line 1: A single integer representing the number of ways FJ could create such a sequence of cattle. Since this number can be quite large, output the result modulo 5,000,011.</li>
</ul>

<p>&nbsp;</p>

### 힌트

<p>The following are the six possible sequences FJ could create (note that &#39;C&#39; stands for cow and &#39;B&#39; stands for bull):</p>

<pre>
CCCC
BCCC
CBCC
CCBC
CCCB
BCCB</pre>