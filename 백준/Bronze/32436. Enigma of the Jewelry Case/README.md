# [Bronze II] Enigma of the Jewelry Case - 32436

[문제 링크](https://www.acmicpc.net/problem/32436)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 165, 정답: 132, 맞힌 사람: 119, 정답 비율: 79.333%

### 분류

구현, 시뮬레이션, 애드 혹

### 문제 설명

<p>The princess of Nlogonia keeps her pearl collection in a square jewelry case made up of $N$ columns, each column containing $N$ small boxes. She places a different number of pearls in each box, and arranges the box so that in each column, from top to bottom, the boxes contain an increasing number of pearls and in each row, from left to right, the boxes also contain an increasing number of pearls.</p>

<p>The princess suspects that her little sister, who is very mischievous, is messing with her things in her games. In particular, the princess suspects that her jewelry case has been rotated $90$ degrees clockwise, possibly multiple times.</p>

<p>Figure (a) below shows an example of the original arrangement of a $4 \times 4$ case. Figure (b) shows the case rotated clockwise, $90$ degrees, once.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Bronze/32436.%E2%80%85Enigma%E2%80%85of%E2%80%85the%E2%80%85Jewelry%E2%80%85Case/cfb0a96b.jpg" data-original-src="https://boja.mercury.kr/assets/problem/32436-1.jpg" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 347px; height: 150px;"></p>

<p>Given the number of pearls in each box, write a program to determine the smallest number of $90$-degree counterclockwise rotations that are necessary to return the jewelry case to its original state.</p>

### 입력

<p>The first line of the input contains an integer $N$, the number of rows and columns in the case ($2 ≤ N ≤ 50$). Each of the following $N$ lines contains $N$ integers $K_{i,j}$, the number of pearls in the box in row $i$ and column $j$ ($0 ≤ K_{i,j} ≤ 10^5$, for $1 ≤ i ≤ N$ and $1 ≤ j ≤ N$). In the input, the rows are given from top to bottom, and the columns are given from left to right.</p>

<p>Your program should output a single line containing only one integer $R$ (which can be $0$, $1$, $2$, or $3$), the smallest number of times the jewelry case must be rotated counterclockwise to return to its original state.</p>

### 출력

