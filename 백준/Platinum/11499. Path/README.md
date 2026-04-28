# [Platinum II] Path - 11499

[문제 링크](https://www.acmicpc.net/problem/11499)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 256 MB

### 통계

제출: 417, 정답: 73, 맞힌 사람: 60, 정답 비율: 20.761%

### 분류

자료 구조, 정렬, 기하학, 스택, 볼록 껍질

### 문제 설명

<p>A histogram is a simple rectilinear polygon whose boundary consists of two chains such that the upper chain is monotone with respect to the horizontal axis and the lower chain is a horizontal line segment, called the base segment (See Figure 1).</p>

<p style="text-align:center"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/11499.%E2%80%85Path/555c1b25.png" data-original-src="%EB%B0%B1%EC%A4%80/Platinum/11499.%E2%80%85Path/555c1b25.png" data-original-src="https://onlinejudgeimages.s3-ap-northeast-1.amazonaws.com/problem/11499/1.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:188px; width:384px" /></p>

<p style="text-align:center">Figure 1. A histogram and its base segment (v<sub>0</sub>, v<sub>1</sub>)</p>

<p>Let P be a histogram specified by a list (v<sub>0</sub>, v<sub>1</sub>, &hellip; ,v<sub>n-1</sub>) of n vertices in the counterclockwise order along the boundary such that its base segment is (v<sub>0</sub>, v<sub>1</sub>). An edge e<sub>i</sub> is a line segment connecting two vertices v<sub>i</sub> and v<sub>i+1</sub>, where i = 0, 1, &hellip; , n &minus; 1 and v<sub>n</sub> = v<sub>0</sub>.&nbsp;</p>

<p>A path inside P is a simple path which does not intersect the exterior of P. The length of the path is defined as the sum of Euclidean length of the line segments of the path. The distance between two points p and q of P is the length of the shortest path inside P between p and q. Your task is to find the distance between v<sub>0</sub> and each point of a given set S of points on the boundary of P. A point of the set S is denoted by p(k, d) which represents a point q on the edge e<sub>k</sub> such that d is the distance between v<sub>k</sub> and q.</p>

<p>In the histogram of Figure 1, the shortest path between v<sub>0</sub> and q<sub>1</sub> = p(10, 2) is a polygonal chain connecting v<sub>0</sub>, v<sub>14</sub>, v<sub>12</sub> and q<sub>1</sub> in that order, and its length is 8.595242. The shortest path between v<sub>0</sub> and q<sub>2</sub> = p(1, 1) is a segment directly connecting v<sub>0</sub> and q<sub>2</sub> with length 15.033296.&nbsp;</p>

<p>Given a histogram P with n vertices and a set S of m points on the boundary of P, write a program to find the distances between v<sub>0</sub> and all points of S.</p>

### 입력

<p>Your program is to read from standard input. The input consists of T test cases. The number of test cases T is given in the first line of the input. Each test case starts with a line containing an integer, n (4 &le; n &le; 100,000), where n is the number of vertices of a histogram P = (v<sub>0</sub>, v<sub>1</sub>, &hellip; , v<sub>n-1</sub>). In the following n lines, each of the n vertices of P is given line by line from v<sub>0</sub> to v<sub>n-1</sub>. Each vertex is represented by two numbers, which are the x-coordinate and the y-coordinate of the vertex, respectively. Each coordinate is given as an integer between 0 and 1,000,000, inclusively. Notice that (v<sub>0</sub>, v<sub>1</sub>) is the base segment. The next line contains an integer m (1 &le; m &le; 100,000) which is the size of a set S given as your task. In the following m lines. Each point p(k,d) of S is given line by line, and is represented by two integers k and d, where 0 &le; k &le; n &minus; 1 and 0 &le; d &lt; the length of edge e<sub>k</sub>. All points in the set S are distinct.&nbsp;</p>

### 출력

<p>Your program is to write to standard output. Print exactly one line for each test case. The line should contain exactly one real value which is the sum of the distances between v<sub>0</sub> and all points of S. Your output must contain the first digit after the decimal point, rounded off from the second digit. If each result is within an error range, 0.1, it will be considered correct. The Euclidean distance between two points p = (x<sub>1</sub>, y<sub>1</sub>) and q = (x<sub>2</sub>, y<sub>2</sub>) is \(\sqrt{(x_2 - x_1)^2 + (y_2 - y_1)^2}\)</p>