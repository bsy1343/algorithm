# [Platinum II] Subarray Cost - 33132

[문제 링크](https://www.acmicpc.net/problem/33132)

### 성능 요약

시간 제한: 5 초, 메모리 제한: 2048 MB

### 통계

제출: 72, 정답: 30, 맞힌 사람: 18, 정답 비율: 32.727%

### 분류

그리디 알고리즘, 데카르트 트리, 세그먼트 트리, 이분 탐색, 자료 구조, 트리, 트리를 사용한 집합과 맵

### 문제 설명

<p>Given an array $A$ of length $N$, a <em>subarray</em> $A[l \ldots r]$ is defined as the part of the array $A$ that includes only the elements located at positions from $l$ to $r$ inclusively. The <em>cost</em> of a subarray is defined as the product of the length of the subarray and the sum of its two smallest elements.</p>

<p>For example, let the array be $A = [5, 1, 3, 5, 3]$. Let us consider the subarray $A[2 \ldots 4] = [1, 3, 5]$. Its length is $3$, its smallest element is $1$, and its second smallest element is $3$. Therefore, its cost is $3 \cdot (1 + 3) = 12$. Let us consider another subarray, $A[1 \ldots 2] = [5, 1]$. Its length is $2$, its smallest element is $1$, and its second smallest element is $5$. Therefore, its cost is $2 \cdot (1 + 5) = 12$.</p>

<p>Note that if the minimal value occurs more than once in a subarray, it is counted several times. For example, the length of the subarray $A[3 \ldots 5] = [3, 5, 3]$ is $3$, its smallest element is $3$, and its second smallest element is also $3$. Therefore, its cost is $3 \cdot (3 + 3) = 18$.</p>

<p>Given an array, find the maximum cost over all subarrays of at least two elements. That is, you need to find the maximum cost over all subarrays $A[l \ldots r]$, where $1 \le l &lt; r \le N$.</p>

### 입력

<p>The first line contains $N$ ($2 \le N \le 10^6$), the length of the array. The second line contains $N$ integers $A_1, A_2, \dots, A_N$ ($1 \le A_i \le 10^9$).</p>

### 출력

<p>Output a single integer, the maximum cost over all subarrays of at least two elements.</p>