# [Platinum V] Fix the Pond - 5673

[문제 링크](https://www.acmicpc.net/problem/5673)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 20, 정답: 13, 맞힌 사람: 12, 정답 비율: 63.158%

### 분류

자료 구조, 분리 집합, 그래프 이론, 그래프 탐색

### 문제 설명

<p>A shrimp farm uses a rectangular pond built as a grid with 2N rows and 2N+1 columns of square cells, for a given integer N. Each cell side is one meter long. The pond has exactly (2N&minus;1)&times; N barriers of length two meters, used to temporarily isolate smaller sections inside the pond for breeding different kinds of shrimp. The barriers have their middle points fixed precisely at the integer coordinates (a, b), for all 0 &lt; a &lt; 2N and 0 &lt; b &lt; 2N + 1, where both a and b are odd, or both are even. Each barrier can be rotated around its middle point to change the pond configuration; however, by being rotated, a barrier switches between only two possible positions, always parallel to the pond sides, vertical or horizontal. The left part of the figure below shows a pond configuration, with N = 3.</p>

<p><img alt="" src="/upload/images2/fond.png" style="height:183px; width:436px" /></p>

<p>At the end of every season the pond is closed for maintenance and cleaning. It must then be reconfigured so that a special machine can sweep the pond floor. The machine starts its work at the top left cell, and needs to pass through every cell exactly once, finishing in the bottom left cell. The right part of the figure shows one such reconfiguration, where six barriers were switched. For this example, though, four barrier switches would have been enough.</p>

<p>You must write a program that given a pond configuration, determines the minimum number of barrier switches needed to reconfigure the pond as specified above. There is always at least one possible way to reconfigure the pond as specified.</p>

### 입력

<p>Each test case is described using several lines. The first line contains an integer N indicating that the pond has 2N rows and 2N + 1 columns (1 &le; N &le; 300). Each of the next 2N &minus; 1 lines contains a string of N characters describing the orientation of the barriers. In the i-th line, the j-th character indicates the orientation of the barrier whose middle point is at coordinates (i, 2j &minus; 1) if i is odd, or (i, 2j) if i is even, for i = 1, 2, . . . , 2N &minus; 1 and j = 1, 2, . . . , N. The character is the uppercase letter &ldquo;V&rdquo; if the orientation is vertical, or the uppercase letter &ldquo;H&rdquo; if it is horizontal.</p>

### 출력

<p>For each test case output a line with an integer representing the minimum number of barrier switches needed to reconfigure the pond as specified.</p>