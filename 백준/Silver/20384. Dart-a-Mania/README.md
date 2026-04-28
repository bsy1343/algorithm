# [Silver IV] Dart-a-Mania - 20384

[문제 링크](https://www.acmicpc.net/problem/20384)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 512 MB

### 통계

제출: 51, 정답: 38, 맞힌 사람: 26, 정답 비율: 78.788%

### 분류

브루트포스 알고리즘, 구현

### 문제 설명

<p>The game of darts has many variations. One such variation is the game of&nbsp;<b>301</b>. In the game of 301 each player starts with a score of 301 (hence the name). Each player, in turn, throws three darts to score points which are subtracted from the player&#39;s current score. For instance, if a player has a current score of 272 and scores 55 points with the three darts, the new score would be 217. Each dart that is tossed may strike regions on the dartboard that are numbered between 1 and 20. (A value of zero indicates that the player either missed the dartboard altogether or elected to not throw the dart.) A dart that strikes one of these regions will either score the number printed on the dartboard, double the number printed, or triple the number printed. For example, a player may score 17, 34, or 51 points with a toss of one dart that hits one of the regions marked with a 17. A third way to score points with one dart is to hit the BULLS EYE which is worth 50 points. (There is no provision for doubling or tripling the bull&#39;s eye score.)</p>

<p>The first player to reduce his score to&nbsp;<u>exactly zero</u>&nbsp;wins the game. If a player scores more points than his/her current score, the player is said to have &quot;busted&quot; and the new score is returned to the last current score.</p>

<p>Given a player&#39;s current dart score, write a program to calculate all the possible combinations and permutations of scores on throwing three darts that would reduce the player&#39;s score to exactly zero (meaning the player won the game). The output of the program should contain the number of combinatons and permutations found.</p>

<p>For example, if the player&#39;s current score is 2, then there would be two combinations and six permutations. The combinations would be: 1) obtain a score of 2 on any one dart and zero on the other two, and 2) obtain a score of one on two different darts and zero on the third dart. The order in which this is accomplished is not important.</p>

<p>With permutations the order is significant; therefore the six permutations would be as follows:</p>

<table class="table table-bordered table-center-40">
	<tbody>
		<tr>
			<td>Dart 1:</td>
			<td>2</td>
			<td>0</td>
			<td>0</td>
			<td>1</td>
			<td>1</td>
			<td>0</td>
		</tr>
		<tr>
			<td>Dart 2:</td>
			<td>0</td>
			<td>2</td>
			<td>0</td>
			<td>1</td>
			<td>0</td>
			<td>1</td>
		</tr>
		<tr>
			<td>Dart 3:</td>
			<td>0</td>
			<td>0</td>
			<td>2</td>
			<td>0</td>
			<td>1</td>
			<td>1</td>
		</tr>
	</tbody>
</table>

<p>(Note: The program doesn&#39;t print out the actual permutations &amp; combinations, just the total number of each.)</p>

### 입력

<p>The input&nbsp;contains a list of integers (each &le; 999), one per line, that represent several players&#39; current scores. A value of zero or less will signify the end of the input.</p>

### 출력

<p>For each positive integer in the input, 2 or 3 line(s) will be written to the output.</p>

<p>If the score can be reduced to zero, your program should write the lines:</p>

<pre>
NUMBER OF COMBINATIONS THAT SCORES x IS c.
NUMBER OF PERMUTATIONS THAT SCORES x IS p.
</pre>

<p>where x is the value of the player&#39;s score while c and p are the total number of combinations and permutations possible, respectively.</p>

<p>If it is impossible to reduce the player&#39;s score to zero, write the line:</p>

<pre>
THE SCORE OF x CANNOT BE MADE WITH THREE DARTS.
</pre>

<p>After the line(s) above are printed, your program should write a line of 70 asterisks to separate output for different scores. The message &quot;END OF OUTPUT&quot; should appear at the end of the output.</p>