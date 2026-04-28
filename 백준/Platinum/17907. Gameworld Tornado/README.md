# [Platinum I] Gameworld Tornado - 17907

[문제 링크](https://www.acmicpc.net/problem/17907)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 22, 정답: 14, 맞힌 사람: 11, 정답 비율: 91.667%

### 분류

자료 구조, 세그먼트 트리, 스위핑, 값 / 좌표 압축

### 문제 설명

<p>The Brilliant Game Overseers (BGO) is building a brand new game. The investors have noted that large gameworlds is a selling point these days, so in order to appease the them, a large gameworld with lots of interesting activities has been planned. In addition to a large map showing the entire world in all its glory, a number of smaller maps in various dimensions have been designed showing the layout of smaller features in the Game. Because features should be spread out a little, these maps can overlap.</p>

<p>Woe upon woe, the day after all maps had finally been finished, a tornado blew through the offices of BGO, and now the master map has been lost, as well as a number of the smaller maps. Desperate to salvage as much as possible of the Game, you have been tasked with trying to piece together as much as possible of the original map, using the feature maps that were left behind by the tornado. Luckily all the maps have their coordinates marked and are axis aligned, so you figure a good start will be to find out how large is the area (in pixels) covered by the remaining maps.</p>

### 입력

<p>The input starts with an integer n (1 &le; n &le; 100 000) denoting the number of axis aligned rectangular maps you have left. Then follows n lines representing the maps, each with four integers x<sub>1</sub>, y<sub>1</sub>, x<sub>2</sub>, y<sub>2</sub> where 0 &le; x<sub>1</sub>, y<sub>1</sub>, x<sub>2</sub>, y<sub>2</sub> &le; 10<sup>9</sup>. x<sub>1</sub> and y<sub>1</sub> are the coordinates of the lower left corner of the rectangle, and x<sub>2</sub> and y<sub>2</sub> are the upper right corner of the rectangle, i.e. x<sub>1</sub> &lt; x<sub>2</sub> and y1 &lt; y<sub>2</sub>.</p>

### 출력

<p>The total area of the game world covered by the remaining maps.</p>