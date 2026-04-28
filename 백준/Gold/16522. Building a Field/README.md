# [Gold III] Building a Field - 16522

[문제 링크](https://www.acmicpc.net/problem/16522)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 272, 정답: 124, 맞힌 사람: 97, 정답 비율: 48.020%

### 분류

기하학, 이분 탐색, 누적 합, 두 포인터

### 문제 설명

<p>John is a meticulous person. In his farm he built a circular field with some trees planted right at the circumference of the field. Figure (a) below shows the field with the trees.</p>

<p>Now John wants to use a long rope and four of the field trees to demarcate a rectangle using the trees as vertices and the rope as edges. Figure (b) below shows two rectangles that can be demarcated using the trees of the field in figure (a).</p>

<p style="text-align: center;"><img alt="" src="https://upload.acmicpc.net/88eaa204-93dd-4574-b677-8375d1bc5c92/-/preview/" style="width: 447px; height: 162px;" /></p>

<p>Given the description of the positions of the trees in John&rsquo;s circular field, you must determine whether it is possible to demarcate a rectangle using four of the trees as vertices and the rope as edges.</p>

### 입력

<p>The first line contains an integer N (4 &le; N &le; 10<sup>5</sup>) indicating the number of trees in the field. Trees are represented as points on a circumference. The second line contains N integers L<sub>1</sub>, L<sub>2</sub>, . . . , L<sub>N</sub> (1 &le; L<sub>i</sub> &le; 10<sup>6</sup> for i = 1, 2, . . . , N) indicating the arc lengths between each pair of consecutive trees. The arcs are given in counter-clockwise order. The total length of the circumference does not exceed 10<sup>9</sup>.</p>

### 출력

<p>Output a single line with the uppercase letter &ldquo;Y&rdquo; if it is possible to demarcate a rectangle using the given trees, and the uppercase letter &ldquo;N&rdquo; otherwise.</p>