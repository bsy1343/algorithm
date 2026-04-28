# [Platinum V] Right Expansion Of The Mind - 19827

[문제 링크](https://www.acmicpc.net/problem/19827)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 12, 정답: 10, 맞힌 사람: 10, 정답 비율: 100.000%

### 분류

자료 구조, 문자열, 애드 혹, 집합과 맵, 비트마스킹

### 문제 설명

<p>One day $n$ people decided to expand their mind.</p>

<p>Initially, the mind of the $i$-th person is two strings $s_i$ and $t_i$ consisting of lowercase English letters. After the expansion, the mind of the person becomes an infinite to the right string $w_i=s_i+t_i+t_i+\cdots$. That is, $w_i$ is a concatenation of $s_i$ and the infinite number of $t_i$. For example, if $s_i=\text{mi}$ and $t_i=\text{nd}$, the corresponding $w_i=\text{mindndndnd}\dots$.</p>

<p>Two persons with expanded mind are <em>interested</em> in each other, if the mind of the first person forms a subsequence of the mind of the second person, and the mind of the second person forms a subsequence of the mind of the first person. The infinite string $a$ is called a subsequence of the infinite string $b$ if there is an infinite sequence of indices $1 \leq i_1 &lt; i_2 &lt; i_3 &lt; \ldots$, such that for each $j$ it is $a_j=b_{i_j}$. For example, the infinite string &quot;<code>baaa</code>$\dots$&quot; is a subsequence of an infinite string &quot;<code>cabababab</code>$\dots$&quot;.</p>

<p>After having the mind expanded, people decided to split into groups in such way, that any two persons in one group are interested in each other. Your task is to split them into the groups, so that the number of groups is minimal possible.</p>

### 입력

<p>The first line contains one integer $n$ --- the number of people that have decided to get their mind expanded ($1 \le n \le 100\,000$).</p>

<p>Each of the following $n$ lines contains two non-empty strings $s_i$ and $t_i$, consisting of lowercase English letters. They represent the minds of every person before the mind expansion.</p>

<p>It is guaranteed that the total length of all strings doesn&#39;t exceed $1\,000\,000$.</p>

### 출력

<p>The first line must contain one integer --- the minimum number of groups.</p>

<p>Then print each group in the following way: first print the number of people in this group and then the indices of them.</p>

<p>Each of the indices must be printed exactly once. The groups and indices of the people in the group can be printed in any order. If there are multiple ways to split the people, you can print any of them.</p>

### 힌트

<p>In the first example the expanded minds of the people look as follows:</p>

<ul>
	<li>&quot;<code>abababab</code>$\ldots$&quot;</li>
	<li>&quot;<code>abababab</code>$\ldots$&quot;</li>
	<li>&quot;<code>aabbabbabb</code>$\ldots$&quot;</li>
	<li>&quot;<code>xyyyyyy</code>$\ldots$&quot;</li>
	<li>&quot;<code>zwwwwww</code>$\ldots$&quot;</li>
</ul>

<p>Neither person $4$ nor $5$ are interested in anybody else. However, the first three people show pairwise interest in each other. Hence it is possible to have the groups $\{1,2,3\}$, $\{4\}$, $\{5\}$.</p>