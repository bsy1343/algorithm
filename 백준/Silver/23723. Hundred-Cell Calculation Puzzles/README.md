# [Silver I] Hundred-Cell Calculation Puzzles - 23723

[문제 링크](https://www.acmicpc.net/problem/23723)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 1024 MB

### 통계

제출: 32, 정답: 27, 맞힌 사람: 25, 정답 비율: 86.207%

### 분류

그래프 이론, 브루트포스 알고리즘, 그래프 탐색

### 문제 설명

<p>The&nbsp;<i>hundred-cell calculation</i>&nbsp;is a kind of calculation training. In hundred-cell calculation, a sheet with ten by ten empty cells is given. Numbers, 0 through 9, are written on the top of the ten columns in an arbitrary order. 0 through 9 are also written at the left of the ten rows in an arbitrary order. You are to fill the empty cells with the sums of the top and left numbers, as an example shown in the figure below.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Silver/23723.%E2%80%85Hundred-Cell%E2%80%85Calculation%E2%80%85Puzzles/2f9a5bb2.png" data-original-src="%EB%B0%B1%EC%A4%80/Silver/23723.%E2%80%85Hundred-Cell%E2%80%85Calculation%E2%80%85Puzzles/2f9a5bb2.png" data-original-src="https://upload.acmicpc.net/fc80f0ac-a9c5-4cf7-b74e-5b38e2726643/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 400px; height: 400px;" /></p>

<p>You may think of more generalized drills. Such a drill has different numbers of the columns and rows, say&nbsp;<i>w</i>&nbsp;&times;&nbsp;<i>h.</i>&nbsp;The numbers to be written on the top and the left can be any integers.</p>

<p>Hideo is designing a puzzle based on the generalized hundred-cell calculation. A sheet is given in which some of answer cells are filled with numbers, but numbers on the top and the left are omitted. The puzzle is to find these omitted numbers consistent with the filled numbers.</p>

<p>Hideo decided to construct puzzles by preparing sheets filled with all the correct sums and then removing some of these sums. This guarantees that the puzzle has at least one solution. The existence of the solution, however, is not enough; it should be unique.</p>

<p>Hideo has found through many trials that, when the leftmost of the numbers on the top is fixed to be 0, puzzles with&nbsp;<i>w</i>&nbsp;&times;&nbsp;<i>h</i>&nbsp;cells may have a unique solution when&nbsp;<i>w</i>&nbsp;+&nbsp;<i>h</i>&nbsp;&minus; 1 sums are kept. He, however, could not figure out which cells to keep for a single unique solution.</p>

<p>Your task is to help Hideo by writing a program that judges solution uniqueness for each of the puzzle candidates he has made.</p>

### 입력

<p>The input consists of at most 100 datasets, each in the following format.</p>

<pre>
<i>w</i> <i>h</i>
<i>x</i><sub>1</sub> <i>y</i><sub>1</sub> <i>n</i><sub>1</sub>
...
<i>x</i><sub><i>k</i></sub> <i>y</i><sub><i>k</i></sub> <i>n</i><sub><i>k</i></sub></pre>

<p><i>w</i>&nbsp;and&nbsp;<i>h</i>&nbsp;in the first line are the numbers of answer cells in one row and in one column, respectively (2 &le;&nbsp;<i>w</i>&nbsp;&le; 100 and 2 &le;&nbsp;<i>h</i>&nbsp;&le; 100). There remain&nbsp;<i>k</i>&nbsp;numbers (<i>k</i>&nbsp;=&nbsp;<i>w</i>&nbsp;+&nbsp;<i>h</i>&nbsp;&minus; 1) in the answer cells. The&nbsp;<i>k</i>&nbsp;lines starting from the second show that the number&nbsp;<i>n<sub>i</sub></i>&nbsp;is in the cell&nbsp;<i>x<sub>i</sub></i>-th from the left and&nbsp;<i>y<sub>i</sub></i>-th from the top.&nbsp;<i>x<sub>i</sub></i>,&nbsp;<i>y<sub>i</sub></i>,&nbsp;<i>n<sub>i</sub></i>&nbsp;are integers satisfying 1 &le;&nbsp;<i>x<sub>i</sub></i>&nbsp;&le;&nbsp;<i>w</i>, 1 &le;&nbsp;<i>y<sub>i</sub></i>&nbsp;&le;&nbsp;<i>h</i>, and &minus;100 &le;&nbsp;<i>n<sub>i</sub></i>&nbsp;&le; 100. Here,&nbsp;<i>x</i>&nbsp;= 1 means the leftmost and&nbsp;<i>y</i>&nbsp;= 1 means the topmost. Either of&nbsp;<i>x<sub>i</sub></i>&nbsp;&ne;&nbsp;<i>x<sub>j</sub></i>&nbsp;or&nbsp;<i>y<sub>i</sub></i>&nbsp;&ne;&nbsp;<i>y<sub>j</sub></i>&nbsp;holds for different&nbsp;<i>i</i>&nbsp;and&nbsp;<i>j</i>.</p>

<p>The end of the input is indicated by a line containing two zeros separated by a space.</p>

### 출력

<p>For each dataset, output YES if the puzzle has a unique solution, and NO otherwise, in a line.</p>