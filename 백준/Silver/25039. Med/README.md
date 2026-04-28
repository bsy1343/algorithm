# [Silver III] Med - 25039

[문제 링크](https://www.acmicpc.net/problem/25039)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 512 MB

### 통계

제출: 45, 정답: 37, 맞힌 사람: 33, 정답 비율: 82.500%

### 분류

브루트포스 알고리즘, 구현, 정렬

### 문제 설명

<p>The moment has finally arrived. Not only is it the last round of COCI this season, it is also the last round of COCB - the Croatian Open Competition in Beekeeping. Not many people know that the two competitions share the same scoring system. More precisely, both competitions consist of six rounds, the points on each round are between 0 and 500, and the scores of the individual rounds are summed up for the final tally.</p>

<p>After the six rounds, the competitors are ranked based on their total score over the six rounds. If two competitors have the same score, the one with the lexicographically smaller name appears sooner on the ranking. No two competitors have the same name.</p>

<p>The beekeepers are very impatient and they would like to know what their final ranking will be in advance. Each beekeeper wants to know their best and worst possible positions on the final ranking. Unlike skilled COCI programmers, the beekeepers don&rsquo;t know how to code. Therefore, they are asking you to determine the range of positions they could occupy after the sixth round.</p>

### 입력

<p>The first line contains a positive integer $n$ ($1 &le; n &le; 500$), the number of beekeepers.</p>

<p>Each of the following $n$ lines contains the name of a beekeeper $s_i$ ($1 &le; |s_i| &le; 10$) and five numbers $b_{i1}$, $b_{i2}$, $b_{i3}$, $b_{i4}$, $b_{i5}$ from the range $[0, 500]$, the scores of the $i$-th beekeeper on the first five rounds of COCB. The names of the beekeepers are distinct and are made up of at most ten lowercase letters of the latin alphabet.</p>

### 출력

<p>Print $n$ lines. In the $i$-th line print the best and worst possible position on the ranking for the $i$-th beekeeper.</p>

### 힌트

<p>Clarification of the second example: So far, Ante has a sum of 1375, and Mate has 875. If Mate were to win 500 points on the last round,&nbsp;and Ante 0, the result would be tied and they would both have 1375 points. However, since Ante is lexicographically smaller than Mate, Ante will still be ahead on the ranking.</p>