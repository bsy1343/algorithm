# [Platinum IV] Round Numbers - 6200

[문제 링크](https://www.acmicpc.net/problem/6200)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 175, 정답: 78, 맞힌 사람: 63, 정답 비율: 45.000%

### 분류

수학, 다이나믹 프로그래밍, 조합론

### 문제 설명

<p>The cows, as you know, have no fingers or thumbs and thus are unable to play &#39;Scissors, Paper, Stone&#39; (also known as &#39;Rock, Paper, Scissors&#39;, &#39;Ro, Sham, Bo&#39;, and a host of other names) in order to make arbitrary decisions such as who gets to be milked first. They can&#39;t even flip a coin because it&#39;s so hard to toss using hooves.</p>

<p>They have thus resorted to &quot;round number&quot; matching. The first cow picks an integer less than two billion. The second cow does the same. &nbsp;If the numbers are both &quot;round numbers&quot;, the first cow wins, otherwise the second cow wins.</p>

<p>A positive integer N is said to be a &quot;round number&quot; if the binary representation of N has as many or more zeroes than it has ones. For example, the integer 9, when written in binary form, is 1001. 1001 has two zeroes and two ones; thus, 9 is a round number. The integer 26 is 11010 in binary; since it has two zeroes and three ones, it is not a round number.</p>

<p>Obviously, it takes cows a while to convert numbers to binary, so the winner takes a while to determine. &nbsp;Bessie wants to cheat and thinks she can do that if she knows how many &quot;round numbers&quot; are in a given range.</p>

<p>Help her by writing a program that tells how many round numbers appear in the inclusive range given by the input (1 &lt;= Start &lt; Finish &lt;= 2,000,000,000).</p>

### 입력

<ul>
	<li>Line 1: Two space-separated integers, respectively Start and Finish.</li>
</ul>

### 출력

<ul>
	<li>Line 1: A single integer that is the count of round numbers in the inclusive range Start..Finish</li>
</ul>

### 힌트

<pre>
 2    10  1x0 + 1x1  ROUND
 3    11  0x0 + 2x1  NOT round
 4   100  2x0 + 1x1  ROUND
 5   101  1x0 + 2x1  NOT round
 6   110  1x0 + 2x1  NOT round
 7   111  0x0 + 3x1  NOT round
 8  1000  3x0 + 1x1  ROUND
 9  1001  2x0 + 2x1  ROUND
10  1010  2x0 + 2x1  ROUND
11  1011  1x0 + 3x1  NOT round
12  1100  2x0 + 2x1  ROUND</pre>

<p>&nbsp;</p>