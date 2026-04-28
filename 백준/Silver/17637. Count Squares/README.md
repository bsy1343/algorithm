# [Silver III] Count Squares - 17637

[문제 링크](https://www.acmicpc.net/problem/17637)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 161, 정답: 102, 맞힌 사람: 64, 정답 비율: 52.893%

### 분류

수학, 자료 구조, 기하학, 집합과 맵, 조합론, 해시를 사용한 집합과 맵

### 문제 설명

<p>Alice took a clean sheet of paper and drew h horizontal and v vertical lines onto the paper.</p>

<p>The horizontal lines have y-coordinates y<sub>1</sub>, . . . , y<sub>h</sub>, and the vertical lines have x-coordinates x<sub>1</sub>, . . . , x<sub>v</sub>.</p>

<p>Given these coordinates, count the number of squares that appeared on the paper.</p>

<p>(The whole boundary of the square has to be drawn. The inside of the square does not have to be empty.)</p>

### 입력

<p>The first line of input contains the integers h and v (0 &le; h, v &le; 1500).</p>

<p>The second line of input contains a strictly increasing sequence consisting of h space-separated integers: y<sub>1</sub>, . . . , y<sub>h</sub>.</p>

<p>The third line of input contains a strictly increasing sequence consisting of v space-separated integers: x<sub>1</sub>, . . . , x<sub>v</sub>.</p>

<p>All horizontal and vertical coordinates are between 0 and 2<sup>30</sup>, inclusive.</p>

### 출력

<p>Output a single line with a single integer: the total number of squares.</p>

### 힌트

<p>In the example there is one 1 &times; 1 square, one 2 &times; 2 square, and one 3 &times; 3 square.</p>