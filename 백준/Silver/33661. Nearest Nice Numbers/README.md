# [Silver I] Nearest Nice Numbers - 33661

[문제 링크](https://www.acmicpc.net/problem/33661)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 2048 MB

### 통계

제출: 28, 정답: 17, 맞힌 사람: 12, 정답 비율: 63.158%

### 분류

그리디 알고리즘, 수학, 정렬

### 문제 설명

<p>While typical programming contests try to strike a balance between different types of problems (geometry, graphs, dynamic programming, number theory, strings, etc), at the User-Aligned Programming Competition (UAPC), the contestants decide in advance what types of problems they want to see by voting in a survey. The survey format is simple: each contestant picks their single favorite type of problem among $N$ options. Then, each problem type $i\in \{1,2,\dots ,N\}$ is assigned a number $x_i \in [0,1]$ based on what share of the votes it received. So, we must have $\sum_{i=1}^{N}{x_i=1}$.</p>

<p>Unfortunately, many of the $x_i$ values came back with an unsightly number of decimal places due to the extremely large number of survey responses, which is not suspicious at all. To fix this, your job is to replace each $x_i$ with an integer $f_i$ so that the fraction $\frac{f_i}{D}$ (for a given $D$) approximates $x_i$. You must pick the $f_i$ values in a way that minimizes $\sum_{i=1}^{N}{|D\cdot x_i - f_i|}$ and ensures that $\sum_{i=1}^{N}{f_i=D}$.</p>

### 입력

<p>The first line of input contains two integers $N$ ($2≤N≤10^5$) and $D$ ($1≤D≤10^9$) where $N$ is the number of problem types and $D$ is the denominator to use. Then $N$ lines follow, with line $i$ containing the single number $x_i$.</p>

### 출력

<p>Output the minimum possible value of $\sum_{i=1}^{N}{|D\cdot x_i- f_i|}$ over all choices of $f$. Answers with an absolute or relative error of at most $10^{-6}$ will be accepted.</p>