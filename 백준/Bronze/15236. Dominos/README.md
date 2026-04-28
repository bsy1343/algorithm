# [Bronze III] Dominos - 15236

[문제 링크](https://www.acmicpc.net/problem/15236)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 1061, 정답: 939, 맞힌 사람: 865, 정답 비율: 90.198%

### 분류

수학

### 문제 설명

<p>Dominoes are gaming pieces used in numerous tile games. Each domino piece contains two marks. Each mark consists of a number of spots (possibly zero). The number of spots depends on the set size. Each mark in a size N domino set can contain between 0 and N spots, inclusive. Two tiles are considered identical if their marks have the same number of spots, regardless of reading order. For example tile with 2 and 8 spot marks is identical to the tile having 8 and 2 spot marks. A proper domino set contains no duplicate tiles. A complete set of size N contains all possible tiles with N or less spots and no duplicate&nbsp;tiles. For example, the complete set of size 2 contains 6 tiles:</p>

<p style="text-align:center"><img alt="" src="%EB%B0%B1%EC%A4%80/Bronze/15236.%E2%80%85Dominos/da42ee89.png" data-original-src="%EB%B0%B1%EC%A4%80/Bronze/15236.%E2%80%85Dominos/da42ee89.png" data-original-src="https://onlinejudgeimages.s3-ap-northeast-1.amazonaws.com/problem/15236/1.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:85px; width:250px" /></p>

<p>Write a program that will determine the total number of spots on all tiles of a complete size N set.</p>

### 입력

<p>The first and only line of input contains a single integer, N (1 &le; N &le; 1000), the size of the complete set.</p>

### 출력

<p>The first and only line of output should contain a single integer, total number of&nbsp;spots in a complete size N set.</p>