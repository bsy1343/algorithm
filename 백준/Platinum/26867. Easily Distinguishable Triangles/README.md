# [Platinum III] Easily Distinguishable Triangles - 26867

[문제 링크](https://www.acmicpc.net/problem/26867)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 1024 MB

### 통계

제출: 61, 정답: 41, 맞힌 사람: 39, 정답 비율: 68.421%

### 분류

수학, 조합론

### 문제 설명

<p>Eva loves painting. Today she is working with a square canvas of $n \times n$ unit cells. Each cell is painted white, painted black, or empty --- not painted at all.</p>

<p>Eva is going to draw a black triangle inside each empty cell. She wants each triangle to be right-angled and have an area of $\frac{1}{2}$ square unit cells. Thus, there are four ways to draw a single triangle:</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/26867.%E2%80%85Easily%E2%80%85Distinguishable%E2%80%85Triangles/c89758d3.png" data-original-src="%EB%B0%B1%EC%A4%80/Platinum/26867.%E2%80%85Easily%E2%80%85Distinguishable%E2%80%85Triangles/c89758d3.png" data-original-src="https://upload.acmicpc.net/1060a6ec-8448-47dc-98d4-7a105d159430/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 325px; height: 57px;" /></p>

<p>Each triangle is a piece of art, and Eva wants them to be easily distinguishable from the rest of the painting. To achieve that, no two black triangles may share a common side with each other, and no black triangle may share a common side with a black square. Note that two black squares are allowed to share a common side.</p>

<p>Help Eva to find out how many ways there are to finish her painting. Since the number can be large, calculate it modulo $998\,244\,353$.</p>

### 입력

<p>The first line contains a single integer $n$ --- the side length of the canvas ($1 \le n \le 1000$).</p>

<p>The next $n$ lines describe the canvas from top to bottom. The $i$-th of these lines contains $n$ characters $s_{i, 1}, s_{i, 2}, \ldots, s_{i, n}$. If $s_{i, j} =$ &#39;<code>.</code>&#39;, the cell in the $i$-th row and the $j$-th column of the canvas is painted white. If $s_{i, j} =$ &#39;<code>#</code>&#39;, that cell is painted black. If $s_{i, j} =$ &#39;<code>?</code>&#39;, that cell is empty.</p>

### 출력

<p>Print a single integer denoting the number of ways to finish Eva&#39;s painting, modulo $998\,244\,353$.</p>

### 힌트

<p>In the first example test, there are $4$ ways to finish the painting, as illustrated below:</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/26867.%E2%80%85Easily%E2%80%85Distinguishable%E2%80%85Triangles/797b7d03.png" data-original-src="%EB%B0%B1%EC%A4%80/Platinum/26867.%E2%80%85Easily%E2%80%85Distinguishable%E2%80%85Triangles/797b7d03.png" data-original-src="https://upload.acmicpc.net/2996c785-a737-4784-bbd5-1118afa16778/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 506px; height: 100px;" /></p>

<p>In the second example test, there is a single way to finish the painting:</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/26867.%E2%80%85Easily%E2%80%85Distinguishable%E2%80%85Triangles/92ab0fd2.png" data-original-src="%EB%B0%B1%EC%A4%80/Platinum/26867.%E2%80%85Easily%E2%80%85Distinguishable%E2%80%85Triangles/92ab0fd2.png" data-original-src="https://upload.acmicpc.net/9d43d0aa-dec7-4639-b28e-c9ad5b484830/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 145px; height: 145px;" /></p>

<p>In the third example test, regardless of how Eva draws the triangle in the center cell, it will share two sides with black squares.</p>