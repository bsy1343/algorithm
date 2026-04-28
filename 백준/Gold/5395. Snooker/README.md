# [Gold V] Snooker - 5395

[문제 링크](https://www.acmicpc.net/problem/5395)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 58, 정답: 15, 맞힌 사람: 14, 정답 비율: 48.276%

### 분류

많은 조건 분기, 구현, 수학, 시뮬레이션

### 문제 설명

<p>Ronnie owns a very old TV with no sound, and a screen so unclear that letters cannot be read. So when Ronnie watches a Snooker match on TV, he cannot see the current score, nor the currently active player. The only thing he can observe is the colour of the ball that is potted or missed. Ronnie does not care who wins, but he has no interest in decided matches. We therefore want to determine when a match is decided.</p>

<p>Snooker is a two-player game, played on a table with 15 red balls (each worth 1 point), and 1 yellow, green, brown, blue, pink and black ball (worth 2,3,4,5,6 and 7 points, respectively). Players take turns in which they score (&ldquo;pot&rdquo;) a sequence of balls, and the turn changes when a player misses a ball. For both players, the initial goal in each turn is to first pot one red ball. When the player succeeds, he must pot a non-red ball of choice, after which he has to pot a red ball again, then again a non-red ball, etc. Red balls remain potted, and non-red balls are returned to the table when potted. When a player pots the last red ball, he must again (try to) pot a non-red ball, which then is returned to the table.</p>

<p>Next, the non-red balls are to be potted in their order of value (from 2 to 7), and are no longer returned to the table. The game has ended when the last ball (i.e., the black ball) has been potted, leaving an empty table. It is easily verified that it takes at least 36 shots to end the game.</p>

<p>The player with the highest score wins. If the scores are equal after the last ball has been potted, turn does not change and the black ball is re-placed on the table, and the first player to pot this ball wins. We assume that the only mistake the players can make is to miss a ball. In particular, we assume that they never pot the wrong ball (as can happen in the real game).</p>

<p>We call a game decided, if at some point during the game the difference between the scores of the two players is so big, that the player with the lower score cannot possibly win anymore.</p>

<p>Example 1: If the score is 60&ndash;44 and only the black and pink ball are left on the table, the difference is 16 and the value of the remaining balls is 13, and we call the game decided.</p>

<p>Example 2: If a player just scored a non-red ball, and there are two red balls and thus also all non-red balls remaining, the maximum value of the remaining balls is 1(red)+7(black)+1(red)+7 (black)+2+3+4+5+6+7= 43, so if the current score is 70&ndash;26, we call the game decided, but if the score is 70&ndash;28 or even 70&ndash;27, we do not.</p>

### 입력

<p>The first line of the input contains a single number: the number of test cases to follow. Each test case has the following format:</p>

<ul>
	<li>One line with an integer N, satisfying 36 &le; N &le; 1, 000: the length of a sequence of balls that are hit.</li>
	<li>One line with N integers v satisfying 0 &le; v &le; 7: the values of the balls that are potted successively, where v = 0 indicates that a player misses some ball. The integers constitute a complete, valid sequence. That is, they represent a game according to the rules described above, ending with the last, black ball. The integers are separated by single spaces.</li>
</ul>

### 출력

<p>For every test case in the input, the output should contain a single number, on a single line: the (minimum) number i of the ball in the sequence (which is numbered from 1 to N), after which the game is decided.</p>