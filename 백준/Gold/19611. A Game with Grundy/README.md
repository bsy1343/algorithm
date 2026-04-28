# [Gold I] A Game with Grundy - 19611

[문제 링크](https://www.acmicpc.net/problem/19611)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 512 MB

### 통계

제출: 52, 정답: 25, 맞힌 사람: 25, 정답 비율: 59.524%

### 분류

수학, 정렬

### 문제 설명

<p>Grundy is playing his favourite game - hide and seek.</p>

<p>His N friends stand at locations on the x-axis of a two-dimensional plane - the i-th one is at coordinates (x<sub>i</sub>, 0). Each friend can see things in a triangular wedge extending vertically upwards from their position &ndash; the i-th friend&rsquo;s triangular wedge of vision will be specified by two lines: one with slope of v<sub>i</sub>/h<sub>i</sub> and the other with slope &minus;v<sub>i</sub>/h<sub>i</sub>. A friend cannot see a point that lies exactly on one of these two lines.</p>

<p>Grundy may choose to hide at any location (a, Y), where a is an integer satisfying L &le; a &le; R, and L, R, and Y are given integer constants.</p>

<p>Each possible location may be in view of some of Grundy&rsquo;s friends (namely, strictly within their triangular wedge of vision).</p>

<p>Grundy would like to know in how many different spots he can stand such that he will be in view of at most i of his friends, for every possible value of i from 0 to N.</p>

### 입력

<p>The first line of input contains the integer N (1 &le; N &le; 100 000).</p>

<p>The next line contains three integers: L, R and Y (&minus;1 000 000 000 &le; L &le; R &le; 1 000 000 000, 1 &le; Y &le; 1 000 000).</p>

<p>Each of the next N lines contain three integers: the i-th such line contains x<sub>i</sub> (L &le; x<sub>i</sub> &le; R), the x-value of the position of friend i followed by two integers vi and hi (1 &le; v<sub>i</sub>, h<sub>i</sub> &le; 100). The slopes v<sub>i</sub>/h<sub>i</sub> and &minus;v<sub>i</sub>/h<sub>i</sub> define the triangular wedge of vision for friend i.</p>

### 출력

<p>The output is N + 1 lines, where each line i (0 &le; i &le; N) contains the integer number of positions in which Grundy can stand and be in view of at most i of his friends.</p>

### 힌트

<p>There are three friends with the following triangular wedges of vision, along with the possible positions that Grundy can be placed, as shown in the diagram below:</p>

<p style="text-align: center;"><img alt="" src="https://upload.acmicpc.net/11b5e7db-3472-487e-846e-17a79f16e1f8/-/preview/" style="width: 607px; height: 465px;" /></p>

<p>Notice the points (2, 3) and (4, 3) are visible only by the friend at position 0, since they lie on the boundary of the triangular wedge of vision for the friend at position 3.</p>