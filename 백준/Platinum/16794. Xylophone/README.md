# [Platinum IV] Xylophone - 16794

[문제 링크](https://www.acmicpc.net/problem/16794)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 43, 정답: 19, 맞힌 사람: 19, 정답 비율: 45.238%

### 분류

애드 혹

### 문제 설명

<p>Xylophone is a musical instrument which is played by striking wooden bars. A single wooden bar will always sound the same pitch, so a xylophone consists of bars with various pitches.</p>

<p>JOI-kun bought a xylophone consisting of N wooden bars. The bars are lined up in a row and numbered 1 through N from left to right. The bar with number i (1 &le; i &le; N) sounds a pitch of height A<sub>i</sub> (1 &le; A<sub>i</sub> &le; N). Different bars sound different pitches. He knows that the bar with the lowest pitch has a smaller number than the bar with the highest pitch.</p>

<p>Because JOI-kun does not know which bar sounds which pitch, he is going to study the pitch of the bars.</p>

<p>JOI-kun has a peculiar sense of sound; when he hears multiple sounds simultaneously, he can tell the difference between the heights of the highest pitch and the lowest pitch. He can strike a lump of bars at a time and hear their sounds. That is, for integers s and t (1 &le; s &le; t &le; N), he can strike the bars with numbers s through t simultaneously, to know the difference between the maximum and the minimum among As, As+1, . . . , A<sub>t</sub>.</p>

<p>He wants determine the pitches of the bars within 10 000 tries of striking.</p>

### 입력



### 출력



### 제한

<ul>
	<li>1 &le; A<sub>i</sub> &le; N (1&nbsp;&le; i &le; N)</li>
	<li>A<sub>i</sub> &ne; A<sub>j</sub> (1&nbsp;&le; i &lt; j &le; N)</li>
	<li>For i and j with A<sub>i</sub> = 1&nbsp;and A<sub>j</sub> = N, it holds that i &lt; j.</li>
</ul>