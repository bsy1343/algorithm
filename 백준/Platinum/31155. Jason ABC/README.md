# [Platinum IV] Jason ABC - 31155

[문제 링크](https://www.acmicpc.net/problem/31155)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 92, 정답: 35, 맞힌 사람: 25, 정답 비율: 36.232%

### 분류

해 구성하기, 많은 조건 분기, 두 포인터

### 문제 설명

<p>You are given a string $S$ of length $3n$, consisting of the characters <code>A</code>, <code>B</code> and <code>C</code>. You are allowed to perform the following operation:</p>

<ul>
	<li>Select some subsegment of this string and a character $c$ (one of <code>A</code>, <code>B</code> and <code>C</code>). Then, replace all the characters on the subsegment with $c$.</li>
</ul>

<p>Find the smallest number of times that you would have to apply the operation above to get a string which contains each of characters <code>A</code>, <code>B</code> and <code>C</code> exactly $n$ times. It can be shown that it is always possible to get such a string.</p>

<p>In addition, find a sequence of operations of the smallest possible length. If there are many such sequences, you can output any of them.</p>

### 입력

<p>The first line of input contains a single integer $n$ ($1 \le n \le 3 \cdot 10^5$).</p>

<p>The second line of the input contains a string $S$ of length $3n$, consisting of the characters <code>A</code>, <code>B</code> and <code>C</code>.</p>

### 출력

<p>In the first line print the minimum number of operations $k$.</p>

<p>In the $i$-th of the next $k$ lines print $2$ integers $l_i, r_i$ and a character $c_i$ ($1 \le l_i \le r_i \le 3n$, $c_i \in \{$<code>A</code>, <code>B</code>, <code>C</code>$\}$), denoting that in the $i$-th operation you will replace each of the characters $S_{l_i}, S_{l_i+1}, \ldots, S_{r_i}$ with $c_i$.</p>

<p>If there is more than one solution with a minimum number of operations, you can print any one of them.</p>

### 힌트

<p>In the first sample, the string will undergo the following transformations:</p>

<p><code>AAA</code> $\to$ <code>ABB</code> $\to$ <code>ABC</code>.</p>

<p>In the second sample, the string already contains exactly one <code>A</code>, one <code>B</code> and one <code>C</code>.</p>

<p>In the third sample, the string will undergo the following transformation:</p>

<p><code>ABABCABAB</code> $\to$ <code>CCABCABAB</code>. Now, it contains each letter $3$ times.</p>