# [Platinum III] Play the Dragon (Small) - 14801

[문제 링크](https://www.acmicpc.net/problem/14801)

### 성능 요약

시간 제한: 5 초, 메모리 제한: 512 MB

### 통계

제출: 103, 정답: 24, 맞힌 사람: 17, 정답 비율: 23.944%

### 분류

그리디 알고리즘, 구현, 시뮬레이션

### 문제 설명

<p>You are a friendly dragon fighting to protect your lair from a greedy knight! You have&nbsp;<strong>H<sub>d</sub></strong>health points and an attack power of&nbsp;<strong>A<sub>d</sub></strong>, and the knight has&nbsp;<strong>H<sub>k</sub></strong>&nbsp;health points and an attack power of&nbsp;<strong>A<sub>k</sub></strong>. If your health drops to 0 or below at any point; you are knocked out and you instantly lose; if the knight&#39;s health drops to 0 or below at any point, the knight is knocked out and you win!</p>

<p>You will battle the knight in a series of turns. On each turn, you go first, and you can choose and execute any one of the following actions.</p>

<ul>
	<li>Attack: Reduce the opponent&#39;s health by your own attack power.</li>
	<li>Buff: Increase your attack power by&nbsp;<strong>B</strong>&nbsp;for the rest of the battle.</li>
	<li>Cure: Your health becomes&nbsp;<strong>H<sub>d</sub></strong>.</li>
	<li>Debuff: Decrease the opponent&#39;s attack power by&nbsp;<strong>D</strong>&nbsp;for the rest of the battle. If a Debuff would cause the opponent&#39;s attack power to become less than 0, it instead sets it to 0.</li>
</ul>

<p>Then, if the knight&#39;s health is greater than 0 following your action, the knight will execute an Attack action. After that, the turn ends. (Note that a turn in which you defeat the knight still counts as a turn even though the knight does not get to act.)</p>

<p>Note that buffs stack with each other; every buff adds an additional&nbsp;<strong>B</strong>&nbsp;to your attack power. Similarly, debuffs stack with each other.</p>

<p>You would like to defeat the knight as fast as possible (if it is possible) so that you will not be late to help the villagers roast marshmallows at tonight&#39;s festival. Can you determine the minimum number of turns in which you can defeat the knight, or that it is&nbsp;<code>IMPOSSIBLE</code>to do so?</p>

### 입력

<p>The first line of the input gives the number of test cases,&nbsp;<strong>T</strong>.&nbsp;<strong>T</strong>&nbsp;test cases follow. Each consists of one line with six integers&nbsp;<strong>H<sub>d</sub></strong>,&nbsp;<strong>A<sub>d</sub></strong>,&nbsp;<strong>H<sub>k</sub></strong>,&nbsp;<strong>A<sub>k</sub></strong>,&nbsp;<strong>B</strong>, and&nbsp;<strong>D</strong>, as described above.</p>

<p>Limits</p>

<ul>
	<li>1 &le;&nbsp;<strong>T</strong>&nbsp;&le; 100.</li>
	<li>1 &le;&nbsp;<strong>H<sub>d</sub></strong>&nbsp;&le; 100.</li>
	<li>1 &le;&nbsp;<strong>A<sub>d</sub></strong>&nbsp;&le; 100.</li>
	<li>1 &le;&nbsp;<strong>H<sub>k</sub></strong>&nbsp;&le; 100.</li>
	<li>1 &le;&nbsp;<strong>A<sub>k</sub></strong>&nbsp;&le; 100.</li>
	<li>0 &le;&nbsp;<strong>B</strong>&nbsp;&le; 100.</li>
	<li>0 &le;&nbsp;<strong>D</strong>&nbsp;&le; 100.</li>
</ul>

### 출력

<p>For each test case, output one line containing&nbsp;<code>Case #x: y</code>, where&nbsp;<code>x</code>&nbsp;is the test case number (starting from 1) and&nbsp;<code>y</code>&nbsp;is either&nbsp;<code>IMPOSSIBLE</code>&nbsp;if it is not possible to defeat the knight, or the minimum number of turns needed to defeat the knight.</p>

### 힌트

<p>In Case #1, you have 11 health and 5 attack, and the knight has 16 health and 5 attack. One possible optimal sequence of actions is:</p>

<ul>
	<li>Turn 1: Attack, reducing the knight&#39;s health to 11. Then the knight attacks and reduces your health to 6.</li>
	<li>Turn 2: Attack, reducing the knight&#39;s health to 6. Then the knight attacks and reduces your health to 1.</li>
	<li>Turn 3: Cure, restoring your health to 11. Then the knight attacks and reduces your health to 6. (If you had attacked instead this turn, the knight&#39;s next attack would have caused you to lose.)</li>
	<li>Turn 4: Attack, reducing the knight&#39;s health to 1. Then the knight attacks and reduces your health to 1.</li>
	<li>Turn 5: Attack, reducing the knight&#39;s health to -4. You instantly win and the knight does not get another attack.</li>
</ul>

<p>In Case #2, one possible optimal sequence of actions is:</p>

<ul>
	<li>Turn 1: Buff, increasing your attack power to 3. Then the knight attacks and reduces your health to 1.</li>
	<li>Turn 2: Attack, reducing the knight&#39;s health to 0. You instantly win and the knight does not get another attack.</li>
</ul>

<p>In Case #3, the knight only needs two attacks to defeat you, and you cannot do enough damage fast enough to defeat the knight. You can indefinitely extend the combat by executing the Cure action after every attack, but it is impossible to actually defeat the knight.</p>

<p>In Case #4, one possible optimal sequence of actions is: Attack, Debuff, Buff, Attack, Attack.</p>