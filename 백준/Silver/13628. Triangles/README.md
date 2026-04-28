# [Silver II] Triangles - 13628

[문제 링크](https://www.acmicpc.net/problem/13628)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 128, 정답: 58, 맞힌 사람: 53, 정답 비율: 50.000%

### 분류

이분 탐색, 기하학, 구현, 누적 합, 두 포인터

### 문제 설명

<p>You will be given N points on a circle. You must write a program to determine how many distinct equilateral triangles can be constructed using the given points as vertices.</p>

<p>The figure below illustrates an example: (a) shows a set of points, determined by the lengths of the circular arcs that have adjacent points as extremes; and (b) shows the two triangles which can be built with these points.</p>

<p style="text-align:center"><img alt="" src="%EB%B0%B1%EC%A4%80/Silver/13628.%E2%80%85Triangles/c921d8c2.png" data-original-src="%EB%B0%B1%EC%A4%80/Silver/13628.%E2%80%85Triangles/c921d8c2.png" data-original-src="https://onlinejudgeimages.s3.amazonaws.com/problem/13628/%EC%8A%A4%ED%81%AC%EB%A6%B0%EC%83%B7%202017-01-05%20%EC%98%A4%ED%9B%84%208.46.12.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:173px; width:455px" /></p>

<p>&nbsp;</p>

### 입력

<p>The first line of the input contains an integer N, the number of points given. The second line contains N integers X<sub>i</sub>, representing the lengths of the circular arcs between two consecutive points in the circle: for 1 &le; i &le; (N &minus; 1), X<sub>i</sub> represents the length of the arc between between points i and i + 1; X<sub>N</sub> represents the length of the arc between points N and 1.</p>

<p>Restrictions</p>

<ul>
	<li>3 &le; N &le; 10<sup>5</sup></li>
	<li>1 &le; Xi &le; 10<sup>3</sup>, for 1 &le; i &le; N</li>
</ul>

### 출력

<p>Your program must output a single line, containing a single integer, the number of distinct equilateral triangles that can be constructed using the given points as vertices.</p>