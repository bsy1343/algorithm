# [Silver IV] Soccer Skills - 15002

[문제 링크](https://www.acmicpc.net/problem/15002)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 45, 정답: 25, 맞힌 사람: 22, 정답 비율: 61.111%

### 분류

브루트포스 알고리즘, 기하학

### 문제 설명

<p>At the company soccer tournament, you want to impress your boss, who is watching the game you are participating in. Fortunately, you are a pretty good soccer player, who can make some sharp passes. You look around you to your team mates to see if there are any around who are close enough that you can reliably pass, but far away enough that your boss will be impressed.</p>

### 입력

<ul>
	<li>A line with an integer 1 &le; N &le; 10<sup>6</sup>, the number of team mates on the field.</li>
	<li>A line with two floating point numbers 0 &le; a, b &le; 1000. The number a gives the least distance at which your boss will be impressed, and the number b gives the largest distance at which you can reliably pass.</li>
	<li>A line with two integers &minus;1000 &le; p<sub>x</sub>, p<sub>y</sub> &le; 1000, your position on the playing field.</li>
	<li>N lines, each with two integers &minus;1000 &le; q<sub>x</sub>, q<sub>y</sub> &le; 1000, the positions of your team mates on the field.</li>
</ul>

### 출력

<ul>
	<li>If there is no team mate on the field you can pass to in such a way that you will impress your boss, output a single line with the word &ldquo;impossible&rdquo;.</li>
	<li>Otherwise, output a single line with two integers q<sub>x</sub>, q<sub>y</sub>, the location of a team mate you can pass to, and two floating point numbers: the distance from you to that team mate, and the angle at which you have to shoot, given as an angle in [&minus;&pi;, &pi;) measured counter-clockwise from the positive x-axis.</li>
</ul>

<p>The distance and angle will be accepted if the absolute or relative difference is at most 10<sup>&minus;6</sup> from the actual value.</p>