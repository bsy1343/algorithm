# [Gold I] Sheep Frenzy - 11139

[문제 링크](https://www.acmicpc.net/problem/11139)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 256 MB

### 통계

제출: 88, 정답: 13, 맞힌 사람: 11, 정답 비율: 40.741%

### 분류

구현, 다이나믹 프로그래밍, 그래프 이론, 그래프 탐색, 너비 우선 탐색, 비트마스킹, 비트필드를 이용한 다이나믹 프로그래밍, 외판원 순회 문제

### 문제 설명

<p>Since IDI Open &rsquo;09, I&rsquo;ve had lots of sheep counting programs supposed to help me fall asleep. Sadly, none of these were any good, so I&rsquo;ve spent close to every night the last years cursing those evil animals. Not sleeping gives you quite a bit of spare time, and I&rsquo;ve spent mine creating a new game called Sheep Frenzy.</p>

<p>The player controls Ulgr the Unpleasantsmelling, whose objective is to eat all sheep on each level as fast as possible. Strangely enough, though I&rsquo;ve gotten quite good at it, this still doesn&rsquo;t give me the satisfaction of revenge on the evildoers. This is why I need your help. You need to write a program that calculates the best way of moving Ulgr around the board in order to eat all sheep as fast as possible.</p>

<p>The board is organized in a H &times; W grid, where each cell is one of the following:</p>

<ul>
	<li>&rsquo;U&rsquo; - The starting point of Ulgr the Unpleasantsmelling. He likes eating sheep, and you&rsquo;re gonna help him do so.</li>
	<li>&rsquo;#&rsquo; - Sheep. They are obviously blind, deaf and has no sense of smell, as they won&rsquo;t move even when you come to eat them.</li>
	<li>&rsquo;.&rsquo; - Grass. Don&rsquo;t argue, it is grass.</li>
	<li>&rsquo;X&rsquo; - Mountains. You (Ulgr) can&rsquo;t walk on these tiles. Well, to be honest you can, but please don&rsquo;t. The game locks up if you do.</li>
</ul>

<p>Ulgr makes one move each second. One move consists in eating a sheep or moving one cell to the left, right, up or down. He can only eat a sheep if he stands on the same cell as it.</p>

### 입력

<p>The first line of input contains a single number T, the number of test cases to follow. Each test case begins with a line containing two numbers, H and W, the height and width of the grid for that level. Then follow H lines, each containing W characters, describing that part of the grid.</p>

<ul>
	<li>0 &lt; T &le; 100</li>
	<li>0 &lt; H, W &le; 50</li>
	<li>There will always be at least one and never be more than 16 sheep in one test case.</li>
	<li>Each test case will contain exactly one &rsquo;U&rsquo;.</li>
	<li>All mountains on the board are marked with &rsquo;X&rsquo;. That is, neither Ulgr or any sheep are on a mountain.</li>
</ul>

### 출력

<p>For each test case, output a line containing a single number, the minimum time in seconds Ulgr needs to eat all the sheep on that level. If it is not possible to eat all the sheep, output impossible instead.</p>