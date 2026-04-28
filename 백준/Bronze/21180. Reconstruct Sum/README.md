# [Bronze II] Reconstruct Sum - 21180

[문제 링크](https://www.acmicpc.net/problem/21180)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 512 MB

### 통계

제출: 259, 정답: 193, 맞힌 사람: 166, 정답 비율: 75.455%

### 분류

수학, 구현, 브루트포스 알고리즘

### 문제 설명

<p>On a whiteboard, you have found a list of integers. Is it possible to use all of them to write down a correct arithmetic expression where one of them is the sum of all the others?</p>

<p>You may not alter the integers in any way (<em>e.g.</em>, changing the sign or concatenating).</p>

### 입력

<p>The first line of input contains an integer $n$ ($1 \le n \le 10^4$), representing the number of integers on the whiteboard.</p>

<p>The integers on the whiteboard are given over the next $n$ lines, one per line. Their absolute values are guaranteed to be at most $10^5$.</p>

### 출력

<p>Print a single integer $x$ which is one of the inputs, and is the sum of all the others. If there&rsquo;s more than one such $x$, output any one. If there are no such values of $x$, output the string &lsquo;<code>BAD</code>&rsquo;.</p>