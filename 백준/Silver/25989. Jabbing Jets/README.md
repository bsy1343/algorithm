# [Silver I] Jabbing Jets - 25989

[문제 링크](https://www.acmicpc.net/problem/25989)

### 성능 요약

시간 제한: 1 초 (추가 시간 없음), 메모리 제한: 2048 MB

### 통계

제출: 149, 정답: 37, 맞힌 사람: 34, 정답 비율: 24.638%

### 분류

수학, 기하학

### 문제 설명

<p>You have just gotten a new job at the Bathroom Accessories Production Company. The first task you are given is to jab holes into showerheads. To prove yourself, you have decided you want to create as many holes as possible.</p>

<p>However, you cannot just randomly drill holes everywhere in the showerhead. (At least, not without getting fired.) In order to ensure that the showerheads look aesthetically pleasing, the company has composed some guidelines which you will have to follow. See Figure J.1 for some examples of aesthetically pleasing showerheads.</p>

<ul>
	<li>The holes should be arranged in concentric circles of radii $r_1, r_2, \ldots, r_n$: the center of every hole should be on one of these circles.</li>
	<li>The distance between the centers of any two holes should be at least $e$.</li>
</ul>

<p>How many holes can you make at most?</p>

<p style="text-align: center;"><img alt="" src="https://upload.acmicpc.net/3ce403c9-523d-4de1-b323-f9c0446614d3/-/preview/" style="width: 500px; height: 210px;" /></p>

<p style="text-align: center;">Figure J.1: Possible aesthetically pleasing showerheads for the first two samples.</p>

### 입력

<p>The input consists of:</p>

<ul>
	<li>One line with two integers $n$ and $e$ ($1 \leq n, e \leq 10^4$),</li>
	<li>One line with $n$ integers $r_1, \ldots, r_n$ ($1 \leq r_i \leq 10^4$), the radii of the circles.</li>
</ul>

<p>It is guaranteed that the numbers $r_i$ are given in increasing order, and that $r_{i+1} - r_i \geq e$. Furthermore, it is guaranteed that increasing any radius $r_i$ by at most $10^{-6}$ will not change the final answer.</p>

### 출력

<p>Output the maximal number of holes that you can make in the showerhead.</p>