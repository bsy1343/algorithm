# [Gold I] Zombie Apocalypse - 14054

[문제 링크](https://www.acmicpc.net/problem/14054)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 17, 정답: 4, 맞힌 사람: 4, 정답 비율: 100.000%

### 분류

스위핑

### 문제 설명

<p>Your country has a problem with zombies. That is, it has zombies, which are a problem. Thankfully, you are gainfully employed at the Forsenic Institute for Zoology and Zombie Emerging Studies (FIZZES), and your job is simply to give a measure of how bad the problem is.</p>

<p>You have mapped out your country on an an N-by-M array of cells marked with non-negative integers.</p>

<p>You have the exact locations of all the zombies, and know that no two zombies are in the same location. The cells containing a zombie are marked with 0. Next, all the unmarked cells touching a cell (where touching a cell means touching on any side or corner of a cell; so each cell touches up to 8 other cells) marked with 0 are marked with 1. Then, all the unmarked cells touching a cell marked with 1 are marked with 2. This process continues until all the cells are marked. These numbers indicate the level of concern your office has about the spread of zombies.</p>

<p>A small example is shown below.</p>

<pre style="text-align: center;">
2 2 1 1 1 2
2 1 1 0 1 2
2 1 0 1 1 2
2 1 1 1 2 2
2 2 2 2 2 3</pre>

<p>Your boss has given you an integer Q, and you must determine the number of cells which are marked with the integer Q.</p>

### 입력

<p>The first line of input will contain two space-separated integers N and M (1 &le; N &le; 10<sup>9</sup>; 1 &le; M &le; 10<sup>9</sup>) indicating the size of the grid. The next line contains the number K (1 &le; K &le; 2000), indicating the number of cells that contain zombies. The next K lines each contain two space-separated integers r<sub>i</sub> c<sub>i</sub> indicating the row and column of the ith zombie (1 &le; r<sub>i</sub> &le; N; 1 &le; c<sub>i</sub> &le; M). No two zombies are in the same cell: thus if i &ne;&nbsp;j then (r<sub>i</sub>, c<sub>i</sub>) &ne;&nbsp;(r<sub>j</sub>, c<sub>j</sub>). The last line will contain the integer Q (0 &le; Q &le; N + M).</p>

### 출력

<p>Output the number of cells in the grid that are marked with the integer Q.</p>