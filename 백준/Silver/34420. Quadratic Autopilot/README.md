# [Silver IV] Quadratic Autopilot - 34420

[문제 링크](https://www.acmicpc.net/problem/34420)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 2048 MB

### 통계

제출: 18, 정답: 17, 맞힌 사람: 15, 정답 비율: 93.750%

### 분류

수학

### 문제 설명

<p>Thomas is trying to model airplanes in his 3D modeling program. He has decided to use parabolic curves to model the movement paths of airplanes. To make his curves as accurate as possible, he has asked a few of his pilot friends to give him the elevations of their respective airplanes at three points in time during some of their flights. Using these three points of elevation data from a given flight, help Thomas find the integer constants $a$, $b$, and $c$ in the equation</p>

<p>\begin{equation*} e(t) = at^2 + bt + c \end{equation*} which gives the elevation of an airplane at time $t$.</p>

### 입력

<p>The input consists of three lines, each with two integers separated by a single space. The first integer on a line is a time, $t$, and the second integer is the elevation at time $t$: $e(t)$. The times will appear in order from smallest to greatest; i.e. $t_1 &lt; t_2 &lt; t_3$.</p>

<p>Input Restrictions</p>

<ul>
	<li>$0 \leq t,e(t) &lt; \left\lfloor \sqrt{2^{32-1}-1} \right\rfloor$</li>
</ul>

### 출력

<p>The output should be a single line with the three integers $a$, $b$, and $c$ satisfying the above equation, separated by spaces.</p>