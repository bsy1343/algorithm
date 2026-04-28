# [Gold III] Largest Square - 4146

[문제 링크](https://www.acmicpc.net/problem/4146)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 128 MB

### 통계

제출: 32, 정답: 21, 맞힌 사람: 21, 정답 비율: 65.625%

### 분류

누적 합, 매개 변수 탐색

### 문제 설명

<p>There is an <em>N &times; N</em> mosaic of square solar cells (<em>1 &le; N &le; 2,000</em>). Each solar cell is either good or bad. There are <em>W</em> (<em>1 &le; W &le; 50,000</em>) bad cells. You need to find the largest square within the mosaic containing at most <em>L</em> (<em>0 &le; L &le; W</em>) bad cells.</p>

### 입력

<p>The input will begin with a number <em>Z &le; 20</em>, the number of test cases, on a line by itself. <em>Z</em> test cases then follow. The first line of the test case contains three space-separated integers: <em>N</em>, <em>W</em>, and <em>L</em>. <em>W</em> lines follow, each containing two space-separated integers representing the coordinates of a location of the bad solar cells.</p>

### 출력

<p>For each input instance, the output will be a single integer representing the area of the largest square that contains no more than <em>L</em> bad solar cells.</p>

### 힌트

<p>The mosaic is 4&times; 4, and contains the following arrangement of good and bad cells (&#39;G&#39; represents good, and &#39;B&#39; represents bad):</p>

<pre>
BGGG
GBBG
GGGG
GGGG
</pre>

<p>Several 2&times; 2 squares at the bottom contain no bad solar cells, but all 3 &times; 3 squares contain at least two bad solar cells.</p>