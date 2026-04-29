# [Gold V] Rectangular Dry Land - 32310

[문제 링크](https://www.acmicpc.net/problem/32310)

### 성능 요약

시간 제한: 7 초 (추가 시간 없음), 메모리 제한: 1024 MB

### 통계

제출: 45, 정답: 24, 맞힌 사람: 19, 정답 비율: 70.370%

### 분류

누적 합, 브루트포스 알고리즘

### 문제 설명

<p>There are a lot of wetlands in Florida and finding space for building houses is a challenge. This problem is even more serious when people insist their houses to be rectangular shapes.</p>

<p>Let’s assume our land is a two-dimensional (rectangular) grid and each grid cell is either wet or dry. We are interested in finding the largest rectangular dryland, i.e., we want to build the largest house (in area). Note that the house must be dryland in rectangular shape, i.e., the dry cells (area to build the house) must be rectangular and there can’t be any wet cells in that rectangle.</p>

### 입력

<p>The first input line contains two integers: r (1 ≤ r ≤ 200), indicating the number of rows in our land and c (1 ≤ c ≤ 200), indicating the number of columns in our land. Each of the next r input lines specifies a row in the land; each line contains c characters (starting in column 1), each character being either 1 (wetland) or 0 (dryland).</p>

### 출력

<p>Print the area of the largest rectangular dryland.</p>