# [Platinum I] Indivisible Inversions - 34502

[문제 링크](https://www.acmicpc.net/problem/34502)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 256 MB

### 통계

제출: 15, 정답: 6, 맞힌 사람: 6, 정답 비율: 40.000%

### 분류

두 포인터, 세그먼트 트리, 자료 구조

### 문제 설명

<p>While studying for his algorithms midterm, Busy Beaver came up with the following problem and wants your help to solve it.</p>

<p>You are given an integer $N$ and a permutation $p_1,p_2,\ldots,p_N$ of length $N$.<sup>1</sup> Find the length of the longest contiguous subarray ($l,r$) ($1 \le l \le r \le N$) of $p$ such that the number of inversions<sup>2</sup> of $p_l,p_{l+1},\ldots,p_r$ is <strong>not</strong> divisible by $K$, or determine if such a subarray does not exist.</p>

<p>Help Busy Beaver find the answer to this problem!</p>

<hr>
<p><sup>1</sup>A permutation of length $N$ is an array consisting of $N$ distinct integers from $1$ to $N$ in arbitrary order. For example, $[2,3,1,5,4]$ is a permutation, but $[1,2,2]$ is not a permutation ($2$ appears twice in the array), and $[1,3,4]$ is also not a permutation ($N=3$ but there is $4$ in the array).</p>

<p><sup>2</sup>An inversion in a permutation p is a pair of indices $(i, j)$ such that $i &gt; j$ and $p_i &lt; p_j$. For example, a permutation $[4, 1, 3, 2]$ contains 4 inversions: $(2, 1)$, $(3, 1)$, $(4, 1)$, $(4, 3)$.</p>

### 입력

<p>Each test contains multiple test cases. The first line of input contains a single positive integer $T$, the number of test cases $(1 \leq T \leq 10^4)$. The description of each test case follows.</p>

<p>The first line of each test case contains two integers $N$ and $K$ ($2 \le K \le N \le 2 \cdot 10^5$).</p>

<p>The second line of each test case contains $N$ <strong>distinct</strong> positive integers $p_1,p_2,\ldots,p_N$ ($1 \le p_i \le N$).</p>

<p>It is guaranteed that the sum of $N$ across all test cases does not exceed $2 \cdot 10^5$.</p>

### 출력

<p>For each test case, output one line with a single integer, indicating the length of the longest contiguous subarray of $p$ such that the number of inversions of the subarray is <strong>not</strong> divisible by $K$. If such a subarray does not exist, output $-1$.</p>

### 힌트

<p>In the first test case, the number of inversions of $[1,3,2,4]$ is $1$ (the second and third elements form the only inversion pair). Since $1$ is not divisible by $3$, the longest contiguous subarray whose number of inversions isn't divisible by $5$ is the entire array itself. Thus, the answer to the test case is the length of the entire array, which is $4$.</p>

<p>In the second test case, the number of inversions of each contiguous subarray is $0$ because the array is sorted. Since no contiguous subarray has an inversion count not divisible by $5$, the answer is $-1$.</p>

<p>In the third test case, it can be shown that the longest contiguous subarray whose number of inversions is not divisible by $2$ is $[3, 1, 4, 2, 6]$, which has $3$ inversions.</p>

<p>In the fourth test case, it can be shown that the longest contiguous subarray whose number of inversions is not divisible by $2$ is $[5, 1, 4, 6, 2]$, which has $5$ inversions.</p>