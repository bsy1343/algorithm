# [Platinum IV] Silly Substitutions - 23718

[문제 링크](https://www.acmicpc.net/problem/23718)

### 성능 요약

시간 제한: 서브태스크 참고, 메모리 제한: 1024 MB

### 통계

제출: 227, 정답: 53, 맞힌 사람: 29, 정답 비율: 19.863%

### 분류

구현, 자료 구조, 시뮬레이션, 연결 리스트

### 문제 설명

<p>You are given a string&nbsp;$S$&nbsp;of length&nbsp;$N$&nbsp;which consists of digits&nbsp;<code>0-9</code>. You do the following operations on the string in the order given.</p>

<ol>
	<li>Find all the substrings&nbsp;<code>01</code>&nbsp;and replace each of them with&nbsp;<code>2</code>.</li>
	<li>Find all the substrings&nbsp;<code>12</code>&nbsp;and replace each of them with&nbsp;<code>3</code>.</li>
	<li>Find all the substrings&nbsp;<code>23</code>&nbsp;and replace each of them with&nbsp;<code>4</code>.</li>
	<li>Find all the substrings&nbsp;<code>34</code>&nbsp;and replace each of them with&nbsp;<code>5</code>.</li>
</ol>

<p style="text-align: center;">.</p>

<p style="text-align: center;">.</p>

<p style="text-align: center;">.</p>

<ol>
	<li value="9">Find all the substrings&nbsp;<code>89</code>&nbsp;and replace each of them with&nbsp;<code>0</code>.</li>
	<li value="10">Find all the substrings&nbsp;<code>90</code>&nbsp;and replace each of them with&nbsp;<code>1</code>.</li>
</ol>

<p>You repeat this process in the same given order until&nbsp;<i>none</i>&nbsp;of the above operations change the string. For example, if&nbsp;$S$&nbsp;is&nbsp;<code>12</code>&nbsp;then we do not stop at operation&nbsp;$1$&nbsp;since it does not affect the string but perform operation&nbsp;$2$&nbsp;and change the string to&nbsp;<code>3</code>. We can see that the string does not change further no matter how many times we repeat the above process.</p>

<p>Your task is to find how the final string will look like for the given&nbsp;$S$.</p>

### 입력

<p>The first line of the input gives the number of test cases,&nbsp;$T$.&nbsp;$T$&nbsp;test cases follow. Each test case consists of two lines.</p>

<p>The first line of each test case contains an integer&nbsp;$N$, denoting the length of the string&nbsp;$S$.</p>

<p>The second line of each test case contains a string&nbsp;$S$&nbsp;of length&nbsp;$N$.</p>

### 출력

<p>For each test case, output one line containing&nbsp;<code>Case #x:&nbsp;y</code>, where&nbsp;$x$ is the test case number (starting from 1) and&nbsp;$y$&nbsp;is the final string obtained.</p>

### 제한

<ul>
	<li>$1&le;T&le;100$.</li>
	<li>The input string only consists of digits&nbsp;<code>0-9</code>.</li>
</ul>