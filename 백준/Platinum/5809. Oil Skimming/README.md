# [Platinum IV] Oil Skimming - 5809

[문제 링크](https://www.acmicpc.net/problem/5809)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 108, 정답: 57, 맞힌 사람: 48, 정답 비율: 52.174%

### 분류

그래프 이론, 이분 매칭

### 문제 설명

<p>Thanks to a certain &quot;green&quot; resources company, there is a new profitable industry of oil skimming. There are large slicks of crude oil floating in the Gulf of Mexico just waiting to be scooped up by enterprising oil barons. One such oil baron has a special plane that can skim the surface of the water collecting oil on the water&#39;s surface. However, each scoop covers a 10m by 20m rectangle (going either east/west or north/south). It also requires that the rectangle be completely covered in oil, otherwise the product is contaminated by pure ocean water and thus unprofitable!</p>

<p>Given a map of an oil slick, the oil baron would like you to compute the maximum number of scoops that may be extracted. The map is an NxN grid where each cell represents a 10m square of water, and each cell is marked as either being covered in oil or pure water.</p>

### 입력

<p>The input starts with an integer K (1 &le; K &le; 100) indicating the number of cases. Each case starts with an integer N (1 &le; N &le; 600) indicating the size of the square grid. Each of the following N lines contains N characters that represent the cells of a row in the grid. A character of &#39;#&#39; represents an oily cell, and a character of &#39;.&#39; represents a pure water cell.</p>

### 출력

<p>For each case, one line should be produced, formatted exactly as follows: &quot;Case X: M&quot; where X is the case number (starting from 1) and M is the maximum number of scoops of oil that may be extracted.</p>