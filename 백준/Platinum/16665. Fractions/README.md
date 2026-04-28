# [Platinum V] Fractions - 16665

[문제 링크](https://www.acmicpc.net/problem/16665)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 115, 정답: 59, 맞힌 사람: 50, 정답 비율: 54.945%

### 분류

수학, 정수론, 유클리드 호제법, 소인수분해

### 문제 설명

<p>You are given a positive integer \(n\).</p>

<p>Find a sequence of fractions \(a_i\), \(b_i\)&nbsp;&nbsp;\(i = 1 \dots k\) (where \(a_i\) and \(b_i\) are positive integers) for some \(k\) such that</p>

<p>\[\begin{cases} b_i \text{ divides } n, 1 &lt; b_i &lt; n \text{ for } i = 1 \dots k &nbsp;\\ 1 \le a_i &lt; b_i, \text{ for } i = 1 \dots k \\ \sum_{i=1}^{k}{\frac{a_i}{b_i}} = 1 - \frac{1}{n} \end{cases}\]</p>

### 입력

<p>The input consists of a single integer \(n\) (\(2 \le n \le 10^9).</p>

### 출력

<p>In the first line print &ldquo;YES&rdquo; if there exists such a sequence of fractions or &ldquo;NO&rdquo; otherwise.</p>

<p>If there exists such a sequence, next lines should contain a description of the sequence in the following format.</p>

<p>The second line should contain integer \(k\) (\(1 \le k \le 100 000\)) &mdash; the number of elements in the sequence. It is guaranteed that if such a sequence exists, then there exists a sequence of length at most \(100 000\). Next \(k\) lines should contain fractions of the sequence with two integers \(a_i\) and \(b_i\) on each line.</p>

### 힌트

<p>In the second example there is a sequence \(\frac{1}{2}\), \(\frac{1}{3}\) such that \(\frac{1}{2}+\frac{1}{3} = 1 - \frac{1}{6}\).</p>