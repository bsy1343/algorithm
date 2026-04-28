# [Gold IV] LIGNJA - 3263

[문제 링크](https://www.acmicpc.net/problem/3263)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 27, 정답: 19, 맞힌 사람: 19, 정답 비율: 73.077%

### 분류

다이나믹 프로그래밍

### 문제 설명

<p>Every day before Mirko goes to work, he connects to the Internet and reads mail from his boss that contains a list of Mirko&#39;s jobs for that day. Each job is defined by its starting time and duration.</p>

<p>Mirko&#39;s work shift lasts N minutes. When Mirko arrives to work, he starts processing his jobs. If there are more jobs he has to start working on at the same time, he can choose which one he will process and other jobs are will be processed by his co-workers. When he finishes one job, he read newspapers until next job starts. If Mirko is busy processing one job when another job starts, he will not process that other job not even after he finishes current one.</p>

<p>When more jobs are starting at the same time by choosing which job to process Mirko can increase amount of time he will be free to read newspapers.</p>

<p>Write a program that will help Mirko decide which jobs to process in order to maximize his free time.</p>

### 입력

<p>First line of the input file contains two integers: N and K, 1 &le; N &le; 10000, 1 &le; K &le; 10000. N represents how many minutes lasts Mirko&#39;s work shift. K represents number of jobs.</p>

<p>Each of the next K lines contains data about one job: integers P and T, meaning that job is starting in Pth minute and its duration is T minutes. 1 &le; P &le; N, 1 &le; P+T-1 &le; N.</p>

### 출력

<p>Write to the output file the maximum number of minutes Mirko can spend reading newspapers.</p>