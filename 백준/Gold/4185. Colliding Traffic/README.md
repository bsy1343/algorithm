# [Gold II] Colliding Traffic - 4185

[문제 링크](https://www.acmicpc.net/problem/4185)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 21, 정답: 6, 맞힌 사람: 6, 정답 비율: 31.579%

### 분류

브루트포스 알고리즘, 기하학, 수학, 물리학

### 문제 설명

<p>For a boat on a small, constrained body of water, other traffic can be a major hazard. The more traffic there is in the same area, the higher the risk of a collision.</p>

<p>Your job is to monitor traffic and help detect likely collisions before they occur. You have sensors to detect the position, direction, and speed of each boat. Assuming the direction and speed remain constant, your task is to determine whether any of the boats will collide. Two boats are considered to collide if they come within a given distance of each other.</p>

### 입력

<p>The first line of input contains a single integer&nbsp;<i>c</i>, the number of test cases to follow. Each test case starts with a line containing two numbers,&nbsp;<i>n</i>, the number of boats, and&nbsp;<i>r</i>, the collision distance. Two boats are considered to collide if they come within&nbsp;<i>r</i>&nbsp;metres of each other. There will be no more than 1000 boats. Each boat is identified by a line containing four numbers&nbsp;<i>x</i>,&nbsp;<i>y</i>,&nbsp;<i>d</i>,&nbsp;<i>s</i>. The numbers&nbsp;<i>x</i>&nbsp;and&nbsp;<i>y</i>&nbsp;give the current position of the boat as a distance east and north, respectively, from a common origin, and will be between -1000 and 1000, inclusive. The lake is small enough that we can model it as a flat surface. The number&nbsp;<i>d</i>&nbsp;gives the direction in which the boat is heading in degrees clockwise from north (so east is 90 degrees). The number&nbsp;<i>s</i>&nbsp;gives the speed of the boat in metres per second, and will be between 0.001 and 1000. Note that&nbsp;<i>r</i>,&nbsp;<i>x</i>,&nbsp;<i>y</i>,&nbsp;<i>d</i>, and&nbsp;<i>s</i>&nbsp;are not necessarily integers. The input data will be such that the answer will not change if any of the numbers&nbsp;<i>x</i>,&nbsp;<i>y</i>,&nbsp;<i>d</i>&nbsp;and&nbsp;<i>s</i>&nbsp;are changed by 10<sup>-6</sup> or less.</p>

### 출력

<p>For each test case, output a line containing a single integer, the number of seconds, rounded to the nearest second, before any of the boats come within&nbsp;<i>r</i>&nbsp;metres of each other. If none of the boats ever collide, output the line:</p>

<pre>
No collision.
</pre>