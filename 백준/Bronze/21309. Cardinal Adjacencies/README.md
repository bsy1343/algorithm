# [Bronze I] Cardinal Adjacencies - 21309

[문제 링크](https://www.acmicpc.net/problem/21309)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 512 MB

### 통계

제출: 146, 정답: 129, 맞힌 사람: 114, 정답 비율: 90.476%

### 분류

구현

### 문제 설명

<p>In landscape ecology, one is interested in the <em>connectedness</em> of regions, particularly near shorelines. A fine grid is overlaid on a map or aerial photo and grid squares with land are marked:</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Bronze/21309.%E2%80%85Cardinal%E2%80%85Adjacencies/1d98c4be.png" data-original-src="%EB%B0%B1%EC%A4%80/Bronze/21309.%E2%80%85Cardinal%E2%80%85Adjacencies/1d98c4be.png" data-original-src="https://upload.acmicpc.net/f356fd3d-0e3a-45c6-8466-a802d02e7802/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 220px; height: 218px;" /></p>

<p>Land squares which share an <strong>edge</strong> are <em>cardinal</em> (North, East, South and West) <em>adjacent</em> (blue lines in the image) and land squares which share an <strong>edge</strong> <em>or</em> a <strong>vertex</strong> (red <em>and</em> blue lines in the image) are <em>intercardinal adjacent</em>. Write a program which takes as input a marked grid and outputs the total <em>cardinal adjacencies</em> in the grid and the total number of <em>intercardinal</em> adjacencies in the grid.</p>

### 입력

<p>The input consists of multiple lines. The first line of input contains two space separated decimal integers <em><strong>nrows</strong></em> and <em><strong>ncolumns</strong></em>, (0 &lt; <em><strong>nrows</strong></em>, <em><strong>ncolumns</strong></em> &le; 1000). This line is followed by <em><strong>nrows</strong></em> additional lines of input each of which contains <em><strong>mcolumns</strong></em> space separated values of 0 or 1. 1 indicates land.</p>

### 출력

<p>There is one line of output containing two space separated decimal integers: the number of <em>cardinal adjacencies</em> followed by the number of <em>intercardinal adjacencies</em>.</p>