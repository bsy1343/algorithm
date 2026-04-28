# [Gold II] Battle Royale - 16063

[문제 링크](https://www.acmicpc.net/problem/16063)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 83, 정답: 41, 맞힌 사람: 36, 정답 비율: 58.065%

### 분류

기하학

### 문제 설명

<p>Battle Royale games are the current trend in video games and Gamers Concealed Punching Circles (GCPC) is the most popular game of them all. The game takes place in an area that, for the sake of simplicity, can be thought of as a two-dimensional plane. Movement and positioning are a substantial part of the gameplay, but getting to a desired location can be dangerous. You are confident in your ability to handle the other players, however, while you are walking to your destination, there are two hazards posed by the game itself:</p>

<ul>
	<li>The game zone is bounded by a blue circle. Outside of this circle, there is a deadly force field that would instantly take you out of the game.</li>
	<li>Inside the game zone, there is a red circle where you are exposed to artillery strikes. This circle is also too risky to enter.</li>
</ul>

<p>You want to move from one spot on the map to another, but the direct path to your destination is blocked by the red circle, so you need to find a way around it. Can you find the shortest path that avoids all hazards by never leaving the blue or entering the red circle? Touching the boundaries of the circles is fine, as long as you do not cross them.</p>

### 입력

<p>The input consists of:</p>

<ul>
	<li>one line with two integers x<sub>c</sub>, y<sub>c</sub> specifying your current location;</li>
	<li>one line with two integers x<sub>d</sub>, y<sub>d</sub> specifying your destination;</li>
	<li>one line with three integers x<sub>b</sub>, y<sub>b</sub>, r<sub>b</sub> specifying the center and radius of the blue circle;</li>
	<li>one line with three integers x<sub>r</sub>, y<sub>r</sub>, r<sub>r</sub> specifying the center and radius of the red circle.</li>
</ul>

<p>All coordinates have an absolute value of at most 1 000, and 1 &le; r<sub>b</sub>, r<sub>r</sub> &le; 1 000. The red circle is strictly inside the blue circle. Your current location and destination are strictly inside the blue circle and strictly outside of the red circle, and the direct path between them is blocked by the red circle.</p>

### 출력

<p>Output the length of the shortest path that does not leave the blue or enter the red circle. The output must be accurate up to a relative or absolute error (whichever is lower) of 10<sup>&minus;7</sup>.</p>