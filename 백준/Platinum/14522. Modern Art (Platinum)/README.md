# [Platinum III] Modern Art (Platinum) - 14522

[문제 링크](https://www.acmicpc.net/problem/14522)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 366, 정답: 69, 맞힌 사람: 63, 정답 비율: 26.360%

### 분류

누적 합, 많은 조건 분기

### 문제 설명

<p>Art critics worldwide have only recently begun to recognize the creative genius behind the great bovine painter, Picowso.</p>

<p>Picowso paints in a very particular way. She starts with an \(N \times N\) blank canvas, represented by an \(N \times N\) grid of zeros, where a zero indicates an empty cell of the canvas. She then draws \(N^2\) rectangles on the canvas, one in each of \(N^2\) colors (conveniently numbered \(1 \ldots N^2\)). For example, she might start by painting a rectangle in color 2, giving this intermediate canvas:</p>

<pre>
2 2 2 0 
2 2 2 0 
2 2 2 0 
0 0 0 0
</pre>

<p>She might then paint a rectangle in color 7:</p>

<pre>
2 2 2 0 
2 7 7 7 
2 7 7 7 
0 0 0 0
</pre>

<p>And then she might paint a small rectangle in color 3:</p>

<pre>
2 2 3 0 
2 7 3 7 
2 7 7 7 
0 0 0 0
</pre>

<p>Each rectangle has sides parallel to the edges of the canvas, and a rectangle could be as large as the entire canvas or as small as a single cell. Each color from \(1 \ldots N^2\) is used exactly once, although later colors might completely cover up some of the earlier colors.</p>

<p>Given the final state of the canvas, please count how many of the \(N^2\) colors could have possibly been the first to be painted.</p>

### 입력

<p>The first line of input contains \(N\), the size of the canvas (\(1 \leq N \leq 1000\)). The next \(N\) lines describe the final picture of the canvas, each containing \(N\) integers that are in the range \(0 \ldots N^2\). The input is guaranteed to have been drawn as described above, by painting successive rectangles in different colors.</p>

### 출력

<p>Please output a count of the number of colors that could have been drawn first.</p>

### 힌트

<p>In this example, color 2 could have been the first to be painted. Color 3 clearly had to have been painted after color 7, and color 7 clearly had to have been painted after color 2. Since we don&#39;t see the other colors, we deduce that they also could have been painted first.</p>