# [Gold II] Function - 24059

[문제 링크](https://www.acmicpc.net/problem/24059)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 512 MB

### 통계

제출: 551, 정답: 134, 맞힌 사람: 103, 정답 비율: 24.408%

### 분류

수학, 정수론, 분할 정복을 이용한 거듭제곱, 페르마의 소정리

### 문제 설명

<p>You are given a function $f \, : \, \mathbb{N}_0 \to \mathbb{N}_0$&nbsp;defined as below. ($\mathbb{N}_0$ denotes the set of non-negative integers.)</p>

<ul>
	<li>$f(0) = a_0$</li>
	<li>$f(i) = a_i^{f(i&nbsp;- 1)}$ ($i&nbsp;\ge 1$)</li>
</ul>

<p>Find the value of $f(n)$ modulo&nbsp;$m$.</p>

### 입력

<p>The first line contains a single integer $n$.</p>

<p>The second line contains $n + 1$ integers $a_0, \, a_1, \, \cdots, \, a_n$.</p>

<p>The third line contains a single integer $m$.</p>

### 출력

<p>Print the value of $f(n)$ modulo&nbsp;$m$.</p>

### 제한

<ul>
	<li>$0&nbsp;\le n \le 2$</li>
	<li>$1 \le a_i \le 2 \times 10^9$ ($0 \le i \le n$)</li>
	<li>$2 \le m &lt; 2 \times 10^9$; $m$ is a prime number.</li>
	<li>All values in input are integers.</li>
</ul>

### 힌트

<p>As a note, the exact value of $9^{9^9}$ has a whopping $369 \, 693 \, 700$ digits.</p>