# [Platinum IV] Chocolate Chip Cookies - 4420

[문제 링크](https://www.acmicpc.net/problem/4420)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 46, 정답: 11, 맞힌 사람: 10, 정답 비율: 40.000%

### 분류

브루트포스 알고리즘, 기하학

### 문제 설명

<p>Making chocolate chip cookies involves mixing flour, salt, oil, baking soda and chocolate chips to form dough which is rolled into a plane about 50 cm square. Circles are cut from the plane, placed on a cookie sheet, and baked in an oven for about twenty minutes. When the cookies are done, they are removed from the oven and allowed to cool before being eaten.</p>

<p>We are concerned here with the process of cutting the first cookie after the dough has been rolled. Each chip is visible in the planar dough, so we need simply to place the cutter so as to maximize the number of chocolate chips contained in its perimeter.</p>

### 입력

<p>Standard input consists of a number of lines, each containing two floating point numbers indicating the (x,y) coordinates of a chip in the square surface of cookie dough. Each coordinate is between 0.0 and 50.0 (cm). Each chip may be considered a point (i.e. these are not President&#39;s Choice Cookies). Each chip is at a different position. There are at most 200 chocolate chips.</p>

### 출력

<p>Standard output consists of a single integer: the number of chocolate chips that can be contained in a single cookie whose diameter is 5 cm. The cookie need not be fully contained in the 50 cm square dough (i.e. it may have a flat side).</p>