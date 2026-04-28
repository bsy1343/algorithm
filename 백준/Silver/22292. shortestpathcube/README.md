# [Silver III] shortestpathcube - 22292

[문제 링크](https://www.acmicpc.net/problem/22292)

### 성능 요약

시간 제한: 1 초 (추가 시간 없음), 메모리 제한: 512 MB

### 통계

제출: 175, 정답: 69, 맞힌 사람: 30, 정답 비율: 44.118%

### 분류

많은 조건 분기, 기하학, 3차원 기하학, 수학, 피타고라스 정리

### 문제 설명

<p>Write a function <u><code>P3</code></u>:</p>

<ul>
	<li>A point P on a surface of a cube C which has (0, 0, 0) and (100, 100, 100) as its vertex, with its planes parallel to the planes made by axes. </li>
	<li>input parameter: <code>x</code>, <code>y</code>, <code>z</code> which make a point P(<code>x</code>, <code>y</code>, <code>z</code>) be on the surface of C
	<ul>
		<li>Each of <code>x</code>, <code>y</code>, <code>z</code> is either an integer or a float.</li>
	</ul>
	</li>
	<li>return value: the minimum distance of (<code>x</code>, <code>y</code>, <code>z</code>) to (100, 100, 100) with these following restrictions:
	<ul>
		<li>You have to be on the surface of C.</li>
		<li>You can move to different planes by passing an edge.</li>
		<li>The answer must have an absolute or relative error less than 10<sup>&minus;6</sup>.</li>
	</ul>
	</li>
</ul>

### 입력



### 출력

