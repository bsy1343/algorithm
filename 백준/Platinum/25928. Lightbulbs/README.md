# [Platinum III] Lightbulbs - 25928

[문제 링크](https://www.acmicpc.net/problem/25928)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 256 MB

### 통계

제출: 14, 정답: 8, 맞힌 사람: 6, 정답 비율: 75.000%

### 분류

수학, 다이나믹 프로그래밍, 누적 합, 확률론, 포함 배제의 원리

### 문제 설명

<p>Thomas Edison is actively working on a better version of a lightbulb. During that process, he covers entire fields with batches of lightbulbs and conducts tests on them. In his current experiment, he arranged $N$ rows with $M$ lightbulbs in each row. Each lightbulb has a chance $P$ of working, otherwise, it&rsquo;s faulty and won&rsquo;t light up. Thomas wants to find the expected value of the length of the longest horizontal sequence of lightbulbs that are working.</p>

<p>For example, in the setup below, where $1$ is a working lightbulb and $0$ is faulty, the length of the longest horizontal sequence of lightbulbs that are working is $3$, since there are three consecutive ones in the second row (and also in the fourth row).</p>

<pre>
1 0 1 1
0 1 1 1
0 1 0 0
1 1 1 0
1 1 0 1</pre>

<p>Note that we&rsquo;re interested in horizontal sequences only.</p>

### 입력

<p>You&rsquo;re given three numbers separated by spaces &ndash; positive integers $N$ and $M$, and a real number $P$.</p>

### 출력

<p>Output the answer to the problem. Your answer would be considered correct if its absolute or relative error is less than $10^{-4}$.</p>

### 제한

<ul>
	<li>$1 &le; N, M &le; 2000$</li>
	<li>$0 &le; P &le; 1$</li>
</ul>