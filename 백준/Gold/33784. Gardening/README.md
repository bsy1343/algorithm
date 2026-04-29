# [Gold V] Gardening - 33784

[문제 링크](https://www.acmicpc.net/problem/33784)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 2048 MB

### 통계

제출: 59, 정답: 39, 맞힌 사람: 35, 정답 비율: 68.627%

### 분류

기하학, 다각형의 넓이

### 문제 설명

<p>Bob has an incredibly huge garden with lots of grass and beautiful flowers, but since he started training his programming skills for the SKP, he does not have that much time to maintain it any more. To reduce the time spent maintaining his garden, Bob selected an area of his garden where he wants to place square stone tiles. He subdivided his garden into a $n$ by $n$ square grid $(1 \leq n \leq 1000)$ such that one stone tile fits exactly into one grid cell. Therefore, each tile must be placed inside exactly one grid cell.</p>

<p>The area Bob wants to fill with tiles is given as a sequence of $m$ points defining its perimeter. Each line segment between points $p_i$ and $p_{i+1}$ defines an edge of the area. Point $p_0$ is also connected to point $p_{m-1}$. In each cell within the defined perimeter, exactly one stone tile is placed. Bob now needs your help to count the number of stone tiles he needs to fill the entire designated area.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/33784.%E2%80%85Gardening/cde74b3d.jpg" data-original-src="https://boja.mercury.kr/assets/problem/33784-1.jpg" onerror="this.onerror=null;this.src=this.dataset.originalSrc"></p>

<p style="text-align: center;">Figure 1 - Example testcase 2, where points given as input are highlighted.</p>

### 입력

<p>The first line of the input consists of one integer $m$ $(4 \leq m \leq 1000)$: the number of points that define the perimeter of the selected area.</p>

<p>The following input consists of $m$ distinct lines with two space-separated integers $x_i$ and $y_i$ $(1 \leq x_i,y_i \leq 1000)$: The coordinates of point $p_i$ are $(x_i,y_i)$. The bottom left corner is defined as point $(0,0)$ and the top right corner is defined as point $(n,n)$.</p>

### 출력

<p>One line with the number of square tiles required to fill the entire designated area.</p>