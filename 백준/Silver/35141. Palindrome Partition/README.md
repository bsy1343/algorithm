# [Silver III] Palindrome Partition - 35141

[문제 링크](https://www.acmicpc.net/problem/35141)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 2048 MB

### 통계

제출: 22, 정답: 19, 맞힌 사람: 13, 정답 비율: 92.857%

### 분류

구현, 그리디 알고리즘, 문자열, 해 구성하기

### 문제 설명

<p>A palindrome is a string that reads the same forwards as backwards. For example, <code>radar</code>, <code>noon</code>, and <code>a</code> are palindromes, while <code>bathtub</code>, <code>thought</code>, and <code>is</code> are not.</p>

<p>Given a string $S$ consisting only of lowercase English letters. You can rearrange the letters in $S$ in any order you like. Your task is to split $S$ after rearrangement into as few palindromic substrings as possible.</p>

### 입력

<p>The first and only line contains the string $S$ ($1 \le |S| \le 200000$) containing lowercase English letters.</p>

### 출력

<p>On the first line, print the minimum number $k$ of palindrome substrings.</p>

<p>On the next $k$ lines, print the palindromes that the string $S$ (after rearrangement) can be split into. If there are multiple ways to split, you may output any of them.</p>

### 힌트

<p><em>Explanation of Sample 1:</em> We can rearrange the input string into <code>levelracecar</code>, then split the string into two palindromes: <code>level</code> and <code>racecar</code>. No rearrangement can produce a single palindrome, so the minimum number of palindromes is $2$.</p>