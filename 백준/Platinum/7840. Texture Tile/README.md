# [Platinum IV] Texture Tile - 7840

[문제 링크](https://www.acmicpc.net/problem/7840)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 256 MB

### 통계

제출: 30, 정답: 11, 맞힌 사람: 10, 정답 비율: 43.478%

### 분류

문자열, 해싱, 슬라이딩 윈도우, 라빈–카프

### 문제 설명

<p>Square raster image is represented by an array of $N \times N$ pixels. A <i>texture tile</i> is a square image in which the first row is equal to the last one, and the first column is equal to the last one. This property is valuable when covering the surface of graphics object with repeating copies of texture, because it allows &quot;seamless&quot; transitions between tiles.</p>

<p>Your program must, given an image, find its largest subimage which is a texture tile.</p>

### 입력

<p>Input file contains integer $N$ followed by $N^2$ numbers $c_{i, j}$ -- pixel values.&nbsp;</p>

### 출력

<p>Output file must contain numbers $p$ $q$ $m$ -- coordinates of top left corner and size of the largest texture tile. If several solutions exist, output any of them.</p>

### 제한

<ul>
	<li>$1 \le N \le 370$, $0 \le c_{i, j} \le 255$</li>
</ul>