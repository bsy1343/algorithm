# [Gold V] Rig Placement - 5140

[문제 링크](https://www.acmicpc.net/problem/5140)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 45, 정답: 25, 맞힌 사람: 21, 정답 비율: 51.220%

### 분류

다이나믹 프로그래밍, 배낭 문제

### 문제 설명

<p>Once we&rsquo;ve found where the oil is (and &mdash; beyond what you solved in the previous question &mdash; also how much oil there is in different places), the next question is where to place oil rigs so that after the rig explodes, we can spill as much oil as possible. This is actually not completely trivial.</p>

<p>We can model the problem as follows: There are 1 &le; n &le; 100 oil fields we may want to exploit. For each of the oil fields, we can decide how much money to invest in that oil field, in increments of million dollars, from 0&ndash;m. (m is the maximum investment per oil field.) For each oil field 1 &le; i &le; n, and each amount of money j &isin; {0, 1, 2,... ,m}, a table a[i,j] of non-negative real numbers tells us how much oil we will get. The table entries are non-decreasing in j (more money means at least as much oil as before), but other than that, they may be arbitrary. The total budget available for rigs is an integer 0 &le; B &le; 100 (again, in increments of millions of dollars). You are to calculate the maximum total amount of oil you can extract with your budget.</p>

### 입력

<p>The first line is the number K of input data sets, followed by the K data sets, each of the following form:</p>

<p>The first line contains three integers n,m,B, the number of oil fields, the maximum investment per oil field, and the total budget.</p>

<p>This is followed by n lines, each consisting of m + 1 non-negative floating point numers, where the jth number is the amount of oil you would extract from the ith oil field if you invested j million dollars in it.</p>

### 출력

<p>For each data set, output &ldquo;Data Set x:&rdquo; on a line by itself, where x is its number. On the next line, output the maximum total amount of oil you can extract from the oil fields together under the given constraints, rounded to two decimals. Each data set should be followed by a blank line.</p>