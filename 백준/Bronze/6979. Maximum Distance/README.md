# [Bronze II] Maximum Distance - 6979

[문제 링크](https://www.acmicpc.net/problem/6979)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 254, 정답: 134, 맞힌 사람: 119, 정답 비율: 53.363%

### 분류

브루트포스 알고리즘

### 문제 설명

<p>Consider two descending sequences of integers X[0..n-1] and Y[0..n-1] with X[i] &gt;= X[i+1] and Y[i] &gt;= Y[i+1] and for all i, 0 &le; i &lt; n - 1. The distance between two elements X[i] and Y[j] is given by</p>

<p>d(X[i], Y[j]) = j - i if j &ge; i and Y[j] &ge; X[i], or 0 otherwise</p>

<p>The distance between sequence X and sequence Y is defined by</p>

<p>d(X, Y) = max{d(X[i], Y[j]) | 0 &le; i &lt; n, 0 &le; j &lt; n}</p>

<p>You may assume 0 &lt; n &lt; 1000.</p>

<p>For example, for the sequences X and Y below, their maximum distance is reached for i=2 and j=7, so d(X, Y)=d(X[2], Y[7])=5.</p>

<p><img alt="" src="%EB%B0%B1%EC%A4%80/Bronze/6979.%E2%80%85Maximum%E2%80%85Distance/80ca0cc0.png" data-original-src="%EB%B0%B1%EC%A4%80/Bronze/6979.%E2%80%85Maximum%E2%80%85Distance/80ca0cc0.png" data-original-src="https://onlinejudgeimages.s3.amazonaws.com/problem/6979/%EC%8A%A4%ED%81%AC%EB%A6%B0%EC%83%B7%202017-01-13%20%EC%98%A4%ED%9B%84%203.38.00.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:148px; width:260px" /></p>

<p>Part (a)</p>

<p>There is a maximum value of d(X, Y) over all sequences X and Y of length n. What property must the sequences satisfy in order to reach this value? There is a minimum value of d(X, Y). What property must the sequences satisfy in order to reach this value?</p>

<p>Part (b)</p>

<p>Write a program that repeatedly reads a pair of sequences of integers and prints the distance between those sequences. The first sequence is the X sequence and the second is the Y sequence. You may assume that the sequences are descending and of equal length. A pair of sequences is preceded by a number on a single line indicating the number of elements in the sequences. Numbers in a sequence are separated by a space, and each sequence is on a single line by itself. As usual, the first number in the input gives the number of test cases. Try to write an efficient program.</p>

<p>Part (c)</p>

<p>Give a very brief explanation of your program. Also, give a rough estimate of the maximum number of comparisons between elements of the two sequences that your program computes. (For example, n^2 can be considered a &quot;rough estimate&quot; of n^2 - 4.)</p>

### 입력



### 출력

