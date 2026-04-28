# [Platinum II] Drawing Circles - 20989

[문제 링크](https://www.acmicpc.net/problem/20989)

### 성능 요약

시간 제한: 5 초, 메모리 제한: 1024 MB

### 통계

제출: 33, 정답: 20, 맞힌 사람: 7, 정답 비율: 36.842%

### 분류

기하학, 스위핑

### 문제 설명

<p>Alice likes to draw circles. Whenever she has some time, she will grab a piece of paper and draw circles on it.</p>

<p>Alice is drawing circles on a paper with a coordinate system. Each circle is represented by an ordered tuple (x, y, r), where (x, y) is the position of the circle&rsquo;s center and r is the radius of the circle. Since she does not like two circles to cross each other, she always erases the inside area of each new circle she draws. That is, she always erases the interior of each new circle she draws, leaving the pencil line showing the circumference. (Of course, if she overwrites an existing circle then the new pencil line simply hides the old circumference, removing it from view.)</p>

<p>For example (see Figure A.1),</p>

<ul>
	<li>if she first draws (0, 0, 1) and then (0, 0, 2), the first circle will be completely erased; or</li>
	<li>if she first draws (&minus;1, 0, 2) and then (1, 0, 2), then the part of the first circle to the right of the x = 0 axis will be erased.</li>
</ul>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/20989.%E2%80%85Drawing%E2%80%85Circles/8676d538.png" data-original-src="https://upload.acmicpc.net/54c41449-3424-4cd9-be11-e6f24c0674eb/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 489px; height: 198px;" /></p>

<p style="text-align: center;">Figure A.1: Sample inputs. Dotted lines are areas that have been erased.</p>

<p>After drawing a number of circles, she would like to know the total length of all curved line segments that are still visible on the paper.</p>

### 입력

<p>The first line of input contains an integer N (1 &le; N &le; 2000) denoting the number of circles Alice drew. Each of the following N lines contains three space-separated integers x<sub>i</sub>, y<sub>i</sub>, and r<sub>i</sub> (&minus;10 000 &le; x<sub>i</sub>, y<sub>i</sub> &le; 10 000, 1 &le; r<sub>i</sub> &le; 10 000, i = 1 . . . N) describing the i th circle she drew.</p>

### 출력

<p>Output the total length of all curved line segments that are visible.</p>

<p>Your answer will be considered correct if its absolute or relative error does not exceed 10<sup>&minus;6</sup>.</p>