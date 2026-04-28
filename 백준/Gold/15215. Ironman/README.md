# [Gold IV] Ironman - 15215

[문제 링크](https://www.acmicpc.net/problem/15215)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 24, 정답: 8, 맞힌 사람: 8, 정답 비율: 38.095%

### 분류

이분 탐색, 물리학

### 문제 설명

<p>An ironman triathlon is a race where participants swim for 3.86 km, ride a bicycle for 180.25 km, and finally run a marathon, and it is considered one of the toughest sport events. Viveka has been training for an even more challenging competition: the n-athlon. In an n-athlon race, participants have to go from the starting point to the finishing point through several types of terrain: water, sand, ice, asphalt, etc. To make the race more interesting, participants are free to pick the route that they think suits best their abilities. Last year Viveka achieved an epic victory by skating the last 40 km in 1 hour over ice, while her arch-rival Veronica was stuck in a tar pit 1 m from the finishing point.</p>

<p>The terrain distribution for this year has been published and now it is your task as the optimization expert in Viveka&rsquo;s team to help her figure out the best route for the race. The competition takes place in a flat area, which we model as the 2D plane, and each type of terrain is shaped as a horizontal strip. Participants are not allowed to leave the race area. You know the position of each strip and Viveka&rsquo;s speed in that type of terrain.</p>

### 입력

<p>The first line contains two pairs of decimal numbers x<sub>s</sub>, y<sub>s</sub>, x<sub>f</sub>, y<sub>f</sub>, the x and y coordinates of the starting and finishing point, respectively, in meters. The second line contains one integer n (1 &le; n &le; 10 000), the number of layers. The third line contains n &minus; 1 decimal numbers, the y coordinate of each change between layers. Layers are given in order, this is, y<sub>s</sub> &lt; y<sub>1</sub> &lt; y<sub>2</sub> &lt; &middot; &middot; &middot; &lt; y<sub>n&minus;1</sub> &lt; y<sub>f</sub> , so the shape of layer i is (&minus;10 000, 10 000) &times; (y<sub>i&minus;1</sub>, y<sub>i</sub>). The first and last layers extend only until the y coordinate of the starting and finishing point, this is they have shape (&minus;10 000, 10 000) &times; (y<sub>s</sub>, y<sub>1</sub>) and (&minus;10 000, 10 000) &times; (y<sub>n&minus;1</sub>, y<sub>f</sub>) respectively. The fourth line contains n decimal numbers, Viveka&rsquo;s speed in each layer, in meters per second. All decimal numbers have absolute value at most 10<sup>4</sup> and at most 4 decimals.</p>

### 출력

<p>Output the minimum time required for Viveka to go from the starting to the finishing point. Your answer should be within absolute or relative error at most 10<sup>&minus;6</sup>.</p>