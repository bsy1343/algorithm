# [Bronze II] Rectangles - 8295

[문제 링크](https://www.acmicpc.net/problem/8295)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 317, 정답: 251, 맞힌 사람: 224, 정답 비율: 80.000%

### 분류

수학, 브루트포스 알고리즘, 사칙연산

### 문제 설명

<p>How many rectangles can you find in the figure below?</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Bronze/8295.%E2%80%85Rectangles/cf23579b.png" data-original-src="https://upload.acmicpc.net/8b9f8cce-c6ba-46ec-8629-ffe36c77c3e6/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 150px; height: 100px;" /></p>

<p>We have found: 6 rectangles 1 &times; 1, 4 rectangles 2 &times; 1, 3 rectangles 1 &times; 2, 2 rectangles 2 &times; 2, 2 rectangles 3&nbsp;&times; 1&nbsp;and one rectangle 3 &times; 2, what gives 18&nbsp;in total. Clearly, we are interested in rectangles with vertices in grid points, i.e., the points located at the intersections of vertical and horizontal line segments, and having vertical or horizontal sides. The above grid has dimensions 3 &times; 2.</p>

<p>And how many such rectangles of perimeter at least 6 can be found in the figure? You can find the answer in the Example section.</p>

### 입력

<p>The first and only line of the standard input contains three integers: <em>n</em>, <em>m</em>&nbsp;and <em>p</em>&nbsp;(1 &le; <em>n</em>, <em>m</em> &le; 100, 4 &le; <em>p</em> &le; 2(<em>n</em>+<em>m</em>)), representing the dimensions of the grid and the lower bound for the perimeter of the rectangles.</p>

### 출력

<p>In the first line of the standard output your program should output one integer: the number of rectangles with vertices in grid points of the grid <em>n</em> &times; <em>m</em>, having vertical or horizontal sides and which perimeter is at least <em>p</em>.</p>