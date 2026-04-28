# [Platinum V] Billboard - 3572

[문제 링크](https://www.acmicpc.net/problem/3572)

### 성능 요약

시간 제한: 3 초, 메모리 제한: 256 MB

### 통계

제출: 116, 정답: 41, 맞힌 사람: 36, 정답 비율: 38.298%

### 분류

자료 구조, 세그먼트 트리

### 문제 설명

<p>At the entrance to the university, there is a huge rectangular billboard of size h&times;w (h is its height and w is its width). The board is the place where all possible announcements are posted: nearest programming competitions, changes in the dining room menu, and other important information.</p>

<p>On September 1, the billboard was empty. One by one, the announcements started being put on the billboard.</p>

<p>Each announcement is a stripe of paper of unit height. More specifically, the i-th announcement is a rectangle of size 1 &times; wi. When someone puts a new announcement on the billboard, she would always choose the topmost possible position for the announcement. Among all possible topmost positions she would always choose the leftmost one.</p>

<p>If there is no valid location for a new announcement, it is not put on the billboard (that&rsquo;s why some programming contests have no participants from this university).</p>

<p>Given the sizes of the billboard and the announcements, your task is to find the numbers of rows in which the announcements are placed.</p>

### 입력

<p>The first line of the input file contains three integer numbers, h, w, and n (1 &le; h,w &le; 10<sup>9</sup>; 1 &le; n &le; 200 000) &mdash; the dimensions of the billboard and the number of announcements.</p>

<p>Each of the next n lines contains an integer number w<sub>i</sub> (1 &le; w<sub>i</sub> &le; 10<sup>9</sup>) &mdash; the width of i-th announcement.</p>

### 출력

<p>For each announcement (in the order they are given in the input file) output one number &mdash; the number of the row in which this announcement is placed. Rows are numbered from 1 to h, starting with the top row. If an announcement can&rsquo;t be put on the billboard, output &ldquo;-1&rdquo; for this announcement.</p>