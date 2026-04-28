# [Gold IV] Gold Leaf - 10572

[문제 링크](https://www.acmicpc.net/problem/10572)

### 성능 요약

시간 제한: 5 초, 메모리 제한: 256 MB

### 통계

제출: 18, 정답: 9, 맞힌 사람: 9, 정답 비율: 56.250%

### 분류

구현, 브루트포스 알고리즘, 시뮬레이션

### 문제 설명

<p>Gold leaf is a very thin layer of gold with a paper backing. If the paper gets folded and then unfolded, the gold leaf will stick to itself more readily than it will stick to the paper, so there will be patches of gold and patches of exposed paper. Note that the gold leaf will always stick to itself, rather than the paper. In the following example, the paper was folded along the dashed line. Notice how the gold leaf always sticks to one side or the other, never both.</p>

<p style="text-align:center"><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/10572.%E2%80%85Gold%E2%80%85Leaf/04cf9e19.png" data-original-src="https://onlinejudgeimages.s3-ap-northeast-1.amazonaws.com/problem/11234/1.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:303px; width:299px" /></p>

<p>Consider a crude digital image of a sheet of gold leaf. If the area covered by a pixel is mostly gold, that will be represented by a &lsquo;#&rsquo;. If it&rsquo;s mostly exposed paper, it will be represented by a &lsquo;.&rsquo;. Determine where the sheet was folded. The sheet was folded exactly once, along a horizontal, vertical, or 45 degree diagonal line. If the fold is horizontal or vertical, it is always between rows/columns. If the fold is diagonal, then the fold goes through a diagonal line of cells, and the cells along the fold are always &lsquo;#&rsquo;.</p>

### 입력

<p>Input will start with a single line containing the number of cases, between 1 and 100, inclusive. Each test case will begin with a line with two integers, N and M 2 &le; N, M &le; 25, where N is the number of rows, and M is the number of columns of the photograph. Each of the next N lines will contain exactly M characters, all of which will be either &lsquo;#&rsquo; or &lsquo;.&rsquo;. This represents a crudely represented digital image of the sheet of gold leaf. There is guaranteed to be at least one &lsquo;.&rsquo;, and there is guaranteed to be a solution.</p>

### 출력

<p>For each test case, output four integers, indicating the places where the fold hits the edges of the paper. Output them in the order r1 c1 r2 c2 where (r1,c1) and (r2,c2) are row/column coordinates (r=row, c=column). The top left character is (1,1) and the bottom right is (n,m). If the fold is horizontal or diagonal, list the left side coordinates before the right. If the fold is vertical, list the top coordinates before the bottom. If the fold is horizontal, use the coordinates above the fold. If the fold is vertical, use the coordinates to the left of the fold. If the fold is diagonal, use the coordinates of the cells that the fold goes through. If more than one fold is possible, choose the one with the smallest first coordinate, then the smallest second coordinate, then third, then fourth.</p>