# [Platinum IV] Rainbow Numbers - 21145

[문제 링크](https://www.acmicpc.net/problem/21145)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 512 MB

### 통계

제출: 64, 정답: 29, 맞힌 사람: 28, 정답 비율: 45.161%

### 분류

다이나믹 프로그래밍

### 문제 설명

<p>Define a <em>rainbow number</em> as an integer that, when represented in base $10$ with no leading zeros, has no two adjacent digits the same.</p>

<p>Given lower and upper bounds, count the number of rainbow numbers between them (inclusive).</p>

### 입력

<p>The first line of input contains a single integer $L$ ($1 \le L &lt; 10^{10^5}$), which is the lower bound.</p>

<p>The second line of input contains a single integer $U$ ($1 \le U &lt; 10^{10^5}$), which is the upper bound.</p>

<p>It is guaranteed that $L \le U$. Note that the limits are not a misprint; $L$ and $U$ can be up to $10^5$ digits long.</p>

### 출력

<p>Output a single integer, which is the number of rainbow numbers between $L$ and $U$ (inclusive). Because this number may be very large, output it modulo $998,244,353$.</p>