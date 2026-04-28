# [Silver III] Hamster Ball - 17572

[문제 링크](https://www.acmicpc.net/problem/17572)

### 성능 요약

시간 제한: 1 초 (추가 시간 없음), 메모리 제한: 512 MB

### 통계

제출: 113, 정답: 72, 맞힌 사람: 64, 정답 비율: 65.979%

### 분류

그리디 알고리즘, 정렬

### 문제 설명

<p>The years have been good to the Rock and Roll Hamster Ball company. Starting with a single hamster ball they now produce a popular range of different sizes for hamsters big and small.</p>

<p>Recently they moved manufacturing to a new plant but disaster has happened: The new balls, many of which have been shipped to customers, have a defect. The two halves of the ball do not lock together properly and hamsters are escaping.</p>

<p>The immediate solution is simple. We will send out special hamster ball tape to each customer, they put the hamster in the ball and tape it shut. Problem solved.</p>

<p>Unfortunately you only have a certain amount of tape and you&rsquo;re not sure it will seal all of the balls that have been shipped. Given the length of tape, the number and radius of hamster balls, what is the largest number of balls you can tape shut?</p>

### 입력

<ul>
	<li>one line containing the integer t (1 &le; t &le; 10000), the length of the tape in centimetres.</li>
	<li>one line containing the integer b (1 &le; b &le; 100), the number of different sizes of balls.</li>
	<li>b lines each with integers d (1 &le; d &le; 100), the number of balls of that size sold and s (1 &le; s &le; 10000) the radius of a ball in centimeters.</li>
</ul>

### 출력

<p>A single line with the integer number of the largest number of balls you can tape shut. If you cannot tape shut any balls, output 0.</p>