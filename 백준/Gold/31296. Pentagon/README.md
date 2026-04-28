# [Gold III] Pentagon - 31296

[문제 링크](https://www.acmicpc.net/problem/31296)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 1024 MB

### 통계

제출: 22, 정답: 8, 맞힌 사람: 7, 정답 비율: 35.000%

### 분류

기하학

### 문제 설명

<p>You are given a pentagon. Your task is to find the number of its triangulations.</p>

<p>A <em>triangulation of polygon $P$</em> is a collection of triangles such that the internal areas of these triangles have no common points, and their union is equal to $P$. Each vertex of each triangle must coincide with some of the polygon&#39;s vertices. Additionally, each side of each traingle must either fully coincide with some of the polygon&#39;s sides or have exactly two common points (endpoints) with the border of the polygon.</p>

### 입력

<p>The first line of input contains one integer $n$, the number of test cases ($1 \le n \le 10\,000$). Then, the test cases follow. There is a single empty line before each test case.</p>

<p>Each test case describes one pentagon and consists of five lines. Each of these lines contains two integers $x$ and $y$ separated by a single space: coordinates of the next vertex of the pentagon in either clockwise or counter-clockwise direction ($-100 \le x, y \le 100$). It is guaranteed that every pentagon has no self-intersections and no self-touchings. Additionally, no two adjacent sides of the polygon lie on the same line.</p>

### 출력

<p>Print $n$ lines, one line for each test case. Each of these lines must contain one integer: the number of different triangulations of the corresponding pentagon.</p>

### 힌트

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/31296.%E2%80%85Pentagon/932786d5.png" data-original-src="%EB%B0%B1%EC%A4%80/Gold/31296.%E2%80%85Pentagon/932786d5.png" data-original-src="https://upload.acmicpc.net/a9b25566-658e-4485-a712-c1f74d89128b/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 462px; height: 141px;" /></p>

<p>This image shows all possible triangulations of the first pentagon in the example.</p>