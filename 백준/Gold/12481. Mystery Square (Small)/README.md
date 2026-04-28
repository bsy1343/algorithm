# [Gold V] Mystery Square (Small) - 12481

[문제 링크](https://www.acmicpc.net/problem/12481)

### 성능 요약

시간 제한: 5 초, 메모리 제한: 512 MB

### 통계

제출: 102, 정답: 42, 맞힌 사람: 27, 정답 비율: 35.065%

### 분류

브루트포스 알고리즘, 비트마스킹

### 문제 설명

<p>I have written down a large perfect square in binary, and then replaced some of the digits with question marks. Can you figure out what my original number was?</p>

### 입력

<p>The first line of the input gives the number of test cases,&nbsp;<strong>T</strong>.&nbsp;<strong>T</strong>&nbsp;test cases follow, one per line. Each line contains&nbsp;<strong>S</strong>: a perfect square written in binary, but with some of the digits replaced by question marks.</p>

### 출력

<p>For each test case, output one line containing &quot;Case #x:&nbsp;<strong>N</strong>&quot;, where x is the case number (starting from 1) and&nbsp;<strong>N</strong>&nbsp;is a perfect square written in binary, obtained by replacing each &#39;?&#39; character in&nbsp;<strong>S</strong>&nbsp;with either a &#39;0&#39; character or a &#39;1&#39; character.</p>

### 제한

<ul>
	<li>1 &le;&nbsp;<strong>T</strong>&nbsp;&le; 25.</li>
	<li><strong>S</strong>&nbsp;begins with &#39;1&#39;.</li>
	<li><strong>S</strong>&nbsp;contains only the characters &#39;0&#39;, &#39;1&#39;, and &#39;?&#39;.</li>
	<li>In every test case, there is exactly one possible choice for&nbsp;<strong>N</strong>.</li>
	<li><strong>S</strong>&nbsp;is at most 60 characters long.</li>
	<li><strong>S</strong>&nbsp;contains at most 20 &#39;?&#39; characters.</li>
</ul>