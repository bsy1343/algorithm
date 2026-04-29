# [Silver IV] Minimal Coprime - 33310

[문제 링크](https://www.acmicpc.net/problem/33310)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 2048 MB

### 통계

제출: 120, 정답: 105, 맞힌 사람: 98, 정답 비율: 89.091%

### 분류

사칙연산, 수학, 애드 혹, 정수론

### 문제 설명

<p style="text-align: center;"><small><em>Today, Little John used all his savings to buy a segment. He wants to build a house on this segment.</em></small></p>

<p>A segment of positive integers $[l,r]$ is called <em>coprime</em> if $l$ and $r$ are coprime<sup>1</sup>.</p>

<p>A coprime segment $[l,r]$ is called <em>minimal coprime</em> if it does not contain<sup>2</sup> any coprime segment not equal to itself. To better understand this statement, you can refer to the notes.</p>

<p>Given $[l,r]$, a segment of positive integers, find the number of minimal coprime segments contained in $[l,r]$.</p>

<hr>
<p><sup>1</sup>Two integers $a$ and $b$ are coprime if they share only one positive common divisor. For example, the numbers $2$ and $4$ are not coprime because they are both divided by $2$ and $1$, but the numbers $7$ and $9$ are coprime because their only positive common divisor is $1$.</p>

<p><sup>2</sup>A segment $[l',r']$ is contained in the segment $[l,r]$ if and only if $l \le l' \le r' \le r$.</p>

### 입력

<p>Each test contains multiple test cases. The first line contains the number of test cases $t$ ($1 \le t \le 100$). The description of the test cases follows.</p>

<p>The only line of each test case consists of two integers $l$ and $r$ ($1 \le l \le r \le 10^9$).</p>

### 출력

<p>For each test case, output the number of minimal coprime segments contained in $[l,r]$, on a separate line.</p>

### 힌트

<p>On the first test case, the given segment is $[1,2]$. The segments contained in $[1,2]$ are as follows.</p>

<ul>
	<li>$[1,1]$: This segment is coprime, since the numbers $1$ and $1$ are coprime, and this segment does not contain any other segment inside. Thus, $[1,1]$ is minimal coprime.</li>
	<li>$[1,2]$: This segment is coprime. However, as it contains $[1,1]$, which is also coprime, $[1,2]$ is not minimal coprime.</li>
	<li>$[2,2]$: This segment is not coprime because $2$ and $2$ share $2$ positive common divisors: $1$ and $2$.</li>
</ul>

<p>Therefore, the segment $[1,2]$ contains $1$ minimal coprime segment.</p>