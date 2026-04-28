# [Gold V] Flexible Segments - 19735

[문제 링크](https://www.acmicpc.net/problem/19735)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 512 MB

### 통계

제출: 59, 정답: 26, 맞힌 사람: 25, 정답 비율: 48.077%

### 분류

애드 혹, 해 구성하기, 수학

### 문제 설명

<p>A great mathematician Vladimir Germanovich has noticed an interesting property of some segments of positive integers while exploring them for new patterns.</p>

<p>Vladimir calls the segment of positive integers $l, l + 1, \ldots, r$ <em>flexible</em> if he is able to change every number of this segment by exactly one in such way, that the product of numbers on this segment doesn&#39;t change. That is, there exists a sequence $a_l, a_{l+1}, \ldots, a_r$ with the following properties:</p>

<ul>
	<li>$a_k = k \pm 1$</li>
	<li>$l \cdot (l+1)\cdot \ldots \cdot r = a_l \cdot a_{l+1} \cdot \ldots \cdot a_r$</li>
</ul>

<p>Now Vladimir Germanovich wants to know if he is able to build flexible segment of any length. Given positive integer $n$ find any flexible segment that consists of $n$ consecutive positive integers or tell that there is no such segment.</p>

### 입력

<p>The only line contains an integer $n$ ($1 \le n \le 10\,000$) --- the length of required segment.</p>

### 출력

<p>The first line of output must contain &quot;<code>YES</code>&quot; if there exists a flexible segment of $n$ positive integers. Otherwise it must contain &quot;<code>NO</code>&quot;.</p>

<p>If such segment exists the second and the third lines must contain the description of this segment.</p>

<p>The second line should contain the only integer $l$ ($1 \le l \le 1\,000\,000$) --- the first element of this segment. It is guaranteed that if a flexible segment of length $n$ exists then there exists a flexible segment $[l; r]$ of length $n$ such that $1 \le l \le 1\,000\,000$.</p>

<p>The third line should contain a string of length $n$ without spaces. It must consist of &quot;<code>+</code>&quot; and &quot;<code>-</code>&quot; characters, the $(k-l+1)$-th character of this string should be &quot;<code>-</code>&quot; if $a_k = k - 1$, or &quot;<code>+</code>&quot; if $a_k = k + 1$.</p>

### 힌트

<p>In the second example $n = 4$, $l = 2$, $r = l + n - 1 = 5$. The answer is the following: $a_2 = 2 - 1 = 1$, $a_3 = 3 + 1 = 4$, $a_4 = 4 + 1 = 5$, $a_5 = 5 + 1 = 6$. The product of integers from $l$ to $r$ is $2 \cdot 3 \cdot 4 \cdot 5 = 120$. The product of $a_k$ is $a_2 \cdot a_3 \cdot a_4 \cdot a_5 = 1 \cdot 4 \cdot 5 \cdot 6 = 120$. Thus, the segment $[2; 5]$ is flexible.</p>