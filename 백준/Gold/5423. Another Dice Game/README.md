# [Gold II] Another Dice Game - 5423

[문제 링크](https://www.acmicpc.net/problem/5423)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 12, 정답: 9, 맞힌 사람: 7, 정답 비율: 77.778%

### 분류

수학, 다이나믹 프로그래밍, 확률론, 런타임 전의 전처리

### 문제 설명

<p>In the game Pickomino<sup>1</sup> one has to throw 8 dice to reach at least a certain target score. The rules are as follows:</p>

<ul>
	<li>The dice contain the values 1, 2, 3, 4, 5 and worm. The dice are fair, so all outcomes are equally likely.</li>
	<li>The game is started by throwing all dice.</li>
	<li>After a throw, the player must pick one of the six possible values and put all dice with this value aside. There must be at least one die with this value.</li>
	<li>After putting some dice aside, the player may choose to either throw the remaining dice again or stop. The player may only stop after at least one worm has been put aside.</li>
	<li>Each possible value may only be chosen once during the game.</li>
	<li>When the player stops, his total score is the sum of the values of the dice that were put aside. A worm is worth 5 points.</li>
	<li>The player can get stuck by throwing only values that were already put aside, by having put all dice aside but not having a worm or by not having reached the target score.</li>
	<li>If the player is stuck he scores 0 points and the game is ended.</li>
</ul>

<p>Jan is playing Pickomino and wants to score at least n points. When Jan uses an optimal strategy, what is the probability that he reaches this target?</p>

<p><sup>1</sup>Dutch people may know this game as Regenwormen</p>

### 입력

<p>On the first line one positive number: the number of test cases, at most 100. After that per test case:</p>

<p>one line with the integer n (1 &le; n &le; 40): the target value.</p>

### 출력

<p>Per test case:</p>

<ul>
	<li>one line with a floating point number: the probability that you score at least n points when using an optimal strategy.</li>
</ul>

<p>This number should be accurate up to 10-6 relative or absolute precision</p>

### 힌트

<p>To reach 5 points it is enough to throw at least one worm. The optimal strategy in this case is therefore to stop as soon as you have a worm. If you did not throw a worm, you should put aside as few dice as possible to maximize the chance of throwing a worm in a later throw.</p>