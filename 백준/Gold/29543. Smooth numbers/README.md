# [Gold V] Smooth numbers - 29543

[문제 링크](https://www.acmicpc.net/problem/29543)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 1024 MB

### 통계

제출: 104, 정답: 56, 맞힌 사람: 44, 정답 비율: 55.000%

### 분류

수학, 그리디 알고리즘, 런타임 전의 전처리

### 문제 설명

<p>Let&#39;s call positive integer <em>smooth</em> if each of its digits except the first and the last is less then the average of it&#39;s two neighbor digits. It means that if $x = a_n \cdot 10^n + a_{n-1} \cdot 10^{n-1} + ... + a_1 \cdot 10 + a_0$ then for each $i = 1 ... {n-1}$ the inequality $a_i &lt; (a_{i - 1} + a_{i + 1}) / 2$ holds.</p>

<p>Vasya has been studying smooth numbers for a long time and he wants to know, if any smooth number of exactly $l$ digits exists, and if so, what is the greatest $l$-digit smooth number.</p>

<p>Vasya is asking you for help! Find the greatest  $l$-digit smooth number. </p>

### 입력



### 출력

<p>Input file contains the only integer $l$ ($1 \le l \le 100$) --- number of digits in smooth number.</p>

### 제한

<p>Output the greatest $l$-digit smooth number or $-1$ if it does not exist.</p>