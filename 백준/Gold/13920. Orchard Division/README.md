# [Gold II] Orchard Division - 13920

[문제 링크](https://www.acmicpc.net/problem/13920)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 48, 정답: 8, 맞힌 사람: 7, 정답 비율: 23.333%

### 분류

스위핑

### 문제 설명

<p>Uncle Oliver is going to sell a significant part of his famous dwarf plum tree orchard. He is going to divide the orchard into two parts, sell the first one and keep the other one.</p>

<p>The trees were originally planted in regular rows and columns forming a rectangular grid with the same number of rows and columns. As years went by, Oliver removed many trees which were weak or plagued by bugs so nowadays there is also a lot of free squares unoccupied by any tree.</p>

<p>Oliver has decided that he will keep exactly half of all the trees in the orchard. Moreover, he has few additional demands which, in his opinion, will ensure easy maintenance of his part in the future.</p>

<ul>
	<li>The part Oliver is going to keep should be in the shape of a rectangle.</li>
	<li>A least one corner of the rectangle should coincide with a corner of the orchard.</li>
	<li>The rectangle area should be as small as possible.</li>
</ul>

<p>Originally, each tree was planted in the center of an imaginary square whose area was exactly one square meter. Thus, the position of each tree can be described by the coordinates of the square on which it is standing. The dividing fence between the two parts of the orchard will run along the borders of the squares.</p>

<p><img alt="" src="https://onlinejudgeimages.s3.amazonaws.com/problem/13920/%EC%8A%A4%ED%81%AC%EB%A6%B0%EC%83%B7%202016-11-21%20%EC%98%A4%ED%9B%84%205.52.35.png" style="height:199px; width:200px" /></p>

### 입력

<p>There are more test cases. Each case starts with a line containing two integers M (1 &le; M &le; 10<sup>9</sup> ) and N (1 &le; N &le; 10<sup>6</sup> ) separated by space. The orchard side length in meters is expressed by M and the number of trees in the orchard is expressed by N. Next, there are N lines, each line specifies x and y coordinates of one tree in the orchard. The coordinates are separated by space. For simplicity reasons, we assume that the coordinates are zero based, so the coordinates of the squares in the corners of the orchard are (0, 0),(0, M &minus; 1),(M &minus; 1, M &minus; 1),(M &minus; 1, 0). All coordinate pairs (x, y) in one test case are unique.</p>

### 출력

<p>For each test case, print a single line with one whole number A denoting the minimum possible area in square meters of uncle Oliver&rsquo;s part of the orchard. If it is not possible to divide the orchard according to Oliver&rsquo;s demands print &ldquo;-1&rdquo;. Note that the output value might not fit into 32-bit integer type.</p>