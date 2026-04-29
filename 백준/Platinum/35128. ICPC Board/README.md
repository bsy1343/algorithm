# [Platinum II] ICPC Board - 35128

[문제 링크](https://www.acmicpc.net/problem/35128)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 2048 MB

### 통계

제출: 47, 정답: 20, 맞힌 사람: 19, 정답 비율: 44.186%

### 분류

구현, 애드 혹

### 문제 설명

<p>As an archaeologist, you have discovered a rectangular wooden board in the ruins of an ancient city. The board is divided into a grid, and each grid cell appears to have been engraved originally with one of the letters ‘<code>C</code>’, ‘<code>I</code>’, and ‘<code>P</code>’. However, due to decay over time, some of the letters are now indistinguishable.</p>

<p>During your investigation, you made the following hypothesis: any square of $2 \times 2$ cells on the board originally had two ‘<code>C</code>’s, one ‘<code>I</code>’, and one ‘<code>P</code>’.</p>

<p>You now want to check whether this hypothesis is consistent with the discovered board. If it is, show one possibility of the original arrangement of the letters that aligns with the hypothesis.</p>

### 입력

<p>The input contains one or more test cases. The first line of the input contains an integer $t$ ($1 ≤ t ≤ 500$), which is the number of test cases. The descriptions of the $t$ test cases follow, each in the following format.</p>

<blockquote>
<p>$n$ $m$</p>

<p>$c_{1,1}$ $c_{1,2}$ $\cdots$ $c_{1,m}$</p>

<p>$c_{2,1}$ $c_{2,2}$ $\cdots$ $c_{2,m}$</p>

<p>$\vdots$</p>

<p>$c_{n,1}$ $c_{n,2}$ $\cdots$ $c_{n,m}$</p>
</blockquote>

<p>The first line of a test case contains two integers $n$ and $m$ ($2 ≤ n ≤ 1000$, $2 ≤ m ≤ 1000$). They represent the number of rows and columns of the board, respectively. The next $n$ lines, each containing $m$ characters, describe the discovered board. The $j$-th character of the $i$-th line, $c_{i,j}$, is one of ‘<code>C</code>’, ‘<code>I</code>’, ‘<code>P</code>’, and ‘<code>?</code>’. If $c_{i,j}$ is ‘<code>C</code>’, ‘<code>I</code>’, or ‘<code>P</code>’, the cell in row $i$ and column $j$ is identifiable as having that letter. If $c_{i,j}$ is ‘<code>?</code>’, the letter in that cell is indistinguishable.</p>

<p>The sum of $n$’s over all the test cases does not exceed $1000$. The same applies to $m$.</p>

### 출력

<p>For each test case, if the hypothesis is not consistent with the discovered board, output no in a single line. Otherwise, output yes in the first line, followed by $n$ lines representing one possibility of the original arrangement of the letters that aligns with the hypothesis. Each of these $n$ lines should contain m characters. The $j$-th character of the $i$-th line should be the letter in the cell in row $i$ and column $j$. If there are multiple possible arrangements, you may output any of them.</p>