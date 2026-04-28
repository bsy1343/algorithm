# [Gold IV] Bedtime Reading, II - 14784

[문제 링크](https://www.acmicpc.net/problem/14784)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 112, 정답: 39, 맞힌 사람: 33, 정답 비율: 34.375%

### 분류

수학, 구현, 그래프 이론, 브루트포스 알고리즘, 그래프 탐색, 정수론, 소수 판정, 에라토스테네스의 체

### 문제 설명

<p>Bessie rubbed her eyes again. &quot;The headache&#39;s gone. Can you go over that part about number chains again, Farmer John?&quot;&nbsp;</p>

<p>&quot;Sure!&quot; FJ exclaimed. &quot;Let&#39;s continue with that sigma function, the one that is the sum of a number&#39;s divisors. First, though, let&#39;s exclude the number itself from the sum and call our new function bess(), in your honor. Now bess(12) = 1+2+3+4+6 = 16. If we continue and compute bess(16), we find it is 1 + 2 + 4 + 8 = 15. Then bess(15) = 1 + 3 + 5 = 9 and bess(9) = 1 + 3 = 4. Then bess(4) = 1 + 2 = 3 and bess(3) = 1. For better or worse, bess(1) is 0. Not much of a chain, really.&quot;&nbsp;</p>

<p>&quot;But look,&quot; continued FJ. &quot;We see that bess(6) = 1 + 2 + 3 = 6 and bess(28) = 28. Those form little tiny chains called &#39;perfect numbers&#39;. Moving to bigger numbers, bess(220) = 284 and -- get this -- bess(284) = 220 -- a chain of length 2! Some chains are even longer.&quot;&nbsp;</p>

<p>&quot;It&#39;s so late; I&#39;m not sure I can do the math,&quot; mooed Bessie.&nbsp;</p>

<p>&quot;No problem,&quot; said FJ. &quot;We&#39;ll ask the programmers to write a program that accepts a start and end integer (1 &lt;= start &lt;= end &lt;= 1,000,000) and finds all the possible number chains whose starting value is in the interval (start..end). No intermediate value is allowed to exceed 2,000,000, though some might be larger than the &#39;end&#39; integer. No chain is longer than 50 elements. Print only chains whose smallest element comes first (i.e., no intermediate value is less than the start value of the chain). We must ask them, though, to compute the answers with their program and not just print them. We&#39;ll supply test data that is reasonable to finish in 1.0 CPU seconds.&quot;</p>

### 입력

<ul>
	<li>Line 1: Two space-separated integers: start and end</li>
</ul>

### 출력

<ul>
	<li>Lines 1..?: Each line contains a space-separated list that represents one chain of numbers calculated using the described bess() function.</li>
</ul>