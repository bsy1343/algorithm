# [Bronze III] Filling Out the Team - 4758

[문제 링크](https://www.acmicpc.net/problem/4758)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 932, 정답: 622, 맞힌 사람: 570, 정답 비율: 66.745%

### 분류

구현

### 문제 설명

<p>Over the years, the people of the great city of Pittsburgh have repeatedly demonstrated a collective expertise at football second to none. Recently a spy has discovered the true source of the city&rsquo;s football power&mdash;a wizard known only as &ldquo;Myron,&rdquo; who is infallible at selecting the proper position at which each player will excel.</p>

<p>Now that you know the source of Pittsburgh&rsquo;s wisdom, you are determined to provide your school&rsquo;s football team with a computer program that matches the wisdom of &ldquo;Myron.&rdquo; You have consulted with the best football minds you can find, and they have dispensed their wisdom on the slowest speed, minimum weight, and minimum strength required to play each position.</p>

<table border="1" cellpadding="1" cellspacing="1" style="width:500px">
	<tbody>
		<tr>
			<td style="text-align: center;">Position</td>
			<td style="text-align: center;">Slow. Speed</td>
			<td style="text-align: center;">Min. Weight</td>
			<td style="text-align: center;">Min. Strength</td>
		</tr>
		<tr>
			<td style="text-align: center;">Wide Receiver</td>
			<td style="text-align: center;">4.5</td>
			<td style="text-align: center;">150</td>
			<td style="text-align: center;">200</td>
		</tr>
		<tr>
			<td style="text-align: center;">Lineman&nbsp;</td>
			<td style="text-align: center;">6.0</td>
			<td style="text-align: center;">300</td>
			<td style="text-align: center;">500</td>
		</tr>
		<tr>
			<td style="text-align: center;">Quarterback</td>
			<td style="text-align: center;">5.0</td>
			<td style="text-align: center;">200</td>
			<td style="text-align: center;">300</td>
		</tr>
	</tbody>
</table>

<p>Using this knowledge, you will develop a program that reads in several players physical at- tributes and outputs what position(s) they are able to play.</p>

### 입력

<p>Each line of the input file will list the attributes for one player:</p>

<p>&lt;speed&gt; &lt;weight&gt; &lt;strength&gt;</p>

<p>Each number will be a real-valued number. The file will end with a line reading &ldquo;0 0 0&rdquo;</p>

### 출력

<p>For each player, you will output one line listing the positions that player can play. A player can play a position if each of their attributes is greater or equal to the minimum for weight and strength, and less than or equal to the slowest speed. If a player can play multiple positions, output them in the order listed above, separated by whitespace. You may leave an extra space at the end of the line. If a player can play no positions, write &ldquo;No positions&rdquo; on the line.</p>