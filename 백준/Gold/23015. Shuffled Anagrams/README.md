# [Gold II] Shuffled Anagrams - 23015

[문제 링크](https://www.acmicpc.net/problem/23015)

### 성능 요약

시간 제한: 서브태스크 참고 (추가 시간 없음), 메모리 제한: 1024 MB (추가 메모리 없음)

### 통계

제출: 67, 정답: 31, 맞힌 사람: 27, 정답 비율: 54.000%

### 분류

그리디 알고리즘, 문자열

### 문제 설명

<p>Let&nbsp;S&nbsp;be a string containing only letters of the English alphabet. An anagram of&nbsp;S&nbsp;is any string that contains exactly the same letters as&nbsp;S&nbsp;(with the same number of occurrences for each letter), but in a different order. For example, the word&nbsp;<code>kick</code>&nbsp;has anagrams such as&nbsp;<code>kcik</code>&nbsp;and&nbsp;<code>ckki</code>.</p>

<p>Now, let&nbsp;S[i]&nbsp;be the&nbsp;i-th letter in&nbsp;S. We say that an anagram of&nbsp;S, A, is&nbsp;<i>shuffled</i>&nbsp;if and only if for all&nbsp;i, S[i] &ne; A[i]. So, for instance,&nbsp;<code>kcik</code>&nbsp;is not a shuffled anagram of&nbsp;<code>kick</code>&nbsp;as the first and fourth letters of both of them are the same. However,&nbsp;<code>ckki</code>&nbsp;would be considered a shuffled anagram of&nbsp;<code>kick</code>, as would&nbsp;<code>ikkc</code>.</p>

<p>Given an arbitrary string&nbsp;S, your task is to output any one shuffled anagram of&nbsp;S, or else print&nbsp;<code>IMPOSSIBLE</code>&nbsp;if this cannot be done.</p>

### 입력

<p>The first line of the input gives the number of test cases, T. T test cases follow. Each test case consists of one line, a string of English letters.</p>

### 출력

<p>For each test case, output one line containing&nbsp;<code>Case #x: y</code>, where x&nbsp;is the test case number (starting from 1) and&nbsp;y&nbsp;is a shuffled anagram of the string for that test case, or&nbsp;<code>IMPOSSIBLE</code>&nbsp;if no shuffled anagram exists for that string.</p>

### 제한

<ul>
	<li>1 &le; T &le; 100.</li>
	<li>All input letters are lowercase English letters.</li>
</ul>

### 힌트

<p>In test case #1,&nbsp;<code>tarts</code>&nbsp;is a shuffled anagram of&nbsp;<code>start</code>&nbsp;as none of the letters in each position of both strings match the other. Another possible solution is&nbsp;<code>trsta</code>&nbsp;(though you only need to provide one solution). However, in test case #2, there is no way of anagramming&nbsp;<code>jjj</code>&nbsp;to form a shuffled anagram, so&nbsp;<code>IMPOSSIBLE</code>&nbsp;is printed instead.</p>