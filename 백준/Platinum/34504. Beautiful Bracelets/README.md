# [Platinum II] Beautiful Bracelets - 34504

[문제 링크](https://www.acmicpc.net/problem/34504)

### 성능 요약

시간 제한: 1 초 (추가 시간 없음), 메모리 제한: 256 MB (추가 메모리 없음)

### 통계

제출: 8, 정답: 5, 맞힌 사람: 4, 정답 비율: 57.143%

### 분류

해 구성하기

### 문제 설명

<p>Busy Beaver has collected some pairs of seashells, and he is trying to make them into two beautiful bracelets!</p>

<p>He has $N$ pairs of seashells, where both seashells in the $i$-th pair have type $a_i$. He wants to make two bracelets, such that each bracelet has one seashell from each pair. Busy Beaver decides his own metric for a beautiful pair of bracelets, which is minimizing the length of the longest common subsequence<sup>1</sup> between two bracelets.</p>

<p>Formally, let $s$ and $t$ be two permutations of the original array $a$. We want to find $(s,t)$ that minimizes the length of the longest cyclic common subsequence, $f(s,t)$, defined by the following:</p>

<ul>
	<li>Consider all cyclic shifts of array $t$, denoted as $t_1,t_2,\dots,t_n$<sup>2</sup>.</li>
	<li>Let $\text{LCS}(s,t)$ be the length of the Longest Common Subsequence between $s$ and $t$. Then $$f(s,t) = \max_{1\le i \le n}\text{LCS}(s,t_i).$$</li>
</ul>

<p>Unfortunately, Busy Beaver has too many seashells to find the most beautiful bracelet pairs by hand. Please help him!</p>

<hr>
<p><sup>1</sup>An array $s$ is a <em>subsequence</em> of an array $t$ if $s$ can be obtained from $t$ by deleting some (possibly none or all) elements from $t$, without reordering the remaining elements.</p>

<p><sup>2</sup>A <em>cyclic shift</em> $t_i$ of an array $t=[t^{(1)},t^{(2)},\dots,t^{(n)}]$ by $i$ places is given by $[t^{(1+i)},t^{(2+i)},\dots,t^{(n+i)}]$, where indices are taken modulo $n$.</p>

### 입력

<p>Each test contains multiple test cases. The first line of input contains a single integer $T$ $(1\le T\le 500)$, the number of test cases. The description of each test case follows.</p>

<p>The first line of each test case contains a single positive integer $N$ $(1\le N\le 500)$.</p>

<p>The second line of each test case contains $N$ integers $a_1,a_2,\dots, a_N$ $(1\le a_i\le 10^9)$ --- the types of seashells Busy Beaver has collected.</p>

<p>It is guaranteed that the sum of $N$ across all test cases does not exceed $500$.</p>

### 출력

<p>For each test case, output two lines. The first line consists of $N$ integers $s_1,s_2,\dots,s_N$, and the second line consists of $N$ integers $t_1,t_2,\dots,t_N$, representing some $(s,t)$ that minimizes $f(s,t)$.</p>

<p>If there are multiple solutions, print any of them.</p>

### 힌트

<p>Note that $f([1,2,3],[1,3,2])$ is $2$ because $\text{LCS}([1,2,3],[1,3,2]) = 2$ ($[1,2]$ is a shared subsequence). This is the maximum $\text{LCS}$ over all cyclic shifts of $t$:</p>

<ul>
	<li>$\text{LCS}([1,2,3],[1,3,2]) = 2$ ($[1,2]$ is a shared subsequence).</li>
	<li>$\text{LCS}([1,2,3],[3,2,1]) = 1$ ($[1]$ is a shared subsequence).</li>
	<li>$\text{LCS}([1,2,3],[2,1,3]) = 2$ ($[2,3]$ is a shared subsequence).</li>
</ul>

<p>It can be shown that there are no $s$ and $t$ that are permutations of $[1,2,3]$, such that $f(s,t) \le 1$.</p>