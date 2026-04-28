# [Silver II] A-maze-ing Lakes - 30610

[문제 링크](https://www.acmicpc.net/problem/30610)

### 성능 요약

시간 제한: 10 초 (추가 시간 없음), 메모리 제한: 1024 MB

### 통계

제출: 163, 정답: 114, 맞힌 사람: 103, 정답 비율: 69.595%

### 분류

그래프 이론, 그래프 탐색, 너비 우선 탐색, 깊이 우선 탐색, 플러드 필

### 문제 설명

<p>An environmental agency is asked to perform a survey of the lakes found in various places. This effort is part of a program to estimate the size and distribution of the lakes depending on the place they&rsquo;re located. At the initial stage of this project, the agency is going to use aerial photographs to perform the estimation. Due to the large number of lakes that will be investigated they decided to use a computer program to help with the task. More specifically, given a &lsquo;two color&rsquo; image that looks like this:</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Silver/30610.%E2%80%85A-maze-ing%E2%80%85Lakes/86a23cf3.png" data-original-src="https://upload.acmicpc.net/646a1f3a-12b2-447d-97e9-f52a09341ed0/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 422px; height: 244px;" /></p>

<p>The task is to find the number of the lakes (marked with blue) as well as the surface area of each one of them. The encoded image is given as a 2D array of tiles that can be either a ground tile or a water tile. Each tile in the image corresponds to one square meter of area. Given a single water tile, a lake is defined to cover all the water tiles that are reachable from the initial tile by performing an arbitrary sequence of up/down/left or right moves on water tiles (not diagonally). You can assume that the border tiles found at the edge of the image are always ground tiles.</p>

### 입력

<p>The first line of the input contains two integers N and M separated with a single whitespace character (1 &le; N &le; 10<sup>3</sup>, 1 &le; M &le; 10<sup>3</sup>). These define an N x M 2D array of tiles. The next N lines of the input are strings of exactly M characters, which are a combination of 0 to mark a ground tile and 1 to mark a water tile.</p>

### 출력

<p>The first line of the output should be a single integer K that is the number of distinct lakes found in the data. The second line should have K space separated integers that are the sizes in square meters of each lake. The integers in the second line (lake sizes) must be in sorted order, from the smallest to the largest.</p>