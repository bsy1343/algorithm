# [Platinum IV] AddK - 24066

[문제 링크](https://www.acmicpc.net/problem/24066)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 1024 MB

### 통계

제출: 109, 정답: 22, 맞힌 사람: 16, 정답 비율: 45.714%

### 분류

자료 구조, 세그먼트 트리

### 문제 설명

<p>You are given an array $A$ of $N$ integers $A_1, \dots , A_N$ and an integer $K$. You must process $Q$ queries of the following two types:</p>

<ul>
	<li>$1 \, i_1 \, i_2 \, \dots&nbsp;\, i_K$: you must circularly permute $A_{i_1} , \dots , A_{i_K}$ to the left. Thus the new values of elements $A_{i_1} , A_{i_2} , \dots , A_{i_{K-1}} , A_{i_K}$ will be $A_{i_2} , A_{i_3} , \dots&nbsp;, A_{i_K} , A_{i_1}$. Note that $i_1, \dots , i_k$ are distinct and not necessarily in increasing order.</li>
	<li>$2 \, l \, r&nbsp;\, m$: you must sum the elements of all continuous subsequences with length $m$ from the sequence $A_l , A_{l+1}, \dots , A_{r-1}, A_r$. Note that an element that appears in multiple subsequences must be added multiple times.</li>
</ul>

### 입력

<p>The first line of the input contains two integers, $N$ and $K$. The second line contains $N$ integers: the elements of array $A$. The third line contains an integer $Q$, the number of queries, and next $Q$ lines consists of queries, which can be one of two types described above.</p>

### 출력

<p>The output consists of the answer to the queries of type $2$, every answer on a new line.</p>

### 제한

<ul>
	<li>$0 &le; A_i &le; 10^6$</li>
	<li>$1 &le; l &le; r &le; N$</li>
	<li>$1 &le; m &le; r - l + 1$</li>
</ul>

### 힌트

<p>The first query is of type $2$ and we must calculate the sum of elements of all continuous subsequences with length $m = 4$ from sequence $(2, 5, 1, 9, 3, 4)$. These subsequences are&nbsp;$(2, 5, 1, 9)$, $(5, 1, 9, 3)$, $(1, 9, 3, 4)$, and the sum of their elements is 52.</p>

<p>The second query is of type $1$ and requires the circular permutation of elements from array $A$, situated at indexes $2$, $5$, $8$. So, the array $A$ will become $(7, 9, 5, 1, 6, 3, 4, 2)$.</p>

<p>The third query is of type $2$ and we must calculate the sum of elements of all continuous subsequences with length $m = 3$ from sequence $(9, 5, 1, 6, 3, 4)$. These subsequences are $(9, 5, 1), (5, 1, 6), (1, 6, 3), (6, 3, 4)$, and the sum of their elements is $50$.</p>