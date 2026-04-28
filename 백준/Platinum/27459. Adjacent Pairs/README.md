# [Platinum II] Adjacent Pairs - 27459

[문제 링크](https://www.acmicpc.net/problem/27459)

### 성능 요약

시간 제한: 3 초, 메모리 제한: 1024 MB

### 통계

제출: 136, 정답: 22, 맞힌 사람: 22, 정답 비율: 21.154%

### 분류

자료 구조, 집합과 맵, 해시를 사용한 집합과 맵

### 문제 설명

<p>Let&#39;s call an array $b_1, b_2, \dots , b_m$ <strong>good</strong>, if $b_i &ne; b_{i+1}$ for any $i$ with $1 &le; i &le; m - 1$.</p>

<p>You are given a <strong>good</strong> array of $n$ positive integers $a_1, a_2 , a_3 , \dots , a_n$.</p>

<p>You can perform the following operations on this array:</p>

<p>Choose any index $i$ ($1 &le; i &le; n$) and a number $x$ ($1 &le; x &le; 10^9$). Then, set $a_i$ to $x$. After this operation, the array has to remain <strong>good</strong>.</p>

<p>You want to perform several operations so that the resulting array will contain exactly two distinct values. Determine the smallest number of operations needed to achieve this goal.</p>

### 입력

<p>The first line of input contains the integer $t$ ($1 &le; t &le; 10^5$), the number of test cases. The description of test cases follows.</p>

<p>The first line of each test case contains a single integer $n$ ($2 &le; n &le; 2 &sdot; 10^5$) - the length of the array.</p>

<p>The second line of each test case contains $n$ integers $a_1 , a_2 , \dots , a_n$ ($1 &le; a_i &le; n$) - elements of the array. It&#39;s guaranteed that $a_i &ne; a_{i+1}$ for $1 &le; i &le; n - 1$ (that is, the array is <strong>good</strong>).</p>

<p>It is guaranteed that the sum of n over all test cases does not exceed $2 &sdot; 10^5$.</p>

### 출력

<p>For each test case, output a single integer - the smallest number of operations needed to achieve an array in which there are exactly two distinct values.</p>

### 힌트

<p>In the first test case, one of the optimal sequences of operations is:</p>

<p>$(4, 5, 2, 4, 5) &rarr; (2, 5, 2, 4, 5) &rarr; (2, 5, 2, 4, 2) &rarr; (2, 5, 2, 5, 2)$.</p>

<p>In the second test case, the array already contains only two distinct values, so the answer is $0$.</p>