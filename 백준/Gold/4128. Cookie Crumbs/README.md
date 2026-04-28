# [Gold III] Cookie Crumbs - 4128

[문제 링크](https://www.acmicpc.net/problem/4128)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 22, 정답: 7, 맞힌 사람: 7, 정답 비율: 35.000%

### 분류

자료 구조, 그래프 이론, 그래프 탐색, 너비 우선 탐색, 분리 집합, 값 / 좌표 압축

### 문제 설명

<p>Cookie Monster likes chocolate chip cookies. He especially likes ones with lots of chocolate chips. Sometimes he likes to experiment with new, unusual cookies. The other day, he tried baking cookies in the shape of rectangles, and using rectangular chocolate chips. Unfortunately, since this was his first time attempting to make rectangular cookies, a few things went wrong. He used way too many chocolate chips. He also turned the oven on too high, and all the chocolate melted and leaked out, leaving only the cookie with holes where the chocolate chips used to be. When the chocolate chips melted, the cookie became disconnected into many cookie crumbs. Cookie Monster needs your help to count the crumbs to make sure he has not lost any in the oven.</p>

### 입력

<p>The first line of input contains four integers x1, y1, x2, y2, each between -1000000000 and 1000000000, giving the x- and y-coordinates of two opposite corners of the cookie. The sides of the cookie are parallel to the x and y coordinate axes. The second line contains an integer 0 &lt;= n &lt;= 100, the number of chocolate chips in the cookie. The following n lines each describe one of the chocolate chips using four integers x1, y1, x2, y2, each between -1000000000 and 1000000000, the x- and y-coordinates of two opposite corners of the chocolate chip. The sides of each chocolate chip are parallel to the x and y coordinate axes. Chocolate chips can overlap, and they can be partially or completely outside the cookie. The cookie and each chocolate chip will have a non-zero area. A chocolate chip is considered to include the points on its perimeter; therefore, crumbs that would meet only at their corners are considered distinct crumbs.</p>

### 출력

<p>Output a single integer, the number of crumbs (disconnected components) that the cookie splits into after the chocolate chips have melted away.</p>