# [Silver I] Longest Contiguous Subsequence - 6042

[문제 링크](https://www.acmicpc.net/problem/6042)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 125, 정답: 90, 맞힌 사람: 81, 정답 비율: 72.973%

### 분류

다이나믹 프로그래밍, 브루트포스 알고리즘

### 문제 설명

<p>Bessie&#39;s friend Jessie wanted to enter a programming contest. &quot;What are the tasks like?&quot; she asked.</p>

<p>Bessie, known to be knowledgeable about so many things, said &quot;Here is a typical problem that folks solve early in their competitive career. See if you can solve it.&quot;</p>

<p>Perhaps you can solve it, too.</p>

<p>You are given two sequences of integers, S1 and S2. S1 has length L1 (1 &lt;= L1 &lt;= 180) and S2 has length L2 (1 &lt;= L2 &lt;= 180). Your job is to print out the length of the longest contiguous subsequence of numbers common to both S1 and S2. Ordered sequence S1 has elements S1_1, S1_2, ..., S1_L1 (-100 &lt;= S1_i &lt;= 100); S2 has elements S2_i (-100 &lt;= S2_i &lt;= 100).</p>

<p>A contiguous subsequence is a consecutive run of numbers in that sequence. The subsequences of 1 2 3 1 are: the empty sequence, &quot;1&quot;, &quot;1 2&quot;, &quot;1 2 3&quot;, &quot;1 2 3 1&quot;, &quot;2&quot;, &quot;2 3&quot;, &quot;2 3 1&quot;, &quot;3&quot;, &quot;3 1&quot;, and a repeat occurrence of &quot;1&quot;.</p>

### 입력

<ul>
	<li>Line 1: Two space-separated integers: L1 and L2</li>
	<li>Lines 2..L1+1: Line i+1 contains a single integer: S1_i</li>
	<li>Lines L1+2..L1+L2+1: Line L1+i+1 contains a integer: S2_i</li>
</ul>

<p>&nbsp;</p>

### 출력

<ul>
	<li>Line 1: A single integer, the length of the longest contiguous subsequence of S1 and S2</li>
</ul>

<p>&nbsp;</p>

### 힌트

<p>Corresponds to the contiguous subsequence 1,1,1,3,2,3,3.</p>

<p>&nbsp;</p>