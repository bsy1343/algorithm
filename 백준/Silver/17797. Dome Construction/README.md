# [Silver IV] Dome Construction - 17797

[문제 링크](https://www.acmicpc.net/problem/17797)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 93, 정답: 79, 맞힌 사람: 73, 정답 비율: 86.905%

### 분류

정렬, 기하학, 3차원 기하학, 피타고라스 정리

### 문제 설명

<p>The world&rsquo;s largest indoor water park is built inside a hemispherical dome that was once used as an aircraft hangar. The park attracts more than 10 000 visitors per day and is big enough that it even has its own tropical micro-climate with clouds forming inside.</p>

<p>Management would like to expand business operations by opening another branch in the dome of your local cathedral. The micro-climate is a key selling point, so to really capitalise on the cathedral they asked you to expand the dome&rsquo;s radius so that it contains at least a given number of clouds. A cloud is contained if its centre is on or inside the boundary of the dome.</p>

<p>You are a cloud engineer by trade, and hence a competent meteorologist. You already identified several potential clouds close by and plotted them in three dimensions relative to the centre of the current structure. In order to capture enough of them, how large do you need to make the radius of the dome?</p>

### 입력

<ul>
	<li>The first line contains the number of clouds you found, n, and the number that must be contained, k, respectively (1 &le; k &le; n &le; 10<sup>5</sup>).</li>
	<li>The next n lines each contain three real numbers x<sub>i</sub>, y<sub>i</sub>, z<sub>i</sub>, the coordinates of the ith cloud relative to the centre of the dome (0 &le; |x<sub>i</sub>|, |y<sub>i</sub>|, |z<sub>i</sub>| &le; 10<sup>6</sup>). Every cloud has a non-negative y-coordinate.</li>
</ul>

### 출력

<p>Output the minimum radius of the dome required to enclose at least k points. Your answer must be accurate to an absolute or relative error of 10<sup>&minus;6</sup>.</p>