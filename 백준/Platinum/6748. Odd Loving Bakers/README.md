# [Platinum II] Odd Loving Bakers - 6748

[문제 링크](https://www.acmicpc.net/problem/6748)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 34, 정답: 9, 맞힌 사람: 6, 정답 비율: 24.000%

### 분류

(분류 없음)

### 문제 설명

<p>There is a group of N bakers in the town of Utopia. These bakers hold a monthly celebration in which they award a prize to some of the luckier among themselves. These lucky guys are chosen as follows:</p>

<p>In the beginning there are some chalk marks on some of the bakers&#39; houses. Each baker has a list of his/her favorite bakers. After each celebration each of the winners puts a chalk mark on the house of all the bakers in his/her favorite list. Before each celebration those bakers with an odd number of chalk marks on their house will be chosen as winners. As there will be a great prize for the winners of the t<sup>th</sup> celebration, you are asked to find the number of its winners</p>

### 입력

<p>The first line of the input file contains a single integer X (1 &le; X &le; 11), the number of test cases, followed by the input data for each test case. The input for each test case will be as follows:</p>

<ul>
	<li>The first line of each instance contains two integers n (the number of bakers) and t (the number of the celebration we want the winners of).</li>
	<li>The next n lines of the instance each describe a baker. In each of these lines first comes the name of the baker (names are lower case strings of no more than 20 characters without spaces), then comes the number of chalk marks initially on the baker&rsquo;s house, then comes the number of bakers in this baker&rsquo;s favorite list, and after that come the names of the bakers in this baker&rsquo;s list.&nbsp;</li>
</ul>

### 출력

<p>There should be one line per test case. For each test case write a line containing a single integer, the number of the winners of the t-th celebration.</p>

### 제한

<ul>
	<li>1 &le;&nbsp;n &le;&nbsp;100</li>
	<li>1 &le;&nbsp;t &le;&nbsp;1,000,000,000</li>
	<li>0 &le;&nbsp;the number of chalk marks initially on the baker&rsquo;s house &lt; 100</li>
</ul>