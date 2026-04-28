# [Silver III] Gecko - 9844

[문제 링크](https://www.acmicpc.net/problem/9844)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 136, 정답: 110, 맞힌 사람: 93, 정답 비율: 83.784%

### 분류

다이나믹 프로그래밍

### 문제 설명

<p>During the rainy season, one of the walls in the house is infested with mosquitoes. The wall is covered by h &times; w square tiles, where there are h rows of tiles from top to bottom, and w columns of tiles from left to right. Each tile has 1 to 1000 mosquitoes resting on it.</p>

<p>A gecko wants to eat as many mosquitoes as possible, subject to the following restrictions. It starts by choosing any tile in the top row, and eats the mosquitoes in that tile. Then, it moves to a tile in the next lower row, eats the mosquitoes on the tile, and so on until it reaches the floor. When it moves from one tile to a tile in the next lower row, it can only move vertically down or diagonally to the left or right (see Figure 1).</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Silver/9844.%E2%80%85Gecko/6ce5288e.png" data-original-src="%EB%B0%B1%EC%A4%80/Silver/9844.%E2%80%85Gecko/6ce5288e.png" data-original-src="https://upload.acmicpc.net/df862d85-3e0d-45ba-bd65-6cd628289861/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 122px; height: 84px;" /></p>

<p style="text-align: center;"><strong>Figure 1</strong> When moving from one tile to a tile in the next lower row, the gecko can only move vertically down or diagonally to the left or right.</p>

<p>Given the values of h and w, and the number of mosquitoes resting on each tile, write a program to compute the maximum possible number of mosquitoes the gecko can eat in one single trip from the top to the bottom of the wall.</p>

### 입력

<p>The first line has two integers. The first integer h &isin; {1, 2, . . . , 500} is the number of rows of tiles on the wall. The second integer w &isin; {1, 2, . . . , 500} is the number of columns of tiles on the wall.</p>

<p>Next, there are h lines of inputs. The i<sup>th</sup> line specifies the number of mosquitoes in each tile of the top i<sup>th</sup> row. Each line has w integers, where each integer m &isin; {1, 2, . . . , 1000} is the number mosquitoes on that tile. The integers are separated by a space character.</p>

### 출력

<p>The output contains a single integer, which is the maximum possible number of mosquitoes the gecko can eat in one single trip from the top to the bottom of the wall.</p>