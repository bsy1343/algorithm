# [Gold I] Partitioning for fun and profit - 1820

[문제 링크](https://www.acmicpc.net/problem/1820)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 128 MB

### 통계

제출: 70, 정답: 20, 맞힌 사람: 17, 정답 비율: 32.075%

### 분류

수학, 다이나믹 프로그래밍, 조합론

### 문제 설명

<p>A partition of a positive integer number&nbsp;<em>m</em>&nbsp;into&nbsp;<em>n</em>&nbsp;elements (<em>n</em>&nbsp;&le;&nbsp;<em>m</em>) is a sequence of positive numbers&nbsp;<em>a<sub>1</sub></em>,...,<em>a<sub>n</sub></em>&nbsp;such that&nbsp;<em>a<sub>1</sub></em>+...+<em>a<sub>n</sub></em>&nbsp;=&nbsp;<em>m</em>&nbsp;and&nbsp;<em>a<sub>1</sub></em>&nbsp;&le;&nbsp;<em>a<sub>2</sub></em>&nbsp;&le;&nbsp;...&nbsp;&le;&nbsp;<em>a<sub>n</sub></em>. Your task is to find a partition of a number&nbsp;<em>m</em>&nbsp;which occupies the&nbsp;<em>k</em>-th position in the lexicographically ordered sequence of all partitions of&nbsp;<em>m</em>&nbsp;into&nbsp;<em>n</em>&nbsp;elements.</p>

<p>The lexicographic ordering among the partitions of a number is defined as follows. For two partitions&nbsp;<em>a</em>&nbsp;and&nbsp;<em>b</em>&nbsp;of&nbsp;<em>m</em>&nbsp;into&nbsp;<em>n</em>&nbsp;elements such that&nbsp;<em>a</em>&nbsp;=&nbsp;[<em>a<sub>1</sub></em>,...,<em>a<sub>n</sub></em>] and&nbsp;<em>b</em>&nbsp;=&nbsp;[<em>b<sub>1</sub></em>,...,<em>b<sub>n</sub></em>] we have&nbsp;<em>a</em>&nbsp;&nbsp;&lt;&nbsp;&nbsp;<em>b</em>&nbsp;if and only if there exists an 1&nbsp;&le;&nbsp;<em>i</em>&nbsp;&le;&nbsp;<em>n</em>&nbsp;such that for all&nbsp;<em>j</em>&nbsp;&lt;&nbsp;<em>i</em>&nbsp;we have&nbsp;<em>a<sub>j</sub></em>&nbsp;=&nbsp;<em>b<sub>j</sub></em>&nbsp;and&nbsp;<em>a<sub>i</sub></em>&nbsp;&lt;&nbsp;<em>b<sub>i</sub></em>. The sequence of all partitions is ordered in increasing lexicographic order and at the first we have the following sequence 1, 1,&nbsp;...&nbsp;1,&nbsp;<em>m</em>-<em>n</em>+1.</p>

### 입력

<p>The first line of input contains a number&nbsp;<em>c</em>&nbsp;giving the number of cases that follow. Each of the subsequent&nbsp;<em>c</em>&nbsp;lines contains three numbers: 1&nbsp;&le;&nbsp;<em>m</em>&nbsp;&le;&nbsp;<em>220</em>, 1&nbsp;&le;&nbsp;<em>n</em>&nbsp;&le;&nbsp;<em>10</em>&nbsp;and 1&nbsp;&le;&nbsp;<em>k</em>&nbsp;which is not bigger than the number of partitions of&nbsp;<em>m</em>&nbsp;into&nbsp;<em>n</em>&nbsp;elements.</p>

### 출력

<p>For each input data set print the&nbsp;<em>k</em>-th partition of&nbsp;<em>m</em>&nbsp;into&nbsp;<em>n</em>&nbsp;elements. Each element of a partition is to be printed in a separate line.</p>