# [Platinum II] Darts - 33250

[문제 링크](https://www.acmicpc.net/problem/33250)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 2048 MB

### 통계

제출: 17, 정답: 15, 맞힌 사람: 9, 정답 비율: 90.000%

### 분류

3차원 기하학, 기하학, 선형대수학, 수학

### 문제 설명

<p>You have joined a project called 'Flying Projectile Coding', which attempts to create a smart machine learning AI that will throw darts at a slightly modified dart board. Before the live testing of this AI, you have decided to train it in a simulation, because that is way faster and cheaper.</p>

<p>In this project, you are tasked with assessing the AI's performance. Since it is still in the early stages of its development, you are only interested in whether it hit the board or not. Also, for now, you just assume that gravity is negligible, so darts fly in straight lines.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/33250.%E2%80%85Darts/d1108cf5.png" data-original-src="https://boja.mercury.kr/assets/problem/33250-1.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 300px; height: 281px;"></p>

<p style="text-align: center;">The board</p>

### 입력

<ul>
	<li>One line with an integer: $ 1 \leq n \leq 10^5 $: the number of darts that have been thrown.</li>
	<li>Two lines with three floating-point numbers each: $ -10 \leq h_1, h_2, h_3 \leq 10 $ and $ -10 \leq v_1, v_2, v_3 \leq 10 $. The dart board is mounted at $ (0, 0, 0) $ and is shaped like an ellipse with perpendicular axes $ (h_1, h_2, h_3) $ and $ (v_1, v_2, v_3) $.</li>
	<li>$ n $ lines with six floating-point numbers each: $ -100 \leq p_1, p_2, p_3 \leq 100 $ and $ -10 \leq d_1, d_2, d_3 \leq 10 $. This line indicates that a dart is thrown from position $ (p_1, p_2, p_3) $ in direction $ (d_1, d_2, d_3) $.</li>
</ul>

### 출력

<p>The number of darts that hit the board.</p>