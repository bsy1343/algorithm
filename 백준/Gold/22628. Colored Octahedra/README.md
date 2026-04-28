# [Gold II] Colored Octahedra - 22628

[문제 링크](https://www.acmicpc.net/problem/22628)

### 성능 요약

시간 제한: 8 초 (추가 시간 없음), 메모리 제한: 512 MB

### 통계

제출: 18, 정답: 12, 맞힌 사람: 11, 정답 비율: 78.571%

### 분류

브루트포스 알고리즘, 자료 구조, 기하학, 3차원 기하학, 해시를 사용한 집합과 맵, 트리를 사용한 집합과 맵, 집합과 맵

### 문제 설명

<p>A young boy John is playing with eight triangular panels. These panels are all regular triangles of the same size, each painted in a single color; John is forming various octahedra with them.</p>

<p>While he enjoys his playing, his father is wondering how many octahedra can be made of these panels since he is a pseudo-mathematician. Your task is to help his father: write a program that reports the number of possible octahedra for given panels. Here, a pair of octahedra should be considered identical when they have the same combination of the colors allowing rotation.</p>

### 입력

<p>The input has the following format:</p>

<pre>
<i>Color</i><sub>1</sub> <i>Color</i><sub>2</sub> ... <i>Color</i><sub>8</sub></pre>

<p>Each&nbsp;<i>Color<sub>i</sub></i>&nbsp;(1 &le;&nbsp;<i>i</i>&nbsp;&le; 8) is a string of up to 20 lowercase alphabets and represents the color of the&nbsp;<i>i</i>-th triangular panel.</p>

### 출력

<p>Output the number of different octahedra that can be made of given panels.</p>