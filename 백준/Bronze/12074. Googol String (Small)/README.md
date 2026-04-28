# [Bronze I] Googol String (Small) - 12074

[문제 링크](https://www.acmicpc.net/problem/12074)

### 성능 요약

시간 제한: 5 초, 메모리 제한: 512 MB

### 통계

제출: 214, 정답: 147, 맞힌 사람: 122, 정답 비율: 71.765%

### 분류

구현, 문자열

### 문제 설명

<p>A &quot;0/1 string&quot; is a string in which every character is either&nbsp;<code>0</code>&nbsp;or&nbsp;<code>1</code>. There are two operations that can be performed on a 0/1 string:</p>

<ul>
	<li><b>switch</b>: Every&nbsp;<code>0</code>&nbsp;becomes&nbsp;<code>1</code>&nbsp;and every&nbsp;<code>1</code>&nbsp;becomes&nbsp;<code>0</code>. For example, &quot;100&quot; becomes &quot;011&quot;.</li>
	<li><b>reverse</b>: The string is reversed. For example, &quot;100&quot; becomes &quot;001&quot;.</li>
</ul>

<p>Consider this infinite sequence of 0/1 strings:</p>

<ul>
	<li>S<sub>0</sub>&nbsp;= &quot;&quot;</li>
	<li>S<sub>1</sub>&nbsp;= &quot;0&quot;</li>
	<li>S<sub>2</sub>&nbsp;= &quot;001&quot;</li>
	<li>S<sub>3</sub>&nbsp;= &quot;0010011&quot;</li>
	<li>S<sub>4</sub>&nbsp;= &quot;001001100011011&quot;</li>
	<li>...</li>
	<li>S<sub>N</sub>&nbsp;= S<sub>N-1</sub>&nbsp;+ &quot;0&quot; +&nbsp;<b>switch</b>(<b>reverse</b>(S<sub>N-1</sub>)).</li>
</ul>

<p>You need to figure out the Kth character of S<sub>googol</sub>, where googol = 10<sup>100</sup>.</p>

### 입력

<p>The first line of the input gives the number of test cases,&nbsp;<b>T</b>. Each of the next&nbsp;<b>T</b>&nbsp;lines contains a number&nbsp;<b>K</b>.</p>

### 출력

<p>For each test case, output one line containing &quot;Case #x: y&quot;, where x is the test case number (starting from 1) and y is the&nbsp;<b>K</b>th character of S<sub>googol</sub>.</p>

### 제한

<ul>
	<li>1 &le;&nbsp;<b>T</b>&nbsp;&le; 100.</li>
	<li>1 &le;&nbsp;<b>K</b>&nbsp;&le; 10<sup>5</sup>.</li>
</ul>