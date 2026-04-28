# [Platinum IV] Snail - 19695

[문제 링크](https://www.acmicpc.net/problem/19695)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 512 MB

### 통계

제출: 43, 정답: 8, 맞힌 사람: 8, 정답 비율: 34.783%

### 분류

이분 탐색, 매개 변수 탐색, 누적 합

### 문제 설명

<p>A snail is stuck at the bottom of a well which is of height H. Initially, the snail is at height 0 and it tries to get out. Well, being at the bottom (i.e., height 0) has its upsides. For instance, the snail can&rsquo;t slide down any further (cannot slide into negative height).</p>

<p>A day is made out of N phases. During each phase, the snail will either try to climb up a certain amount, or rest and slide down a certain amount. The snail knows how much it would move in each phase and this is denoted by P<sub>i</sub>. If positive, this means that the snail will travel upwards, if negative, the snail will slide downwards (until height 0), if zero, the snail will maintain its height.</p>

<p>Find out the first day and phase such that the snail reaches a height of H to exit the well.</p>

### 입력

<p>Your program must read from standard input.</p>

<p>The first line of input contains two positive integers H, denoting the height of the well and N, denoting the number of phases per day.</p>

<p>The next line of input contains N signed integers (separated by spaces) describing the snail&rsquo;s routine: P<sub>0</sub>, P<sub>1</sub>, P<sub>2</sub>, . . . , P<sub>N&minus;1</sub> where P<sub>i</sub> denotes the amount the snail travels in phase i.</p>

### 출력

<p>Your program must print to standard output.</p>

<p>Your program should print one line with two integers, separated by a space.</p>

<p>If the snail can reach the top of the well (i.e. height H) for the first time on the phase P of day D, your output should be D followed by P.</p>

<p>Otherwise, if the snail will always be stuck in the well, your output should be &minus;1 followed by &minus;1.</p>

### 제한

<ul>
	<li>1 &le; H &le; 10<sup>12</sup></li>
	<li>&minus;10<sup>12</sup> &le; P<sub>i</sub> &le; 10<sup>12</sup></li>
	<li>1 &le; N &le; 10 000</li>
</ul>