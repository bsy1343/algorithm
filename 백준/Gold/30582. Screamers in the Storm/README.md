# [Gold I] Screamers in the Storm - 30582

[문제 링크](https://www.acmicpc.net/problem/30582)

### 성능 요약

시간 제한: 2 초 (추가 시간 없음), 메모리 제한: 1024 MB

### 통계

제출: 60, 정답: 33, 맞힌 사람: 28, 정답 비율: 56.000%

### 분류

다이나믹 프로그래밍, 기하학, 4차원 이상의 기하학

### 문제 설명

<p>Students visiting the Multidimensional Data Cabinet at Tomorrow Programming School may get access to multidimensional hyperspheres stored in air-conditioned helium cupboards in the cabinet. Before exploring a chosen sphere, a student has to prove he/she is knowledgeable enough to handle the sphere. There are spheres of various dimensions and various integer radiuses, each in a separate locked cupboard. The dimension and the radius of the sphere are written on the cupboard label. To unlock the cupboard, the student has to enter a specific value into the lock mechanism. The value depends on the dimension and the radius of the sphere. It is equal to the sum of absolute values of all coordinates of all integer points which lie inside or on the surface of the sphere, when the center of the sphere is exactly in the center of coordinates. The sum has to be entered modulo 10<sup>9</sup> + 7.</p>

<p>An integer point in a d-dimensional Euclidean space is a point which all d coordinates are integers.</p>

<p>The Cabinet manager is planning to obtain more spheres in the future, and you know that calculations which help to unlock some high-dimensional spheres may be quite tedious to perform by hand.</p>

<p>Write a program that calculates the value necessary to unlock a cupboard with a sphere in the cabinet.</p>

### 입력

<p>The input contains two integers D, R (1 &le; D &le; 50, 1 &le; R &le; 50), the dimension and the radius of the sphere inside a cupboard.</p>

### 출력

<p>Print the value which unlocks the cupboard with the given sphere, modulo 10<sup>9</sup> + 7.</p>