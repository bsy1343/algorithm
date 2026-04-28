# [Gold II] Overplanting - 5899

[문제 링크](https://www.acmicpc.net/problem/5899)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 215, 정답: 126, 맞힌 사람: 107, 정답 비율: 57.527%

### 분류

자료 구조, 집합과 맵, 스위핑

### 문제 설명

<p>Farmer John has purchased a new machine that is capable of planting grass within any rectangular region of his farm that is &quot;axially aligned&quot; (i.e., with vertical and horizontal sides).  Unfortunately, the machine malfunctions one day and plants grass in not one, but N (1 &lt;= N &lt;= 1000) different rectangular regions, some of which may even overlap.</p><p>Given the rectangular regions planted with grass, please help FJ compute the total area in his farm that is now covered with grass.</p>

### 입력

<ul><li>Line 1: The integer N.</li><li>Lines 2..1+N: Each line contains four space-separated integers x1 y1 x2 y2 specifying a rectangular region with upper-left corner (x1,y1) and lower-right corner (x2,y2).  All coordinates are in the range -10^8...10^8.</li></ul>

### 출력

<ul><li>Line 1: The total area covered by grass.  Note that this could be too large to fit into a 32-bit integer.</li></ul>