# [Bronze III] Max Volume - 9776

[문제 링크](https://www.acmicpc.net/problem/9776)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 482, 정답: 391, 맞힌 사람: 335, 정답 비율: 83.127%

### 분류

수학, 구현, 사칙연산

### 문제 설명

<p>Write a program to find the maximum volume of given geometric 3-dimensional figures. Here, there are 3 types of figures: cone, cylinder and sphere.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Bronze/9776.%E2%80%85Max%E2%80%85Volume/243fea67.png" data-original-src="%EB%B0%B1%EC%A4%80/Bronze/9776.%E2%80%85Max%E2%80%85Volume/243fea67.png" data-original-src="https://upload.acmicpc.net/51b9d0e5-fefc-4841-bd7f-9da111450728/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 485px; height: 202px;" /></p>

<p>The volume (V) of each figure can be calculated by the following formulas.</p>

<ul>
	<li>Cone: V = (1/3)&pi;r<sup>2</sup>h</li>
	<li>Cylinder: V = &pi;r<sup>2</sup>h</li>
	<li>Sphere: V = (4/3)&pi;r<sup>3</sup></li>
</ul>

<p>Use the value &pi; = 3.14159 in your calculation.</p>

### 입력

<p>The first line of the input contains a positive integer n (1 &le; n &le; 100) which is the number of figures. The n following lines contain the description of each figure. In case of a cone, the line begins with letter C and followed by 2 values: r and h respectively. If it is a cylinder, the line begins with letter L and followed by 2 values: r and h respectively. If it is a sphere, the line begins with letter S and followed by only one value which is r.</p>

### 출력

<p>Print out the max volume among the input figures with 3 decimal places</p>