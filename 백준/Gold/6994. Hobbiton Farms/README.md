# [Gold II] Hobbiton Farms - 6994

[문제 링크](https://www.acmicpc.net/problem/6994)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 49, 정답: 29, 맞힌 사람: 22, 정답 비율: 56.410%

### 분류

기하학

### 문제 설명

<p>The HOA (Home Owners Association) of Hobbiton, the village in the Shire where Bilbo lives, is trying to create a new map showing precisely the boundaries of the houses in Hobbiton. But the unique geometry of Hobbiton is making this complicated, since a land parcel (on which a house is built) may either be a circle or a rectangle.</p>

<p>Before figuring out the boundaries and drawing the new map, the Hobbiton HOA would like to make sure that all its records are correct, and specifically that no two land parcels overlap with each other. It knows how to decide if two land parcels overlap if both of them are circles, or if both of them are rectangles. However, it needs your help when one of the land parcels is a rectangle and the other one is a circle.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/6994.%E2%80%85Hobbiton%E2%80%85Farms/b4a7dd29.png" data-original-src="%EB%B0%B1%EC%A4%80/Gold/6994.%E2%80%85Hobbiton%E2%80%85Farms/b4a7dd29.png" data-original-src="https://upload.acmicpc.net/e2a22ae1-115e-407a-9aa5-26b92833916d/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 404px; height: 300px;" /></p>

### 입력

<p>The first line in the test data file contains the number of test cases (&lt; 100). After that, each line contains one test case. Each test case comprises 7 numbers (of the type double). The first three numbers denote the circle, specifically, radius, x-coordinate of the center, y-coordinate of the center. The next four numbers represent the rectangle, specifically, the x and y coordinates of the lower left and upper right corners. More precisely, from the figure above, the 7 numbers are: r, x<sub>c</sub>, y<sub>c</sub>, x<sub>l</sub>, y<sub>l</sub>, x<sub>u</sub>, y<sub>u</sub>. You can assume that all the numbers are positive.</p>

### 출력

<p>For each test case, you are to output whether the circle and the rectangle overlap. The exact format is shown below in the examples.</p>