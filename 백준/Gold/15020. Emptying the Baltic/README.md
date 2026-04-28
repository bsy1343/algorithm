# [Gold II] Emptying the Baltic - 15020

[문제 링크](https://www.acmicpc.net/problem/15020)

### 성능 요약

시간 제한: 3 초, 메모리 제한: 512 MB

### 통계

제출: 155, 정답: 74, 맞힌 사람: 69, 정답 비율: 50.735%

### 분류

자료 구조, 그래프 이론, 최단 경로, 데이크스트라, 우선순위 큐

### 문제 설명

<p>Gunnar dislikes forces of nature and always comes up with innovative plans to decrease their influence over him. Even though his previous plan of a giant dome over Stockholm to protect from too much sunlight (as well as rain and snow) has not yet been realized, he is now focusing on preempting the possible effects climate change might have on the Baltic Sea, by the elegant solution of simply removing the Baltic from the equation.</p>

<p>First, Gunnar wants to build a floodbank connecting Denmark and Norway to separate the Baltic from the Atlantic Ocean. The floodbank will also help protect Nordic countries from rising sea levels in the ocean. Next, Gunnar installs a device that can drain the Baltic from the seafloor. The device will drain as much water as needed to the Earth&rsquo;s core where it will disappear forever (because that is how physics works, at least as far as Gunnar is concerned). However, depending on the placement of the device, the entire Baltic might not be completely drained &ndash; some pockets of water may remain.</p>

<p>To simplify the problem, Gunnar is approximating the map of the Baltic using a 2-dimensional grid with 1 meter squares. For each square on the grid, he computes the average altitude. Squares with negative altitude are covered by water, squares with non-negative altitude are dry. Altitude is given in meters above the sea level, so the sea level has altitude of exactly 0. He disregards lakes and dry land below the sea level, as these would not change the estimate much anyway.</p>

<p>Water from a square on the grid can flow to any of its 8 neighbours, even if the two squares only share a corner. The map is surrounded by dry land, so water never flows outside of the map. Water respects gravity, so it can only flow closer to the Earth&rsquo;s core &ndash; either via the drainage device or to a neighbouring square with a lower water level.</p>

<p>Gunnar is more of an idea person than a programmer, so he has asked for your help to evaluate how much water would be drained for a given placement of the device.</p>

### 입력

<p>The first line contains two integers h and w, 1 &le; h, w &le; 500, denoting the height and width of the map.</p>

<p>Then follow h lines, each containing w integers. The first line represents the northernmost row of Gunnar&rsquo;s map. Each integer represents the altitude of a square on the map grid. The altitude is given in meters and it is at least &minus;10<sup>6</sup> and at most 10<sup>6</sup>.</p>

<p>The last line contains two integers i and j, 1 &le; i &le; h, 1 &le; j &le; w, indicating that the draining device is placed in the cell corresponding to the j&rsquo;th column of the i&rsquo;th row. You may assume that position (i, j) has negative altitude (i.e., the draining device is not placed on land).</p>

### 출력

<p>Output one line with one integer &ndash; the total volume of sea water drained, in cubic meters.</p>