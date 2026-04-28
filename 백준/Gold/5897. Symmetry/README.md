# [Gold I] Symmetry - 5897

[문제 링크](https://www.acmicpc.net/problem/5897)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 95, 정답: 28, 맞힌 사람: 22, 정답 비율: 28.205%

### 분류

자료 구조, 브루트포스 알고리즘, 기하학, 집합과 맵

### 문제 설명

<p>After taking a modern art class, Farmer John has become interested in finding geometric patterns in everything around his farm.  He carefully plots the locations of his N cows (2 &lt;= N &lt;= 1000), each one occupying a distinct point in the 2D plane, and he wonders how many different lines of symmetry exist for this set of points.  A line of symmetry, of course, is a line across which the points on both sides are mirror images of each-other.</p><p>Please help FJ answer this most pressing geometric question.</p>

### 입력

<ul><li>Line 1: The single integer N.</li><li>Lines 2..1+N: Line i+1 contains two space-separated integers representing the x and y coordinates of the ith cow (-10,000 &lt;= x,y &lt;= 10,000).</li></ul>

### 출력

<ul><li>Line 1: The number of different lines of symmetry of the point set.</li></ul>

### 힌트

<h4>Input Details</h4><p>The 4 cows form the corners of a square.</p><h4>Output Details</h4><p>There are 4 lines of symmetry -- one vertical, one horizontal, and two diagonal.</p>