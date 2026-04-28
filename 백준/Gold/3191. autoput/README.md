# [Gold II] autoput - 3191

[문제 링크](https://www.acmicpc.net/problem/3191)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 25, 정답: 10, 맞힌 사람: 9, 정답 비율: 56.250%

### 분류

다이나믹 프로그래밍

### 문제 설명

<p>Imagine one simple road in a coordinate system. Road is going from left to right, following the configuration of the land and within one square it can:&nbsp;</p>

<ol style="list-style-type:lower-alpha">
	<li>stay on the same height&nbsp;</li>
	<li>go down or up by one square&nbsp;</li>
</ol>

<p>Car is driving on the road from left to right. The time needed to travel through a single square is either A seconds for the case a), or B seconds for the case b).&nbsp;</p>

<p>However, we can build a tunnel under some mountain or a viaduct above some valley. These objects have to be horizontal, and the time needed for a car to travel through a single square on a tunnel or viaduct is C seconds.&nbsp;</p>

<p>Write a program that will, for a given configuration of land, calculate the minimal time for a car to travel the whole road with optimal construction of tunnels and viaducts. Total number of objects built must not be greater than the given number K.&nbsp;</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/3191.%E2%80%85autoput/b4225c05.png" data-original-src="https://upload.acmicpc.net/41a6408f-61b5-4bff-825e-923b9d0de4c3/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 428px; height: 237px;" /></p>

<p>Figure above corresponds to the third example. Original road is denoted by the thin line, and the optimal path is denoted by the thick line. Because the number of objects is restricted to 2, we could not build a tunnel under the first mountain.&nbsp;</p>

### 입력

<p>First line of input contains three integers A, B and C, 1 &le; A,B,C &le; 100.&nbsp;</p>

<p>Second line of input contains two integers N and K, 1 &le; N &le; 30,000, 1 &le; K &le; 1,000.&nbsp;</p>

<p>Third line of input contains a sequence of N characters that describes the configuration of the land,&nbsp;from left to right. Each character in the sequence is one of the following:&nbsp;</p>

<ul>
	<li>&#39;D&#39; in next square land is going DOWN&nbsp;</li>
	<li>&#39;R&#39; in next square land is staying on the SAME HEIGHT&nbsp;</li>
	<li>&#39;G&#39; in next square land is going UP&nbsp;</li>
</ul>

### 출력

<p>First and only line of output should contain the minimal time from the problem statement.&nbsp;</p>