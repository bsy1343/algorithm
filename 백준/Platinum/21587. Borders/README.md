# [Platinum II] Borders - 21587

[문제 링크](https://www.acmicpc.net/problem/21587)

### 성능 요약

시간 제한: 4 초, 메모리 제한: 1024 MB

### 통계

제출: 44, 정답: 22, 맞힌 사람: 21, 정답 비율: 61.765%

### 분류

이분 매칭, 최대 유량, 그래프 이론

### 문제 설명

<p>Consider a black and white image, where every pixel has a value of either 0 or 1. Define a region of the image as a collection of pixels that all have the same value, and are interconnected. Specifically, for any two pixels in a region, there is a path between them only going up, down, left or right, and only going through other pixels with the same value.</p>

<p>You wish to see a border completely around every region in the image. You can choose certain regions to draw a border around; when you do, you draw a border around the entire region, including any internal &ldquo;holes&rdquo; (regions entirely contained within the region). If two regions are adjacent, then you can supply the border between then by drawing the border around one, or the other, or both. What is the minimum number of regions you need to draw a border around in order to ensure that every region has a border?</p>

<p>Consider these examples:</p>

<p style="text-align: center;"><img alt="" src="https://upload.acmicpc.net/cc8cfbee-7723-45ac-acd7-f54b1e9f3f19/-/preview/" style="width: 616px; height: 176px;" /></p>

<ul>
	<li>In the first case, the minimum is three. Because they&rsquo;re on the edges, there is no choice but to draw a border around all three.</li>
	<li>In the second case, the minimum is one. Drawing a border around the 0 region puts a border around the 1 region.</li>
	<li>In the third case, the answer is eight. Drawing a border around all of the regions on the edges puts a border around the center region.</li>
</ul>

### 입력

<p>The first line of input contains two integers $n$ and $m$ ($1 \le n, m \le&nbsp;100$), where $n$ is the number of rows in the image, and $m$ is the number of columns.</p>

<p>Each of the next $n$ lines contains a single string of length $m$, consisting only of the characters &lsquo;<code>0</code>&rsquo; and &lsquo;<code>1</code>&rsquo;. This is the image.</p>

### 출력

<p>Output a single integer, which is the minimum number of regions you must draw a border around to ensure that every region has a border.</p>