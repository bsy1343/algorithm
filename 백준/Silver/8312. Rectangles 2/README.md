# [Silver V] Rectangles 2 - 8312

[문제 링크](https://www.acmicpc.net/problem/8312)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 153, 정답: 97, 맞힌 사람: 83, 정답 비율: 65.873%

### 분류

수학, 브루트포스 알고리즘, 조합론

### 문제 설명

<p style="text-align:center"><img alt="" src="%EB%B0%B1%EC%A4%80/Silver/8312.%E2%80%85Rectangles%E2%80%852/6829fb9f.gif" data-original-src="https://onlinejudgeimages.s3-ap-northeast-1.amazonaws.com/problem/8312/1.gif" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:100px; width:150px" /></p>

<p>We have found: 6 rectangles 1 &times; 1, 4 rectangles 2 &times; 1, 3 rectangles 1 &times; 2, 2 rectangles 2 &times; 2, 2 rectangles 3&nbsp;&times; 1&nbsp;and one rectangle 3 &times; 2, what gives 18 in total. Clearly, we are interested in rectangles with vertices in grid points, i.e., the points located at the intersections of vertical and horizontal line segments, and having vertical or horizontal sides. The above grid has dimensions 3 &times; 2.</p>

<p>And how many such rectangles of perimeter at least 6 can be found in the figure? You can find the answer in the Example section.</p>

### 입력

<p>The first and only line of the standard input contains three integers: n, m&nbsp;and p&nbsp;(1 &le; n, m &le; 5,000, 4 &le; p &le; 2(n+m)), representing the dimensions of the grid and the lower bound for the perimeter of the rectangles.</p>

### 출력

<p>In the first line of the standard output your program should output one integer: the number of rectangles with vertices in grid points of the grid n &times; m, having vertical or horizontal sides and which perimeter is at least p.</p>