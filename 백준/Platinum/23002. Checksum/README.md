# [Platinum III] Checksum - 23002

[문제 링크](https://www.acmicpc.net/problem/23002)

### 성능 요약

시간 제한: 서브태스크 참고 (추가 시간 없음), 메모리 제한: 1024 MB (추가 메모리 없음)

### 통계

제출: 54, 정답: 34, 맞힌 사람: 29, 정답 비율: 65.909%

### 분류

그래프 이론, 최소 스패닝 트리

### 문제 설명

<p>Grace and Edsger are constructing a $N \times N$ boolean matrix $A$. The element in $i$-th row and $j$-th column is represented by $A_{i,j}$. They decide to note down the checksum (defined as bitwise XOR of given list of elements) along each row and column. Checksum of $i$-th row is represented as $R_i$. Checksum of $j$-th column is represented as $C_j$.</p>

<p>For example, if $N = 2$, $A = \begin{bmatrix} 1 &amp; 0 \\ 1 &amp; 1 \end{bmatrix}$, then $R = \begin{bmatrix} 1 &amp; 0 \end{bmatrix}$ and $C = \begin{bmatrix} 0 &amp; 1 \end{bmatrix}$.</p>

<p>Once they finished the matrix, Edsger stores the matrix in his computer. However, due to a virus, some of the elements in matrix $A$ are replaced with $-1$ in Edsger&#39;s computer. Luckily, Edsger still remembers the checksum values. He would like to restore the matrix, and reaches out to Grace for help. After some investigation, it will take $B_{i,j}$ hours for Grace to recover the original value of $A_{i,j}$ from the disk. Given the final matrix $A$, cost matrix $B$, and checksums along each row ($R$) and column ($C$), can you help Grace decide on the minimum total number of hours needed in order to restore the original matrix $A$?</p>

### 입력

<p>The first line of the input gives the number of test cases, $T$. $T$ test cases follow.</p>

<p>The first line of each test case contains a single integer $N$.</p>

<p>The next $N$ lines each contain $N$ integers representing the matrix $A$. $j$-th element on the $i$-th line represents $A_{i,j}$.</p>

<p>The next $N$ lines each contain $N$ integers representing the matrix $B$. $j$-th element on the $i$-th line represents $B_{i,j}$.</p>

<p>The next line contains $N$ integers representing the checksum of the rows. $i$-th element represents $R_i$.</p>

<p>The next line contains $N$ integers representing the checksum of the columns. $j$-th element represents $C_j$.</p>

### 출력

<p>For each test case, output one line containing&nbsp;<code>Case #x:&nbsp;y</code>, where $x$ is the test case number (starting from 1) and $y$&nbsp;is the minimum number of hours to restore matrix $A$.</p>

### 제한

<ul>
	<li>$1 \le T \le 100$.</li>
	<li>$-1 \le A_{i,j} \le 1$, for all $i$, $j$.</li>
	<li>$1 \le B_{i,j} \le 1000$, for $i$, $j$ where $A_{i,j} = -1$, otherwise $B_{i,j} = 0$.</li>
	<li>$0 \le R_i \le 1$, for all $i$.</li>
	<li>$0 \le C_j \le 1$, for all $j$.</li>
	<li>It is guaranteed that there exist at least one way to replace $-1$ in $A$ with $0$ or $1$ such that $R$ and $C$ as satisfied.</li>
</ul>

### 힌트

<p>In Sample Case #1, $A_{1,2}$ can be restored using the checksum of either 1-st row or 2-nd column. Hence, Grace can restore the matrix without spending any time to recover the data.</p>

<p>In Sample Case #2, Grace spends one hour to recover $A_{1,1}$. After that, she can use checksums of 1-st row and 1-st column to restore $A_{1,2}$ and $A_{2,1}$ respectively. And then she can use checksum of 2-nd row to restore $A_{2,2}$. Hence, Grace can restore the matrix by spending one hour.</p>

<p>In Sample Case #3, Grace can spend one hour to recover $A_{1,1}$ and another hour to recover $A_{2,2}$. After that, she can use checksum to restore the rest of the matrix. Hence, Grace can restore the matrix by spending two hours in total.</p>