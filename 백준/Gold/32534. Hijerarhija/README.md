# [Gold III] Hijerarhija - 32534

[문제 링크](https://www.acmicpc.net/problem/32534)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 55, 정답: 45, 맞힌 사람: 36, 정답 비율: 80.000%

### 분류

자료 구조, 집합과 맵, 트리, 해시를 사용한 집합과 맵

### 문제 설명

<p>Krešimir has started studying corporate structures, including <em>hierarchies</em>. He observed employees and their relationships within a company. In this case, we are only looking at <em>superior–subordinate</em> relationships, meaning relationships where one employee is directly superior to another employee in the company.</p>

<p>A hierarchy is a structure with $N$ employees and $N - 1$ superior–subordinate relationships, where there is one person who is directly or indirectly superior to all employees. In the observed company, there are also $N$ employees and $N - 1$ such relationships, but it is not certain whether this is a valid hierarchy or not.</p>

<p>Krešimir has asked you to help answer this question. He has recorded all the data in his notebook. Additionally, in his notebook, he will make $Q$ permanent changes by reversing one superior–subordinate relationship such that the subordinate becomes superior to their former superior. After each such change, it is necessary to answer the same question: is the current state a valid hierarchy?</p>

### 입력

<p>In the first line, there is a positive integer $N$ ($2 ≤ N ≤ 3 \cdot 10^5$).</p>

<p>In the next $N - 1$ lines, for each $i = 1, 2, \dots , N - 1$, there is a pair of integers $p_i$ and $e_i$ ($1 ≤ p_i , e_i ≤ N$, $p_i \ne e_i$), indicating that $p_i$ is directly superior to $e_i$.</p>

<p>In the next line, there is a non-negative integer $Q$ ($0 ≤ Q ≤ 10^6$).</p>

<p>In the following $Q$ lines, there are pairs $a_i$, $b_i$ ($1 ≤ a_i , b_i ≤ N$, $a_i \ne b_i$). It is guaranteed that at that moment, $a_i$ will either be directly superior to $b_i$ or vice versa.</p>

<p>In the test data, it is <strong>guaranteed</strong> that it will be possible to achieve at least one hierarchy with some sequence of reversals.</p>

### 출력

<p>In the next $Q + 1$ lines, for each of the given scenarios, it is necessary to output whether the current structure is a hierarchy, i.e., "<code>DA</code>" if it is, or "<code>NE</code>" if it is not (without quotation marks).</p>