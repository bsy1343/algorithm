# [Gold I] Shuriken Game - 5441

[문제 링크](https://www.acmicpc.net/problem/5441)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 27, 정답: 8, 맞힌 사람: 8, 정답 비율: 80.000%

### 분류

다이나믹 프로그래밍, 게임 이론

### 문제 설명

<p>Being a ninja means spending a lot of time training. To pass the time between training sessions, ninjas like to play games with their shurikens<sup>4</sup>. An old favorite of the ninjas is a game for two players featuring one stack of shurikens. In turn, each player takes a number of shurikens from the stack, at least one but at most N. The winner is the player to take the last shuriken(s). It took a while, but every ninja eventually discovered what strategy you have to follow in order to win, and the ninjas lost interest in the game.</p>

<p>Fortunately, one ninja came up with an additional rule that would hopefully make the game nontrivial again. This extra rule is that a player is not allowed to copy his opponent&rsquo;s last move, i.e. remove the same number of shurikens as his opponent just did. If the stack consists of just one shuriken, and the other player has just taken one, the player to move has no legal move and loses. Can you help the ninjas figure out how the player to move can win in a given game situation?</p>

<p><sup>4</sup>A shuriken is a metal star with sharp corners which ninjas use to throw at enemies</p>

<p>&nbsp;</p>

### 입력

<p>The first line of the input contains a single number: the number of test cases to follow. Each test case has the following format:</p>

<ul>
	<li>One line with three integers S, N and P, satisfying 1 &le; S &le; 100, 000, 2 &le; N &le; 100 and 1 &le; P &le; N: the number of shurikens in the stack, the maximum number of shurikens a player is allowed to take from the stack, and the last move from the other player, respectively.</li>
</ul>

### 출력

<p>For every test case in the input, the output should contain one integer on a single line: the smallest amount of shurikens that the player to move can take in order to secure the win. If there is no winning move, the output should be 0.</p>