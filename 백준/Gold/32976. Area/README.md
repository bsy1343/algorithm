# [Gold III] Area - 32976

[문제 링크](https://www.acmicpc.net/problem/32976)

### 성능 요약

시간 제한: 1 초 (추가 시간 없음), 메모리 제한: 2048 MB

### 통계

제출: 4, 정답: 3, 맞힌 사람: 3, 정답 비율: 75.000%

### 분류

수학

### 문제 설명

<p>A square field has been divided into $N^2$ rectangular plots by drawing $(N-1)$ vertical and $(N-1)$ horizontal lines. The rows of plots are numbered $1 \ldots N$ from bottom to top and the columns $1 \ldots N$ from left to right, as shown on the figures below (the figures are not to scale).</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/32976.%E2%80%85Area/9353cf03.jpg" data-original-src="https://boja.mercury.kr/assets/problem/32976-1.jpg" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 446px; height: 200px;"></p>

<p>The plots located at the intersection of the $i$-th column and the $i$-th row (for $1 \le i \le N$) are called the <em>long diagonal</em>. The plots located at the intersection of the $(i+1)$-st column and the $i$-th row (for $1 \le i \le N-1$) are called the <em>short diagonal</em>.</p>

<p>You know the areas of the plots on the long and short diagonals. Calculate the area of the plot at the intersection of the $X$-th column and the $Y$-th row.</p>

### 입력

<p>The first line contains the integer $N$ ($2 \le N \le 1\,000$).</p>

<p>The second line contains $N$ integers $A_1, A_2, \dots, A_N$ ($1 \le A_i \le 10^9$) --- the areas of the plots on the long diagonal.</p>

<p>The third line contains $N-1$ integers $B_1, B_2, \dots, B_{N-1}$ ($1 \le B_i \le 10^9$) --- the areas of the plots on the short diagonal.</p>

<p>The fourth line contains two integers $X$ and $Y$ ($1 \le X, Y \le N$) --- the coordinates of the plot whose area should be calculated.</p>

### 출력

<p>Output the area $S$ of the plot located at the intersection of the $X$-th column and the $Y$-th row. The answer should be represented as a sequence of lines, each containing two integers $P_i$ and $S_i$. The numbers $P_i$ must be distinct primes. The numbers $S_i$ must be non-zero integers such that $$ S = P_1^{S_1} \cdot P_2^{S_2} \cdot P_3^{S_3} \cdot \ldots \cdot P_k^{S_k}, $$ where $k$ is the number of lines in the answer. The lines must be listed in increasing order of $P_i$. (Recall that an integer $P$ is considered prime if it has exactly two positive integer divisors: $1$ and $P$.)</p>

<p>If $S = 1$, then output it as a single line "<code>1 1</code>".</p>