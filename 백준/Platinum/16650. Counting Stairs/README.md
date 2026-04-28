# [Platinum II] Counting Stairs - 16650

[문제 링크](https://www.acmicpc.net/problem/16650)

### 성능 요약

시간 제한: 3 초, 메모리 제한: 512 MB

### 통계

제출: 286, 정답: 116, 맞힌 사람: 82, 정답 비율: 35.193%

### 분류

수학, 다이나믹 프로그래밍, 조합론

### 문제 설명

<p>Remember Barney from problem B? Barney&rsquo;s older sister Cecilia often watches him play with his set of cubes. She also joins Barney in his games and prevails most of the time, shaking his confidence on a daily basis.</p>

<p>One day Cecilia noticed Barney struggling to build a symmetric stair with his n cubes. She immediately told him she could not just build a symmetric stair, but even calculate the number of different symmetric stairs consisting of n cubes! Can you?</p>

<p>Recall that a symmetric stair consists of one or more towers of cubes, where the heights of towers are non-increasing from left to right, and is symmetric with respect to the x = y line (where the x-axis is horizontal and oriented to the right, and the y-axis is vertical and oriented upwards). For a more detailed explanation, please refer to problem B statement.</p>

<p>The number of different symmetric stairs can be quite large, so you need to calculate it modulo 998 244 353.</p>

### 입력

<p>The input contains multiple test cases.</p>

<p>The first line of the input contains a single integer t &mdash; the number of test cases (1 &le; t &le; 10<sup>4</sup>). Each of the following t lines contains a single integer n<sub>i</sub> &mdash; the number of cubes in the i-th test case (1 &le; n<sub>i</sub> &le; 2 &middot; 10<sup>5</sup>).</p>

### 출력

<p>For each test case, output a line with a single integer &mdash; the number of symmetric stairs with exactly n<sub>i</sub> cubes, modulo 998 244 353.</p>

### 힌트

<p>All different symmetric stairs with n = 17 cubes are shown below:</p>

<p style="text-align: center;"><img alt="" src="https://upload.acmicpc.net/9a61cd59-2c3c-44a6-91e9-ffb4e4be1c65/-/preview/" style="width: 620px; height: 152px;" /></p>