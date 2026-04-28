# [Gold IV] Contest Construction - 22925

[문제 링크](https://www.acmicpc.net/problem/22925)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 2048 MB (추가 메모리 없음)

### 통계

제출: 91, 정답: 56, 맞힌 사람: 53, 정답 비율: 67.949%

### 분류

다이나믹 프로그래밍, 정렬

### 문제 설명

<p>The ICPC NAC staff have written a number of problems and wish to construct a problem set out of them. Each problem has a positive difficulty rating.</p>

<p>A contest has a <em>Nice</em> difficulty distribution if, when the difficulties of the problems are sorted in ascending order, every problem after the second has a difficulty rating less than or equal to the sum of the difficulty ratings of the two problems immediately preceding that problem.</p>

<p>Given the difficulty ratings of a set of problems and the number of problems desired for the set, count the number of problem sets with <em>Nice</em> difficulty distributions. Two problem sets are distinct if and only if there is some problem in one problem set but not in the other. (Specifically, note that two problem sets are the same even if the problems are permuted.)</p>

### 입력

<p>The first line of input contains two integers $n$ ($3 \le n \le 50$) and $k$ ($3 \le k \le 18, k \le n$), where $n$ is the number of problems the judges have written, and $k$ is the number of problems they wish to put in the problem set.</p>

<p>Each of the next $n$ lines contains a single integer $d$ ($1 \le d \le 10^9$). These are the problem difficulties.</p>

### 출력

<p>Output a single integer, which is the number of possible problem sets with <em>Nice</em> difficulty distributions.</p>