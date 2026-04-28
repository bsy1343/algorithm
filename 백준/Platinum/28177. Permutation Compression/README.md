# [Platinum II] Permutation Compression - 28177

[문제 링크](https://www.acmicpc.net/problem/28177)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 77, 정답: 28, 맞힌 사람: 23, 정답 비율: 36.508%

### 분류

자료 구조, 그리디 알고리즘, 세그먼트 트리, 이분 탐색, 집합과 맵, 트리를 사용한 집합과 맵

### 문제 설명

<p>Grammy has a permutation of length $n$. She wants to delete some useless elements in the permutation, so she decided to use some magic tool to delete them. There are $k$ magic tools, the $i$-th of them can delete the maximum element of an interval of length exactly $\ell_i$. Each magic tool can be used at most once.</p>

<p>After each deletion, the length of the array decreases by one, and the neighbors of the deleted element become neighbors themselves.</p>

<p>Before using the tool, Grammy shows you her blueprint of the array after deletion. The new array consists of exactly $m$ distinct elements from $1$ to $n$. Please help Grammy to determine whether it is possible to delete the elements by using the magic tool, so that the result is equal to the blueprint.</p>

### 입력

<p>There are multiple test cases.</p>

<p>The first line contains an integer $T$ ($1 \leq T \leq 10^5$), denoting the number of test cases. </p>

<p>For each test case:</p>

<p>The first line contains three integers $n$, $m$, $k$ ($1 \leq m \leq n \leq 2 \cdot 10^5$, $1\leq k\leq 2\cdot 10^5$), denoting the length of the permutation, the length of the compressed array, and the parameter of the magic tool. </p>

<p>The second line contains $n$ distinct integers $a_i$ ($1 \leq a_i \leq n$), denoting the initial permutation. It is guaranteed that the elements are distinct.</p>

<p>The third line contains $m$ distinct integers $b_i$ ($1 \leq b_i \leq n$), denoting the array after compression. It is guaranteed that the elements are distinct.</p>

<p>The fourth line contains $k$ integers $\ell_i$ ($1 \leq \ell_i \leq n$), denoting the magic tools.</p>

<p>It is guaranteed that $\sum n\leq 2\cdot 10^5$ and $\sum k\leq 2\cdot 10^5$.</p>

### 출력

<p>For each test case, output &quot;<code>YES</code>&quot; or &quot;<code>NO</code>&quot; on a separate line, denoting the answer to the problem. </p>