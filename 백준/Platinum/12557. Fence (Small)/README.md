# [Platinum V] Fence (Small) - 12557

[문제 링크](https://www.acmicpc.net/problem/12557)

### 성능 요약

시간 제한: 5 초, 메모리 제한: 512 MB

### 통계

제출: 58, 정답: 35, 맞힌 사람: 29, 정답 비율: 61.702%

### 분류

다이나믹 프로그래밍, 그리디 알고리즘, 배낭 문제, 수학, 정수론

### 문제 설명

<p>We are looking into building a very long fence. We have already found a nice place to build it, and all that remains is to collect the materials.</p>

<p>From local hardware stores, we can buy unlimited numbers of wooden boards, each of which can come in a variety of different lengths. To avoid waste, we want to make sure that the total length of these boards is&nbsp;<em>exactly</em>&nbsp;equal to the length of the fence we are trying to build.</p>

<p>Given the length of the fence, and the possible board lengths that we can use, what is the minimum number of boards that we need to purchase in order to get exactly the right length?</p>

<p><em>Beware:</em>&nbsp;the fence is going to be very long!</p>

### 입력

<p>The first line of the input file contains the number of cases,&nbsp;<strong>T</strong>.&nbsp;<strong>T</strong>&nbsp;test cases follow.</p>

<p>Each test case consists of two lines. The first line contains space-separated integers&nbsp;<strong>L</strong>and&nbsp;<strong>N</strong>. These represent the total length of the fence, and the number of different board lengths that can be purchased. The second line contains&nbsp;<strong>N</strong>&nbsp;space-separated integers&nbsp;<strong>B<sub>1</sub></strong>,&nbsp;<strong>B<sub>2</sub></strong>, ...,&nbsp;<strong>B<sub>N</sub></strong>, representing all the possible board lengths.</p>

<h3>Limits</h3>

<ul>
	<li>1 &le;&nbsp;<strong>T</strong>&nbsp;&le; 50.</li>
	<li>10<sup>10</sup>&nbsp;&le;&nbsp;<strong>L</strong>&nbsp;&le; 10<sup>18</sup>.</li>
	<li>1 &le;&nbsp;<strong>N</strong>&nbsp;&le; 100.</li>
	<li><span style="font-size:13px">1 &le;&nbsp;</span><strong style="font-size:13px">B<sub>i</sub></strong><span style="font-size:13px">&nbsp;&le; 100.</span></li>
</ul>

### 출력

<p>For each test case, output one line containing &quot;Case #x: M&quot;, where x is the case number (starting from 1) and M is as follows:</p>

<ul>
	<li>If it is possible to purchase one or more boards so that their total length is exactly equal to&nbsp;<strong>L</strong>, then M should be the minimum number of boards required to do this.</li>
	<li>Otherwise, M should be the string &quot;IMPOSSIBLE&quot;.</li>
</ul>

### 힌트

<p>In the first example, the optimal strategy is to use 2 boards of length 23, 5 boards of length 51, and 99999997 boards of length 100. Of course, you could use just 100000001 boards of length 100 to get a total&nbsp;<em>greater</em>&nbsp;than&nbsp;<strong>L</strong>, but that is not allowed.</p>

<p>In the second example, it is only possible to get even lengths.</p>