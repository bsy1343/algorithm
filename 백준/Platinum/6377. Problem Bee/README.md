# [Platinum IV] Problem Bee - 6377

[문제 링크](https://www.acmicpc.net/problem/6377)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 10, 정답: 7, 맞힌 사람: 7, 정답 비율: 70.000%

### 분류

많은 조건 분기, 기하학

### 문제 설명

<p>Imagine a perfectly formed honeycomb, spanning the infinite Cartesian plane. It is an interlocking grid composed of congruent equilateral hexagons. One hexagon is located so that its center is at the origin and has two corners on the X-axis. A bee must be very careful about how it travels in order not to get lost in the infinite plane. To get from an arbitrary point A to another arbitrary point B, it will first head from A to the exact center of the hexagon in which A is located. Then, it will travel in a straight line to the exact center of an adjacent hexagon. It will move from center to adjacent center until it has reached the hexagon containing point B. At the destination hexagon, it will move from the center to point B. In all cases the bee will take a path of minimal distance that obeys the rules. The figure below demonstrates one possible minimal path from point A to point B.</p>

<p><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/6377.%E2%80%85Problem%E2%80%85Bee/bc0d12be.png" data-original-src="https://onlinejudgeimages.s3.amazonaws.com/problem/6377/%EC%8A%A4%ED%81%AC%EB%A6%B0%EC%83%B7%202016-06-13%20%EC%98%A4%ED%9B%84%205.31.01.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:319px; width:640px" /></p>

### 입력

<p>Input will be in the form of 5 floating point numbers per line. The first number will be the length, in centimeters, of the sides of the hexagons. The next two numbers will be the x and y coordinates of point A, followed by the x and y coordinates for point B. The input will be terminated by a line containing five zeroes. Neither point A nor point B will ever be exactly on a border between hexagons.</p>

<p>&nbsp;</p>

### 출력

<p>For each line of the input, output the minimum length of a path from point A to point B, in centimeters, to the nearest .001 centimeters.</p>