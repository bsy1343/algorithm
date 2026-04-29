# [Platinum III] Sums of Two - 35016

[문제 링크](https://www.acmicpc.net/problem/35016)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 2048 MB

### 통계

제출: 51, 정답: 7, 맞힌 사람: 4, 정답 비율: 11.765%

### 분류

다이나믹 프로그래밍, 배낭 문제, 비트 집합, 비트마스킹

### 문제 설명

<p>Lina the Magician claims that a common modern computer can easily perform a hundred billion operations per second! To prove it, she proposes to run the following calculations.</p>

<p>Let $V$ be a set of integers, initially empty. We are given the starting value of the integer $s$. Make $n$ steps described below:</p>

<ul>
<li>$s \leftarrow (s \cdot 618\,023 + 1) \bmod 999\,983$;</li>
<li>find the number of distinct pairs of integers in $V$ that have the sum $s$;</li>
<li>if this number is even, insert $s$ into the set $V$.</li>
</ul>

<p>How many elements will there be in $V$ after $n$ steps?</p>

<p>Formally: on each step, we count the number of pairs $(a, b)$ where $a \in V$, $b \in V$, $a \le b$ and $a + b = s$.</p>

### 입력

<p>The first line contains integers $n$ and $s$ ($1 \le n \le 200\,000$; $0 \le s &lt; 999\,983$; $s \ne 742\,681$).</p>

### 출력

<p>Print a single integer: the size of set $V$ after $n$ steps.</p>

### 힌트

<p>In the example, the values of $s$ on the four steps are $740\,740$, $139\,655$, $469\,353$, and $880\,395$.</p>