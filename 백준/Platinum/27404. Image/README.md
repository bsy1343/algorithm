# [Platinum IV] Image - 27404

[문제 링크](https://www.acmicpc.net/problem/27404)

### 성능 요약

시간 제한: 0.6 초, 메모리 제한: 1024 MB

### 통계

제출: 5, 정답: 2, 맞힌 사람: 2, 정답 비율: 40.000%

### 분류

다이나믹 프로그래밍, 분할 정복을 이용한 거듭제곱, 수학

### 문제 설명

<p>Fourier has an image of M &times; N pixels (M lines, N columns). All the pixels are initially white. Fourier wants to color some pixels in black in order to obtain an amazing image. He considers an image to be amazing if, in any contiguous group of K pixel columns, there exists at least one column containing at least F black pixels.</p>

<p>Fourier is very curious about how many possibilities he has for coloring the image and he asks you to calculate this for him.</p>

### 입력

<p>The input contains a single line with four integers, M N K F, with the meanings described above.</p>

### 출력

<p>The output must contain a single integer representing the number of amazing images modulo 1,000,000,007.</p>

### 제한

<ul>
	<li>1 &le; K &le; N</li>
	<li>1 &le; F &le; M</li>
</ul>