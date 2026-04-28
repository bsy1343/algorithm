# [Platinum III] Aunts - 23509

[문제 링크](https://www.acmicpc.net/problem/23509)

### 성능 요약

시간 제한: 7 초 (추가 시간 없음), 메모리 제한: 128 MB

### 통계

제출: 8, 정답: 4, 맞힌 사람: 4, 정답 비율: 80.000%

### 분류

(분류 없음)

### 문제 설명

<p>The organizing comittee of this contest is made from a bunch of slackers who&#39;s rather do anything than prepare a contest. As a result of this, $N$ of them reported that they have to bring some medicine to their aunt, so that they can get away without doing anything. All of their aunts live within a $A\times B$ matrix. They all report their absence to Dzoni, who takes a note of the cell that their aunt&#39;s house is located as well as the altitude it&#39;s located in. Dzoni doesn&#39;t know the actual altitudes, but he knows that in every two adjacent cells in the matrix, the absolute difference of their altitudes is <strong>exaclty</strong> 1. Having this in mind, after every claim made by a member of the organizing comittee he tries to reconstruct all the altitudes, meaning that he will check if its possible to assign each cell with an altitude so that all of the reports are true. If after some report, Dzoni is unable to reconstruct the altitudes (and since it&#39;s Dzoni, if it&#39;s possible, he&#39;ll be able to do it), it&#39;s obvious that the organizing comittee member that just made the report said something really stupid. Your job is to find the member who said something really stupid.</p>

### 입력

<p>In the first line of the input there are three integers $N$, $A$ and $B$ denoting the number of comittee members ($N\leq10^5$), the number of rows and the number of columns of the matrix ($A,B\leq10^9$).</p>

<p>In each of the following $N$ lines, there are three integers $R_i$, $C_i$ and $H_i$ denoting the row, column ($R_i\le A, C_i\le B$) and altitude ($1 \le H_i \le 10^8$) of the $i$-th organizing comittee&#39;s alleged aunt&#39;s house.</p>

### 출력

<p>In the first and only line write the index of the comittee member who said something really stupid (comittee members are indexed from $1$). If such a member doesn&#39;t exist, print &quot;bravo komisijo&quot; (meaning &quot;congratulations, ogranizing comittee&quot; in Serbian) without the quotation marks.</p>