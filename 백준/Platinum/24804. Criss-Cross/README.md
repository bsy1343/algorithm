# [Platinum II] Criss-Cross - 24804

[문제 링크](https://www.acmicpc.net/problem/24804)

### 성능 요약

시간 제한: 10 초 (추가 시간 없음), 메모리 제한: 1024 MB

### 통계

제출: 130, 정답: 13, 맞힌 사람: 9, 정답 비율: 9.091%

### 분류

임의 정밀도 / 큰 수 연산, 브루트포스 알고리즘, 유클리드 호제법, 기하학, 선분 교차 판정, 수학, 정수론

### 문제 설명

<p><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/24804.%E2%80%85Criss-Cross/c6794b4d.png" data-original-src="%EB%B0%B1%EC%A4%80/Platinum/24804.%E2%80%85Criss-Cross/c6794b4d.png" data-original-src="https://upload.acmicpc.net/31ffe9b6-1288-4ff3-9702-600f55ed5e27/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 180px; height: 191px; float: right;" />Peter is bored during his operating systems class, so he draws doodles on a sheet of paper. &nbsp;He feels like drawing abstract art using his ruler: he draws line segments by choosing two points in the plane and connecting them. Lots of them.</p>

<p>Can you write a program that counts the number of distinct points at which the line segments he drew intersect or touch?</p>

### 입력

<p>The first line in the input contains an integer $n$ ($1 \le n \le 1\,000$) which is the number of lines. &nbsp;The following $n$ lines contain four integers $x_0 \ \ &nbsp;y_0 \ \ x_1 \ \ &nbsp;y_1$ ($-1\,000\,000 \le x_0, \ y_0, \ x_1, \ y_1 \le 1\,000\,000$. Lines have non-zero length, i.e., the two points will be distinct: $x_0 \ne x_1$ or $y_0 \ne y_1$ or both.</p>

### 출력

<p>Output the number of distinct points for which there is at least one pair of line segments that intersects or touches at this point.</p>

<p>Ignore those intersections points in your count that are created by line segments that intersect or touch at more than one point (i.e. overlapping segments).</p>

<p>You may further assume that if two line segments touch exactly at their endpoints, the three points involved are not collinear.</p>