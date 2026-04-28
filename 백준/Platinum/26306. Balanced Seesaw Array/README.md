# [Platinum I] Balanced Seesaw Array - 26306

[문제 링크](https://www.acmicpc.net/problem/26306)

### 성능 요약

시간 제한: 3 초 (추가 시간 없음), 메모리 제한: 1024 MB

### 통계

제출: 169, 정답: 44, 맞힌 사람: 35, 정답 비율: 23.810%

### 분류

자료 구조, 세그먼트 트리, 느리게 갱신되는 세그먼트 트리

### 문제 설명

<p>Bob likes to play seesaw. He thinks that it would be really funny if the seesaw is in a balanced state. It means that the seesaw is not tilted to the left and right. After playing the seesaw, Bob thinks about a problem related to the balanced seesaw.</p>

<p>Let $A = [a_1, a_2, \dots , a_m]$ denote an array of length $m$. Bob thinks that $[a_1, a_2, \dots , a_m]$ is a <em>balanced seesaw array</em> if there exists an integer $k$ between $1$ to $m$ such that $\sum_{i=1}^{m}{(i-k)a_i} = 0$.</p>

<p>Bob gets an array $A = [a_1, a_2, \dots , a_n]$ as his birthday gift, and he is curious about whether some non-empty subarray is a <em>balanced seesaw array</em>. More formally, he is interested in whether $[a_ℓ , a_{ℓ+1}, \dots , a_r]$ is a <em>balanced seesaw array</em> for some specified pair $(ℓ, r)$ where $1 &le; ℓ &le; r &le; n$. Bob also finds that the elements in its array will change by time, it will have the following two types of changes.</p>

<ol>
	<li>$a_ℓ , a_{ℓ+1}, \dots , a_r$ are increased by $x$.</li>
	<li>$a_ℓ , a_{ℓ+1}, \dots , a_r$ are changed to $x$.</li>
</ol>

<p>For convenience, Bob will give you the array $A = [a_1, a_2, \dots , a_n]$ first. Then, there are $q$ operations. Each operation will be one of the following three types.</p>

<ul>
	<li>$1$ $ℓ$ $r$ $x$: means that $a_ℓ , a_{ℓ+1}, \dots , a_r$ are increased by $x$.</li>
	<li>$2$ $ℓ$ $r$ $x$: means that $a_ℓ , a_{ℓ+1}, \dots , a_r$ are changed to $x$.</li>
	<li>$3$ $ℓ$ $r$: means that Bob is curious about whether the subarray $[a_ℓ , a_{ℓ+1}, \dots , a_r]$ is a <em>balanced seesaw array</em>. You should output &ldquo;<code>Yes</code>&rdquo; or &ldquo;<code>No</code>&rdquo; for each operation type 3.</li>
</ul>

### 입력

<p>The first line of input contains two integers $n$ and $q$. $n$ is the length of the array, and $q$ is the number of operations. The second line contains $n$ integers $a_i$ to define the array. Each of the following $q$ lines is an operation described in the problem statement.</p>

### 출력

<p>Please output &ldquo;<code>Yes</code>&rdquo; or &ldquo;<code>No</code>&rdquo; to indicate whether $[a_ℓ , a_{ℓ+1}, \dots , a_r]$ is a <em>balanced seesaw array</em> for each type 3 operation.</p>

### 제한

<ul>
	<li>$1 &le; n &le; 100000$</li>
	<li>$1 &le; q &le; 1200000$</li>
	<li>$-1000 &le; a_i &le; 1000$</li>
	<li>$-10000 &le; x &le; 10000$</li>
	<li>For $1 &le; i &le; n$, you may assume that $|a_i | &le; 1.5 &times; 10^9$ after any operation.</li>
	<li>$1 &le; ℓ &le; r &le; n$</li>
</ul>