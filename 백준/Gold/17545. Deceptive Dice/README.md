# [Gold IV] Deceptive Dice - 17545

[문제 링크](https://www.acmicpc.net/problem/17545)

### 성능 요약

시간 제한: 1 초 (추가 시간 없음), 메모리 제한: 512 MB

### 통계

제출: 98, 정답: 77, 맞힌 사람: 71, 정답 비율: 79.775%

### 분류

다이나믹 프로그래밍, 수학, 확률론

### 문제 설명

<p>Recently your town has been infested by swindlers who convince unknowing tourists to play a simple dice game with them for money. The game works as follows: given is an n-sided die, whose sides have 1, 2, . . . , n pips, and a positive integer k. You then roll the die, and then have to make a choice. Option 1 is to stop rolling. Option 2 is to reroll the die, with the limitation that the die can only be rolled k times in total. Your score is the number of pips showing on your final roll.</p>

<p>Obviously the swindlers are better at this game than the tourists are. You, proud supporter of the Battle Against Probabilistic Catastrophes, decide to fight this problem not by banning the swindlers but by arming the tourists with information.</p>

<p>You create pamphlets on which tourists can find the maximum expected score for many values of n and k. You are sure that the swindlers will soon stop their swindling if the tourists are better prepared than they are!</p>

<p>The layout of the flyers is done, and you have distribution channels set up. All that is left to do is to calculate the numbers to put on the pamphlet.</p>

<p>Given the number of sides of the die and the number of times you are allowed to roll, calculate the expected (that is, average) score when the game is played optimally.</p>

### 입력

<ul>
	<li>A single line with two integers 1 &le; n &le; 100, the number of sides of the die, and 1 &le; k &le; 100, the number of times the die may be rolled.</li>
</ul>

### 출력

<p>Output the expected score when playing optimally. Your answer should have an absolute or relative error of at most 10<sup>&minus;7</sup>.</p>