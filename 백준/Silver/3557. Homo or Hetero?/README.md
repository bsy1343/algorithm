# [Silver I] Homo or Hetero? - 3557

[문제 링크](https://www.acmicpc.net/problem/3557)

### 성능 요약

시간 제한: 3 초, 메모리 제한: 256 MB

### 통계

제출: 136, 정답: 66, 맞힌 사람: 45, 정답 비율: 52.941%

### 분류

자료 구조, 집합과 맵, 해시를 사용한 집합과 맵, 트리를 사용한 집합과 맵

### 문제 설명

<p>Consider a list of numbers with two operations:</p>

<ul>
	<li><code>insert number</code> --- adds the specified number to the end of&nbsp; the list.</li>
	<li><code>delete number</code> --- removes the first occurrence of&nbsp; the specified number from the list. If the list does not contain the number specified, no changes are performed.</li>
</ul>

<p>For example: the result of the insertion of a number 4 to the list $[1, 2, 1]$ is the list $[1, 2, 1, 4]$. If we delete the number $1$ from this list, we get the list $[2, 1, 4]$, but if we delete the number $3$ from the list $[1, 2, 1, 4]$, the list stays unchanged.</p>

<p>The list is <em>homogeneous</em> if it contains at least two equal numbers and the list is <em>heterogeneous</em> if it contains at least two different numbers. For example: the list $[2, 2]$ is homogeneous, the list $[2, 1, 4]$ is heterogeneous, the list $[1, 2, 1, 4]$ is both, and the empty list is neither homogeneous nor heterogeneous.</p>

<p>Write a program that handles a number of the operations <code>insert</code> and <code>delete</code> on the empty list and determines list&#39;s homogeneity and heterogeneity after each operation.&nbsp;</p>

### 입력

<p>The first line of the input file contains an integer number $n$ --- the number of operations to handle ($1 \le n \le 100\,000$).</p>

<p>Following $n$ lines contain one operation description each. The operation description consists of a word <code>insert</code> or <code>delete</code>, followed by an integer number $k$ --- the operation argument ($-10^9 \le k \le 10^9$).</p>

### 출력

<p>For each operation output a line, containing a single word, describing the state of the list after the operation:</p>

<ul>
	<li><code>both</code> &nbsp; &nbsp;--- if the list is both homogeneous and heterogeneous.</li>
	<li><code>homo</code> &nbsp; &nbsp;--- if the list is homogeneous, but not heterogeneous.</li>
	<li><code>hetero</code> &nbsp;--- if the list is heterogeneous, but not homogeneous.</li>
	<li><code>neither</code> --- if the list is neither homogeneous nor heterogeneous.</li>
</ul>