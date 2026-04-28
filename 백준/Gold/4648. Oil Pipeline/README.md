# [Gold II] Oil Pipeline - 4648

[문제 링크](https://www.acmicpc.net/problem/4648)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 28, 정답: 4, 맞힌 사람: 4, 정답 비율: 14.286%

### 분류

브루트포스 알고리즘, 구현

### 문제 설명

<p>Rocky Oil owns several rectangular oil fields in which it is drilling new wells. It wants to connect all wells in a field to a single East-West pipeline using straight North-South pipes. Your task is to write a program that first finds the location of the E-W pipeline such that the total length of the N-S pipes in the field is minimal; then it must draw a map of the oil field, if possible.</p>

<p>Each rectangular oil field is a grid 94 units long in the E-W direction and 73 units long in the N-S direction. The grid uses integer coordinates, with the SW corner at (1,1) and the NE corner at (94,73). Oil wells may be at any integer coordinates within the grid, and all wells will appear at different positions. The E-W pipeline will stretch across the entire field at an integer N-S coordinate. Wells with the same E-W coordinate share the same pipe. In case there are multiple positions for the E-W pipeline giving the same minimal length, always choose the one furthest south (i.e., with the lowest N-S coordinate).</p>

<p>Consider the first input example below. With the E-W pipeline at 11, the well at E-W position 1 is on the pipeline and has length zero. The two wells at E-W position 69 can share a single pipe of length 18. The total length for all three wells is 18. If the E-W pipeline were at 20 there would be two N-S pipes, one of length 9 at position 1 and another of length 9 at position 69, again with a total length of 18. In fact, any E-W pipeline located from 11 to 20 results in a total length of 18, which is minimal. Since there is more than one position for the pipeline that minimizes the length, choose the southernmost position, which is 11.</p>

<p>Any map drawn must occupy at most 69 columns and 19 rows (not counting borders and labels) so it fits on a standard-sized display. The map must include the E-W pipeline, all wells, and all N-S pipes. Only that portion of the field actually containing wells should be drawn, using the smallest bounding rectangle whose edges are multiples of 5. The E-W pipeline will always stretch across the entire map, regardless of its width. Wells must be inside the bounding rectangle, not on any of its edges. These constraints may make it impossible to draw some oil fields. The first input example shows the largest map possible.</p>

### 입력

<p>The input consists of data for one or more oil fields, followed by a line containing 0 0 which signals the end of the input. Data for each oil field consists of one or more pairs of positive integers, one pair per line, representing the positions of oil wells in the field. The pair -1 -1 indicates the end of the data for a field.</p>

### 출력

<p>For each oil field, output a line with a numbered header. Then output the map of the oil field, if possible. Otherwise, output a sentence with the location of the pipeline. Use the exact format shown below.</p>

<p>Use &#39;@&#39; to represent an oil well, &#39;*&#39; to represent a pipe, and &#39;.&#39; (a period) to represent an empty grid location. Wells take precedence over pipes, so if a well and a pipe occupy the same location, use &#39;@&#39;. Draw a border around the mapped oil field, using &#39;|&#39; (a vertical bar) for N-S edges and &#39;-&#39; (a dash) for E-W edges, but mark every 5th grid position with &#39;+&#39;, as shown in the examples. Label each &#39;+&#39; with its position in the oil field. The label for each N-S &#39;+&#39; comes immediately before the &#39;+&#39; sign. The label for the northernmost &#39;+&#39; must start at the beginning of the first line of output. Labels for an E-W &#39;+&#39; must always have the most significant digit immediately below the &#39;+&#39;. Contrary to the usual output conventions, some of the lines in the map will have leading blanks.</p>