# [Silver V] Very Simple Problem - 7863

[문제 링크](https://www.acmicpc.net/problem/7863)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 117, 정답: 52, 맞힌 사람: 48, 정답 비율: 44.037%

### 분류

구현

### 문제 설명

<p>During a preparation of programming contest, its jury is usually faced with many difficult tasks. One of them is to select a problem simple enough to most, if not all, contestants to solve.</p>

<p>The difficulty here lies in diverse meanings of the term &ldquo;simple&rdquo; amongst the jury members. So, the jury uses the following procedure to reach a consensus: each member weights each proposed problem with a positive integer &ldquo;complexity rating&rdquo; (not necessarily different for different problems). The jury member calls &ldquo;simplest&rdquo; those problems that he gave the minimum complexity rating, and &ldquo;hardest&rdquo; those problems that he gave the maximum complexity rating.</p>

<p>The ratings received from all jury members are then compared, and a problem is declared as &ldquo;very simple&rdquo;, if it was called as &ldquo;simplest&rdquo; by more than a half of the jury, and was called as &ldquo;hardest&rdquo; by nobody.</p>

### 입력

<p>The first line of input file contains integers N and P (1 &le; N, P &le; 100), the number of jury members and the number of problems. The following N lines contain P integers in range from 0 to 1000 each &mdash; the complexity ratings.</p>

### 출력

<p>Output file must contain an ordered list of &ldquo;very simple&rdquo; problem numbers, separated by spaces. If there are no such problems, output must contain a single integer 0 (zero).</p>