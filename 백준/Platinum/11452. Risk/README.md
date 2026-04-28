# [Platinum III] Risk - 11452

[문제 링크](https://www.acmicpc.net/problem/11452)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 256 MB

### 통계

제출: 19, 정답: 12, 맞힌 사람: 9, 정답 비율: 64.286%

### 분류

수학, 다이나믹 프로그래밍, 확률론

### 문제 설명

<p>Good old friends Vladimir and Barack like to play games together. One of their favourites is the strategy board game Risk, where players occupy certain regions of the world, and are to conquer all regions of specific continents. Once in a while, Vladimir challenges the little boys in the neighbourhood for a game. This time, he asked Mark, who immediately said yes, excited that he was invited to play with one of the big boys.</p>

<p>Only later, Mark realized that Risk is a serious game and that Vladimir is a much more experienced player than he is. In order to have at least a little chance, Mark ask you for your advice on a specific aspect of the game. In particular, can you tell him what the probability is that Mark, occupying a certain region with M armies, wins the battle if he decides to attack an adjacent region occupied by Vladimir with N armies?</p>

<p>Rules for a battle</p>

<p>We consider the standard rules of Risk, with one exception: the dice used do not necessarily have six sides. The dice may have any number of sides D &ge; 1, all sides having different values and equal probability.</p>

<p>During a battle, the two players take turns in rolling the dice, until one of them has won. Suppose that the attacking player has A armies left in the region from which he is attacking, and that the defender has B armies in his region. Then first, the attacker rolls min{3, A &minus; 1} dice. That is, in principle, he uses three dice. However, if A &lt; 4, he uses A &minus; 1 dice, one die for each army he has minus 1, because one army must remain in the region and is not involved in the attack. Now, if B = 1, the defender rolls one die. If B &ge; 2, the defender chooses to roll one or two dice, so as to optimize his probability to win the battle.</p>

<p>Each player&rsquo;s highest die is compared, as is their second-highest die (if both players roll more than one). In each comparison, the highest number wins. The defender wins in the event of a tie. With each dice comparison, the loser removes one army from his region from the game board. Any extra dice are disregarded and do not affect the results.</p>

<p>For example, suppose that the attackers rolls three dice, yielding 4, 2 and 1, and that the defender rolls two dice, yielding 3 and 2. Then the first comparison (between 4 and 3) is won by the attacker, the second comparison (between 2 and 2) is won by the defender. As a result, both players lose one army. If, as another example, the attacker has two dice showing value 6, then it may be wise for the defender to roll only one die, so he loses at most one army.</p>

<p>The battle is over, when either the attacker has only one army left (the defender has won) or the defender has no more army left (the attacker has won).</p>

### 입력

<p>The input starts with a line containing an integer T, the number of test cases. Then for each test case:</p>

<ul>
	<li>One line containing an integer D satisfying 1 &le; D &le; 20: the number of sides of the dice in the game.</li>
	<li>One line containing two space-separated integers M and N satisfying 2 &le; M &le; 100 and 1 &le; N &le; 100: the number of armies at Mark&rsquo;s region, and the number of armies at Vladimir&rsquo;s region, respectively.</li>
</ul>

### 출력

<p>For each test case, output one line with a single real value: the probability that Mark wins the battle. An absolute precision error of 0.0001 is allowed. Scientific notation is also allowed.</p>