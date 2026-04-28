# [Bronze III] Square Pasture - 14173

[문제 링크](https://www.acmicpc.net/problem/14173)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 3097, 정답: 2208, 맞힌 사람: 2061, 정답 비율: 71.962%

### 분류

수학, 사칙연산

### 문제 설명

<p>Farmer John has decided to update his farm to simplify its geometry. Previously, his cows grazed in two rectangular fenced-in pastures. Farmer John would like to replace these with a single square fenced-in pasture of minimum size that still covers all the regions of his farm that were previously enclosed by the former two fences.</p>

<p>Please help Farmer John figure out the minimum area he needs to make his new square pasture so that if he places it appropriately, it can still cover all the area formerly covered by the two older rectangular pastures. The square pasture should have its sides parallel to the x and y axes.</p>

### 입력

<p>The first line in the input file specifies one of the original rectangular pastures with four space-separated integers x<sub>1</sub> y<sub>1</sub> x<sub>2</sub> y<sub>2</sub>, each in the range 0&hellip;10. The lower-left corner of the pasture is at the point (x<sub>1</sub>,y<sub>1</sub>), and the upper-right corner is at the point (x<sub>2</sub>,y<sub>2</sub>), where x<sub>2</sub>&gt;x<sub>1</sub> and y<sub>2</sub>&gt;y<sub>1</sub>.</p>

<p>The second line of input has the same 4-integer format as the first line, and specifies the second original rectangular pasture. This pasture will not overlap or touch the first pasture.</p>

### 출력

<p>The output should consist of one line containing the minimum area required of a square pasture that would cover all the regions originally enclosed by the two rectangular pastures.</p>

### 힌트

<p>In the example above, the first original rectangle has corners (6,6) and (8,8). The second has corners at (1,8) and (4,9). By drawing a square fence of side length 7 with corners (1,6) and (8,13), the original areas can still be enclosed; moreover, this is the best possible, since it is impossible to enclose the original areas with a square of side length only 6. Note that there are several different possible valid placements for the square of side length 7, as it could have been shifted vertically a bit.</p>