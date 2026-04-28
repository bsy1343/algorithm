# [Gold IV] Floors - 7901

[문제 링크](https://www.acmicpc.net/problem/7901)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 17, 정답: 12, 맞힌 사람: 10, 정답 비율: 71.429%

### 분류

그리디 알고리즘, 구현

### 문제 설명

<p>The new highway promised a better and faster connection between A and B and a considerable reduction of congestion. Unfortunately there was an obstacle: the old mansion. This conflict was soon resolved in favor of the highway.</p>

<p>Shortly before the demolition of the mansion was about to start, a lover of old mansions found out that the colorfully tiled floors in the mansion were designed by the famous painter Mondriaan, and therefore had great cultural value. They should be saved. They should be removed from the mansion before the mansion will be demolished.</p>

<p>A floor moving expert was hired to accomplish the job. He decided to cut each floor into smaller pieces, in order to make it more tractable. He possessed a fine floor cutting tool which enabled him to cut a rectangular piece of floor into two smaller rectangular pieces, cutting parallel to one of the sides. Of course the cutting should be between tiles; cutting through a tile was not an option. This way the floor in Figure 1 could easily be cut into 9 tiles. The floor in Figure 2 however can not be cut into smaller pieces. The floor in Figure 3 can be cut into six pieces, but one of the parts will consist of several tiles.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/7901.%E2%80%85Floors/1724449c.png" data-original-src="https://onlinejudgeimages.s3-ap-northeast-1.amazonaws.com/problem/7901/1.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:176px; width:544px" /></p>

<p>While preparing for the job, the floor moving expert was anxious to know how large the remaining pieces could be: would they be heavy, very heavy or extremely heavy? What kind of floor lifting tool should be hired? Because the floors have a fixed thickness, and a fixed density, the weight of a piece of floor only depends upon its area.</p>

<p>Given a rectangular floor covered with rectangular tiles, find the area of the largest piece, after the floor is cut into the smallest possible pieces. The words smallest and largest refer to the area of the pieces. Cutting through a tile is not allowed. A cut through a rectangle is always parallel to one of the sides, and through the full length (or width) of the rectangle.</p>

### 입력

<p>The input contains several floors. The first line of the input gives the number of floors.</p>

<p>Each floor is described in several lines. The first line contains two positive integers: the length and width of the floor, in millimeters. A floor is at most 40 000 mm long or wide. The next line contains a single number: the number t of tiles (1 &le; t &le; 100). The following t lines each contain the description of a tile. A tile is given as four integers:</p>

<p>xl yl xh yh</p>

<p>where (xl, yl) are the coordinates of the lower left corner of the tile, and (xh, yh) are the coordinates of the upper rightmost corner of the tile. A tile always has a positive area. The order of the coordinates of the floor and those of the tile coincide, of course.</p>

<p>You may assume that the tiles are mutually disjoint, and cover the floor, the whole floor, and nothing but the floor.</p>

### 출력

<p>For each test case (each floor) the output contains a number, on a single line: the area of the largest piece of floor (in square millimeters), after cutting the floor into the smallest pieces possible, with the given restrictions.</p>