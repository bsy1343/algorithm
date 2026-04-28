# [Platinum I] Integral Points - 17606

[문제 링크](https://www.acmicpc.net/problem/17606)

### 성능 요약

시간 제한: 3 초 (추가 시간 없음), 메모리 제한: 512 MB

### 통계

제출: 97, 정답: 53, 맞힌 사람: 46, 정답 비율: 54.762%

### 분류

수학, 정수론, 해 구성하기

### 문제 설명

<p>We say a set of points are concyclic if they all lie on the circumference of a circle. The task is: given an integer n, find a circle centered at (0, 0) such that there are at least n distinct concyclic integral points lying on it.</p>

<p>Note: Integral points are points with integral coordinates.</p>

### 입력

<p>The input is a line containing a positive integer n.</p>

### 출력

<p>Output n + 1 lines. The first line contains an integer r indicating the radius of the circle. Each of the following lines contains two integers x and y such that point (x, y) lies on the circle.</p>

### 제한

<ul>
	<li>1 &le; n &le; 1000</li>
	<li>This problem uses a special checker so you don&rsquo;t have to output the minimum radius r.</li>
	<li>Each token in your output cannot exceed 30 characters.</li>
	<li>Every point in your output must be unique.</li>
	<li>The size of your code must be no greater than 256 kilobytes.</li>
</ul>