# [Silver IV] Diwali lightings (Large) - 14291

[문제 링크](https://www.acmicpc.net/problem/14291)

### 성능 요약

시간 제한: 5 초, 메모리 제한: 512 MB

### 통계

제출: 202, 정답: 96, 맞힌 사람: 85, 정답 비율: 45.213%

### 분류

수학

### 문제 설명

<p>Diwali is the festival of lights. To celebrate it, people decorate their houses with multi-color lights and burst crackers. Everyone loves Diwali, and so does Pari. Pari is very fond of lights, and has transfinite powers, so she buys an infinite number of red and blue light bulbs. As a programmer, she also loves patterns, so she arranges her lights by infinitely repeating a given finite pattern&nbsp;<b>S</b>.</p>

<p>For example, if&nbsp;<b>S</b>&nbsp;is&nbsp;<code>BBRB</code>, the infinite sequence Pari builds would be&nbsp;<code>BBRBBBRBBBRB...</code></p>

<p>Blue is Pari&#39;s favorite color, so she wants to know the number of blue bulbs between the&nbsp;<b>I</b>th bulb and&nbsp;<b>J</b>th bulb, inclusive, in the infinite sequence she built (lights are numbered with consecutive integers starting from 1). In the sequence above, the indices would be numbered as follows:</p>

<pre>
B  B  R  B  B  B  R  B  B  B  R  B...
1  2  3  4  5  6  7  8  9  10 11 12
</pre>

<p>So, for example, there are 4 blue lights between the 4th and 8th positions, but only 2 between the 10th and 12th.</p>

<p>Since the sequence can be very long, she wrote a program to do the count for her. Can you do the same?</p>

### 입력

<p>The first line of the input gives the number of test cases,&nbsp;<b>T</b>.&nbsp;<b>T</b>&nbsp;test cases follow.</p>

<p>First line of each test case consists of a string S, denoting the initial finite pattern.</p>

<p>Second line of each test case consists of two space separated integers&nbsp;<b>I</b>&nbsp;and&nbsp;<b>J</b>, defined above.</p>

### 출력

<p>For each test case, output one line containing Case #x: y, where x is the test case number (starting from 1) and y is number of blue bulbs between the <strong>I</strong>th bulb and <strong>J</strong>th bulb of Pari&#39;s infinite sequence, inclusive.</p>

### 제한

<ul>
	<li>1 &le;&nbsp;<b>T</b>&nbsp;&le; 100.</li>
	<li>1 &le; length of&nbsp;<b>S</b>&nbsp;&le; 100.</li>
	<li>Each character of&nbsp;<b>S</b>&nbsp;is either uppercase&nbsp;<code>B</code>&nbsp;or uppercase&nbsp;<code>R</code>.</li>
	<li>1 &le;&nbsp;<b>I</b>&nbsp;&le;&nbsp;<b>J</b>&nbsp;&le; 10<sup>18</sup>.</li>
</ul>

### 힌트

<p>Cases #1 and #2 are explained above.</p>

<p>In Case #3, bulbs at odd indices are always blue, and bulbs at even indices are always red, so there are half a million blue bulbs between positions 1 and 10<sup>6</sup>.</p>