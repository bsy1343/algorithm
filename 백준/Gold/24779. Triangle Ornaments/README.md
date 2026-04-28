# [Gold III] Triangle Ornaments - 24779

[문제 링크](https://www.acmicpc.net/problem/24779)

### 성능 요약

시간 제한: 1 초 (추가 시간 없음), 메모리 제한: 1024 MB

### 통계

제출: 39, 정답: 24, 맞힌 사람: 23, 정답 비율: 67.647%

### 분류

수학, 기하학, 물리학

### 문제 설명

<p><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/24779.%E2%80%85Triangle%E2%80%85Ornaments/d05f63c4.png" data-original-src="%EB%B0%B1%EC%A4%80/Gold/24779.%E2%80%85Triangle%E2%80%85Ornaments/d05f63c4.png" data-original-src="https://upload.acmicpc.net/3eeff83e-1b9a-4e3d-9ac3-fe9d91d4c93c/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 367px; height: 250px; float: right;" />A company makes triangle-shaped ornaments for the upcoming holidays. Each ornament is tied at one of its corners to a rod using a string of unknown length. Multiple of these ornaments may be attached to the same rod. These ornaments should be able to swing (rotate around the axis formed by the string) without interfering with each other.</p>

<p>Write a program that computes the minimum required length for the rod, given a list of triangles!</p>

### 입력

<p>The input consists of a single test case. The first line contains one integer $N$ ($0 &lt; N \le 100$), denoting the number of triangles. The next $N$ lines each contain three integers $A, B, C$ denoting the lengths of the three sides of each triangle. &nbsp;The triangle will hang from the corner between sides $A$ and $B$. &nbsp;You are guaranteed that $A, B, C$ form a triangle that has an area that is strictly greater than zero.</p>

### 출력

<p>Output the required length $L$ such that all triangles can be hung from the rod, no matter how long or short each triangle&#39;s string is. &nbsp;No triangle should swing beyond the rod&#39;s ends. You may ignore the thickness of each ornament, the width of the string and you may assume that the string is attached exactly to the triangle&#39;s end point.</p>

<p>Your answer should be accurate to within an absolute or relative error of $10^{-4}$.</p>