# [Platinum IV] Jurisdiction Disenchantment - 14486

[문제 링크](https://www.acmicpc.net/problem/14486)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 51, 정답: 24, 맞힌 사람: 16, 정답 비율: 38.095%

### 분류

브루트포스 알고리즘, 정렬, 두 포인터

### 문제 설명

<p>The Super League of Paragons and Champions (SLPC) has been monitoring a plot by a corrupt politician to steal an election. In the past week, the politican has used a mind-control technique to enslave the n representatives responsible for choosing the election&rsquo;s winner. Luckily, the SLPC has managed to recruit you and hence has access to your power to break mind-control. You are able to break mind-control in an axis-aligned rectangle. Unfortunately, your power comes at a steep cost; you get a headache the next day proportional to the size of the rectangle. You do not even want to risk or think about what would happen if you tried to use your power multiple times in one day.</p>

<p>You have done your research and you know the position that each representative will be standing when the votes are about to be cast. You need to free enough representatives to prevent the politician from having a majority (strictly more than one-half) vote. What is the area of the smallest axis-aligned rectangle that you can affect to do this?</p>

### 입력

<p>The first line of input contains a single integer T (1 &le; T &le; 10), the number of test cases. The first line of each test case contains a single integer n (1 &le; n &le; 299, n is odd), the number of representatives. Each of the next n lines of input contains two integers, denoting the x and y coordinates of a representative. It is guaranteed that all coordinates are between &minus;10,000 and +10,000.</p>

### 출력

<p>For each test case, output a single line containing the area of the smallest axis-aligned rectangle containing more than n/2 of the representatives.</p>

### 힌트

<p>In the first case, a rectangle containing a single point has an area of 0.</p>

<p>In the second test case, the rectangle needs to include at least two points. There are two smallest possible rectangles; one includes (0, 0) and (1, 4) and the other includes (1, 4) and (3, 2). In either case, the area is 4.</p>