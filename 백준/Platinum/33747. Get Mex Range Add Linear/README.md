# [Platinum III] Get Mex Range Add Linear - 33747

[문제 링크](https://www.acmicpc.net/problem/33747)

### 성능 요약

시간 제한: 4 초, 메모리 제한: 2048 MB

### 통계

제출: 5, 정답: 5, 맞힌 사람: 5, 정답 비율: 100.000%

### 분류

세그먼트 트리, 이분 탐색, 자료 구조

### 문제 설명

<p>Sorry, we have had the theme of adding up integers so many times elsewhere. So we give you a different definition of addition --- adding an element to a set.</p>

<p>You are given $a$, a sequence of $n$ sets. Initially, $a_i=\left\{ 0 \right\}$ (set only containing $0$) for all $1 \le i \le n$.</p>

<p>You are asked to solve $q$ queries of the following kinds.</p>

<ul>
	<li>$1$ $l$ $r$: Set $a_i \leftarrow a_i \cup \left\{i-l+1\right\}$ for all $l \le i \le r$. ($1 \le l \le r \le n$)</li>
	<li>$2$ $i$: Output the value of $\text{mex}(a_i)$$^\dagger$. ($1 \le i \le n$)</li>
</ul>

<p>$^\dagger$ Given a set of nonnegative integers $S$, $\text{mex}(S)$ is defined as the smallest nonnegative integer <strong>not</strong> in $S$.</p>

### 입력

<p>The first line contains two integers $n$ and $q$ --- the number of sets and queries. ($1 \le n,q \le 5\cdot 10^5$)</p>

<p>Each of the $q$ following lines contains a query. Each query is given in the format described above.</p>

### 출력

<p>For each query of type $2$, print the answer on a new line.</p>

### 힌트

<p>The sample input is explained as follows.</p>

<p>After the first query of type $1$, $a$ changes to $[\left\{ 0,1 \right\},\left\{ 0,2 \right\},\left\{ 0,3 \right\},\left\{ 0,4 \right\},\left\{ 0,5 \right\}]$.</p>

<p>Then, the $\text{mex}$ of $\left\{ 0,1 \right\}$ and $\left\{ 0,5 \right\}$ are $2$ and $1$ correspondingly.</p>

<p>After three more queries of type $1$, $a$ changes to $[\left\{ 0,1 \right\},\left\{ 0,1,2 \right\},\left\{ 0,1,2,3 \right\},\left\{ 0,1,4 \right\},\left\{ 0,2,5 \right\}]$.</p>

<p>Then, the $\text{mex}$ of $\left\{ 0,1,2 \right\}$, $\left\{ 0,1,2,3 \right\}$, $\left\{ 0,1,4 \right\}$ are $3$, $4$, $2$ correspondingly.</p>