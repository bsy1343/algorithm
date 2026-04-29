# [Platinum II] Covers - 32820

[문제 링크](https://www.acmicpc.net/problem/32820)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 2048 MB

### 통계

제출: 262, 정답: 52, 맞힌 사람: 43, 정답 비율: 22.995%

### 분류

그래프 이론, 다이나믹 프로그래밍, 데이크스트라, 문자열, 최단 경로, kmp, z

### 문제 설명

<p>You are given two strings $T$ and $P$. Your aim is to create $T$ with $P$. You first begin with an empty string. Then you can do one of three operations shown below.</p>

<ul>
	<li>Put $P$ at the end of the current string. This operation costs $0$.</li>
	<li>Put a character at the end of the current string. This operation costs $1$.</li>
	<li>Delete characters at the end of the current string and put $P$. This operation costs the number of characters you deleted.</li>
</ul>

<p>For example, assume that $T = $<code>aabaabaa</code> and $P = $<code>aaba</code>. There are two ways to create $T$ with $P$ as follows, where <code>ε</code> denotes an empty string.</p>

<ul>
	<li><code>ε</code> → <code>aaba</code> → <code>aabaa</code> → <code>aabaab</code> → <code>aabaaba</code> → <code>aabaabaa</code>, or</li>
	<li><code>ε</code> → <code>aaba</code> → <code>aab</code> → <code>aabaaba</code> → <code>aabaabaa</code>.</li>
</ul>

<p>The former costs four as it first puts $P$ (cost $0$) and four characters (a, <code>b</code>, <code>a</code>, and <code>a</code>, cost $4$). The latter costs two as it first puts $P$ (cost $0$), then deletes one character (<code>a</code>, cost $1$) and puts $P$ (cost $0$), and finally puts a character (<code>a</code>, cost $1$). We choose the latter and we can see that it has the minimum cost.</p>

<p>Given $T$ and $P$, write a program which computes the minimum cost to create $T$ with $P$.</p>

### 입력

<p>Your program is to read from standard input. The input starts with a line containing two integers, $m$ and $n$ ($1 ≤ m ≤ 100\,000$, $1 ≤ n ≤ 200\,000$), where $m$ is the length of $P$ and $n$ is that of $T$. The second line contains $P$ and the third line contains $T$. Both $P$ and $T$ are in English lower-case letters.</p>

### 출력

<p>Your program is to write to standard output. Print exactly one line. The line should contain the minimum cost to create $T$ with $P$.</p>