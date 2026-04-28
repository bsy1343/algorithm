# [Gold I] A Reasonable Ranking - 7645

[문제 링크](https://www.acmicpc.net/problem/7645)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 20, 정답: 7, 맞힌 사람: 7, 정답 비율: 100.000%

### 분류

그래프 이론, 애드 혹, 해 구성하기

### 문제 설명

<p>Recently, there was a huge StarCraft II league at Stanford: the Stanford Local StarCraft II Contest (SLSC). There were N players in the contest, and each of the players played against each of the other players exactly once. Afterwards, the results of the games were written down in an N-by-N table. Sadly, it was not immediate from the table which players were better than which other players. Therefore, you, who hosted the league, decided to generate a reasonable ranking of the players. To be more specific, let x and y be two different players, where x is ranked higher than y. Then, the ordered pair (x, y) is reasonable if either one of the following conditions is satisfied:</p>

<ol>
	<li>Player x won the game against player y; or</li>
	<li>There exists another player z ranked between x and y such that both (x, z) and (z, y) are reasonable.</li>
</ol>

<p>A ranking is reasonable if all pairs of players are reasonable. Given the table, determine if there exists a reasonable ranking. If it is the case, give any such example.</p>

### 입력

<p>The input consists of multiple test cases. Each test case begins with a line containing a single integer N, 1 &le; N &le; 1,000, denoting the number of players. Then follow N lines describing the win-loss table M. The next N lines each contain a string of length N consisting only of &lsquo;0&rsquo; and &lsquo;1&rsquo;, without leading or trailing spaces. The jth character on the ith line, M<sub>ij</sub>, is equal to 1 if player i won against player j and 0 otherwise. You may assume that for any i &ne; j, exactly one of M<sub>ij</sub> and M<sub>ji</sub> is 1, and the other is 0. That is, there are no draws. Also, we have M<sub>ii</sub> = 0 for all i (which shouldn&rsquo;t matter anyway). Input is followed by a single line with N = 0, which should not be processed.</p>

### 출력

<p>For each test case, print out a space-separated reasonable ranking of all the players, from the highest ranked player to the lowest. If there is no reasonable ranking, print &ldquo;impossible&rdquo; (without quotes) instead.</p>