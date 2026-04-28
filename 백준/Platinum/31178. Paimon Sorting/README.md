# [Platinum III] Paimon Sorting - 31178

[문제 링크](https://www.acmicpc.net/problem/31178)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 58, 정답: 19, 맞힌 사람: 19, 정답 비율: 33.929%

### 분류

자료 구조, 애드 혹, 세그먼트 트리

### 문제 설명

<p>Paimon just invents a new sorting algorithm which looks much like <em>bubble sort</em>, with a few differences. It accepts a $1$-indexed sequence $A$ of length $n$ and sorts it. Its pseudo-code is shown below.</p>

<p><strong>Functions 1</strong> The Sorting Algorithm</p>

<ol>
	<li><strong>function</strong> Sort($A$)</li>
	<li><strong>&nbsp; &nbsp; for</strong> $i$ &larr; $1$ to $n$ <strong>do</strong> // $n$ is the number of elements in $A$</li>
	<li><strong>&nbsp; &nbsp; &nbsp; &nbsp; for</strong> $j$ &larr; $1$ to $n$ <strong>do</strong></li>
	<li><strong>&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; if</strong> $a_i &lt; a_j$ <strong>then</strong> // $a_i$ is the $i$-th element in $A$</li>
	<li>&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; Swap $a_i$ and $a_j$</li>
</ol>

<p>If you don&#39;t believe this piece of algorithm can sort a sequence it will also be your task to prove it. Anyway here comes the question:</p>

<p>Given an integer sequence $A = a_1, a_2, \cdots, a_n$ of length $n$, for each of its prefix $A_k$ of length $k$ (that is, for each $1 \le k \le n$, consider the subsequence $A_k = a_1, a_2, \cdots, a_k$), count the number of swaps performed if we call $\text{SORT}(A_k)$.</p>

### 입력

<p>There are multiple test cases. The first line of the input contains an integer $T$ indicating the number of test cases. For each test case:</p>

<p>The first line contains an integer $n$ ($1 \le n \le 10^5$) indicating the length of the sequence.</p>

<p>The second line contains $n$ integers $a_1, a_2, \cdots, a_n$ ($1 \le a_i \le n$) indicating the given sequence.</p>

<p>It&#39;s guaranteed that the sum of $n$ of all test cases will not exceed $10^6$.</p>

### 출력

<p>For each test case output one line containing $n$ integers $s_1, s_2, \cdots, s_n$ separated by a space, where $s_i$ is the number of swaps performed if we call $\text{SORT}(A_i)$.</p>