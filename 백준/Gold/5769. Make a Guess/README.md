# [Gold V] Make a Guess - 5769

[문제 링크](https://www.acmicpc.net/problem/5769)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 23, 정답: 12, 맞힌 사람: 12, 정답 비율: 57.143%

### 분류

브루트포스 알고리즘, 구현

### 문제 설명

<p>MasterMind is a game that was created by a telecommunication engineer named Mordechai Meirovitz, from Romania, in 1971. The game was awarded the prestigious &ldquo;The Year&rsquo;s Game&rdquo; in 1974 and was a huge commercial success, having been sold in more than 40 countries.</p>

<p>MasterMind is a logical game in which your objective as a player is to find out a secret password chosen by an opponent player. The password to be found is a sequence of characters from a given alphabet. In order to find out what the password is, you submit &ldquo;guesses&rdquo; to your opponent. A guess is a possible password. That is, a guess is a sequence of the same number of characters as the password, from the same alphabet.</p>

<p>After each guess you receive an answer, which consists of two integers, (E, G), indicating how good your guess was. If a character in a guess exists in the password at the same position (in the string) then it counts as &ldquo;excellent&rdquo; (E). Otherwise if a character exists in both the guess and the password, but in a different position in the string, then it counts as &ldquo;good&rdquo; (G). A single character from a guess is not counted twice (that is, if it is counted as excellent it is not counted as good). The table below illustrates some examples.</p>

<table class = "table table-bordered">
	<tbody>
		<tr>
			<td style="text-align:center">Password</td>
			<td style="text-align:center">Guess</td>
			<td style="text-align:center">Answer</td>
			<td>Remark</td>
		</tr>
		<tr>
			<td style="text-align:center">1233</td>
			<td style="text-align:center">3243</td>
			<td style="text-align:center">(2, 1)</td>
			<td>&lsquo;2&rsquo; and the second &lsquo;3&rsquo; are at the same position in both the pass- word and guess, and because the first &lsquo;3&rsquo; also exists in the pass- word, but in another position.</td>
		</tr>
		<tr>
			<td style="text-align:center">1233</td>
			<td style="text-align:center">3000</td>
			<td style="text-align:center">(0, 1)</td>
			<td>The only coincident character in both the password and the guess is the &lsquo;3&rsquo;, but in different positions.</td>
		</tr>
		<tr>
			<td style="text-align:center">1233</td>
			<td style="text-align:center">4455</td>
			<td style="text-align:center">(0, 0)</td>
			<td>&lsquo;4&rsquo; and &lsquo;5&rsquo; are not present in the password.</td>
		</tr>
		<tr>
			<td style="text-align:center">1233</td>
			<td style="text-align:center">1233</td>
			<td style="text-align:center">(4, 0)</td>
			<td>Right!</td>
		</tr>
	</tbody>
</table>

<p><br />
Based on the answers received after each guess, a player can eventually deduce what the password is. The goal of the game is to find out the password with the minimum number of guesses.</p>

<p>You must write a program to help you to find the password, showing all deduced positions after a set of guesses and answers.</p>

### 입력

<p>The input contains several test cases. The first line of a test case contains three integers N, L and K. N indicates the number of guesses (0 &le; N &le; 1000), L indicates the length of the password (1 &le; L &le; 4) and K indicates the size of the alphabet used (1 &le; K &le; 18). The next line contains K characters that can be digits (&lsquo;0&rsquo; to &lsquo;9&rsquo;) or capital letters (&lsquo;A&rsquo; to &lsquo;Z&rsquo;), specifying the alphabet used in the password. The following N lines contain each a guess and an answer. A guess is a sequence of L characters from the alphabet used. An answer is composed by two integers E and G, (respectively the excellency and goodness of the guess, as explained above). The end of input is indicated by N = L = K = 0.</p>

<p><em>The input must be read from standard input.</em></p>

### 출력

<p>For each test case in the input file your program must print one single line containing the information deduced from the set of guesses and answers. If it is possible to deduce the entire password from the set of guesses and answers, then your program should print the password. Otherwise, it should print a character &lsquo;?&rsquo; in each non-deduced position of the password, as shown in the examples.</p>

<p><em>The output must be written to standard output.</em></p>