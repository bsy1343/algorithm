# [Platinum I] The Stable Marriage Problem - 3761

[문제 링크](https://www.acmicpc.net/problem/3761)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 403, 정답: 144, 맞힌 사람: 109, 정답 비율: 36.213%

### 분류

그래프 이론, 문자열, 파싱, 안정 결혼 문제

### 문제 설명

<p>The stable marriage problem consists of matching members of two different sets according to the member&rsquo;s preferences for the other set&rsquo;s members. The input for our problem consists of:</p>

<ul>
	<li>set M of n males;</li>
	<li>a set F of n females;</li>
	<li>for each male and female we have a list of all the members of the opposite gender in order of preference (from the most preferable to the least).</li>
</ul>

<p>A marriage is a one-to-one mapping between males and females.&nbsp;A marriage is called stable, if there is no pair (m, f) such that f &isin; F prefers m &isin; M to her current partner and m prefers f over his current partner. The stable marriage A is called male-optimal if there is no other stable marriage B, where any male matches a female he prefers more than the one assigned in A.</p>

<p>Given preferable lists of males and females, you must find the male-optimal stable marriage.</p>

### 입력

<p>The first line gives you the number of tests. The first line of each test case contains integer n (0 &lt; n &lt; 27). Next line describes n male and n female names. Male name is a lowercase letter, female name is an upper-case letter. Then go n lines, that describe preferable lists for males. Next n lines describe preferable lists for females.</p>

### 출력

<p>For each test case find and print the pairs of the stable marriage, which is male-optimal. The pairs in each test case must be printed in lexicographical order of their male names as shown in sample output. Output an empty line between test cases.</p>