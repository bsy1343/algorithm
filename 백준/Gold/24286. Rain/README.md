# [Gold II] Rain - 24286

[문제 링크](https://www.acmicpc.net/problem/24286)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 1024 MB

### 통계

제출: 20, 정답: 6, 맞힌 사람: 4, 정답 비율: 40.000%

### 분류

구현, 애드 혹

### 문제 설명

<p>Waterproof barriers of different heights are placed perpendicular to the length of a rectangular box. The distance between any two adjacent barriers is one centimeter. The box is without a lid and when there is enough rain on top, it is filled with as much water as possible. For some barriers, we can increase their heights by integer values no larger than the pre-specified ones. What is the minimum count of barriers at which we need to increase their heights, so that the maximum amount of water can be collected in the box? Write program rain to find the answer.</p>

<p><strong>Remark</strong>: We calculate the amount of water in cubic centimeters because we assume the width of the box to be one centimeter. We consider the front and back walls of the box (the one that is to us and the one to the rear) to be higher than the height of each barrier, together with any possible increase in height of the barriers. The left and right walls of the box coincide with the left and right barriers respectively and with the barriers after a possible increase of the heights.</p>

### 입력

<p>The first line of the standard input contains the count N of the barriers. The second line contains, according to their location in the box from left to right, the heights in centimeters of the barriers. The next line contains the count K of barriers at which we can increase the heights. It follows as many lines as there are barriers at which we can increase the heights. Each of these lines contains a barrier number and a maximum allowed increase in height in centimeters. Barrier numbers start at zero.</p>

### 출력

<p>The program should print on the standard output two integers separated by exactly one space, equal respectively to the found minimum number of barriers at which we increase the heights and the maximum amount of water that the box can collect after increasing the heights of the barriers.</p>

### 제한

<ul>
	<li>1 &lt; N &lt; 1 000 000</li>
	<li>0 &lt; K &le; N; The initial height of each barrier is a positive integer less than 1 000 000</li>
	<li>The maximum allowed increase in height of a barrier is a positive integer less than 1 000 000.</li>
</ul>

### 힌트

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/24286.%E2%80%85Rain/fd86c7c0.png" data-original-src="https://upload.acmicpc.net/973af0fe-5e28-459a-b889-685af458c4d4/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 282px; height: 100px;" /></p>

<p>We do not increase the height of the barrier at position 2 because this will not change the amount of water. We increase by 1 centimeter the barrier height at position 4. This increases the total amount of water by 1 cubic centimeter.</p>