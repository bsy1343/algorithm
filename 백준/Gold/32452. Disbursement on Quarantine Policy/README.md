# [Gold II] Disbursement on Quarantine Policy - 32452

[문제 링크](https://www.acmicpc.net/problem/32452)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 1024 MB

### 통계

제출: 63, 정답: 51, 맞힌 사람: 44, 정답 비율: 86.275%

### 분류

기댓값의 선형성, 모듈로 곱셈 역원, 수학, 정수론, 페르마의 소정리, 확률론

### 문제 설명

<blockquote>
<p>The 2019 novel coronavirus, COVID-19, can be transmitted between humans through water droplets and close contact. The transmission is especially easy and fast in relatively crowded or confined spaces, such as airplanes or trains. If someone is infected with COVID-19, then passengers occupying the adjacent seats will be infected easily.</p>

<hr>
<p style="text-align: right;">—“Quarantine Policy,” 2023 ICPC Taoyuan Regional Contest, Problem D</p>
</blockquote>

<p>There is a train with $n$ rows, and there are $m$ seats per row. All seats are occupied. For some passengers, we know they are being infected with COVID-19 or not. However, for other passengers, we are not sure about their status, and we assume each of them has $\frac{1}{2}$ chance being infected with COVID-19, independent from each other.</p>

<p>All infected passengers need to be quarantined for $d_0$ days. All passengers that are not infected, but edge-adjacent to any infected passenger, need to be quarantined for $d_1$ days. All passengers that are not infected, not edge-adjacent to any infected passenger, but corner-adjacent to any infected passenger, need to be quarantined for $d_2$ days.</p>

<p>The passengers need to stay in the hotel during quarantine. According to the regulations, the government needs to pay for the hotel. As an accountant of the government, you are asked to evaluate the expected total number of days the passengers need to be quarantined, which indicates the expected total cost on paying for the hotel.</p>

<p>For example, suppose $n = 4$, $m = 4$, $d_0 = 15$, $d_1 = 7$, $d_2 = 3$. The third passenger in the third row is infected, and we don’t know whether the second passenger in the first row is infected or not. Other $14$ passengers are not infected.</p>

<p>If the second passenger in the first row is infected, then the total number of days of quarantine is $91$:</p>

<pre>7 15  7  0
3  7  7  3
0  7 15  7
0  3  7  3</pre>

<p>If that passenger is not infected, then the total number of days of quarantine is $55$:</p>

<pre>0  0  0  0
0  3  7  3
0  7 15  7
0  3  7  3</pre>

<p>So the expected total number of days of quarantine is $\frac{91+55}{ 2} = 73$.</p>

### 입력

<p>The first line contains five integers $n$, $m$, $d_0$, $d_1$ and $d_2$. The following $n$ lines contain $m$ characters each. The $j$-th character of the $i$-th line represents the passenger occupying the $j$-th seat of the $i$-th row. Each character is one of ‘<code>V</code>’, ‘<code>.</code>’, or ‘<code>?</code>’. ‘<code>V</code>’ means an infected passenger, ‘<code>.</code>’ means a not infected passenger, and ‘<code>?</code>’ means a passenger that has $\frac{1}{ 2}$ chance being infected.</p>

### 출력

<p>The expected total number of days the passengers need to be quarantined, modulo $10^9 + 7$. It can be proved that the answer can be represented by a rational number $\frac{p}{ q}$ where $q$ is not a multiple of $10^9 + 7$. Then you need to print $p \times q^{-1}$ modulo $10^9 + 7$, where $q^{-1}$ means the multiplicative inverse of $q$ modulo $10^9 + 7$.</p>

<p>Note: If $x \times q \equiv 1 \bmod 10^9 + 7$, then $x$ is the multiplicative inverse of $q$ modulo $10^9 + 7$.</p>

### 제한

<ul>
	<li>$1 ≤ n ≤ 100$</li>
	<li>$1 ≤ m ≤ 100$</li>
	<li>$0 ≤ d_2 ≤ d_1 ≤ d_0 ≤ 100$</li>
</ul>