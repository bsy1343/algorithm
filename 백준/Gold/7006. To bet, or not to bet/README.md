# [Gold III] To bet, or not to bet - 7006

[문제 링크](https://www.acmicpc.net/problem/7006)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 17, 정답: 8, 맞힌 사람: 7, 정답 비율: 77.778%

### 분류

다이나믹 프로그래밍

### 문제 설명

<p>Alexander Charles McMillan loves to gamble,&nbsp;and during his last trip to the casino he ran across a new game. It is played on a linear sequence of squares as shown below.</p>

<table border="1" cellpadding="1" cellspacing="1" style="width:300px">
	<tbody>
		<tr>
			<td style="text-align: center;">Start</td>
			<td style="text-align: center;">&nbsp; &nbsp; &nbsp;&nbsp;</td>
			<td style="text-align: center;">&nbsp; &nbsp; &nbsp;&nbsp;</td>
			<td style="text-align: center;">&nbsp; ... &nbsp;&nbsp;</td>
			<td style="text-align: center;">&nbsp; &nbsp; &nbsp;&nbsp;</td>
			<td style="text-align: center;">&nbsp; &nbsp; &nbsp;&nbsp;</td>
			<td style="text-align: center;">End</td>
		</tr>
	</tbody>
</table>

<p>A chip is initially placed on the Start square. The player then tries to move the chip to the End square through a series of turns, at which point the game ends. In each turn a coin is fl ipped: if the coin is heads the chip is moved one square to the right and if the coin is tails the chip is moved two squares to the right (unless the chip is one square away from the End square, in which case it just moves to the End square). At that point, any instruction on the square the coin lands on must be followed. Each instruction is one of the following:&nbsp;</p>

<ol>
	<li>Move right n squares (where n is some positive integer)&nbsp;</li>
	<li>Move left n squares (where n is some positive integer)&nbsp;</li>
	<li>Lose a turn&nbsp;</li>
	<li>No instruction&nbsp;</li>
</ol>

<p>After following the instruction, the turn ends and a new one begins. Note that the chip only follows the instruction on the square it lands on after the coin flip. If, for example, the chip lands on a square that instructs it to move 3 spaces to the left, the move is made, but the instruction on the resulting square is ignored and the turn ends. Gambling for this game proceeds as follows: given a board layout and an integer T, you must wager whether or not you think the game will end within T turns.&nbsp;</p>

<p>After losing his shirt and several other articles of clothing, Alexander has decided he needs professional help-not in beating his gambling addiction, but in writing a program to help decide how to bet in this game.</p>

### 입력

<p>Input will consist of multiple problem instances. The first line will consist of an integer n indicating the number of problem instances. Each instance will consist of two lines: the first will contain two integers m and T (1 &lt;= m &lt;= 50, 1 &lt;= T &lt;= 40), where m is the size of the board excluding the Start and End squares, and T is the target number of turns. The next line will contain instructions for each of the m interior squares on the board. Instructions for the squares will be separated by a single space, and a square instruction will be one of the following: +n, -n, L or 0 (the digit zero). The first indicates a right move of n squares, the second a left move of n squares, the third a lose-a-turn square, and the fourth indicates no instruction for the square. No right or left move will ever move you off the board.</p>

### 출력

<p>Output for each problem instance will consist of one line, either&nbsp;<br />
Bet for. x.xxxx&nbsp;</p>

<p>if you think that there is a greater than 50% chance that the game will end in T or fewer turns, or&nbsp;<br />
Bet against. x.xxxx&nbsp;</p>

<p>if you think there is a less than 50% chance that the game will end in T or fewer turns, or&nbsp;<br />
Push. 0.5000&nbsp;</p>

<p>otherwise, where x.xxxx is the probability of the game ending in T or fewer turns rounded to 4 decimal places. (Note that due to rounding the calculated probability for display, a probability of 0.5000 may appear after the Bet for. or Bet against. message.)</p>