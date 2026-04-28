# [Silver III] Lazyland - 16671

[문제 링크](https://www.acmicpc.net/problem/16671)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 86, 정답: 71, 맞힌 사람: 70, 정답 비율: 83.333%

### 분류

그리디 알고리즘, 정렬

### 문제 설명

<p>The kingdom of Lazyland is the home to n idlers. These idlers are incredibly lazy and create many problems to their ruler, the mighty King of Lazyland.</p>

<p>Today k important jobs for the kingdom (k &le; n) should be performed. Every job should be done by one person and every person can do at most one job. The King allowed every idler to choose one job they wanted to do and the i-th idler has chosen the job a<sub>i</sub>.</p>

<p>Unfortunately, some jobs may not be chosen by anyone, so the King has to persuade some idlers to choose another job. The King knows that it takes b<sub>i</sub> minutes to persuade the i-th idler. He asked his minister of labour to calculate the minimum total time he needs to spend persuading the idlers to get all the jobs done. Can you help him?</p>

### 입력

<p>The first line of the input contains two integers n and k (1 &le; k &le; n &le; 10<sup>5</sup>) &mdash; the number of idlers and the number of jobs.</p>

<p>The second line of the input contains n integers a<sub>1</sub>, a<sub>2</sub>, . . . , a<sub>n</sub> (1 &le; a<sub>i</sub> &le; k) &mdash; the jobs chosen by each idler.</p>

<p>The third line of the input contains n integers b<sub>1</sub>, b<sub>2</sub>, . . . , b<sub>n</sub> (1 &le; b<sub>i</sub> &le; 10<sup>9</sup>) &mdash; the time the King needs to spend to persuade the i-th idler.</p>

### 출력

<p>The only line of the output should contain one number &mdash; the minimum total time the King needs to spend persuading the idlers to get all the jobs done.</p>

### 힌트

<p>In the first example the optimal plan is to persuade idlers 1, 6, and 8 to do jobs 2, 4, and 6.</p>

<p>In the second example each job was chosen by some idler, so there is no need to persuade anyone.</p>