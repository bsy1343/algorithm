# [Silver I] Patio - 26050

[문제 링크](https://www.acmicpc.net/problem/26050)

### 성능 요약

시간 제한: 3 초, 메모리 제한: 1024 MB

### 통계

제출: 44, 정답: 24, 맞힌 사람: 23, 정답 비율: 56.098%

### 분류

누적 합, 슬라이딩 윈도우

### 문제 설명

<p>Cimrman wants to make a square patio floor using tiles of two colours, red and blue. The patio floor should look like this (with the colors slightly faded in time):</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Silver/26050.%E2%80%85Patio/586979f2.png" data-original-src="https://upload.acmicpc.net/f85e3eb7-0a6c-46c8-a5c9-0e47e6235010/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 142px; height: 142px;" /></p>

<p style="text-align: center;">Figure 1: One of Cimrman&rsquo;s perfect patios</p>

<p>More specifically, the patio must have a square shape. Tiles of one of the colours are used as the border of the square. The border must be exactly one tile thick. The tiles of the other colour are used to fill the rest of the square. Also, the side of the square must consist of at least 3 tiles.</p>

<p>Cimrman has a long file of square red tiles and blue tiles, the size of all tiles is the same. From this file, Cimrman is going to take some tiles to use them on the floor. Manipulating the file is clumsy, so Cimrman wants the tiles to be taken easily from the file, meaning the taken tiles have to form one contiguous subsequence in the file.</p>

<p>Before Cimrman starts the construction, he needs to know how many suitable subsequences of tiles are there in the file.</p>

### 입력

<p>The input consists of two lines. The first line contains integer N (1 &le; N &le; 2 &middot; 10<sup>5</sup>), the length of the file of tiles. The second line contains string of N characters, representing the file of tiles. Only two characters appear in the string, &ldquo;X&rdquo; represents a blue tile and &ldquo;O&rdquo; represents a red tile.</p>

### 출력

<p>Output the number of contiguous subsequences in the file from which Cimrman can construct a nice square patio floor.</p>