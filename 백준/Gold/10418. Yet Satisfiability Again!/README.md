# [Gold IV] Yet Satisfiability Again! - 10418

[문제 링크](https://www.acmicpc.net/problem/10418)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 256 MB

### 통계

제출: 82, 정답: 21, 맞힌 사람: 19, 정답 비율: 36.538%

### 분류

비트마스킹, 브루트포스 알고리즘

### 문제 설명

<p>Alice recently started to work for a hardware design company and as a part of her job, she needs to identify defects in fabricated integrated circuits. An approach for identifying these defects boils down to solving a satisfiability instance. She needs your help to write a program to do this task.</p>

### 입력

<p>The first line of input contains a single integer, not more than 5, indicating the number of test cases to follow. The first line of each test case contains two integers n and m where 1 &le; n &le; 20 indicates the number of variables and 1 &le; m &le; 100 indicates the number of clauses. Then, m lines follow corresponding to each clause. Each clause is a disjunction of literals in the form Xi or &sim;Xi for some 1 &le; i &le; n, where &sim;Xi indicates the negation of the literal Xi. The &ldquo;or&rdquo; operator is denoted by a &lsquo;v&rsquo; character and is seperated from literals with a single space.</p>

### 출력

<p>For each test case, display satisfiable on a single line if there is a satisfiable assignment; otherwise display unsatisfiable.</p>