# [Platinum III] Arable Area - 6632

[문제 링크](https://www.acmicpc.net/problem/6632)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 70, 정답: 16, 맞힌 사람: 9, 정답 비율: 19.149%

### 분류

기하학, 스위핑

### 문제 설명

<p>The prime minister has recently bought a piece of valuable agricultural land, which is situated in a valley forming a regular grid of unit square fields. ACM would like to verify the transaction, especially whether the price corresponds to the market value of the land, which is always determined as the number of unit square fields fully contained in it.</p>

<p>Your task is to write a program that computes the market value. The piece of land forms a closed polygon, whose vertices lie in the corners of unit fields.</p>

<p>For example, the polygon in the picture (it corresponds to the first scenario in Sample Input) contains three square fields.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/6632.%E2%80%85Arable%E2%80%85Area/54467301.png" data-original-src="%EB%B0%B1%EC%A4%80/Platinum/6632.%E2%80%85Arable%E2%80%85Area/54467301.png" data-original-src="https://www.acmicpc.net/upload/images2/aa.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:215px; width:212px" /></p>

### 입력

<p>The input consists of several test scenarios. Each scenario starts with a line containing one integer number N (3 &le; N &le; 100), the number of polygon vertices. Each of the following N lines contains a pair of integers X<sub>i</sub> and Y<sub>i</sub>, giving the coordinates of one vertex. The vertices are listed in the order they appear along the boundary of the polygon. You may assume that no coordinate will be less then &minus;100 or more than 100 and that the boundary does not touch or cross itself.</p>

<p>The last scenario is followed by a line containing single zero.</p>

### 출력

<p>For each scenario, output one line with an integer number &mdash; the number of unit squares that are completely inside the polygon.</p>