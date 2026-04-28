# [Silver II] Surface Area - 9715

[문제 링크](https://www.acmicpc.net/problem/9715)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 312, 정답: 256, 맞힌 사람: 228, 정답 비율: 84.444%

### 분류

구현, 기하학, 3차원 기하학

### 문제 설명

<p>The solid in the picture below is made up of 1x1x1 cubes in a 3D grid. In this problem, we&#39;ll limit ourselves to solids that are made up of columns rooted on the ground (a column consists of one or several 1x1x1 cubes stacked on top of each other). Such solids can be described as a matrix of digits, where each digit corresponds to the height of a column in the 2D grid that makes up the ground. A zero means there is no column at all in that position.</p>

<p><img alt="" src="%EB%B0%B1%EC%A4%80/Silver/9715.%E2%80%85Surface%E2%80%85Area/9a3014a9.png" data-original-src="https://onlinejudgeimages.s3.amazonaws.com/problem/9715/%EC%8A%A4%ED%81%AC%EB%A6%B0%EC%83%B7%202016-10-04%20%EC%98%A4%ED%9B%84%204.03.33.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:241px; width:190px" /></p>

<p>The corresponding matrix for the above solid will be  </p>

<pre>
4231
2101
0001</pre>

<p>The volume of such a solid is simple enough to calculate, but what we&#39;re interested here in the total surface area including the floor (that is, the number of 1x1 &quot;squares&quot; non hidden on the outer surface). You are given the information of the solid as a matrix. Your task is to compute the surface area of the given solid. You can assume that the solid is always connected, i.e the columns will be attached to each other in the four cardinal directions.</p>

### 입력

<p>First line of the input contains T, the number of test cases.  Each test case starts with a line containing R and C denoting the number of rows and columns of the solid. Each of the next R lines contains C digits. Each digits are between 0 to 9 inclusive. R and C will be between 1 and 50 inclusive.  </p>

### 출력

<p>For each test case, output the total surface area of the given solid, including the floor area.</p>