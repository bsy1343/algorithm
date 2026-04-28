# [Platinum II] Grid - 7776

[문제 링크](https://www.acmicpc.net/problem/7776)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 19, 정답: 3, 맞힌 사람: 3, 정답 비율: 16.667%

### 분류

수학, 구현, 정렬, 기하학, 정수론, 해 구성하기, 시뮬레이션, 유클리드 호제법, 무작위화

### 문제 설명

<p>Gerald has spent several hours drawing a rectangular grid on a sheet of paper. At the beginning, he drew some vertical lines with equal distance (d<sub>x</sub>) between them. Than he drew some horizontal lines, also with equal distance (d<sub>y</sub>) between them. Both d<sub>x</sub> and d<sub>y</sub> are greater than zero.</p>

<p>While Gerald was relaxing with a cup of tea, his brother Mike came and scratched a straight line on the sheet. Gerald felt outraged with Mike&rsquo;s behavior and ordered him to remove everything odd from the paper.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/7776.%E2%80%85Grid/a63ff472.png" data-original-src="https://www.acmicpc.net/upload/images2/grid.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:190px; width:302px" /></p>

<p>Mike didn&rsquo;t take his brother&rsquo;s words seriously and removed almost all the information with an eraser. However, he did not notice the points of intersection of his line with the grid. All those points were bold enough to be readable even after erasing.</p>

<p>Help Gerald to find the parameters of the original grid.</p>

### 입력

<p>The first line of input contains single integer n &mdash; the number of points of intersection (3 &le; n &le; 100 000).</p>

<p>Each of the following n lines contains a pair of integer number x<sub>i</sub>, y<sub>i</sub> &mdash; the coordinates of the intersection point. Coordinates do not exceed 10<sup>9</sup> by the absolute value.</p>

<p>All the intersection points are distinct. There are no common points of the grid and the Mike&rsquo;s line except for the specified ones.</p>

### 출력

<p>Output six integer numbers x<sub>1</sub>, x<sub>2</sub>, d<sub>x</sub>, y<sub>1</sub>, y<sub>2</sub> and d<sub>y</sub>. First three numbers describe the set of vertical lines: the minimum x-coordinate of the vertical line, the maximum x-coordinate of the vertical line, and the distance between adjacent vertical lines (&minus;10<sup>9</sup> &le; x<sub>1</sub> &le; x<sub>2</sub> &le; 10<sup>9</sup>; 0 &lt; d<sub>x</sub> &le; 2 &middot; 10<sup>9</sup>). Following three numbers should describe the set of horizontal lines in the same way with x replaced by y (&minus;10<sup>9</sup> &le; y<sub>1</sub> &le; y<sub>2</sub> &le; 10<sup>9</sup>; 0 &lt; d<sub>y</sub> &le; 2 &middot; 10<sup>9</sup>).</p>

<p>It is guaranteed that at least one solution exists.</p>