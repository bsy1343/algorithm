# [Silver IV] Sales Report - 7847

[문제 링크](https://www.acmicpc.net/problem/7847)

### 성능 요약

시간 제한: 4 초, 메모리 제한: 128 MB

### 통계

제출: 103, 정답: 79, 맞힌 사람: 43, 정답 비율: 75.439%

### 분류

구현, 자료 구조, 집합과 맵, 해시를 사용한 집합과 맵, 트리를 사용한 집합과 맵

### 문제 설명

<p>The Unknown Trading Company have installed a new inventory-tracking system, which stores a complete database of goods and trading points worldwide. Each salespoint and each item was assigned an integer unique identifier (id). For every sale, the system logs id of the item, number of items sold, and id of the salespoint.</p>

<p>Your task is to output a summary report, tabulating total sales by items and salespoints. The report must be a two-dimensional table, with the first row containing item ids in increasing order, first column containing salespoint ids in increasing order, and values inside the table representing total sales of corresponding item from the corresponding salespoint. The value in first column of the first row must be &amp;minus;1. The values in cells without corresponding sales must be 0.</p>

### 입력

<p>Input contains number of records <i>N</i>, followed by <i>N</i> triplets of integers <i>q<sub>i</sub></i> <i>s<sub>i</sub></i> <i>v<sub>i</sub></i>, where <i>q<sub>i</sub></i> -- item id, <i>s<sub>i</sub></i> -- salespoint id, <i>v<sub>i</sub></i> -- number of items sold.</p>

### 출력

<p>Output file must a table as described above, row-by-row.</p>

### 제한

<ul>
	<li>1 &amp;le; <i>N</i> &amp;le; 500000,</li>
	<li>1 &amp;le; <i>q<sub>i</sub></i>, <i>s<sub>i</sub></i>, <i>v<sub>i</sub></i> &amp;le; 10<sup>9</sup>,</li>
	<li>the summary table will have no more than 10<sup>8</sup> cells,</li>
	<li>the summary value in each cell will not exceed than 2<sup>31</sup>&amp;minus;1.</li>
</ul>