# [Platinum I] Number Game (Large) - 12588

[문제 링크](https://www.acmicpc.net/problem/12588)

### 성능 요약

시간 제한: 5 초, 메모리 제한: 512 MB

### 통계

제출: 113, 정답: 51, 맞힌 사람: 29, 정답 비율: 46.032%

### 분류

수학, 애드 혹, 정수론, 게임 이론

### 문제 설명

<p>Arya and Bran are playing a game. Initially, two positive integers&nbsp;<strong>A</strong>&nbsp;and&nbsp;<strong>B</strong>&nbsp;are written on a blackboard. The players take turns, starting with Arya. On his or her turn, a player can replace&nbsp;<strong>A</strong>&nbsp;with&nbsp;<strong>A</strong>&nbsp;-&nbsp;<strong>k</strong>*<strong>B</strong>&nbsp;for any positive integer&nbsp;<strong>k</strong>, or replace&nbsp;<strong>B</strong>&nbsp;with&nbsp;<strong>B</strong>&nbsp;-&nbsp;<strong>k</strong>*<strong>A</strong>&nbsp;for any positive integer&nbsp;<strong>k</strong>. The first person to make one of the numbers drop to zero or below loses.</p>

<p>For example, if the numbers are initially (12, 51), the game might progress as follows:</p>

<ul>
	<li>Arya replaces 51 with 51 - 3*12 = 15, leaving (12, 15) on the blackboard.</li>
	<li>Bran replaces 15 with 15 - 1*12 = 3, leaving (12, 3) on the blackboard.</li>
	<li>Arya replaces 12 with 12 - 3*3 = 3, leaving (3, 3) on the blackboard.</li>
	<li>Bran replaces one 3 with 3 - 1*3 = 0, and loses.</li>
</ul>

<p>We will say (<strong>A</strong>,&nbsp;<strong>B</strong>) is a&nbsp;<em>winning</em>&nbsp;position if Arya can always win a game that starts with (<strong>A</strong>,&nbsp;<strong>B</strong>) on the blackboard, no matter what Bran does.</p>

<p>Given four integers&nbsp;<strong>A<sub>1</sub></strong>,&nbsp;<strong>A<sub>2</sub></strong>,&nbsp;<strong>B<sub>1</sub></strong>,&nbsp;<strong>B<sub>2</sub></strong>, count how many winning positions (<strong>A</strong>,&nbsp;<strong>B</strong>) there are with&nbsp;<strong>A<sub>1</sub></strong>&nbsp;&le;&nbsp;<strong>A</strong>&nbsp;&le;&nbsp;<strong>A<sub>2</sub></strong>&nbsp;and&nbsp;<strong>B<sub>1</sub></strong>&nbsp;&le;&nbsp;<strong>B</strong>&nbsp;&le;&nbsp;<strong>B<sub>2</sub></strong>.</p>

### 입력

<p>The first line of the input gives the number of test cases,&nbsp;<strong>T</strong>.&nbsp;<strong>T</strong>&nbsp;test cases follow, one per line. Each line contains the four integers&nbsp;<strong>A<sub>1</sub></strong>,&nbsp;<strong>A<sub>2</sub></strong>,&nbsp;<strong>B<sub>1</sub></strong>,&nbsp;<strong>B<sub>2</sub></strong>, separated by spaces.</p>

<h3>Limits</h3>

<ul>
	<li>1 &le;&nbsp;<strong>T</strong>&nbsp;&le; 100.&nbsp;</li>
	<li>1 &le;&nbsp;<strong>A<sub>1</sub></strong>&nbsp;&le;&nbsp;<strong>A<sub>2</sub></strong>&nbsp;&le; 1,000,000.</li>
	<li>1 &le;&nbsp;<strong>B<sub>1</sub></strong>&nbsp;&le;&nbsp;<strong>B<sub>2</sub></strong>&nbsp;&le; 1,000,000.</li>
	<li><strong style="font-size:13px">A<sub>2</sub></strong><span style="font-size:13px">&nbsp;-&nbsp;</span><strong style="font-size:13px">A<sub>1</sub></strong><span style="font-size:13px">&nbsp;&le; 999,999.</span></li>
	<li><strong>B<sub>2</sub></strong>&nbsp;-&nbsp;<strong>B<sub>1</sub></strong>&nbsp;&le; 999,999.</li>
</ul>

### 출력

<p>For each test case, output one line containing &quot;Case #x: y&quot;, where x is the case number (starting from 1), and y is the number of winning positions (<strong>A</strong>,&nbsp;<strong>B</strong>) with&nbsp;<strong>A<sub>1</sub></strong>&nbsp;&le;&nbsp;<strong>A</strong>&nbsp;&le;&nbsp;<strong>A<sub>2</sub></strong>&nbsp;and&nbsp;<strong>B<sub>1</sub></strong>&le;&nbsp;<strong>B</strong>&nbsp;&le;&nbsp;<strong>B<sub>2</sub></strong>.</p>