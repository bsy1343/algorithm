# [Platinum I] DORUCAK - 3137

[문제 링크](https://www.acmicpc.net/problem/3137)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 18, 정답: 4, 맞힌 사람: 3, 정답 비율: 21.429%

### 분류

수학, 기하학, 이분 탐색, 선분 교차 판정, 다각형의 넓이

### 문제 설명

<p>Mirko and Slavko like to eat burek for breakfast. This one time they bought one with cheese and another with meat. Watching the hot bureks on the table, teasing their nostrils with enticing aromas, they could not decide on who would get which burek so they decided to split both of them in halves. Mirko boasted that he could cut both bureks in two halves of equal areas with just one swift stroke of his knife. Help Mirko accomplish this before the bureks get cold.</p>

<p style="text-align: center;"><img alt="" src="https://upload.acmicpc.net/aee4e89d-e5d6-49eb-b3c7-73ecaea1ca88/-/preview/" style="width: 274px; height: 221px;" /></p>

<p style="text-align: center;">Image corresponds to first example.</p>

<p>Each of the bureks is a convex polygon. The bureks are positioned so that one of them is completely left of the y-axis, and the other completely right of it.</p>

<p>Write a program that, given the coordinated of the polygons, calculates the equation of the line that splits both bureks into two halves of equal areas.</p>

### 입력

<p>The first line contains an integer N (3 &le; N &le; 5000), the number of vertices in the first burek.</p>

<p>Each of the following N lines contains two real numbers X and Y in decimal format (&minus;1000 &lt; X &lt; 0, &minus;1000 &lt; Y &lt; 1000), the coordinates of one vertex in the burek.</p>

<p>The remainder of the input describes the second burek in the same format.</p>

<p>In both bureks, the vertices will be given in counter-clockwise order. The coordinates of the vertices will be given with exactly three digits after the decimal point. No three points in a polygon will be collinear.</p>

### 출력

<p>Output two numbers A and B so that y = A &sdot; x + B describes a line for Mirko to use to cut the bureks. Your output must be accurate to &plusmn;0.001.</p>

<p>Note: the solution always exists and is unique.</p>