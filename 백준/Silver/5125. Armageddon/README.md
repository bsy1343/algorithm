# [Silver I] Armageddon - 5125

[문제 링크](https://www.acmicpc.net/problem/5125)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 33, 정답: 22, 맞힌 사람: 21, 정답 비율: 67.742%

### 분류

기하학

### 문제 설명

<p>There&rsquo;s an asteroid headed for earth! If we&rsquo;re clever, we might be able to avoid a catastrophe. Unfortunately at this time, we can only see part of it, the rest is blocked by the sun. So we must plan for an asteroid of unknown size moving at an unknown speed. On the plus side, we have missiles! But since we don&rsquo;t know much about the asteroid, it is unclear when we should fire. When the missiles hit the asteroid, the asteroid will split into two pieces. The pieces will move away from each other at an angle determined by the size of the asteroid. We must fire the missiles soon enough in order to make sure that the pieces will miss the earth, which has a radius of 6,378.1 km. Given the angle at which the pieces will move, and the speed of the initial asteroid, we would like to know how much time is left until it is too late to fire the missiles.</p>

<p style="text-align: center;"><img alt="" src="/upload/images2/armag.png" style="height:293px; width:674px" /></p>

### 입력

<p>The first line is the number K of input data sets, followed by the K data sets, each of the following form:</p>

<p>There are four numbers: x<sub>a</sub> the position of the asteroid in kilometers, which will be greater than the radius of the earth (the earth is at position 0), 0 &lt; a &lt; 180 the angle in degrees at which the two asteroid pieces will separate, s<sub>a</sub> &gt; 0 the constant speed of the asteroid in kilometers per second, s<sub>m</sub> &gt; 0 the constant speed of our missiles in kilometers per second.</p>

### 출력

<p>For each data set, output &ldquo;Data Set x:&rdquo; on a line by itself, where x is its number. On the next line, output the number of seconds left before it&rsquo;s too late to fire the missiles, assuming we fire them from the earth&rsquo;s surface. Round the output to two decimal places. If there is less than 0.00 seconds left, output &ldquo;Oh no!&rdquo;. Each data set should be followed by a blank line.</p>