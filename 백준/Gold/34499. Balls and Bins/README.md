# [Gold III] Balls and Bins - 34499

[문제 링크](https://www.acmicpc.net/problem/34499)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 256 MB

### 통계

제출: 6, 정답: 6, 맞힌 사람: 6, 정답 비율: 100.000%

### 분류

그리디 알고리즘, 정렬

### 문제 설명

<p>Busy Beaver has $N$ bins and a large amount of balls. The $i$-th bin can hold up to $s_i$ balls and currently contains $a_i$ balls. In a <em>move</em>, he first chooses a bin $i$ that is currently full (i.e., $a_i = s_i$). Then, for each ball in the chosen bin, he chooses to either discard it or move it to a different bin with enough space. (Within the same move, it is allowed to move different balls to different bins.)</p>

<p>Using only these moves, Busy Beaver is trying to remove all of the balls from all of the bins. Determine whether or not it is possible to do so.</p>

### 입력

<p>Each test contains multiple test cases. The first line of input contains a single integer $T$ $(1\le T\le 10^5)$, the number of test cases. The description of each test case follows.</p>

<p>The first line of each test case contains a single positive integer $N$ $(1\le N\le 5\cdot 10^5)$.</p>

<p>The second line contains $N$ integers $a_1,a_2,\dots, a_N$ $(1\le a_i\le 10^9)$ --- the number of balls currently in each bin.</p>

<p>The third line contains $N$ integers $s_1,s_2,\dots, s_N$ $(1\le s_i\le 10^9,a_i\le s_i)$ --- the number of balls each bin can hold.</p>

<p>It is guaranteed that the sum of $N$ across all test cases does not exceed $5\cdot 10^5$.</p>

### 출력

<p>For each test case, output "<code>YES</code>" (without quotes) if all bins may be emptied, and "<code>NO</code>" (without quotes) otherwise.</p>

### 힌트

<p>In the first test case, Busy Beaver can move all the balls in the first bin to the second bin. Then he will have exactly $1 + 2 = 3$ balls in the second bin, making the second bin full. </p>

<p>Then he can move all the balls from the second bin to the third bin. Then he will have exactly $5 + 3 = 8$ balls in the third bin, making the third bin full. </p>

<p>Finally, he can throw all the balls in the third bin away.</p>

<p>In the second test case, it can be shown that it is impossible to discard all the balls.</p>