# [Silver III] Most Frequent Square - 5229

[문제 링크](https://www.acmicpc.net/problem/5229)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 25, 정답: 23, 맞힌 사람: 19, 정답 비율: 95.000%

### 분류

브루트포스 알고리즘, 기하학

### 문제 설명

<p>As Sam is flying over the Grid world to the outlands, he notices some interesting formations on the ground, where there is well-defined small square grid with only a subset of its grid points lit (see figure). To pass time, Sam starts counting the number of different axis-parallel squares formed by the grid points. You are to write a program to help Sam with this task.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Silver/5229.%E2%80%85Most%E2%80%85Frequent%E2%80%85Square/30177b70.png" data-original-src="https://upload.acmicpc.net/71d38a16-0400-437a-a010-48cdda2bda01/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 493px; height: 226px;" /></p>

<p>Specifically, given a set of grid coordinates, your goal is to find the most common size of an axis-parallel square formed by subsets of the given points. An axis-parallel square is such that the square is aligned with the grid axes (i.e., the sides of the square are either vertical or horizontal, but are not allowed to at an angle). For instance, in the figure above, there are 3 such squares with side length 2, and three squares with side length 4.</p>

### 입력

<p>The first line in the test data file contains the number of test cases (&le; 50). After that, each line contains one test case. The test case begins with the number of points, k (&le; 30), and then we have k coordinate pairs (for a total of 2k numbers). Assume all numbers are &ge; 0, and that the coordinates are all &le; 30.</p>

### 출력

<p>For each test case, if there is at least one axis-parallel square present among the provided points, you should output the side length for which there are maximum squares present, and also the number of squares for that side length. If there are more than two side lengths with maximum number of squares, then output the largest of the side lengths. If the provided set of points does not form a single square, then you should output: <code>No squares among the points</code>.</p>