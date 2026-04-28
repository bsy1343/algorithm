# [Platinum III] White Bird - 22512

[문제 링크](https://www.acmicpc.net/problem/22512)

### 성능 요약

시간 제한: 5 초, 메모리 제한: 512 MB

### 통계

제출: 6, 정답: 5, 맞힌 사람: 4, 정답 비율: 100.000%

### 분류

미적분학, 기하학, 구현, 수학, 물리학, 시뮬레이션

### 문제 설명

<p>Angry Birds is a mobile game of a big craze all over the world. You were convinced that it was a waste of time to play the game, so you decided to create an automatic solver.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/22512.%E2%80%85White%E2%80%85Bird/052a1f80.png" data-original-src="%EB%B0%B1%EC%A4%80/Platinum/22512.%E2%80%85White%E2%80%85Bird/052a1f80.png" data-original-src="https://upload.acmicpc.net/e34e87d9-d84a-4a8d-b685-a0ed000b035f/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" /></p>

<p>You are describing a routine that optimizes the white bird&#39;s strategy to defeat a pig (enemy) by hitting an egg bomb. The white bird follows a parabolic trajectory from the initial position, and it can vertically drop egg bombs on the way.</p>

<p>In order to make it easy to solve, the following conditions hold for the stages.</p>

<ul>
	<li><var><i>N</i></var>&nbsp;obstacles are put on the stage.</li>
	<li>Each obstacle is a rectangle whose sides are parallel to the coordinate axes.</li>
	<li>The pig is put on the point&nbsp;<var>(<i>X</i>,<i>Y</i>)</var>.</li>
	<li>You can launch the white bird in any direction at an initial velocity&nbsp;<var><i>V</i></var>&nbsp;from the origin.</li>
	<li>If the white bird collides with an obstacle, it becomes unable to drop egg bombs.</li>
	<li>If the egg bomb collides with an obstacle, the egg bomb is vanished.</li>
</ul>

<p>The acceleration of gravity is&nbsp;<var>9.8m&frasl;s<sup>2</sup></var>. Gravity exerts a force on the objects in the decreasing direction of&nbsp;<var><i>y</i></var>-coordinate.</p>

### 입력

<p>A dataset follows the format shown below:</p>

<pre>
<var><i>N</i></var> <var><i>V</i></var> <var><i>X</i></var> <var><i>Y</i></var>
<var><i>L</i><sub>1</sub></var> <var><i>B</i><sub>1</sub></var> <var><i>R</i><sub>1</sub></var> <var><i>T</i><sub>1</sub></var>
<var>&hellip;</var>
<var><i>L</i><sub><i>N</i></sub></var> <var><i>B</i><sub><i>N</i></sub></var> <var><i>R</i><sub><i>N</i></sub></var> <var><i>T</i><sub><i>N</i></sub></var></pre>

<p>All inputs are integer.</p>

<ul>
	<li><var><i>N</i></var>: the number of obstacles</li>
	<li><var><i>V</i></var>: the initial speed of the white bird</li>
	<li><var><i>X</i></var>,&nbsp;<var><i>Y</i></var>: the position of the pig</li>
</ul>

<p>(<var>0&le;<i>N</i>&le;50</var>,&nbsp;<var>0&le;<i>V</i>&le;50</var>,&nbsp;<var>0&le;<i>X</i>,<i>Y</i>&le;300</var>,&nbsp;<var><i>X</i>&ne;0</var>)</p>

<p>for&nbsp;<var>1&le;<i>i</i>&le;<i>N</i>,</var></p>

<ul>
	<li><var><i>L</i><sub><i>i</i></sub></var>: the x-coordinate of the left side of the&nbsp;<var><i>i</i></var>-th obstacle</li>
	<li><var><i>B</i><sub><i>i</i></sub></var>: the y-coordinate of the bottom side of the&nbsp;<var><i>i</i></var>-th obstacle</li>
	<li><var><i>R</i><sub><i>i</i></sub></var>: the x-coordinate of the right side of the&nbsp;<var><i>i</i></var>-th obstacle</li>
	<li><var><i>T</i><sub><i>i</i></sub></var>: the y-coordinate of the top side of the&nbsp;<var><i>i</i></var>-th obstacle</li>
</ul>

<p>(<var>0&le;<i>L</i><sub><i>i</i></sub>,<i>B</i><sub><i>i</i></sub>,<i>R</i><sub><i>i</i></sub>,<i>T</i><sub><i>i</i></sub>&le;300</var>)</p>

<p>It is guaranteed that the answer remains unaffected by a change of&nbsp;<var><i>L</i><sub><i>i</i></sub></var>,&nbsp;<var><i>B</i><sub><i>i</i></sub></var>,&nbsp;<var><i>R</i><sub><i>i</i></sub></var>&nbsp;and&nbsp;<var><i>T</i><sub><i>i</i></sub></var>&nbsp;in&nbsp;<var>10<sup>&minus;6</sup></var>.</p>

### 출력

<p>Yes/No</p>

<p>You should answer whether the white bird can drop an egg bomb toward the pig.</p>