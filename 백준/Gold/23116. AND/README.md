# [Gold I] AND - 23116

[문제 링크](https://www.acmicpc.net/problem/23116)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 139, 정답: 77, 맞힌 사람: 63, 정답 비율: 57.798%

### 분류

애드 혹, 해 구성하기, 비트마스킹

### 문제 설명

<p>You had an array $a$. After that, you calculated bitwise <code>AND</code>s of all subarrays of the original array. Formally, you calculated all numbers of the form $a_i$ <code>AND</code> $a_{i + 1}$ <code>AND</code> $\ldots$ <code>AND</code> $a_j$ for $1 \le i \le j \le \mathrm{length}(a)$.</p>

<p>You remember the resulting set of all these numbers: a number lies in this set if and only if it can be represented as bitwise <code>AND</code> of at least one subarray. Sadly, you forgot the original array. </p>

<p>Find any array $a$ which would produce the given set of <code>AND</code>s on subarrays, or determine that there is no such array.</p>

### 입력

<p>The first line contains a single integer $t$ ($1 \le t \le 10^5$), the number of test cases.</p>

<p>The first line of each test case contains a single integer $n$ ($1 \le n \le 10^5$), the size of the given set.</p>

<p>The second line of each test case contains $n$ integers $b_1, b_2, \ldots, b_n$ ($0 \le b_i \le 2^{20} - 1$), the elements of the set. It is guaranteed that all elements are distinct.</p>

<p>It is guaranteed that the sum of $n$ over all test cases does not exceed $10^5$.</p>

### 출력

<p>For each test case, if there is no such array, output $-1$.</p>

<p>Otherwise, on the first line, output the size of the original array $k$ ($1 \le k \le 5n$).</p>

<p>On the next line, output $k$ integers $a_1, a_2, \ldots, a_k$ ($0 \le a_i \le 2^{20} - 1$), the elements of the array. </p>

<p>If there are several possible answers, print any one of them.</p>

<p>It can be shown that, if there is at least one array, then there is an array which satisfies these conditions.</p>

### 힌트

<p>Note that the elements of the array that you output don&#39;t have to be distinct.</p>