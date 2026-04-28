# [Platinum III] Grazing on the Run - 7036

[문제 링크](https://www.acmicpc.net/problem/7036)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 122, 정답: 84, 맞힌 사람: 70, 정답 비율: 72.917%

### 분류

다이나믹 프로그래밍

### 문제 설명

<p>A long, linear field has N (1 &lt;= N &lt;= 1,000) clumps of grass at unique integer locations on what will be treated as a number line.Think of the clumps as points on the number line.&nbsp;</p>

<p>Bessie starts at some specified integer location L on the number line (1 &lt;= L &lt;= 1,000,000) and traverses the number line in the two possible directions (sometimes reversing her direction) in order to reach and eat all the clumps. She moves at a constant speed (one unit of distance in one unit of time), and eats a clump instantly when she encounters it.&nbsp;</p>

<p>Clumps that aren&#39;t eaten for a while get stale. We say the &quot;staleness&quot; of a clump is the amount of time that elapses from when Bessie starts moving until she eats a clump. Bessie wants to minimize the total staleness of all the clumps she eats.&nbsp;</p>

<p>Find the minimum total staleness that Bessie can achieve while eating all the clumps.</p>

### 입력

<ul>
	<li>Line 1 : Two space-separated integers: N and L.&nbsp;</li>
	<li>Lines 2..N+1: Each line contains a single integer giving the position P of a clump (1 &lt;= P &lt;= 1,000,000).&nbsp;</li>
</ul>

### 출력

<ul>
	<li>Line 1: A single integer: the minimum total staleness Bessie can achieve while eating all the clumps.</li>
</ul>