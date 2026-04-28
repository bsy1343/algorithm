# [Gold IV] Big Buttons - 23986

[문제 링크](https://www.acmicpc.net/problem/23986)

### 성능 요약

시간 제한: 20 초 (추가 시간 없음), 메모리 제한: 1024 MB

### 통계

제출: 33, 정답: 30, 맞힌 사람: 24, 정답 비율: 96.000%

### 분류

조합론, 자료 구조, 수학, 문자열, 트리, 트라이

### 문제 설명

<p>You are a contestant on a popular new game show and are playing for the grand prize!</p>

<p>There are two big buttons, a red one and a black one. You will make a sequence of exactly&nbsp;<b>N</b>&nbsp;button presses.</p>

<p>There are lots of different sequences of presses you could make, but there are&nbsp;<b>P</b>&nbsp;forbidden prefixes, each of length no greater than&nbsp;<b>N</b>. If you make a sequence of presses which begins with&nbsp;<i>any</i>&nbsp;of the forbidden sequences, you will not win the grand prize. It is fine for your sequence to contain one or more forbidden prefixes as long as they do not appear at the start of your sequence.</p>

<p>A&nbsp;<i>winning</i>&nbsp;sequence must consist of exactly&nbsp;<b>N</b>&nbsp;button presses and must not begin with one of the forbidden prefixes. How many different winning sequences are there?</p>

### 입력

<p>The first line of the input gives the number of test cases,&nbsp;<b>T</b>.&nbsp;<b>T</b>&nbsp;test cases follow. Each test case starts with a line containing two integers&nbsp;<b>N</b>&nbsp;and&nbsp;<b>P</b>, as described above. Then, there are&nbsp;<b>P</b>&nbsp;more lines, each of which contains a string of between 1 and&nbsp;<b>N</b>&nbsp;characters, inclusive, describing one of the forbidden sequences of presses. An&nbsp;<code>R</code>&nbsp;represents pressing the red button, whereas a&nbsp;<code>B</code>&nbsp;represents pressing the black button.</p>

### 출력

<p>For each test case, output one line containing&nbsp;<code>Case #x: y</code>, where&nbsp;<code>x</code>&nbsp;is the test case number (starting from 1) and&nbsp;<code>y</code>&nbsp;is the number of winning sequences, as desribed above.</p>

### 제한

<ul>
	<li>1 &le;&nbsp;<b>T</b>&nbsp;&le; 100.</li>
	<li>1 &le;&nbsp;<b>P</b>&nbsp;&le; min(2<sup><b>N</b></sup>, 100).</li>
	<li>Each forbidden prefix is between 1 and&nbsp;<b>N</b>&nbsp;characters long, inclusive.</li>
	<li>No two forbidden prefixes will be the same.</li>
</ul>