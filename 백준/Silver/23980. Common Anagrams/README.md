# [Silver III] Common Anagrams - 23980

[문제 링크](https://www.acmicpc.net/problem/23980)

### 성능 요약

시간 제한: 20 초 (추가 시간 없음), 메모리 제한: 1024 MB

### 통계

제출: 46, 정답: 39, 맞힌 사람: 35, 정답 비율: 85.366%

### 분류

브루트포스 알고리즘, 자료 구조, 해시를 사용한 집합과 맵, 집합과 맵

### 문제 설명

<p>Ayla has two strings&nbsp;<b>A</b>&nbsp;and&nbsp;<b>B</b>, each of length&nbsp;<b>L</b>, and each of which is made of uppercase English alphabet letters. She would like to know how many different substrings of&nbsp;<b>A</b>&nbsp;appear as anagrammatic substrings of&nbsp;<b>B</b>. More formally, she wants the number of different ordered tuples (i, j), with 0 &le; i &le; j &lt;&nbsp;<b>L</b>, such that the i-th through j-th characters of&nbsp;<b>A</b>&nbsp;(inclusive) are the same multiset of characters as at least one contiguous substring of length (j - i + 1) in&nbsp;<b>B</b>.</p>

### 입력

<p>The first line of the input gives the number of test cases,&nbsp;<b>T</b>.&nbsp;<b>T</b>&nbsp;test cases follow. Each test case starts with one line, containing&nbsp;<b>L</b>: the length of the string. The next two lines contain one string of&nbsp;<b>L</b>&nbsp;characters each: these are strings&nbsp;<b>A</b>&nbsp;and&nbsp;<b>B</b>, in that order.</p>

### 출력

<p>For each test case, output one line containing&nbsp;<code>Case #x: y</code>, where&nbsp;<code>x</code>&nbsp;is the test case number (starting from 1) and&nbsp;<code>y</code>&nbsp;is the answer Ayla wants, as described above.</p>

### 제한

<ul>
	<li>1 &le;&nbsp;<b>T</b>&nbsp;&le; 100.</li>
	<li>1 &le;&nbsp;<b>L</b>&nbsp;&le; 50.</li>
</ul>

### 힌트

<p>In Sample Case #1,&nbsp;<b>L</b>&nbsp;= 3,&nbsp;<b>A</b>&nbsp;=&nbsp;<code>ABB</code>, and&nbsp;<b>B</b>&nbsp;=&nbsp;<code>BAB</code>&nbsp;There are 6 substrings of&nbsp;<b>A</b>:</p>

<ul>
	<li><code>A</code>. The substring&nbsp;<code>A</code>&nbsp;in&nbsp;<b>B</b>&nbsp;is (trivially) an anagram.</li>
	<li><code>B</code>. The substring&nbsp;<code>B</code>&nbsp;in&nbsp;<b>B</b>&nbsp;is (trivially) an anagram.</li>
	<li><code>B</code>. The substring&nbsp;<code>B</code>&nbsp;in&nbsp;<b>B</b>&nbsp;is (trivially) an anagram.</li>
	<li><code>AB</code>. The substring&nbsp;<code>AB</code>&nbsp;in&nbsp;<b>B</b>&nbsp;is (trivially) an anagram.</li>
	<li><code>BB</code>. There is no corresponding anagrammatic substring in&nbsp;<b>B</b>.</li>
	<li><code>ABB</code>. The substring&nbsp;<code>BAB</code>&nbsp;in&nbsp;<b>B</b>&nbsp;is an anagram.</li>
</ul>

<p>In total, there are 5 substrings with a corresponding anagrammatic substring in&nbsp;<b>B</b>, so the answer is 5.</p>

<p>In Sample Case #2, note that it is the same as Sample Case #1, except that&nbsp;<b>A</b>&nbsp;and&nbsp;<b>B</b>&nbsp;are swapped. This changes the answer to 6!</p>

<p>In Sample Case #3, note that the substring&nbsp;<code>CAT</code>&nbsp;in&nbsp;<b>A</b>&nbsp;has the corresponding substring&nbsp;<code>TAC</code>&nbsp;in&nbsp;<b>B</b>&nbsp;which is an anagram. This still counts, even though the strings are at different indices in their respective strings.</p>

<p>In Sample Case #4, note that although the substring&nbsp;<code>SUB</code>&nbsp;in&nbsp;<b>A</b>&nbsp;has several corresponding substrings in&nbsp;<b>B</b>&nbsp;which are anagrams, it only counts once.</p>

<p>In Sample Case #5, note that every substring of&nbsp;<b>A</b>&nbsp;has a corresponding anagrammatic substring in&nbsp;<b>B</b>, so the answer is 10.</p>