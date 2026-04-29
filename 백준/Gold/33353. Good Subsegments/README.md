# [Gold III] Good Subsegments - 33353

[문제 링크](https://www.acmicpc.net/problem/33353)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 2048 MB

### 통계

제출: 8, 정답: 3, 맞힌 사람: 3, 정답 비율: 42.857%

### 분류

누적 합, 수학, 조합론

### 문제 설명

<p>You are given an array $a[1..n]$ consisting of $n$ integers from $1$ to $n$. A <em>subsegment</em> $a[\ell..r]$ of the array is its consecutive part from position $\ell$ to position $r$, inclusive.</p>

<p>A subsegment $a[\ell..r]$ is <em>$k$-good</em> if the following conditions are satisfied:</p>

<ul>
	<li>$r - \ell + 1 \ge 2 \cdot k$, so its length is at least $2 \cdot k$;</li>
	<li>$a_{\ell} = a_{\ell + 1} = a_{\ell + 2} = ... = a_{\ell + k - 1}$, so at least $k$ of its leftmost elements are equal to each other;</li>
	<li>$a_{r} = a_{r - 1} = a_{r - 2} = ... = a_{r - k + 1}$, so at least $k$ its rightmost elements are equal to each other;</li>
	<li>$a_{\ell} = a_r$, so its ends are equal.</li>
</ul>

<p>For each $k$ from $1$ to $\left\lfloor\frac{n}{2}\right\rfloor$, find the number of $k$-good subsegments of the given array $a$.</p>

### 입력

<p>The first line contains an integer $t$ ($1 \le t \le 5 \cdot 10^5$), the number of test cases. The test cases follow.</p>

<p>The first line of each test case contains an integer $n$ ($2 \le n \le 5 \cdot 10^5$).</p>

<p>The second line consists of $n$ integers $a_1, a_2, \ldots, a_n$ ($1 \le a_i \le n$).</p>

<p>The sum of $n$ over all test cases does not exceed $5 \cdot 10^5$.</p>

### 출력

<p>For each test case, print a line with $\left\lfloor\frac{n}{2}\right\rfloor$ integers: the number of $k$-good subsegments for each corresponding $k$, starting from $1$.</p>