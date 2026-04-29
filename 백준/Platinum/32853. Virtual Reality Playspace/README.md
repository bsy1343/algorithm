# [Platinum III] Virtual Reality Playspace - 32853

[문제 링크](https://www.acmicpc.net/problem/32853)

### 성능 요약

시간 제한: 4 초, 메모리 제한: 2048 MB

### 통계

제출: 3, 정답: 1, 맞힌 사람: 1, 정답 비율: 50.000%

### 분류

스택, 자료 구조

### 문제 설명

<p>Yolanda just finished moving the furniture around her house. Her house is shaped like a rectangle of side lengths $r$ and $c$. Yolanda wants to choose a place to put her virtual reality (VR) playspace.</p>

<p>Yolanda has some standards for how a VR playspace should be positioned:</p>

<ul>
	<li>It should take the shape of a rectangle.</li>
	<li>Its sides should be parallel and perpendicular to the sides of her house.</li>
	<li>It must exactly cover the entirety of any unit square it occupies.</li>
	<li>It should contain no obstacles.</li>
	<li>It should be at least $s$ units across along one side, and at least $t$ units across along the other.</li>
	<li>Each of its sides must border either the house’s outer walls, or obstacles. In other words, a VR playspace is maximally-sized.</li>
</ul>

<p>Given a map of Yolanda’s house, Yolanda wants to know how many different places she can choose for her VR playspace.</p>

### 입력

<p>The first line of input contains four integers $r$, $c$, $s$, and $t$ ($1 ≤ r, c, s, t ≤ 3\, 000$), giving the length and width of Yolanda’s house and the size of her VR playspace.</p>

<p>The next $r$ lines each contain a string of $c$ characters describing Yolanda’s house. Each character is either a dot (<code>.</code>) that denotes an empty square unit of space, or a zero (<code>0</code>) that denotes a square unit of obstacle.</p>

### 출력

<p>Output a single integer, the number of different places Yolanda can choose for her VR playspace.</p>