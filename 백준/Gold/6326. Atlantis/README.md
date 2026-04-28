# [Gold III] Atlantis - 6326

[문제 링크](https://www.acmicpc.net/problem/6326)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 59, 정답: 22, 맞힌 사람: 22, 정답 비율: 42.308%

### 분류

정렬, 스위핑, 값 / 좌표 압축

### 문제 설명

<p>There are several ancient Greek texts that contain descriptions of the fabled island Atlantis. Some of these texts even include maps of parts of the island. But unfortunately, these maps describe different regions of Atlantis. Your friend Bill has to know the total area for which maps exist. You (unwisely) volunteered to write a program that calculates this quantity.</p>

### 입력

<p>The input file consists of several test cases. Each test case starts with a line containing a single integer n (1  n  100) of available maps. The n following lines describe one map each. Each of these lines contains four numbers x1 ; y1 ; x2 ; y2 (0  x1 &lt; x2  100000; 0  y1 &lt; y2  100000), not necessarily integers. The values (x1 ; y1) and (x2 ; y2) are the coordinates of the top-left resp. bottom-right corner of the mapped area.</p>

<p>The input file is terminated by a line containing a single 0. Don&rsquo;t process it<sup>1</sup>.</p>

<p><sup>1</sup>We warned you!</p>

### 출력

<p>For each test case, your program should output one section. The first line of each section must be &ldquo;Test case #k&rdquo;, where k is the number of the test case (starting with 1). The second one must be &ldquo;Total explored area: a&rdquo;, where a is the total explored area (i.e. the area of the union of all rectangles in this test case), printed exact to two digits to the right of the decimal point.</p>

<p>Output a blank line after each test case.</p>