# [Gold II] Absurdistan Roads III - 11214

[문제 링크](https://www.acmicpc.net/problem/11214)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 256 MB

### 통계

제출: 62, 정답: 18, 맞힌 사람: 17, 정답 비율: 28.814%

### 분류

방향 비순환 그래프, 그래프 이론, 위상 정렬

### 문제 설명

<p>The people of Absurdistan discovered how to build roads only last year. After the discovery, each city decided to build its own road, connecting the city to some other city. Each newly built road can be used in both directions.</p>

<p>You bought a tourist guide which has a map of the country with the newly built roads. However, since you are very interested in history, you would like to know which city built which road.</p>

<p>Given the description of n roads, can you find an assignment of roads to n cities, such that each city built one road? If there are multiple assignments, you are happy with any one. At least one solution is guaranteed to exist.</p>

### 입력

<p>The first line contains an integer n (2 &le; n &le; 100 000) &ndash; the number of cities and roads. Then follow n lines with 2 numbers each. A line containing &ldquo;a b&rdquo; indicates that there is a road between cities a and b, 1 &le; a, b &le; n, a &ne; b. There can be multiple roads between the same pair of cities.</p>

### 출력

<p>Print n lines with two integers &ldquo;a b&rdquo; denoting that a road between a and b was built by city a. Each road from the input must appear exactly once in the output. If there are multiple solutions, you can print any one and you can print the roads in any order.</p>