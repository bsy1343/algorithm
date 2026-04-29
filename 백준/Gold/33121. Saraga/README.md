# [Gold IV] Saraga - 33121

[문제 링크](https://www.acmicpc.net/problem/33121)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 2048 MB

### 통계

제출: 101, 정답: 70, 맞힌 사람: 45, 정답 비율: 69.231%

### 분류

그리디 알고리즘, 문자열

### 문제 설명

<p>The word <em>saraga</em> is an abbreviation of <em>sarana olahraga</em>, an Indonesian term for a sports facility. It is created by taking the prefix <code>sara</code> of the word <code>sarana</code> and the suffix <code>ga</code> of the word olahraga. Interestingly, it can also be created by the prefix <code>sa</code> of the word <code>sarana</code> and the suffix <code>raga</code> of the word <code>olahraga</code>.</p>

<p>An abbreviation of two strings $S$ and $T$ is <em>interesting</em> if there are at least two different ways to split the abbreviation into two <strong>non-empty</strong> substrings such that the first substring is a prefix of $S$ and the second substring is a suffix of $T$.</p>

<p>You are given two strings $S$ and $T$. You want to create an interesting abbreviation of strings $S$ and $T$ with minimum length, or determine if it is impossible to create an interesting abbreviation.</p>

### 입력

<p>The first line consists of a string $S$ ($1 ≤ |S| ≤ 200\, 000$).</p>

<p>The second line consists of a string $T$ ($1 ≤ |T| ≤ 200\, 000$).</p>

<p>Both strings $S$ and $T$ only consist of lowercase English letters.</p>

### 출력

<p>If it is impossible to create an interesting abbreviation, output <code>-1</code>.</p>

<p>Otherwise, output a string in a single line representing an interesting abbreviation of strings $S$ and $T$ with minimum length. If there are multiple solutions, output any of them.</p>