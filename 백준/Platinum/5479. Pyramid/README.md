# [Platinum III] Pyramid - 5479

[문제 링크](https://www.acmicpc.net/problem/5479)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 96, 정답: 38, 맞힌 사람: 32, 정답 비율: 46.377%

### 분류

자료 구조, 세그먼트 트리, 누적 합, 덱, 슬라이딩 윈도우, 덱을 이용한 구간 최댓값 트릭, 다차원 세그먼트 트리

### 문제 설명

<p>After winning a great battle, King Jaguar wants to build a pyramid that will serve both as a monument to remember his victory and as a tomb for the brave soldiers that died in battle. The pyramid will be built in the battlefield and will have a rectangular base of a columns by b rows. Inside it, at ground level, is a smaller, rectangular chamber of c columns by d rows that will contain the corpses and weapons of the fallen soldiers.</p>

<p>The King&rsquo;s architects have surveyed the battlefield as an m columns by n rows grid and have measured the elevation of each square as an integer.</p>

<p>Both the pyramid and the chamber are to be built covering complete squares of the grid and with their sides parallel to those of the battlefield. The elevation of the squares of the internal chamber must remain unchanged but the remaining terrain of the base of pyramid will be leveled by moving sand from higher squares to lower ones. The final elevation of the base will be the average elevation of all the squares of the base (excluding those of the chamber). The architects are free to locate the internal chamber anywhere within the pyramid as long as they leave a wall at least one square thick surrounding the chamber.</p>

<p><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/5479.%E2%80%85Pyramid/763388b4.png" data-original-src="https://onlinejudgeimages.s3-ap-northeast-1.amazonaws.com/problem/5479/1.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="float:right; height:202px; width:302px" />Help the architects pick the best place to locate the pyramid and the internal chamber so that the final elevation of the base is the maximum possible for the sizes given.</p>

<p>The figure shows an example of the battlefield; the number in each square represents the elevation of the terrain in that particular position of the field. The gray squares represent the base of the pyramid while the surrounded white squares represent the chamber. This figure illustrates an optimal placement.&nbsp;</p>

<p>Write a program that, given the dimensions of the field, the pyramid, and the chamber along with the elevation of every square in the field, locates both the pyramid in the field and the chamber inside the pyramid so that the elevation of the base is the maximum possible.</p>

### 입력

<p>LINE 1: Contains six space-separated integers, respectively: m, n, a, b, c, and d.</p>

<p>NEXT n LINES: Each line contains m space-separated integers that represent the elevations of one row of the grid. The first of these lines represents the top row (row 1) of the grid, and the last line represents the bottom row (row n). The m integers in each line represent the elevations of squares of that row starting from column 1.&nbsp;</p>

### 출력

<p>LINE 1: Must contain 2 space-separated integers that represent the upper-left corner of the base of the pyramid, the first number being the column and the second the row.</p>

<p>LINE 2: Must contain 2 space-separated integers that represent the upper-left corner of the chamber inside the pyramid, the first number being the column and the second the row.&nbsp;</p>

<p>NOTE: If there are multiple optimal placements, then any one of them you output will be considered correct.</p>

### 제한

<ul>
	<li>3 &le; m &le; 1000</li>
	<li>3 &le; n &le; 1000</li>
	<li>3 &le; a &le; m</li>
	<li>3 &le; b &le; n</li>
	<li>1 &le; c &le; a &ndash; 2</li>
	<li>1 &le; d &le; b &ndash; 2</li>
	<li>All elevations are integers in the range from 1 to 100.&nbsp;</li>
</ul>