# [Platinum II] Orbit - 10087

[문제 링크](https://www.acmicpc.net/problem/10087)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 256 MB

### 통계

제출: 52, 정답: 10, 맞힌 사람: 6, 정답 비율: 17.143%

### 분류

이분 탐색, 미적분학, 기하학, 수학

### 문제 설명

<p>As the Ancient romans knew, not only the Earth, but the entire Universe is flat. Moreover, the center of the Universe is the planet Earth, and every celestial body can be represented by a pair of coordinates (x, y) in a coordinate system centered at the planet Earth. The celestial bodies have a fixed position that never changes. In the observable universe there are N stars, each with a position (x<sub>i</sub> y<sub>i</sub>) and luminosity L<sub>i</sub>.</p>

<p>In the year 2154, there is hectic preparation on building a new system of two deep space sensors in a distant orbit around the Earth. Both sensors will be stationed on distance R from Earth. The sensors are really sensitive to light that hits them. Taking this into account, the scientists want to place both sensors in similar conditions in order to get compatible observations. This means that the positions of the sensors must be chosen in such a way that the maximum observed brightness on the surface of the sensors is the same. An additional safety constraint is that the sensors must be as far away from each other as possible.</p>

<p>The maximum observed brightness on the surface of the sensor is the maximum value of the observed brightnesses based on each star. The observed brightness based on a star with luminosity L and distance r from a fixed point is given by the formula \(F = \frac{L}{4 \pi r^2}\). We remind you that, in the plane of the Universe the distance between two points with coordinates (x<sub>i</sub> y<sub>i</sub>) and (x<sub>j</sub> y<sub>j</sub>) is calculated by \(r = \sqrt{(x_i-x_j)^2 + (y_i-y_j)^2}\). &nbsp;The sensors, the planet Earth and all celestial bodies are points with negligible sizes. There are no other bodies in the Universe, except the ones mentioned in the problem statement.</p>

<p>Write a program orbit, which given R &ndash; orbit (distance from Earth), in which to place the two sensors, and N stars, each given with coordinates (x<sub>i</sub>, y<sub>i</sub>) and luminosity L<sub>i</sub>, finds two points (X<sub>1</sub>, Y<sub>1</sub>), (X<sub>2</sub>, Y<sub>2</sub>), at distance R from Earth (The Earth is a point with coordinates (0, 0)) such that:</p>

<ol>
	<li>the maximum observed brightness is the same;</li>
	<li>the distance between the two points is as large as possible.</li>
</ol>

### 입력

<p>On the first line of the standard input are given two integers (N &ndash; the number of stars and R &ndash; the desired distance from Earth, which is the orbit of the sensors), separated with a single space. N lines follow with three integers each: x<sub>i</sub>, y<sub>i</sub>, L<sub>i</sub>: the coordinates and the luminosity of the i-th star. The numbers R, x<sub>i</sub>, y<sub>i</sub> are in the same units.</p>

### 출력

<p>On the only line of the standard output, the program must output 4 real numbers: X<sub>1</sub>, Y<sub>1</sub>, X<sub>2</sub>, and Y<sub>2</sub>, separated with spaces &ndash; the found coordinates of both points in which the sensors must be placed. If there are no two points at distance R from Earth with the same (with precision up to 10<sup>-7</sup>) maximum observed brightness, output a single line with the message No solution. The answer will be considered correct if the absolute or relative error is less than 10<sup>-7</sup>.</p>

### 제한

<ul>
	<li>1 &le; N &le; 100000</li>
	<li>1 &le; R &le; 10<sup>9</sup></li>
	<li>|x<sub>i</sub>| &le; 10<sup>9</sup></li>
	<li>|y<sub>i</sub>| &le; 10<sup>9</sup></li>
	<li>0 &lt; L<sub>i</sub> &le; 10<sup>9</sup></li>
</ul>

### 힌트

<p>The points (-1.414213562, -1.414213562) and (-1.414213562, 1.414213562) are also hit by the same brightness and are distance R from Earth, but are closer to each other than (0, 2) and (0, -2).</p>