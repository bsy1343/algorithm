# [Platinum III] Tile Puzzle - 22671

[문제 링크](https://www.acmicpc.net/problem/22671)

### 성능 요약

시간 제한: 8 초 (추가 시간 없음), 메모리 제한: 512 MB

### 통계

제출: 28, 정답: 7, 맞힌 사람: 6, 정답 비율: 31.579%

### 분류

가우스 소거법, 선형대수학, 수학

### 문제 설명

<p>You are visiting Ancient and Contemporary Museum. Today there is held an exhibition on the history of natural science. You have seen many interesting exhibits about ancient, medieval, and modern science and mathematics, and you are in a resting space now.</p>

<p>You have found a number of panels there. Each of them is equipped with&nbsp;<i>N</i>&nbsp;&times;&nbsp;<i>N</i>&nbsp;electric tiles arranged in a square grid. Each tile is lit in one of the following colors: black (unlit), red, green, yellow, blue, magenta, and cyan. Initially all the tiles are in black. When a tile is touched on, that tile and the eight adjacent tiles will change their colors as follows: black -&gt; red, red -&gt; green, green -&gt; yellow, yellow -&gt; blue, blue -&gt; magenta, magenta -&gt; cyan, and cyan -&gt; black. Here, the leftmost and rightmost columns are considered adjacent, and so as the uppermost and lowermost rows. There is a goal pattern for each panel, and you are to change the colors of the tiles as presented in the goal pattern. For example, if you are given the goal pattern shown in the figure below for a panel of 4 &times; 4, you will touch on the upper-left tile once and then on the lower-right tile twice (note that this might not be the only way).</p>

<p>Since you are good at programming, you guess you can find the solution using your computer. So your job in this problem is to write a program for it.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/22671.%E2%80%85Tile%E2%80%85Puzzle/c89fa098.png" data-original-src="%EB%B0%B1%EC%A4%80/Platinum/22671.%E2%80%85Tile%E2%80%85Puzzle/c89fa098.png" data-original-src="https://upload.acmicpc.net/069eb837-67f2-429e-93f5-ea811b80b9f9/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 226px; height: 226px;" /></p>

<p style="text-align: center;">Figure 1: Example Goal Pattern</p>

### 입력

<p>The input contains a series of datasets. Each dataset is given in the following format:</p>

<pre>
<i>N</i>
<i>Row</i><sub>1</sub>
...
<i>Row<sub>N</sub></i>
</pre>

<p><i>N</i>&nbsp;indicates the size (i.e. the number of rows and columns) of the electrical panel (3 &le;&nbsp;<i>N</i>&nbsp;&le; 15).&nbsp;<i>Row<sub>i</sub></i>&nbsp;describes the goal pattern of the&nbsp;<i>i</i>-th row and contains exactly&nbsp;<i>N</i>&nbsp;numbers separated by a space. The&nbsp;<i>j</i>-th number indicates the color of the&nbsp;<i>j</i>-th column, and it is one of the following: 0 (denoting black), 1 (red), 2 (green), 3 (yellow), 4 (blue), 5 (magenta), and 6 (cyan).</p>

<p>The input is terminated by a line containing a single zero. This line is not part of any datasets.</p>

### 출력

<p>For each dataset, your program should produce the output of&nbsp;<i>N</i>&nbsp;lines. The&nbsp;<i>i</i>-th line should correspond to the&nbsp;<i>i</i>-th row and contain exactly&nbsp;<i>N</i>&nbsp;numbers separated by a space, where the&nbsp;<i>j</i>-th number should be the number of touches on the tile of the&nbsp;<i>j</i>-th column. The number should be in the range from 0 to 6 inclusive.</p>

<p>If there is more than one solution, your program may output any of them. If it is impossible to make the goal pattern, your program should output a single line containing &ldquo;-1&rdquo; (without quotes) instead of the&nbsp;<i>N</i>&nbsp;lines.</p>

<p>A blank line should follow the output for every dataset (including the last one).</p>