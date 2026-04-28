# [Platinum IV] Crazy Fences - 5868

[문제 링크](https://www.acmicpc.net/problem/5868)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 152, 정답: 52, 맞힌 사람: 39, 정답 비율: 30.709%

### 분류

구현, 그래프 이론, 그래프 탐색, 너비 우선 탐색, 깊이 우선 탐색, 값 / 좌표 압축, 격자 그래프

### 문제 설명

<p>After visiting a modern art museum, Farmer John decides to re-design his farm by moving all of the N (1 &lt;= N &lt;= 500) fences between his pastures! Each fence is describe by either a horizontal or a vertical line segment in the 2D plane.  If two fences meet, they do so only at their endpoints.</p><p>FJ has C cows (1 &lt;= C &lt;= 500) on his farm.  Each cow resides at a point in the 2D plane that is not on any fence, and no two cows reside at the same point.  Two cows are said to be in the same community if one could walk to the other without touching any fences.  Please help FJ determine the size of the largest community.</p>

### 입력

<ul><li>Line 1: Two space-separated integers, N and C.</li><li>Lines 2..1+N: Each line contains four integers: x1, y1, x2, y2. These describe a fence running from point (x1,y1) to point (x2,y2).  Each fence is either vertical (x1=x2) or horizontal (y1=y2).  All coordinates are in the range 0 .. 1,000,000.</li><li>Lines 2+N..1+N+C: Each line contains two integers x and y describing a cow at position (x,y).  All coordinates are in the range 0 .. 1,000,000.</li></ul>

### 출력

<ul><li>Line 1: The number of cows in the largest community.</li></ul>

### 힌트

<h4>Input Details</h4><p>There are 7 fences and 3 cows.</p><h4>Output Details</h4><p>Cows #1 and #2 both belong to the same community, since they can visit each-other without touching any fences.  Cow #3 cannot reach cow #1 or cow #2 without crossing a fence.</p>