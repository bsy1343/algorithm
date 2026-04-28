# [Bronze III] Better Dice - 30306

[문제 링크](https://www.acmicpc.net/problem/30306)

### 성능 요약

시간 제한: 1 초 (추가 시간 없음), 메모리 제한: 1024 MB

### 통계

제출: 530, 정답: 314, 맞힌 사람: 263, 정답 비율: 59.234%

### 분류

구현, 브루트포스 알고리즘

### 문제 설명

<p>The latest Table-Top Role Playing Game is out now: <em>Better Dice</em>. Unlike all other TTRPGs, this one is all about dice. In fact, it is all about the <em>better die</em>: decisions are made, friendships gained and lost, fights fought, battles won, all based on who has the <em>better die</em>.</p>

<p>This game uses special $n$-sided dice where each of the $n$ faces has the same probability of being rolled. Moreover, each die has its own special set of $n$ numbers on the faces.</p>

<p>While playing <em>Better Dice</em> you ended up in a very precarious situation where you must absolutely have a <em>better die</em> than your opponent, that is, you must roll higher than your opponent. Given both your die and your opponent&#39;s die, decide who is more likely to roll a higher number.</p>

### 입력

<p>The input consists of:</p>

<ul>
	<li>One line with an integer $n$ ($1\leq n\leq 1000$), the number of sides on each die.</li>
	<li>Two lines, each with $n$ integers $d$ ($1 \leq d \leq 10^9$), the values on one of the dice.</li>
</ul>

### 출력

<p>Output &quot;<code>first</code>&quot; if the first die is more likely to roll a higher number than the second die. Output &quot;<code>second</code>&quot; if the second die is more likely to roll a higher number than the first die. Output &quot;<code>tie</code>&quot; if they are both equally likely to come up higher than the other.</p>