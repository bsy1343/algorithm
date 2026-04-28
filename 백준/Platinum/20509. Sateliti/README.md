# [Platinum I] Sateliti - 20509

[문제 링크](https://www.acmicpc.net/problem/20509)

### 성능 요약

시간 제한: 3 초, 메모리 제한: 512 MB

### 통계

제출: 63, 정답: 29, 맞힌 사람: 22, 정답 비율: 44.000%

### 분류

해싱, 문자열, 접미사 배열과 LCP 배열

### 문제 설명

<p>For crater exploration purposes, the Arecibo telescope records images of Saturn&rsquo;s satellites. The scientific team must distinguish between satellite images and group the images by satellite, but it&rsquo;s not that simple because satellites could be shot from different angles.</p>

<p>Captured images can be displayed as n &times; m matrices, filled with &#39;<code>*</code>&#39; (crater) and &#39;<code>.</code>&#39; (plain surface). We say that two images correspond to the same satellite if one can get the other by <strong>circular shifts of rows and columns</strong>.</p>

<p>To make the verification process easier, scientists want to find the <strong>lexicographically smallest</strong> image corresponding to the satellite from the given image. When comparing images, we compare strings obtained by concatenating all rows of the image, where characters are compared by ASCII value.</p>

### 입력

<p>The first line contains integers n and m (1 &le; n, m &le; 1000), the dimensions of the image.</p>

<p>Each of the following n lines contains m characters &#39;<code>*</code>&#39; and &#39;<code>.</code>&#39;. This represents the captured image.</p>

### 출력

<p>Output n lines with m characters each, the wanted lexicographically smallest image.</p>

### 힌트

<p>Clarification of the first example:</p>

<p>All images that can be obtained by circular shifts are:</p>

<pre>
.** .*. *.. **. *.. ..* *.* ..* .*.
*.. .** .*. ..* **. *.. .*. *.* ..*
.*. *.. .** *.. ..* **. ..* .*. *.*</pre>