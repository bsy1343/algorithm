# [Platinum IV] Triangles - 8166

[문제 링크](https://www.acmicpc.net/problem/8166)

### 성능 요약

시간 제한: 3 초, 메모리 제한: 128 MB

### 통계

제출: 226, 정답: 43, 맞힌 사람: 34, 정답 비율: 25.954%

### 분류

정렬, 기하학, 누적 합

### 문제 설명

<p>n pairwise disjoint points in the plane are given (n &ge; 3). There are \( \frac {n&sdot;(n-1)&sdot;(n-2)}{6} \) triangles whose vertices are some pairwise different points among them (including degenerate triangles, i.e. ones whose vertices are collinear).</p>

<p>We want to calculate the sum of areas of all the triangles with vertices in the given points.</p>

<p>Those parts of the plane that belong to many triangles are to be calculated multiple times. We assume that the area of degenerate triangles (i.e. those with collinear vertices) is zero.</p>

<p>Write a programme that:</p>

<ul>
	<li>reads from the standard input the coordinates of the points in the plane,</li>
	<li>determines the sum of the areas of all the triangles with vertices in the given points,</li>
	<li>prints out the result to the standard output.</li>
</ul>

### 입력

<p>In the first line of the standard input there is one integer n (3 &le; n &le; 3,000) denoting the number of selected points. Each of the following &nbsp;lines contains two integers x<sub>i</sub> and y<sub>i</sub> (0 &le; x<sub>i</sub>,y<sub>i</sub> &le; 10,000) separated by a single space and denoting the coordinates of the ith point (for i=1,2,&hellip;,n). No pair (ordered) of coordinates appears more than once.</p>

### 출력

<p>In the first and only line of the standard output there should be one real number equal to the sum of the areas of all the triangles with vertices in the given points. The outcome should be printed out with exactly one digit after dot and should not differ from the correct value by more than 0.1.</p>

### 힌트

<p><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/8166.%E2%80%85Triangles/7681a7f0.gif" data-original-src="https://onlinejudgeimages.s3-ap-northeast-1.amazonaws.com/problem/8166/1.gif" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:115px; width:112px" /></p>