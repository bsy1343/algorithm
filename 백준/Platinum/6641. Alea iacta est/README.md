# [Platinum V] Alea iacta est - 6641

[문제 링크](https://www.acmicpc.net/problem/6641)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 128 MB

### 통계

제출: 3, 정답: 2, 맞힌 사람: 2, 정답 비율: 66.667%

### 분류

다이나믹 프로그래밍

### 문제 설명

<p>Isaac B. Manfred always dreamed about being a terribly rich man. When he was a child, he played with banknotes instead of toys. After finishing high school, he quickly became a senior broker in one famous bank. His career rose rapidly and also did his wealth. Unfortunately, the bank crisis changed his life significantly. The broker suddenly became broke.</p>

<p>To gain his money back, I.B.M. spent a lot of time in casinos, trying to earn some money there. Most people who ever tried to get rich in casinos are actually very poor today. But this does not include I.B.M. He is a very clever guy and instead of blindly betting his money, he carefully studies various games and computes the probabilities of losing or winning. First, he tried his luck with Roulette and Blackjack, but found out that the odds of winning a fortune are low.</p>

<p>Recently, I.B.M. started to study dice games. He found several of them similar to a trademarked game called Yahtzee! The rules sometimes vary but basic principles are the same. To give you an idea, we will describe a simplified version of such rules.</p>

<p>The game consists of rounds. In each round, a player rolls five dice. After the first roll, it is possible to keep some of the dice and re-roll the rest of them. Any number of dice can be rerolled (including none or all of them). If the re-rolled dice still do not fit the player&rsquo;s intentions, it is possible to re-roll some of them again, for the third and final time. After at most two such re-rolls, the player must assign the result to one of possible combinations and the round is scored according to that combination.</p>

<p>The following table shows the list of combinations, conditions that must be satisfied to use them, and the number of points scored when the combination is used.</p>

<table class="table table-bordered">
	<thead>
		<tr>
			<th>Combination</th>
			<th>Condition</th>
			<th>Scoring</th>
			<th>Example</th>
			<th>Score</th>
		</tr>
	</thead>
	<tbody>
		<tr>
			<td>Ones</td>
			<td>At least one 1.</td>
			<td>One point for each 1.</td>
			<td>1 1 2 4 5</td>
			<td>2</td>
		</tr>
		<tr>
			<td>Twos</td>
			<td>At least one 2.</td>
			<td>Two points for each 2.</td>
			<td>1 2 2 2 6</td>
			<td>6</td>
		</tr>
		<tr>
			<td>Threes</td>
			<td>At least one 3.</td>
			<td>Three points for each 3.</td>
			<td>1 2 4 5 5</td>
			<td>0</td>
		</tr>
		<tr>
			<td>Fours</td>
			<td>At least one 4.</td>
			<td>Four points for each 4.</td>
			<td>4 4 4 4 4</td>
			<td>20</td>
		</tr>
		<tr>
			<td>Fives</td>
			<td>At least one 5.</td>
			<td>Five points for each 5.</td>
			<td>1 2 3 4 5</td>
			<td>5</td>
		</tr>
		<tr>
			<td>Sixes</td>
			<td>At least one 6.</td>
			<td>Six points for each 6.</td>
			<td>1 4 6 6 6</td>
			<td>18</td>
		</tr>
		<tr>
			<td>Sequence</td>
			<td>(1 2 3 4 5) or (2 3 4 5 6).</td>
			<td>Thirty points.</td>
			<td>1 2 3 4 5</td>
			<td>30</td>
		</tr>
		<tr>
			<td>Full House</td>
			<td>Three of the same value and a pair of another value.</td>
			<td>Sum of all dice values.</td>
			<td>2 2 5 5 5</td>
			<td>19</td>
		</tr>
		<tr>
			<td>Four of a kind</td>
			<td>Four of the same value, the fifth one different.</td>
			<td>Sum of all dice values.</td>
			<td>4 4 4 4 5</td>
			<td>21</td>
		</tr>
		<tr>
			<td>Five of a kind</td>
			<td>All five of the same value.</td>
			<td>Fifty points.</td>
			<td>1 1 1 1 1</td>
			<td>50</td>
		</tr>
		<tr>
			<td>Chance</td>
			<td>None.</td>
			<td>Sum of all dice values.</td>
			<td>2 4 5 5 6</td>
			<td>22</td>
		</tr>
	</tbody>
</table>

<p>A small example: The player rolls 2, 3, 6, 6, 5. The two 6&rsquo;s are kept and the three remaining dice re-rolled, they give new values: 1, 1, 6. The player may now choose to score 20 points immediately for a Full House. Instead, he or she decides to re-roll the two 1&rsquo;s again, in hope there will be another 6. The dice give 4 and 5 and the player will score either 18 points for Sixes or 27 points for Chance.</p>

<p>The main point of the game is that there are eleven combinations and eleven rounds. During the whole game, each combination must be used exactly once. It may happen that some result would not fit into any available combination. In such a case, the player must select some combination anyway, scoring zero points for that round and losing the possibility to use that combination later. These rules make the game very tricky, especially at the end, when the combinations have been almost exhausted.</p>

<p>Now, we get back to Isaac. He found a casino with an electronic version of this dice game. After carefully watching many games of other players, he was able to crack the random-number generator used in the machine. Therefore, he is able to predict the following rolls exactly. What an opportunity! However, it is still not easy to find the optimal strategy. If you write a program that would help him to become rich, he may share some of his money with you.</p>

### 입력

<p>The input contains several scenarios, each of them specified on a single line. The line contains three numbers separated by a space: A, C, and X<sub>0</sub>. These numbers describe the random-number generator: A is called a multiplier (1 &le; A &le; 2<sup>31</sup>), C is an increment (0 &le; C &le; 2<sup>31</sup>), and X<sub>0</sub> is the initial seed (0 &le; X0 &le; 2<sup>31</sup>). The last scenario is followed by a line containing three zeros.</p>

<p>The generator is a linear congruential generator, which means that the next random number is calculated from the previous one using the following formula:</p>

<p style="text-align: center;">X<sub>n+1</sub> = (A &lowast; X<sub>n</sub> + C) mod 2<sup>32</sup></p>

<p>The modulo operation specifies that only the lowest 32 bits of the result are used, the rest is discarded. Numbers X<sub>1</sub>, X<sub>2</sub>, X<sub>3</sub> ... constitute a pseudo-random sequence, each of them determines the result of one individual roll of a dice. With congruential generators, the &ldquo;randomness&rdquo; of the numbers is in their higher bits only &mdash; therefore, to get a result of the n-th roll (starting with n = 1), we discard lower 16 bits of the number X<sub>n</sub> and compute the remainder when the number in bits 16-31 is divided by six. This gives a number between 0 and 5, by adding one, we get a number shown on a dice:</p>

<p style="text-align: center;">roll(n)=[floor(X<sub>n</sub>/2<sup>16</sup>) mod 6] + 1</p>

<p>For example, when A = 69069, C = 5, and the X0 = 0 is zero, we get the following sequence of &ldquo;random&rdquo; rolls: 1, 6, 6, 3, 2, 4, 3, 2, 3, 5, 1, 6, 6, 4, 5, 1, 3, 4, 1, ...</p>

### 출력

<p>For each scenario, print one integer number: the maximal number of points that may be scored in a game determined by the given generator. The score is calculated after 11 rounds as the sum of scores in all combinations.</p>