# [Platinum IV] Dynamo Wheel - 17568

[문제 링크](https://www.acmicpc.net/problem/17568)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 54, 정답: 26, 맞힌 사람: 8, 정답 비율: 34.783%

### 분류

정렬, 기하학, 두 포인터

### 문제 설명

<p>A water wheel is a device for converting the potential energy of water into the kinetic energy of rotation. We have attached buckets along our otherwise perfectly-balanced wheel. Each bucket has a specific weight when empty, and a specific weight when full of water, both in kilograms.</p>

<p>Whenever a bucket reaches the top of the water wheel, it is filled to its maximum capacity. When the bucket reaches the bottom, diametrically opposite, it is emptied again.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/17568.%E2%80%85Dynamo%E2%80%85Wheel/9355147e.png" data-original-src="https://upload.acmicpc.net/84f629cb-641a-4da7-90c4-91059a97a93c/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 604px; height: 237px;" /></p>

<p style="text-align: center;">Figure D.1: Illustration of Sample Input 1 at approximately 15.0 degrees clockwise from the start. The centre of mass is drawn as a vector from the origin.</p>

<p>The acceleration of the wheel depends on the horizontal distance between the centre of mass of the wheel and its axis of rotation. Centre of mass of the wheel at some time is defined as the sum of the co-ordinates of the buckets at that time multiplied by their weight.</p>

<p>Our water wheel has a radius of exactly 1 metre. What is the maximum positive x-component of centre of mass achieved by the wheel at any angle?</p>

### 입력

<ul>
	<li>The first line of input contains the number of buckets on the wheel, n (2 &le; n &le; 10<sup>5</sup>).</li>
	<li>The remaining n lines of input each contain a description of a bucket, in angular order:
	<ul>
		<li>the decimal clockwise angle of the ith bucket in degrees, d<sub>i</sub> (0.0 &le; d &le; 360.0),</li>
		<li>the decimal weights of this bucket when empty and full, e<sub>i</sub> and f<sub>i</sub> (0 &le; e<sub>i</sub> &le; f<sub>i</sub> &le; 10<sup>4</sup>).</li>
	</ul>
	</li>
</ul>

### 출력

<p>Output the maximum horizontal component of the centre of mass of the wheel over all possible angles. Your answer should be within an absolute or relative error of at most 10<sup>&minus;6</sup>.</p>