# [Platinum V] Collisions - 7493

[문제 링크](https://www.acmicpc.net/problem/7493)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 130, 정답: 55, 맞힌 사람: 34, 정답 비율: 35.789%

### 분류

자료 구조, 세그먼트 트리

### 문제 설명

<p>Identical small balls are located on a straight line and can move along this line only. Each ball moves with a constant velocity, but velocities of different balls may be different. When two balls meet, a perfectly elastic collision occurs. It&rsquo;s a common-known physical fact, that when two equal-mass physical bodies&nbsp;<strong>A</strong>&nbsp;and&nbsp;<strong>B</strong>&nbsp;collide perfectly elastically, they swap their velocities, i. e. new&nbsp;<strong>A</strong>&rsquo;s velocity is old&nbsp;<strong>B</strong>&rsquo;s one, and new&nbsp;<strong>B</strong>&rsquo;s is old&nbsp;<strong>A</strong>&rsquo;s.</p>

<p>Your task is to write a program to find the total number of collisions.</p>

### 입력

<p>The first line at input contains the number of balls&nbsp;<strong>N</strong>&nbsp;(<strong>3</strong>&nbsp;&le;&nbsp;<strong>N</strong>&nbsp;&le;&nbsp;<strong>200000</strong>). Each of the following&nbsp;<strong>N</strong>&nbsp;lines contains&nbsp;<strong>2</strong>&nbsp;space-separated integers &mdash; the starting coordinate and the velocity of corresponding ball. All start coordinates are in range &ndash;10<strong><sup>11</sup></strong>&lt;&nbsp;<strong>x</strong>&lt;&nbsp;<strong>10<sup>11</sup></strong>,&nbsp;all velocities are in range&nbsp;<strong>&ndash;10<sup>8</sup></strong>&lt;&nbsp;<strong>v</strong>&lt;&nbsp;<strong>10<sup>8</sup></strong>. All start coordinates are different. It&rsquo;s guaranteed that each collision involves exactly two balls (none involves three or more balls together).</p>

### 출력

<p>Your program should output exactly one integer number in a single line &ndash; the total number of collisions (or&nbsp;<strong>987654321987654321</strong>&nbsp;if the number is infinite).</p>