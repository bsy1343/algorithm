# [Silver V] TopYodeller - 6893

[문제 링크](https://www.acmicpc.net/problem/6893)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 88, 정답: 40, 맞힌 사람: 34, 정답 비율: 50.000%

### 분류

구현

### 문제 설명

<p>A yodel is a wordless song that shifts suddenly from a normal voice to a high, falsetto voice and back. Yodeling, present in many Swiss folk songs, is commonly heard throughout the Alps.</p>

<p>The TopYodeller contest invites the world&#39;s best yodellers to compete for a share of 100,000 Swiss Francs, with the best yodeller receiving 50,000 Francs. Each yodeller competes in a series of yodel rounds, and is assigned a score, by the judge, for their performance in the round. To keep the judge impartial, each yodeller is assigned a contestant number. Every yodeller competes in every yodel round. After all the yodel rounds are complete, the yodeller with the highest total score is declared the TopYodeller.</p>

<p>You have been hired by the TopYodeller Contest Co-ordinating Committee (CCC) to write a program which generates a scoreboard so that yodel fans around the world can track the progress of the best yodellers on the Internet.</p>

<p>After each round, each yodeller&#39;s cumulative score is calculated and a rank is assigned. A yodeller&#39;s rank is $j+1$ if $j$ yodellers have a cumulative score higher than their score. Therefore, there may be multiple yodellers at the same rank.</p>

### 입력

<p>Each test case consists of one TopYodeller competition. The first line of the input contains two integers, $n$ and $k$; $n$ $(2 \le n \le 100)$ represents the number of yodellers in the competition, and $k$ $(1 \le k \le 100)$ represents the number of yodel rounds in the competition.</p>

<p>Yodellers are assigned contestant numbers from $1$ to $n$.</p>

<p>Next in the input are $k$ lines, each line representing a yodel round.</p>

<p>Each line of input representing a yodel round contains $n$ integers. These $n$ integers give the scores assigned to the $n$ yodellers by the judge. The first integer corresponds to the score given to yodeller number $1$, and so forth. The score assigned to a yodeller in any given round is an integer between $-1\,000$ and $1\,000$, inclusive.</p>

### 출력

<p>For the highest-ranked yodeller at the end of the competition, output <code>Yodeller x is the TopYodeller: score y, worst rank z</code> where $x$ is the contestant number, $y$ is their total score after the competition, and $z$ is their worst rank at any time during the competition. If there is a tie for TopYodeller, the output should be one line per winning contestant, listed by increasing competitor number.</p>

### 힌트

<p>After Round 1</p>

<ul>
	<li>Yodeller 3 has score 100, and is ranked 1.</li>
	<li>Yodeller 1 has score 99, and is ranked 2.</li>
	<li>Yodeller 2 has score 97, and is ranked 3.</li>
	<li>Yodeller 4 has score 85, and is ranked 4.</li>
	<li>Yodeller 5 has score -4, and is ranked 5.</li>
</ul>

<p>After Round 2</p>

<ul>
	<li>Yodeller 5 has score 996, and is ranked 1.</li>
	<li>Yodeller 3 has score 200, and is ranked 2.</li>
	<li>Yodeller 1 has score 194, and is ranked 3.</li>
	<li>Yodeller 2 has score 194, and is ranked 3.</li>
	<li>Yodeller 4 has score 147, and is ranked 5.</li>
</ul>