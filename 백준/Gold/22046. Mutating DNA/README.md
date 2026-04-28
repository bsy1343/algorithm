# [Gold I] Mutating DNA - 22046

[문제 링크](https://www.acmicpc.net/problem/22046)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 2048 MB

### 통계

제출: 140, 정답: 87, 맞힌 사람: 83, 정답 비율: 61.940%

### 분류

그리디 알고리즘, 누적 합

### 문제 설명

<p>Grace is a biologist working in a bioinformatics firm in Singapore. As part of her job, she analyses the DNA sequences of various organisms. A DNA sequence is defined as a string consisting of characters &quot;<code>A</code>&quot;, &quot;<code>T</code>&quot;, and &quot;<code>C</code>&quot;. Note that in this task DNA sequences <strong>do not contain character &quot;<code>G</code>&quot;</strong>.</p>

<p>We define a mutation to be an operation on a DNA sequence where two elements of the sequence are swapped. For example a single mutation can transform &quot;<code>A<strong>C</strong>T<strong>A</strong></code>&quot; into &quot;<code>A<strong>A</strong>T<strong>C</strong></code>&quot; by swapping the highlighted characters &quot;<code>A</code>&quot; and &quot;<code>C</code>&quot;.</p>

<p>The mutation distance between two sequences is the minimum number of mutations required to transform one sequence into the other, or $-1$ if it is not possible to transform one sequence into the other by using mutations.</p>

<p>Grace is analysing two DNA sequences $a$ and $b$, both consisting of $n$ elements with indices from $0$ to $n - 1$. Your task is to help Grace answer $q$ questions of the form: what is the mutation distance between the substring $a[x..y]$ and the substring $b[x..y]$? Here, a substring $s[x..y]$ of a DNA sequence $s$ is defined to be a sequence of consecutive characters of s, whose indices are $x$ to $y$ inclusive. In other words, $s[x..y]$ is the sequence $s[x]s[x + 1] \dots s[y]$.</p>

### 입력



### 출력



### 제한

<ul>
	<li>$1 \le&nbsp;n, q \le&nbsp;100\,000$</li>
	<li>$0 \le x \le y \le n - 1$</li>
	<li>Each character of $a$ and $b$ is one of &quot;<code>A</code>&quot;, &quot;<code>T</code>&quot;, and &quot;<code>C</code>&quot;.</li>
</ul>