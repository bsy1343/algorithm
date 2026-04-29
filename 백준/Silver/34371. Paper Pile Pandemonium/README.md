# [Silver IV] Paper Pile Pandemonium - 34371

[문제 링크](https://www.acmicpc.net/problem/34371)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 2048 MB

### 통계

제출: 23, 정답: 21, 맞힌 사람: 15, 정답 비율: 88.235%

### 분류

구현, 스택, 자료 구조

### 문제 설명

<p>It's nearing the end of a busy semester, and you have piles of homework to finish. Literally. All of your homework was printed on sheets of paper (poor trees), which you laid out on your desk in a series of piles. As you were completing the assignments, you moved sheets of paper from the top of one pile to the top of another pile, and kept a diligent log as you did so to keep track of which assignments were completed.</p>

<p>Suddenly, you realize that some of your assignments are due in only in a few minutes, and you need to scan and turn them in now! Through all the shuffling you unfortunately lost track of where all the assignments are amongst the piles. However, your diligent log should let you determine where the assignments must be now. Can you write a program that can determine where all the assignments are now located?</p>

### 입력

<p>The first line of input contains two space-separated integers, $1 \leq N \leq 1\,000$ and $1 \leq P \leq 1\,000$, the number of sheets of paper, and the number of piles the sheets of paper are organized in, respectively. The next $P$ lines each begin with a single integer $0 \leq p_i \leq N$, indicating the number of sheets of paper that were initially in the $i^{\text{th}}$ pile. That integer is followed by a space and then $p_i$ space-separated integers in the range $[1, N]$ denoting, from left to right, the sheet numbers that appear in the pile from bottom to top. Note that sheet numbers will appear exactly once amongst all the piles, and that $\sum_{i=1}^{P} p_i = N$ (the sum of sheets in each pile is equal to the total number of sheets, $N$).</p>

<p>The next line contains a single integer, $0 \leq M \leq 1\,000$, the number of times sheets of paper were moved from one pile to another. The next $M$ lines each contain three space separated integers defining one such movement, $1 \leq s_i \leq P$, $1 \leq d_i \leq P$, and $1 \leq n_i \leq N$, the source pile number, the destination pile number, and the number of sheets of paper that were moved from the top of the source pile to the top of the destination pile, respectively. When the sheets are moved, they are lifted as a group off the top of the source pile, and placed on top of the destination pile without changing their order. Note also that for all $i$, $s_i \neq d_i$, and it is guaranteed that number of sheets in pile $s_i$ before the $i^{\text{th}}$ movement is greater than or equal to $n_i$.</p>

### 출력

<p>You should output $P$ lines, with the $i^\text{th}$ line containing zero or more space-separated integers denoting, from left to right, the sheet numbers that appear in the $i^\text{th}$ pile (from bottom to top) after all movements have occurred. If there are no sheets in a pile, output an empty line.</p>