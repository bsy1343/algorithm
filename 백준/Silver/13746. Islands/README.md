# [Silver I] Islands - 13746

[문제 링크](https://www.acmicpc.net/problem/13746)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 209, 정답: 155, 맞힌 사람: 143, 정답 비율: 74.869%

### 분류

그래프 이론, 그래프 탐색, 너비 우선 탐색, 플러드 필

### 문제 설명

<p>You are mapping a faraway planet using a satellite. The planet&#39;s surface can be modeled as a grid. The satellite has captured an image of the surface. Each grid square is either land (denoted as &#39;L&#39;), water (denoted as &#39;W&#39;), or covered by clouds (denoted as &#39;C&#39;). Clouds mean that the surface could either be land or water; you cannot tell.</p>

<p>An island is a region of land where every grid cell in the island is connected to every other by some path, and every leg of the path only goes up, down, left or right.</p>

<p>Given an image, determine the minimum number of islands that is consistent with the given image.</p>

### 입력

<p>Each input will consist of a single test case. Note that your program may be run multiple times on different inputs. The first line of input contains two integers, r and c (1 &le; r,c &le; 50), which are the number of rows and the number of columns of the image. The next r lines will each contain exactly c characters, consisting only of &lsquo;L&rsquo; (representing Land), &lsquo;W&rsquo; (representing Water), and &lsquo;C&rsquo; (representing Clouds).</p>

### 출력

<p>Output a single integer, which is the minimum number of islands possible.</p>