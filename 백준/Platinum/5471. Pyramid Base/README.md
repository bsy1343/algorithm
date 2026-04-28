# [Platinum I] Pyramid Base - 5471

[문제 링크](https://www.acmicpc.net/problem/5471)

### 성능 요약

시간 제한: 5 초, 메모리 제한: 128 MB

### 통계

제출: 101, 정답: 61, 맞힌 사람: 41, 정답 비율: 55.405%

### 분류

자료 구조, 세그먼트 트리, 이분 탐색, 스위핑, 매개 변수 탐색, 느리게 갱신되는 세그먼트 트리

### 문제 설명

<p>You have been asked to find the largest affordable location for constructing a new pyramid. &nbsp;In order to help you decide, you have been provided with a survey of the available land which has been conveniently divided into an M by N grid of square cells. The base of the pyramid must be a square with sides parallel to those of the grid.</p>

<p>The survey has identified a set of P possibly overlapping obstacles, which are described as rectangles in the grid with sides parallel to those of the grid. In order to build the pyramid, all the cells covered by its base must be cleared of any obstacles. Removing the ith obstacle has a cost Ci. Whenever an obstacle is removed, it must be removed completely, that is, you cannot remove only part of an obstacle. Also, please note that removing an obstacle does not affect any other obstacles that overlap it.</p>

<p>Write a program that, given the dimensions M and N of the survey, the description of the P obstacles, the cost of removing each of the obstacles, and the budget B you have, finds the maximum possible side length of the base of the pyramid such that the total cost of removing obstacles does not exceed B.</p>

### 입력

<p>Your program must read from the standard input the following data:</p>

<ul>
	<li>Line 1 contains two integers separated by a single space that represent M and N respectively. (1 &le; M, N &le; 1,000,000)</li>
	<li>Line 2 contains the integer B, the maximum cost you can afford (i.e., your budget).&nbsp;(B = 0)</li>
	<li>Line 3 contains the integer P, the number of obstacles found in the survey.&nbsp;(1 &le; P &le; 1,000)</li>
	<li>Each of the next P lines describes an obstacle. The ith of these lines describes the ith obstacle. Each line consists of 5 integers: X<sub>i1</sub>, Y<sub>i1</sub>, X<sub>i2</sub>, Y<sub>i2</sub>, and C<sub>i</sub> separated by single spaces. They represent respectively the coordinates of the bottommost leftmost cell of the obstacle, the coordinates of the topmost rightmost cell of the obstacle, and the cost of removing the obstacle. &nbsp; &nbsp;The bottommost leftmost cell on the grid has coordinates (1, 1) and the topmost rightmost cell has coordinates (M, N).&nbsp;(1 &le; X<sub>i1</sub> &le; X<sub>i2</sub> &le; M, 1 &le; Y<sub>i1</sub> &le; Y<sub>i2</sub> &le; N, 1 &le; C<sub>i</sub> &le; 7,000)</li>
</ul>

### 출력

<p>Your program must write to the standard output a single line containing one integer, the maximum possible side length of the base of the pyramid that can be prepared. If it is not possible to build any pyramid, your program should output the number 0.</p>

### 힌트

<p><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/5471.%E2%80%85Pyramid%E2%80%85Base/0b312955.png" data-original-src="%EB%B0%B1%EC%A4%80/Platinum/5471.%E2%80%85Pyramid%E2%80%85Base/0b312955.png" data-original-src="https://onlinejudgeimages.s3-ap-northeast-1.amazonaws.com/problem/5471/1.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:136px; width:305px" /></p>

<p>The figure shows the only possible location for the pyramid&#39;s base having a side of length 3.</p>