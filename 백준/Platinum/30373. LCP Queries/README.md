# [Platinum I] LCP Queries - 30373

[문제 링크](https://www.acmicpc.net/problem/30373)

### 성능 요약

시간 제한: 2.5 초, 메모리 제한: 1024 MB

### 통계

제출: 27, 정답: 12, 맞힌 사람: 11, 정답 비율: 44.000%

### 분류

자료 구조, 문자열, 트리, 이분 탐색, 누적 합, 해싱, 트라이, 접미사 배열과 LCP 배열

### 문제 설명

<p>A string $x$ is called a <em>prefix</em> of a string $y$ if $x$ can be obtained by repeating the removal of the last letter of $y$ zero or more times. For example, &ldquo;<code>abac</code>&rdquo;, &ldquo;<code>aba</code>&rdquo;, &ldquo;<code>ab</code>&rdquo;, &ldquo;<code>a</code>&rdquo;, and an empty string are the prefixes of &ldquo;<code>abac</code>&rdquo;.</p>

<p>For two strings $x$ and $y$, let $\text{LCP}(x, y)$be the length of the longest common prefix of $x$ and $y$. For example, $\text{LCP}($&quot;<code>abacab</code>&quot;$, $&quot;<code>abacbba</code>&quot;$) = 4$ because the longest common prefix of these two strings is &ldquo;<code>abac</code>&rdquo;. Note that $\text{LCP}(x, y)$ is always defined for any strings $x$ and $y$ because at least an empty string is one of their common prefixes.</p>

<p>You are given $n$ strings $s_!, \dots, s_n$ and $m$ strings $t_1, \dots, t_m$ of lowercase English letters. Then, you are given $q$ queries. In each query you are given an integer sequence $a_1, \dots, a_k$. Let $u$ be the concatenation of $t_{a_1}, \dots, t_{a_k}$. Your task is to calculate $\sum_{i=1}^{n}{\text{LCP}(u, s_i)}$.</p>

### 입력

<p>The input consists of a single test case of the following format.</p>

<blockquote>
<p>$n$</p>

<p>$s_1$</p>

<p>$\vdots$</p>

<p>$s_n$</p>

<p>$m$</p>

<p>$t_1$</p>

<p>$\vdots$</p>

<p>$t_m$</p>

<p>$q$</p>

<p>$\text{query}_1$</p>

<p>$\vdots$</p>

<p>$\text{query}_q$</p>
</blockquote>

<p>The first line consists of an integer $n$. Each of the next $n$ lines consists of a non-empty string $s_i$ of lowercase English letters. The next line consists of an integer $m$. Each of the next $m$ lines consists of a non-empty string $t_j$ of lowercase English letters.</p>

<p>The next line consists of an integer $q$. Then $q$ queries are given in order. Each of the queries is given in a single line in the following format.</p>

<blockquote>
<p>$k$ $a_1$ $\cdots$ $a_k$</p>
</blockquote>

<p>$k$ is a positive integer which represents the length of the integer sequence of this query. Each $a_i$ is an integer between $1$ and $m$, inclusive.</p>

<p>You can assume that $1 \le n \le 200\,000$, $1 \le m \le 200\,000$ and $1 \le q \le 200\,000$. The sum of lengths of $s_i$ does not exceed $200\,000$. Similarly, the sum of lengths of $t_i$ does not exceed $200\,000$. The sum of $k$ over all queries does not exceed $200\,000$.</p>

### 출력

<p>Output $q$ lines. The $i$-th line should be the answer to the $i$-th query.</p>