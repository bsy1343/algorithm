# [Gold II] Counter Culture (Large) - 12154

[문제 링크](https://www.acmicpc.net/problem/12154)

### 성능 요약

시간 제한: 5 초, 메모리 제한: 512 MB

### 통계

제출: 62, 정답: 27, 맞힌 사람: 25, 정답 비율: 54.348%

### 분류

많은 조건 분기, 그리디 알고리즘, 구현, 시뮬레이션

### 문제 설명

<p>In the Counting Poetry Slam, a performer takes the microphone, chooses a number&nbsp;<strong>N</strong>, and counts aloud from 1 to&nbsp;<strong>N</strong>. That is, she starts by saying 1, and then repeatedly says the number that is 1 greater than the previous number she said, stopping after she has said&nbsp;<strong>N</strong>.<br />
<br />
It&#39;s your turn to perform, but you find this process tedious, and you want to add a twist to speed it up: sometimes, instead of adding 1 to the previous number, you might reverse the digits of the number (removing any leading zeroes that this creates). For example, after saying &quot;16&quot;, you could next say either &quot;17&quot; or &quot;61&quot;; after saying &quot;2300&quot;, you could next say either &quot;2301&quot; or &quot;32&quot;. You may reverse as many times as you want (or not at all) within a performance.<br />
<br />
The first number you say must be 1; what is the fewest number of numbers you will need to say in order to reach the number&nbsp;<strong>N</strong>? 1 and&nbsp;<strong>N</strong>&nbsp;count toward this total. If you say the same number multiple times, each of those times counts separately.</p>

### 입력

<p>The first line of the input gives the number of test cases,&nbsp;<strong>T</strong>.&nbsp;<strong>T</strong>&nbsp;lines follow. Each has one integer&nbsp;<strong>N</strong>, the number you must reach.</p>

<h3>Limits</h3>

<ul>
	<li>1 &le;&nbsp;<strong>T</strong>&nbsp;&le; 100.</li>
	<li>1 &le;&nbsp;<strong>N</strong>&nbsp;&le; 10<sup>14</sup>.</li>
</ul>

### 출력

<p>For each test case, output one line containing &quot;Case #x: y&quot;, where x is the test case number (starting from 1) and y is the minimum number of numbers you need to say.</p>

### 힌트

<p>In Case #2, flipping does not help and the optimal strategy is to just count up to 19.<br />
<br />
In Case #3, the optimal strategy is to count up to 12, flip to 21, and then continue counting up to 23. That is, the numbers you will say are 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 21, 22, 23.</p>