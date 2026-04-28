# [Platinum I] Garden - 20252

[문제 링크](https://www.acmicpc.net/problem/20252)

### 성능 요약

시간 제한: 10 초, 메모리 제한: 1024 MB

### 통계

제출: 67, 정답: 24, 맞힌 사람: 13, 정답 비율: 37.143%

### 분류

그래프 이론, 이분 매칭, 역추적

### 문제 설명

<p>There is a rectangle garden in front of Gina&rsquo;s house. The garden can be seen as an n-by-m rectangular grid. All grid cells are identical squares, and two grid cells are considered adjacent if they share an common edge.</p>

<p>Gina loves cacti and wants to plant as many cacti as possible in the garden. However, there are some constraints on planting cacti.</p>

<ul>
	<li>The soil can be too wet in some of the cells and therefore is not suitable for cacti. Gina cannot plant cacti in those cells.</li>
	<li>Since the soil in each cell is not fertile enough to grow two or more cacti, Gina may plant at most one cactus in a cell.</li>
	<li>At most one cactus can be planted in any pair of adjacent cells. Otherwise, the cacti in those cells may be harmed by their neighbor&rsquo;s thorns.</li>
</ul>

<p>Please write a program to help Gina calculate the maximum possible number of cacti can be planted, and also a way of plantings that meet the listed constraints.</p>

### 입력

<p>The first line contains two space-separated integers n and m meaning the garden is an n-by-m grid. Then, each of the following n lines contains a string of m characters. These characters are either &lsquo;<code>.</code>&rsquo; or &lsquo;<code>*</code>&rsquo;. The j-th character of the i-th of these lines indicates whether the soil in the grid cell on the i-th row and the j-th column is suitable for planting a cactus. &lsquo;<code>.</code>&rsquo; means it is suitable, and &lsquo;<code>*</code>&rsquo; means it is not suitable.</p>

### 출력

<p>First, output the maximum possible number of cacti on the first line. Then, output n lines, each line containing a string of m characters. Each of the characters must be one of &lsquo;<code>.</code>&rsquo;, &lsquo;<code>*</code>&rsquo; and &lsquo;<code>C</code>&rsquo;. The j-th character of the i-th of these lines indicates the status of the grid cell on the i-th row and the j-th column. A &lsquo;<code>C</code>&rsquo; means a cactus should be planted in that particular cell, and the other cells should be identical to the corresponding position of the input.</p>

<p>If there are more than one possible way of planting, any of them will be accepted.</p>

### 제한

<ul>
	<li>1 &le; nm &le; 10<sup>5</sup></li>
</ul>