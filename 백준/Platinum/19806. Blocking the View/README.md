# [Platinum V] Blocking the View - 19806

[문제 링크](https://www.acmicpc.net/problem/19806)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 60, 정답: 13, 맞힌 사람: 10, 정답 비율: 38.462%

### 분류

기하학, 선분 교차 판정, 볼록 다각형 내부의 점 판정

### 문제 설명

<p>Anton is developing a 2D graphics engine for video games. It must hit the market. In order to display the objects correctly, he needs to understand whether one object blocks the view to another one if the player is looking in some particular direction.</p>

<p>For the prototype Anton considers objects to be non-intersecting segments on the plane. The segment $a$ blocks the view to the segment $b$ in direction of the vector $\vec{v}$, if there are such points $A$ on $a$ and $B$ on $b$, that the vectors $\overrightarrow{AB}$ and $\vec{v}$ are co-directed. In other words, there is a point on $a$ such that, if it starts moving along the direction of $\vec{v}$, it would hit the segment $b$.</p>

<p>Anton is busy looking for investors to his projects, so he asks you to implement this part of the graphics engine.</p>

### 입력

<p>The first line of input contains an integer $n$, the number of tests that follow ($1 \le n \le 50\,000$).</p>

<p>Each of the following $n$ lines contains 10 integers: $ax_1$, $ay_1$, $ax_2$, $ay_2$, $bx_1$, $by_1$, $bx_2$, $by_2$, $vx$, $vy$ --- coordinates of the endpoints of the first segment, coordinates of the endpoints of the second segment, and coordinates of the view direction vector. All coordinates do not exceed $10^6$ by their absolute values. It is guaranteed, that each segment has positive length, and that the direction vector $\vec{v}$ is non-zero.</p>

### 출력

<p>For every test print &quot;<code>Yes</code>&quot;, if the first segment blocks the view to the second segment in the given direction, if it doesn&#39;t, print &quot;<code>No</code>&quot;.</p>