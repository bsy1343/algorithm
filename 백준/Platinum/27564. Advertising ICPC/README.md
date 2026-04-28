# [Platinum III] Advertising ICPC - 27564

[문제 링크](https://www.acmicpc.net/problem/27564)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 80, 정답: 27, 맞힌 사람: 23, 정답 비율: 45.098%

### 분류

다이나믹 프로그래밍, 비트마스킹, 비트필드를 이용한 다이나믹 프로그래밍

### 문제 설명

<p>You&#39;re making a flag to try to advertise ICPC! The flag takes the form of a grid that is already filled with some &quot;<code>C</code>&quot;, &quot;<code>I</code>&quot;, and &quot;<code>P</code>&quot; letters. A flag is <em>advertising ICPC</em> if there exists at least one $2 \times 2$ subgrid that looks exactly like the following:</p>

<pre>
IC
PC</pre>

<p>The flag cannot be rotated or reflected. Every square in the grid must be filled with either a &quot;<code>C</code>&quot;, &quot;<code>I</code>&quot;, or &quot;<code>P</code>&quot;. Count the number of ways to fill the unfilled locations on the flag such that the flag is advertising ICPC.</p>

### 입력

<p>The first line contains two integers, $n$ and $m$ $(2 \le n, m \le 8)$, where $n$ is the number of rows and $m$ is the number of columns in the grid.</p>

<p>The next $n$ lines each contains a string of length $m$. Each character in the string is either a &quot;<code>C</code>&quot;, &quot;<code>I</code>&quot;, &quot;<code>P</code>&quot;, or &quot;<code>?</code>&quot;. A &quot;<code>?</code>&quot; means that that location is not yet filled with a letter.</p>

<p>These $n$ lines form the grid that represents the flag.</p>

### 출력

<p>Output a single integer, which is the number of ways to fill the flag such that it is advertising ICPC, modulo $998\,244\,353$.</p>