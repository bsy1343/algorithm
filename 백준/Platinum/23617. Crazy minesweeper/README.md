# [Platinum III] Crazy minesweeper - 23617

[문제 링크](https://www.acmicpc.net/problem/23617)

### 성능 요약

시간 제한: 1 초 (추가 시간 없음), 메모리 제한: 256 MB

### 통계

제출: 21, 정답: 4, 맞힌 사람: 4, 정답 비율: 22.222%

### 분류

애드 혹, 브루트포스 알고리즘, 그리디 알고리즘, 구현, 시뮬레이션

### 문제 설명

<p>In this problem, we will be playing a popular game, &lt;&lt;Minesweeper&gt;&gt;.</p>

<p>The game takes place on a rectangular field with $H \times W$ cells. $K$ mines are randomly placed in the cells of the field, and their locations are unknown to the player. The goal is to find the mines safely.</p>

<p>Initially, all cells are &lt;&lt;closed&gt;&gt;. The player can &lt;&lt;open&gt;&gt; any cell in the field. If there is a mine in the opened cell, the game ends. Otherwise, the player is informed about the number of mines in the cells adjacent to that cell by their sides or corners. The game ends  when precisely $K$ cells remain closed in the field --- i.e. the cells containing mines.</p>

<p>Often, the available information is insufficient to determine the precise location of the mines. In these cases, the player has to guess and tries to open a cell which may contain a mine. To minimize the effect of these dangerous situations, the player can make up to six mistakes by opening a cell with mine. On opening such cell, the player is informed about the mine, the cell remains closed, and the game continues. If you open a mine-containing cell for the seventh time, you will lose.</p>

<p>The game fields are generated randomly in the following manner. The jury defines the field size $W$ by $H$, the number of mines $K$ and the magic number $S$. After that, the following pseudorandom sequence of integers is generated: $$ T_0 = S $$ $$ T_{i+1} = (48\,271 * T_i) \,\operatorname{mod}\, 2\,147\,483\,647 $$</p>

<p>Then the mine locations are obtained from this sequence. Its elements $T_1$, $T_2$, $T_3$, $\ldots$ are iterated in order. For each element $T_i$, the row index $r_i$ and the column index $c_i$ are obtained using formulas: $$ r_i = \left\lfloor \frac{T_i}{W} \right\rfloor \,\operatorname{mod}\, H     \qquad c_i = T_i \,\operatorname{mod}\, W, $$ and the mine is set into the corresponding cell, if it is not yet there. The process of setting mines ends as soon as the number of mines becomes equals to $K$.</p>

<p>The rows and colums are numbered from zero.</p>

### 입력



### 출력



### 힌트

<p>The fully uncovered field in the sample (which is also the first test) is:</p>

<pre>
X2223X20013X310011100123211XXX
24XX3X2001XXX2122X2111XXX22343
X4X32111235X43X5X43X34443X23X3
X3110113XX3X34XXXX33XXX334X5XX
110112X4X4322XX654X334XX2XXX5X
0001X22X23X323XX2X4X212222334X
1112211112XX1234323X20122101X3
X33X2221135533X3X222112XX2012X
2XX33XX22XXXX3X313X201X6X42121
234X445X335X442213X2013XXX2X10
X22X4XX22X33X3X11X22124X633232
X3325X4112X34X312221X3XX3X12XX
3X2X4X41124X4X323X113X534333X3
X2214XX22X3X312XX3203X5X4XX211
11014X53X22121223X102X4X4X4200
0001XX3X21001X101110112122X100
</pre>