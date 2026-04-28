# [Platinum IV] Superpermutations - 19727

[문제 링크](https://www.acmicpc.net/problem/19727)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 512 MB

### 통계

제출: 3, 정답: 3, 맞힌 사람: 2, 정답 비율: 100.000%

### 분류

자료 구조, 세그먼트 트리

### 문제 설명

<p>Once, during his informatics class, Dima had solved all the problems about permutations. Then he came up with a problem about a <em>superpermutation</em>.</p>

<p>A <em>superpermutation</em> of order $n$ is a sequence of integers from $1$ to $n$, such that every permutation of numbers from $1$ to $n$ occurs as a continuous subsegment in this sequence.</p>

<p>Dima quickly came up with an algorithm for generating superpermutations:</p>

<ul>
	<li>$s_1 = [1]$.</li>
	<li>Initially, set $s_{n+1}$ equal to $s_n$.</li>
	<li>Consider all subsegments of $s_n$ of length $n$ from left to right, in order of increasing of their beginning.</li>
	<li>If a current subsegment $s_n[l, l+1, \ldots, l+n-1]$ is a permutation of numbers from $1$ to $n$ (that means that every number from $1$ to $n$ occurs exactly once), then insert numbers $n + 1, s_n[l], s_n[l + 1], \ldots, s_n[l+n-1]$ into $s_{n+1}$ right after the last element $s_n[l+n-1]$ of the corresponding subsegment.</li>
</ul>

<p>Let&#39;s take a look at how to construct superpermutations of order $1$, $2$, $3$ and $4$:</p>

<p>By definition, $s_1 = [ 1 ]$.</p>

<p>Set $s_2 = [ 1 ]$. Consider the only subsegment of length $1$ in $s_1$: $[1]$ is a permutation, so we insert $[2, 1]$ into $s_2$ after it. The result is $s_2 = [1, \mathbf{2, 1}]$.</p>

<p>Set $s_3 = [ 1, 2, 1 ]$. Consider all subsegments of length $2$ in $s_2$. $[1, 2]$ is a permutation, after inserting $[3, 1, 2]$, we get $s_3 = [1, 2, \mathbf{3, 1, 2}, 1]$. $[2, 1]$ is also a permutation, so we insert $[3, 2, 1]$ into $s_3$, we get $s_3 = [1, 2, 3, 1, 2, 1, \mathbf{3, 2, 1}]$.</p>

<p>Initially, set $s_4 = [ 1, 2, 3, 1, 2, 1, 3, 2, 1]$. Consider all subsegments of length $3$ in $s_3$:</p>

<ul>
	<li>$[1, 2, 3]$ is a permutation, so we insert $[4, 1, 2, 3]$ after it. Now $s_4 = [ 1, 2, 3, \mathbf{4, 1, 2, 3}, 1, 2, 1, 3, 2, 1]$.</li>
	<li>$[2, 3, 1]$ is a permutation, so we insert $[4, 2, 3, 1]$ after it. Now $s_4 = [ 1, 2, 3, 4, 1, 2, 3, 1, \mathbf{4, 2, 3, 1}, 2, 1, 3, 2, 1]$.</li>
	<li>$[3, 1, 2]$ is a permutation, so we insert $[4, 3, 1, 2]$ after it. Now $s_4 = [ 1, 2, 3, 4, 1, 2, 3, 1, 4, 2, 3, 1, 2, \mathbf{4, 3, 1, 2}, 1, 3, 2, 1]$.</li>
	<li>$[1, 2, 1]$ is not a permutation, so nothing happens here, we continue with the next subsegment.</li>
	<li>$[2, 1, 3]$ is a permutation, so we insert $[4, 2, 1, 3]$ after it. Now $s_4 = [ 1, 2, 3, 4, 1, 2, 3, 1, 4, 2, 3, 1, 2, 4, 3, 1, 2, 1, 3, \mathbf{4, 2, 1, 3}, 2, 1]$. \item We do the same with two remaining permutations of length 3: $[1, 3, 2]$ and $[3, 2, 1]$.</li>
</ul>

<p>Dima noticed that he came up with a pretty efficient way of constructing a superpermutation, because every permutation occurs exactly once. To make sure he did not make a mistake, Dima wants to find a position where a given permutation $a_1, \dots, a_n$ occurs in his superpermutation $s_n$. Positions are numbered starting with 1.</p>

<p>Since the length of $s_n$ is huge, you need to find the index of the first element of $s_n$ from which the occurrence of the given permutation starts, modulo $10^9 + 7$.</p>

### 입력

<p>The first line contains a single integer $n$ --- the length of the permutation ($1 \le n \le 300\,000$).</p>

<p>The second line contains $n$ integers $a_1, a_2, \ldots, a_n$ --- the given permutation ($1 \le a_i \le n$, all $a_i$ are different).</p>

### 출력

<p>Output a single integer --- the position of the occurrence of the permutation $a_1, a_2, \ldots, a_n$ in the superpermutation of order $n$, modulo $10^9+7$.</p>