# [Gold V] The Flood - 4048

[문제 링크](https://www.acmicpc.net/problem/4048)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 90, 정답: 36, 맞힌 사람: 31, 정답 비율: 43.662%

### 분류

너비 우선 탐색, 브루트포스 알고리즘, 플러드 필, 그래프 이론, 그래프 탐색

### 문제 설명

<p>Global warming has us all thinking of rising oceans &mdash; well, maybe only those of us who live near the ocean. The small island nation of Gonnasinka has employed you to answer some questions for them. In particular they want to know how high the water has to get before their island becomes two islands (or more).</p>

<p>Given a grid of integers giving the altitudes of the island, how high must the ocean rise before the land splits into pieces?</p>

### 입력

<p>Each test case begins with a line containing two positive integers n, m giving the dimensions of the igrid, then n lines each containing m positive integers. The integers indicate the original altitude of the grid elements. Grid elements are considered to be adjacent only if they share a horizontal or vertical edge. Values of zero (0) along the perimeter, and all zero cells connected to these, are ocean at its initial level. Cells of 0 not connected to the perimeter (that is, surrounded by higher land) are simply sea level elevations. Furthermore, assume the ocean initially surrounds the given grid. The island is initially connected. Neither n nor m will exceed 100 and heights will never exceed 1000. A line with 0 0 follows the last test case.</p>

### 출력

<p>For each test case output one of the two following lines.</p>

<pre>
Case n: Island splits when ocean rises f feet.</pre>

<p>or</p>

<pre>
Case n: Island never splits.</pre>

<p>Our convention here is if your answer is, say, 5 feet, you more accurately mean &ldquo;5 feet plus a little more.&rdquo; That is, at least a little water will be flowing over the originally 5 foot high portion of land.</p>