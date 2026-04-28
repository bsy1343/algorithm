# [Bronze II] Country Leader (Small) - 14322

[문제 링크](https://www.acmicpc.net/problem/14322)

### 성능 요약

시간 제한: 5 초, 메모리 제한: 512 MB

### 통계

제출: 261, 정답: 158, 맞힌 사람: 144, 정답 비율: 63.717%

### 분류

구현, 문자열

### 문제 설명

<p>The Constitution of a certain country states that the leader is the person with the name containing the greatest number of different alphabet letters. (The country uses the uppercase English alphabet from A through Z.) For example, the name&nbsp;<code>GOOGLE</code>&nbsp;has four different alphabet letters: E, G, L, and O. The name&nbsp;<code>APAC CODE JAM</code>&nbsp;has eight different letters. If the country only consists of these 2 persons,&nbsp;<code>APAC CODE JAM</code>&nbsp;would be the leader.</p>

<p>If there is a tie, the person whose name comes earliest in alphabetical order is the leader.</p>

<p>Given a list of names of the citizens of the country, can you determine who the leader is?</p>

<ul>
</ul>

### 입력

<p>The first line of the input gives the number of test cases,&nbsp;T.&nbsp;T&nbsp;test cases follow. Each test case starts with a line with an interger&nbsp;N, the number of people in the country. Then&nbsp;N&nbsp;lines follow. The i-th line represents the name of the i-th person. Each name contains at most 20 characters and contains at least one alphabet letter.</p>

### 출력

<p>For each test case, output one line containing&nbsp;<code>Case #x: y</code>, where&nbsp;<code>x</code>&nbsp;is the test case number (starting from 1) and y is the name of the leader.</p>

### 제한

<ul>
	<li>1 &le;&nbsp;T&nbsp;&le; 100.</li>
	<li>1 &le;&nbsp;N&nbsp;&le; 100.</li>
	<li>Each name consists of at most 20 characters and only consists of the uppercase English letters&nbsp;<code>A</code>&nbsp;through&nbsp;<code>Z</code>.</li>
</ul>

### 힌트

<p>In sample case #1,&nbsp;<code>JOHNSON</code>&nbsp;contains 5 different alphabet letters(&#39;H&#39;, &#39;J&#39;, &#39;N&#39;, &#39;O&#39;, &#39;S&#39;), so he is the leader.</p>

<p>Sample case #2 would only appear in Large data set. The name&nbsp;<code>DEF</code>&nbsp;contains 3 different alphabet letters, the name&nbsp;<code>A AB C</code>&nbsp;also contains 3 different alphabet letters.&nbsp;<code>A AB C</code>&nbsp;comes alphabetically earlier so he is the leader.</p>