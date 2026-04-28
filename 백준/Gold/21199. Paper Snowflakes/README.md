# [Gold III] Paper Snowflakes - 21199

[문제 링크](https://www.acmicpc.net/problem/21199)

### 성능 요약

시간 제한: 5 초, 메모리 제한: 1024 MB

### 통계

제출: 17, 정답: 14, 맞힌 사람: 14, 정답 비율: 82.353%

### 분류

자료 구조, 정렬, 이분 탐색, 누적 합, 스위핑, 우선순위 큐

### 문제 설명

<p>To make a paper snowflake, you fold a sheet of paper in various places and then cut some parts out of the folded sheet. When you unfold the sheet, it can make a very nice pattern. That is, if the folds and cuts are chosen well.</p>

<p>Samantha has recently taken up this hobby but with a &quot;modern art&quot; twist. To get started, she explores folding a strip of paper that is $L$ picometres long (Samantha likes to measure her folds and cuts very precisely). She places it on the real line with one end at $0$ and the other at $L$. The left end at point $0$ is affixed to this point, the other endpoint at position $L$ is the <em>loose</em> endpoint.</p>

<p>She then performs a series of folds. For the first fold, Samantha creases the paper $f_1$ picometres from the loose end and folds the loose end over this fold. The loose end is now pointing towards the left. For the second fold, she then creases the top portion of the paper $f_2$ picometres from the loose end ($f_2 &lt; f_1$) and folds the top portion of the paper over this point back to the right over this crease point. The loose end is now pointing towards the right.</p>

<p>She alternates folding back-and-forth this way. At each step, she creases the top portion of the paper $f_i$ picometres from the loose end ($f_i &lt; f_{i-1}$) and folds the loose end over the crease.</p>

<p>She will now cut the paper at $M$ distinct locations, which will split the paper into $M+1$ piles. Each of the piles will have zero or more layers of paper in it. The figure below depicts the folded paper from the first sample input, the cuts (solid lines), and the $x$-locations of where the paper was folded (dashed lines).</p>

<p>What is the total length of paper in each of the $M+1$ piles?</p>

<p style="text-align: center;"><img alt="" src="https://upload.acmicpc.net/262fe3a4-1258-4754-af9c-c80667be487b/-/preview/" style="width: 558px; height: 271px;" /></p>

### 입력

<p>The first line of input consists of three integers $N$ ($1 \leq N \leq 10^5$), which is the number of folds, $M$ ($1 \leq M \leq 10^5$), which is the number of cuts, and $L$ ($2 \leq L \leq 10^{18}$), which is the length of the paper in picometres.</p>

<p>The second line describes the folds. This line contains $N$ integers $f_1, f_2, \ldots, f_N$, indicating that the $i^\textrm{th}$ fold occurred $f_i$ picometres from the loose end. These values satisfy $1 \leq f_N &lt; f_{N-1} &lt; \cdots &lt; f_1 &lt; L$.</p>

<p>The third line describes the cuts. This line contains $M$ integers $c_1, c_2, \ldots, c_M$, indicating that the $i^\textrm{th}$ cut is $c_i$ picometres from the affixed point. These values satisfy $-10^{18} \leq c_1 &lt; c_2 &lt; \cdots &lt; c_M \leq 10^{18}$.</p>

### 출력

<p>Output the total length of paper in each of the $M+1$ piles, in order from left to right.</p>