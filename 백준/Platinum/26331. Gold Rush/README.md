# [Platinum III] Gold Rush - 26331

[문제 링크](https://www.acmicpc.net/problem/26331)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 60, 정답: 25, 맞힌 사람: 14, 정답 비율: 29.787%

### 분류

조합론, 뤼카 정리, 수학, 정수론

### 문제 설명

<p>After learning about the gold rush in school, your friends have decided to have a gold mining tournament. This one-of-a-kind tournament will be the largest of its kind!</p>

<p>For the tournament, everyone will all line up in a row. Every pair of consecutive people will then face off in a &quot;round&quot; of the tournament. Assuming there are 7 people in the tournament, the first round would look something like this when pairing off: (1, 2) (3, 4) (5, 6) (7).</p>

<p>Notice that when there are an odd number of people in a round, the last person automatically advances to the next round. The remaining players in that round play a best-of-k format where k is an odd number of games. The first person to win ceiling(k/2) games advances to the next round, the other player is eliminated from the tournament, and no more games are played between those players.</p>

<p>For example, let&#39;s say players 2, 3, 5, and 7 advance from the first round above. The following round then pairs off in order and the match ups look like this: (2, 3) (5, 7).</p>

<p>The rounds continue in this fashion until a single player remains, the tournament winner!</p>

<p>You would like to know, for a given tournament layout, how many ways the tournament records can play out. Two tournament records are considered different if one of the following conditions is met:</p>

<ol>
	<li>The number of games played by a player in the tournament is different.</li>
	<li>The outcome of the i-th game played by a player is different.</li>
</ol>

<p>Given the number of players in a tournament and its format (as in best-of-k), determine the number of possible win-loss records.</p>

### 입력

<p>The input begins with a single positive integer, t, representing the number of tournaments to evaluate. Each of the next t lines contains two integers, n (1 &le; n &le; 10<sup>17</sup>) and k (1 &le; k &le; 10<sup>17</sup>), representing the number of players and the best-of-k format, respectively.</p>

### 출력

<p>For each tournament, output the number of possible win-loss records. As this number may be quite large, output the result modulo 1,000,003.</p>