# [Platinum IV] World Cup 2010 (Large) - 12566

[문제 링크](https://www.acmicpc.net/problem/12566)

### 성능 요약

시간 제한: 5 초, 메모리 제한: 512 MB

### 통계

제출: 26, 정답: 12, 맞힌 사람: 12, 정답 비율: 66.667%

### 분류

다이나믹 프로그래밍, 트리에서의 다이나믹 프로그래밍, 트리

### 문제 설명

<p>After four years, it is the World Cup time again and Varva is on his way to South Africa, just in time to catch the second stage of the tournament.</p>

<p>In the second stage (also called the knockout stage), each match always has a winner; the winning team proceeds to the next round while the losing team is eliminated from the tournament. There are 2<sup>P</sup>&nbsp;teams competing in this stage, identified with integers from 0 to 2<sup>P</sup>&nbsp;- 1. The knockout stage consists of P rounds. In each round, each remaining team plays exactly one match. The exact pairs and the order of matches are determined by successively choosing two remaining teams with lowest identifiers and pairing them in a match. After all matches in one round are finished, the next round starts.</p>

<p><br />
<br />
&nbsp;&nbsp;&nbsp;<img src="https://onlinejudgeimages.s3.amazonaws.com/problem/12565/images-31.png" style="border:0px; vertical-align:middle" />&nbsp;<br />
&nbsp;</p>

<p>In order to help him decide which matches to see, Varva has compiled a list of constraints based on how much he likes a particular team. Specifically, for each team&nbsp;<code>i</code>&nbsp;he is&nbsp;&nbsp;<strong>willing to miss at most</strong>&nbsp;<code>M[i]</code>&nbsp;matches the team plays in the tournament.</p>

<p>Varva needs to buy a set of tickets that will guarantee that his preferences are satisfied, regardless of how the matches turn out. Other than that, he just wants to spend as little money as possible. Your goal is to find the&nbsp;<strong>minimal amount of money</strong>&nbsp;he needs to spend on the tickets.</p>

<p>Tickets for the matches need to be purchased in advance (before the tournament starts) and the ticket price for each match is known. Note that, in the small input, ticket prices for all matches will be equal, while in the large input, they may be different.&nbsp;</p>

<h3>Example</h3>

<p>A sample tournament schedule along with the ticket prices is given in the figure above. Suppose that the constraints are given by the array&nbsp;<code>M = {1, 2, 3, 2, 1, 0, 1, 3}</code>, the optimal strategy is as follows: Since we can&#39;t miss any games of team 5, we&#39;ll need to spend 50, 400, and 800 to buy tickets to all the matches team 5 may play in. Now, the constrains for the other teams are also satisfied by these tickets, except for team 0. The best option to fix this is to buy the ticket for team 0&#39;s first round match, spending another 100, bringing the total to 1350.</p>

### 입력

<p>The first line of the input gives the number of test cases,&nbsp;<strong>T</strong>.&nbsp;&nbsp;<strong>T</strong>&nbsp;test cases follow. Each case starts with a line containing a single integer&nbsp;<strong>P</strong>. The next line contains 2<sup>P</sup>&nbsp;integers -- the constraints&nbsp;<code>M[0]</code>, ...,&nbsp;<code>M[2<sup>P</sup>-1]</code>.</p>

<p>The following block of&nbsp;<strong>P</strong>&nbsp;lines contains the ticket prices for all matches: the first line of the block contains 2<sup>P-1</sup>&nbsp;integers -- ticket prices for first round matches, the second line of the block contains 2<sup>P-2</sup>&nbsp;integers -- ticket prices for second round matches, etc. The last of the&nbsp;<strong>P</strong>&nbsp;lines contains a single integer -- ticket price for the final match of the World Cup. The prices are listed in the order the matches are played.</p>

<h3>Limits</h3>

<ul>
	<li>1 &le;&nbsp;<strong>T</strong>&nbsp;&le; 50</li>
	<li>1 &le;&nbsp;<strong>P</strong>&nbsp;&le; 10</li>
	<li>Each element of&nbsp;<strong>M</strong>&nbsp;is an integer between 0 and&nbsp;<strong>P</strong>, inclusive.</li>
	<li>All the prices are integers between 0 and 100000, inclusive.</li>
</ul>

### 출력

<p>For each test case, output one line containing &quot;Case #x: y&quot;, where x is the case number (starting from 1) and y is the minimal amount of money Varva needs to spend on tickets as described above.</p>