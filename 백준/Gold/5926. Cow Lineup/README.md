# [Gold III] Cow Lineup - 5926

[문제 링크](https://www.acmicpc.net/problem/5926)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 901, 정답: 371, 맞힌 사람: 270, 정답 비율: 44.481%

### 분류

자료 구조, 정렬, 집합과 맵, 두 포인터, 값 / 좌표 압축

### 문제 설명

<p>Farmer John has hired a professional photographer to take a picture of some of his cows.  Since FJ&apos;s cows represent a variety of different breeds, he would like the photo to contain at least one cow from each distinct breed present in his herd.</p><p>FJ&apos;s N cows are all standing at various positions along a line, each described by an integer position (i.e., its x coordinate) as well as an integer breed ID.  FJ plans to take a photograph of a contiguous range of cows along the line.  The cost of this photograph is equal its size -- that is, the difference between the maximum and minimum x coordinates of the cows in the range of the photograph.</p><p>Please help FJ by computing the minimum cost of a photograph in which there is at least one cow of each distinct breed appearing in FJ&apos;s herd.</p>

### 입력

<ul><li>Line 1: The number of cows, N (1 &lt;= N &lt;= 50,000).</li><li>Lines 2..1+N: Each line contains two space-separated positive integers specifying the x coordinate and breed ID of a single cow.  Both numbers are at most 1 billion.</li></ul>

### 출력

<ul><li>Line 1: The smallest cost of a photograph containing each distinct breed ID.</li></ul>

### 힌트

<h4>Input Details</h4><p>There are 6 cows, at positions 25,26,15,22,20,30, with respective breed IDs 7,1,1,3,1,1.</p><h4>Output Details</h4><p>The range from x=22 up through x=26 (of total size 4) contains each of the distinct breed IDs 1, 3, and 7 represented in FJ&apos;s herd.</p>