# [Platinum I] Julius Caesar and Kazusa - 20785

[문제 링크](https://www.acmicpc.net/problem/20785)

### 성능 요약

시간 제한: 13 초, 메모리 제한: 256 MB

### 통계

제출: 14, 정답: 4, 맞힌 사람: 4, 정답 비율: 57.143%

### 분류

자료 구조, 세그먼트 트리, 느리게 갱신되는 세그먼트 트리

### 문제 설명

<p>Have you ever heard of the Caesar cipher? It is one of the simplest and best-known encryption techniques. Named after Julius Caesar, he used this cipher to communicate with his generals.&nbsp;</p>

<p>Caesar cipher is a type of substitution cipher in which each letter in the plaintext is <em>shifted</em> a certain number of places down the alphabet. The alphabet is considered wrapped around. For example, with a shift of $1$ in the Latin alphabet, A would be replaced by B, B would become C,&nbsp;Z would be A, and so on.</p>

<p>Kazusa now has an array $a$ of integers $a_1,a_2,\dots,a_n$ of length $n$, with each $a_i$ in the range $[0,65\,536)$, and she wants to encrypt it using Caesar cipher several times. She selects an interval $[l,r](1\leq l\leq r\leq n)$ each time, and makes an encryption using Caesar cipher with shift of $1$ to the numbers in the interval. Formally, for all $l\leq i\leq r$, this transforms $a_i$ into $(a_i+1) \bmod 65\,536$.&nbsp;</p>

<p>However, while Kazusa is encrypting the array, her sister, Setsuna, raises some questions about the array. Each query asks on the current copy of the array, where zero or more encryptions using Caesar cipher has been done. Each query is given by three integers $x, y, L$, which asks whether the two strings $a_x,a_{x+1} \dots a_{x+L-1}$ and $a_y,a_{y+1} \dots a_{y+L-1}$ are same.</p>

<p>While Kazusa is busying doing the encryption, she has no time to answer these queries. Could you please help her?</p>

### 입력

<p>The first line contains two integers $n,q$ $(1 \leq n, q \leq 500\,000)$, denoting the size of the array and the number of operations, respectively. The second line contains $n$ integers $a_1,a_2,\dots,a_n$ $(0 \leq a_i &lt; 65\,536)$, denoting the initial array. The next $q$ lines describe the operations, each operation is in one of the two following types:</p>

<ul>
	<li>Operation of type 1 contains three integers $1, l, r$ $(1 \leq l \leq r \leq n)$, meaning that Kazusa made an encryption using Caesar cipher with shift $1$ to the numbers in the interval $[l,r]$;</li>
	<li>Operation of type 2 contains four integers $2, x, y, L$ $(1 \leq x, y \leq n,\max \{x,y\}+L-1 \leq n)$, meaning that Setsuna asked a query whether the two strings are the same.</li>
</ul>

### 출력

<p>For each operation of type 2, if the two strings are same, please print <code>yes</code> in one line; otherwise print <code>no</code>.</p>

### 힌트

<p>The first test case is explained below.</p>

<table class="table table-bordered th-center td-center">
	<thead>
		<tr>
			<th>Operation</th>
			<th>Array</th>
			<th>Description</th>
		</tr>
	</thead>
	<tbody>
		<tr>
			<td>1</td>
			<td><code>[1,2,1,2,1]</code></td>
			<td><code>[1,2]</code> and <code>[2,1]</code> are different</td>
		</tr>
		<tr>
			<td>2</td>
			<td><code>[1,2,1,2,1]</code></td>
			<td><code>[1,2,1]</code> and <code>[1,2,1]</code> are same</td>
		</tr>
		<tr>
			<td>3</td>
			<td><code>[2,2,1,2,1]</code></td>
			<td>the first element is shifted by one</td>
		</tr>
		<tr>
			<td>4</td>
			<td><code>[2,2,2,3,2]</code></td>
			<td>the third to the fifth elements are shifted by one</td>
		</tr>
		<tr>
			<td>5</td>
			<td><code>[2,2,2,3,2]</code></td>
			<td><code>[2,2,2,3]</code> and <code>[2,2,3,2]</code> are different</td>
		</tr>
		<tr>
			<td>6</td>
			<td><code>[2,2,2,3,2]</code></td>
			<td><code>[2,2]</code> and <code>[2,2]</code> are same</td>
		</tr>
	</tbody>
</table>