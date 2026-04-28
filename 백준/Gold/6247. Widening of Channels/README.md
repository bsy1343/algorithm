# [Gold V] Widening of Channels - 6247

[문제 링크](https://www.acmicpc.net/problem/6247)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 65, 정답: 39, 맞힌 사람: 36, 정답 비율: 67.925%

### 분류

그래프 이론, 그래프 탐색

### 문제 설명

<p>In the Waterland country, there are n lakes (numbered from 1 to n) and m channels between them. The width (in meters) of each channel is known. Navigation in the channels can be performed in both directions. It is known that a boat with width of one meter can reach any lake, starting from lake number 1.</p>

<p>Write program channels, which calculates the minimum number of channels that should be widened, so that a boat with width of k meters can make a trip between every two lakes (the boat can move from one lake to another, if its width is less than or equal to the width of the channel, connecting the lakes).</p>

### 입력

<p>On the first line of the standard input are given integers, n and m (1 &lt; n &le; 1000, 1 &lt; m &le; 100000).</p>

<p>On each of the next m lines are given three integers, i, j and w, showing that there is a channel of width w (1 &le; w &le; 200) between lakes, i and j (1 &le; i, j &le; n).</p>

<p>On the last line is given the integer k (1 &le; k &le; 200).</p>

### 출력

<p>On a line of the standard output the program have to write one integer: the minimum number of channels that should be widened.</p>