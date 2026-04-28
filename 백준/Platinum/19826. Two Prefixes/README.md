# [Platinum I] Two Prefixes - 19826

[문제 링크](https://www.acmicpc.net/problem/19826)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 512 MB

### 통계

제출: 11, 정답: 6, 맞힌 사람: 6, 정답 비율: 100.000%

### 분류

문자열, z

### 문제 설명

<p>Misha didn&#39;t do his math homework for today&#39;s lesson once again. As a punishment, his teacher Dr. Andrew decided to give him a hard, but very useless task.</p>

<p>Dr. Andrew has written two strings $s$ and $t$ of lowercase English letters at the blackboard. He reminded Misha that <em>prefix</em> of a string is a string formed by removing several (possibly none) of its last characters, and a <em>concatenation</em> of two strings is a string formed by appending the second string to the right of the first string.</p>

<p>The teacher asked Misha to write down on the blackboard all strings that are the concatenations of some non-empty prefix of $s$ and some non-empty prefix of $t$. When Misha did it, Dr. Andrew asked him how many distinct strings are there. Misha spent almost the entire lesson doing that and completed the task.&nbsp;</p>

<p>Now he asks you to write a program that would do this task automatically.</p>

### 입력

<p>The first line contains the string $s$ consisting of lowercase English letters. The second line contains the string $t$ consisting of lowercase English letters.</p>

<p>The lengths of both string do not exceed $10^5$.</p>

### 출력

<p>Output a single integer --- the number of distinct strings that are concatenations of some non-empty prefix of $s$ with some non-empty prefix of $t$.</p>

### 힌트

<p>In the first example, the string $s$ has three non-empty prefixes: {<code>a</code>, <code>ab</code>, <code>aba</code>}. The string $t$ has two non-empty prefixes: {<code>a</code>, <code>aa</code>}. In total, Misha has written five distinct strings: {<code>aa</code>, <code>aaa</code>, <code>aba</code>, <code>abaa</code>, <code>abaaa</code>}. The string <code>abaa</code> has been written twice.</p>

<p>In the second example, Misha has written eight distinct strings: {<code>aa</code>, <code>aaa</code>, <code>aaaa</code>, <code>aaaaa</code>, <code>aaaaaa</code>, <code>aaaaaaa</code>, <code>aaaaaaaa</code>, <code>aaaaaaaaa</code>}.</p>