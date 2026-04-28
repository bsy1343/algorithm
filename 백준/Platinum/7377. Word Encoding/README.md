# [Platinum III] Word Encoding - 7377

[문제 링크](https://www.acmicpc.net/problem/7377)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 23, 정답: 9, 맞힌 사람: 7, 정답 비율: 33.333%

### 분류

이분 탐색, 다이나믹 프로그래밍, 문자열

### 문제 설명

<p>In any language, certain combinations of letters do not appear (or at least appear so seldom that they can be considered non-existent). For instance, there are no English words containing the three letter combination buv as a substring. Given a list of letter combinations that do not exist, the number of possible &ldquo;words&rdquo; in a language can be reduced a lot (a &ldquo;word&rdquo; here means any combination of letters that doesn&lsquo;t contain any of the given letter combinations as a substring). If we order all such words by increasing length, ordering words of the same length alphabetically, we can enumerate them starting from 1. Assume that the alphabet always consists of the lower case letters &lsquo;a&rsquo; to &lsquo;z&rsquo;.</p>

<p>For instance, if the list only contains the combinations q, ab and aaa, the words would be enumerated like this:</p>

<pre>
his:
1. a
2. b
. . .
16. p
17. r
.
.
.
26. aa
27. ac
.
.
.
649. zz
650. aac</pre>

<p>Given the list of letter combinations, write a program that for a given word outputs its number, and for a given number ouputs its word. You can assume that none of the words will exceed 20 characters and no number will be greater than 2 000 000 000 (for both input and output).</p>

### 입력

<p>The input will contain several test cases. The number of test cases T appears on a line by itself. Then follow T test cases. Each test case starts with a line containing two integers, N (the number of letter combinations, non-negative, at most 1 000) and M (the number of queries for this list, positive, at most 100). Then follow N lines, each containing a lower case letter combination (between 1 and 3 letters, inclusive). After that follow M lines, each containing either a positive integer or a lower case word. If it&lsquo;s a word, it will not contain any of the combinations of letters in the list for this test case. If it&lsquo;s a number, it will not be greater than the number of words in the language.</p>

### 출력

<p>For each query, output a single line containing either the word&lsquo;s corresponding number, or the number&lsquo;s corresponding word.</p>