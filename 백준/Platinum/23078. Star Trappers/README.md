# [Platinum II] Star Trappers - 23078

[문제 링크](https://www.acmicpc.net/problem/23078)

### 성능 요약

시간 제한: 서브태스크 참고 (추가 시간 없음), 메모리 제한: 1024 MB

### 통계

제출: 131, 정답: 20, 맞힌 사람: 17, 정답 비율: 27.869%

### 분류

브루트포스 알고리즘, 기하학, 볼록 다각형 내부의 점 판정

### 문제 설명

<p>John and Ada are sitting on the grass above a small hill. It is midnight and the sky is full of stars. The sky looks like a 2D plane from so far away and the stars look like points on that plane. Ada loves blue stars and suddenly she notices one, while all the other stars in the sky are white. She loves the blue star so much that she wants to trap it. And she asks John for help.</p>

<p>Ada will tell John the position of the blue star and he has to trap it. To trap it, John has to draw a polygon in the sky with his buster sword, so that the blue star is strictly inside the polygon (not on the border of the polygon) and the polygon has the smallest possible perimeter. The vertices of the polygon must be the white stars.</p>

<p>Even though John is super awesome, he needs your help. Given the positions of the white stars and the blue star, you need to find out whether John can trap the blue star and if he can, also find the minimum length of the perimeter of the polygon he will use.</p>

### 입력

<p>The first line of the input gives the number of test cases, $T$.&nbsp;$T$&nbsp;test cases follow.</p>

<p>For each test case, the first line contains an integer&nbsp;$N$, it denotes the number of white stars in the sky.</p>

<p>The next $N$&nbsp;lines will each contain two integers,&nbsp;$X_i$&nbsp;and&nbsp;$Y_i$. The&nbsp;$i$-th pair of integers denotes the&nbsp;<i>x</i>&nbsp;and&nbsp;<i>y</i>&nbsp;coordinates of the&nbsp;$i$-th star in the sky.</p>

<p>After these&nbsp;$N$&nbsp;lines, there will be one last line, which will contain two integers,&nbsp;$X_s$&nbsp;and&nbsp;$Y_s$, which denote the&nbsp;<i>x</i>&nbsp;and&nbsp;<i>y</i>&nbsp;coordinates of the blue star.</p>

### 출력

<p>For each test case, output one line containing&nbsp;<code>Case #x: y</code>, where&nbsp;$x$&nbsp;is the test case number (starting from 1) and&nbsp;$y$&nbsp;is the minimum length of the perimeter of the polygon drawn to trap the shooting star. If it is impossible for John to draw a polygon that traps the star, then&nbsp;$y$&nbsp;should be&nbsp;<code>IMPOSSIBLE</code>.</p>

<p>$y$&nbsp;will be considered correct if it is within an absolute or relative error of $10^{-6}$ of the correct answer.</p>

### 제한

<ul>
	<li>$1 \le T \le 100$.</li>
	<li>$0 \le X_i,Y_i \le 10^6$, for all&nbsp;$i$.</li>
	<li>$0 \le X_s,Y_s \le 10^6$.</li>
	<li>No two stars (including the blue star) will have the same position.</li>
</ul>

### 힌트

<p>In the first test case we have only two white stars, so we cannot draw any polygons.</p>

<p>In the second test case we have three white stars, so we can draw only one polygon (a triangle), as shown in the picture below. It turns out that we are able to catch the blue star in this polygon. The length of the perimeter of this polygon is $5+5+52 \approx 17.071068$.</p>

<p style="text-align: center;"><img alt="" src="https://upload.acmicpc.net/0ef35498-6c30-4056-914b-dfcf98ad259a/-/preview/" /></p>