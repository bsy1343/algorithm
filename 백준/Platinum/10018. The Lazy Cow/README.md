# [Platinum II] The Lazy Cow - 10018

[문제 링크](https://www.acmicpc.net/problem/10018)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 116, 정답: 45, 맞힌 사람: 39, 정답 비율: 48.750%

### 분류

자료 구조, 세그먼트 트리, 스위핑, 느리게 갱신되는 세그먼트 트리

### 문제 설명

<p>It&apos;s a hot summer day, and Bessie the cow is feeling quite lazy.  She wants to locate herself at a position in her field so that she can reach as much delicious grass as possible within only a short distance.</p><p>There are N patches of grass (1 &lt;= N &lt;= 100,000) in Bessie&apos;s field. The ith such patch contains g_i units of grass (1 &lt;= g_i &lt;= 10,000) and is located at a distinct point (x_i, y_i) in the field (0 &lt;= x_i, y_i &lt;= 1,000,000).  Bessie would like to choose a point in the field as her initial location (possibly the same point as a patch of grass, and possibly even a point with non-integer coordinates) so that a maximum amount of grass is within a distance of K steps from this location (1 &lt;= K &lt;= 2,000,000).</p><p>When Bessie takes a step, she moves 1 unit north, south, east, or west of her current position.  For example, to move from (0,0) to (3,2), this requires 5 total steps.  Bessie does not need to take integer-sized steps -- for example, 1 total step could be divided up as half a unit north and half a unit east.</p><p>Please help Bessie determine the maximum amount of grass she can reach, if she chooses the best possible initial location.</p>

### 입력

<ul><li>Line 1: The integers N and K.</li><li>Lines 2..1+N: Line i+1 describes the ith patch of grass using 3 integers: g_i, x_i, y_i.</li></ul>

### 출력

<ul><li>Line 1: The maximum amount of grass Bessie can reach within K steps, if she locates herself at the best possible initial position.</li></ul>

### 힌트

<h4>Input Details</h4><p>Bessie is willing to take at most 3 steps from her initial position.  There are 4 patches of grass.  The first contains 7 units of grass and is located at position (8,6), and so on.</p><h4>Output Details</h4><p>By locating herself at (3,0), the grass at positions (0,0), (6,0), and (4,2) is all within K units of distance.</p>