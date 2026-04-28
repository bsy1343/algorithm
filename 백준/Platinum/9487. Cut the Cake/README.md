# [Platinum V] Cut the Cake - 9487

[문제 링크](https://www.acmicpc.net/problem/9487)

### 성능 요약

시간 제한: 20 초, 메모리 제한: 128 MB

### 통계

제출: 141, 정답: 34, 맞힌 사람: 26, 정답 비율: 30.952%

### 분류

오일러 지표 (χ=V-E+F), 기하학, 선분 교차 판정

### 문제 설명

<p>Given a circle, and a list of lines, how many parts has the circle been cut into? In the following example, four lines cut the circle into five parts.</p>

<p><img alt="" src="/upload/images2/ctk.png" style="height:451px; width:649px" /></p>

### 입력

<p>There will be several test cases in the input. Each test case will begin with four integers, r (1&le;r&le;1,000), x, y (-1,000&le;x,y&le;1,000), and n (0&le;n&le;1,000), where r is the radius of a circle, x and y are the coordinates of the center of the circle, and n is the number of lines. On each of the next n lines will be four integers, x1, y1, x2 and y2 (-1,000&le;x1,y1,x2,y2&le;1,000). These describe a line passing through (x1,y1) and (x2,y2). Note that we&rsquo;re interested in the whole, infinite line, not just the segment between (x1,y1) and (x2,y2). In any test case, no more than two lines will intersect at any point inside the circle, no lines will be tangent to the circle, and no two lines will be coincident. The input will end with a line with four 0s.</p>

### 출력

<p>For each test case, output a single integer, indicating the number of parts that the circle is cut into. Output no spaces, and do not separate answers with blank lines.</p>