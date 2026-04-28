# [Platinum IV] Repetitions - 8053

[문제 링크](https://www.acmicpc.net/problem/8053)

### 성능 요약

시간 제한: 3 초, 메모리 제한: 128 MB

### 통계

제출: 90, 정답: 33, 맞힌 사람: 28, 정답 비율: 37.838%

### 분류

이분 탐색, KMP, 문자열

### 문제 설명

<p>A sequence of words over alphabet [&lsquo;a&rsquo;,&hellip;,&rsquo;z&rsquo;] is given. The length of longest word occuring as a coherent fragment in every word given is to be found.</p>

<p>Write a program which:</p>

<ul>
	<li>reads the sequence of words from the standard input,</li>
	<li>counts the length of the longest word occuring as a coherent fragment in every word given,</li>
	<li>writes the result to the standard output.</li>
</ul>

### 입력

<p>In the first line of the standard input there is an integer n, where 1 &le; n &le; 5 is the number of words. In each of the next n lines there is one word formed from small letters of English alphabet [&lsquo;a&rsquo;,&hellip;,&rsquo;z&rsquo;]. The length of each word is at least 1, but not greater than 2,000.</p>

### 출력

<p>The text of standard output should consist of exactly one line containing a single integer equal to the length of the longest word occuring as the coherent fragment in every word given.</p>