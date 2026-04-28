# [Platinum V] Longest Path - 25940

[문제 링크](https://www.acmicpc.net/problem/25940)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 1024 MB

### 통계

제출: 19, 정답: 8, 맞힌 사람: 8, 정답 비율: 53.333%

### 분류

구현, 그래프 이론, 정렬, 해 구성하기, 시뮬레이션

### 문제 설명

<p>You are visiting a lovely garden, with several points of interest. Every pair of points of interest have a single, one way path (edge) connecting them. (The paths are one way so that guests don&#39;t get upset having to deal with other guests walking in the opposite direction.) Luckily, you get to decide which point of interest to begin from. Naturally, to get your money&#39;s worth, you&#39;d like to visit as many of the points of interest as possible without revisiting any point of interest, since that would be a waste of time. Determine a walking path that allows you to visit the maximal number of points of interest without repeating any of them.</p>

<p>Given a directed graph containing exactly one edge (path) between every pair of vertices (points of interest), determine a walking path of maximal length that doesn&#39;t revisit any vertex.</p>

### 입력

<p>The first input line contains a positive integer, n (n &le; 100), indicating the number of gardens to check. The input for each garden follows. Each set starts with a line with a single integer, v (1 &le; v &le; 500), the number of points of interest for that case. The following v lines will contain v space separated integers each. The j th (1 &le; j &le; v) of these integers on the i th (1 &le; i &le; v) line is 1 if there is a path from point i to point j, or 0 if there is a directed path from point j to point i instead. The i th integer on the i th line will always be 0. It is guaranteed that the input information is consistent - if the jth integer on the ith line is 1 then the ith integer on the jth line is 0, and vice versa.</p>

### 출력

<p>For each garden, on a line by itself, output a space separated list of any maximal length sequence of unique points of interest to visit.</p>