# [Silver IV] Anniversary Cake - 13473

[문제 링크](https://www.acmicpc.net/problem/13473)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 256 MB

### 통계

제출: 197, 정답: 109, 맞힌 사람: 94, 정답 비율: 62.667%

### 분류

기하학, 해 구성하기

### 문제 설명

<p>Two students, Adam and Anton, are celebrating two-year anniversary of not passing their Math Logic&nbsp;exam. After very careful search in a local supermarket, they bought a rectangular cake with integer&nbsp;dimensions and two candles.</p>

<p>Later in the campus Adam put the candles into different integer points of the cake and gave a knife to&nbsp;Anton to cut the cake. The cut should start and end at integer points at the edges of the cake, and it&nbsp;should not touch the candles. Also each piece should have exactly one candle at it. Please, help Anton&nbsp;to find the starting and ending points of the cut.</p>

<p><img alt="" src="https://onlinejudgeimages.s3.amazonaws.com/problem/13473/%EC%8A%A4%ED%81%AC%EB%A6%B0%EC%83%B7%202016-11-01%20%EC%98%A4%ED%9B%84%202.30.49.png" style="height:147px; width:330px" /></p>

<p>A 7 &times; 3 cake and two candles at (2, 2) and (3, 2).<br />
Anton can cut this cake through (0, 0) and (4, 3).</p>

### 입력

<p>The single line of the input contains six integers: w, h &mdash; cake dimensions; a<sub>x</sub>, a<sub>y</sub> &mdash; x and y&nbsp;coordinates of the first candle; b<sub>x</sub>, b<sub>y</sub> &mdash; the coordinates of the second candle (3 &le; w, h &le; 10<sup>9</sup>;&nbsp;0 &lt; a<sub>x</sub>, b<sub>x</sub> &lt; w; 0 &lt; a<sub>y</sub>, b<sub>y</sub> &lt; h; a<sub>x</sub>&nbsp;&ne;&nbsp;b<sub>x</sub> or a<sub>y&nbsp;</sub>&ne; b<sub>y</sub>).</p>

### 출력

<p>Output four integers s<sub>x</sub>, s<sub>y</sub>, e<sub>x</sub>, and e<sub>y</sub> &mdash; the starting and ending coordinates of the cut. Both starting&nbsp;and ending point of the cut should belong to the sides of the cake.</p>

<p>If there are several solutions, output any of them.</p>