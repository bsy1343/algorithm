# [Platinum IV] Job Scheduling - 8124

[문제 링크](https://www.acmicpc.net/problem/8124)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 21, 정답: 13, 맞힌 사람: 12, 정답 비율: 66.667%

### 분류

그리디 알고리즘, 정렬

### 문제 설명

<p>We are given n&nbsp;independent and indivisible jobs numbered from 1&nbsp;to n. They should be executed sequentially in any order. The later the execution of a job starts the longer it lasts - precisely, the time of execution of the job i&nbsp;is h<sub>i</sub>(t) = a<sub>i</sub>t + b<sub>i</sub>, if we start it in the moment t. We assume that 0 &le; a<sub>i</sub> &le; 1, 0 &le; b<sub>i</sub> &le; 1.</p>

<p>The goal is to schedule the jobs so that the total execution time is the shortest.</p>

<p>Write a program that:</p>

<ul>
	<li>reads from the standard input the number of jobs n&nbsp;not greater than 10,000&nbsp;and successively - for each job i&nbsp;- the coefficients a<sub>i</sub>&nbsp;and b<sub>i</sub>&nbsp;determining the dependence of the job execution time upon the time it starts,</li>
	<li>finds such a scheduling of the jobs that the cumulative execution time is minimal; then the program writes to the standard output the numbers of the jobs in the order they should be executed.</li>
</ul>

### 입력

<ul>
	<li>In the first line of the standard input there is one positive integer not greater then 10,000. It is the number of jobs n.</li>
	<li>In each of the following n&nbsp;lines there is a pair of nonnegative real numbers. The numbers are written in a standard form with a decimal point and six digits after the point. The numbers are separated by a single space. It is the pair of coefficients a<sub>i</sub>&nbsp;and b<sub>i</sub>&nbsp;determining the dependence of the execution time of the corresponding i-th job upon the time it starts.</li>
</ul>

### 출력

<p>One should write in the standard output the scheduling of the jobs, i.e. an appropriate permutation of numbers 1, ..., n; one number per line.</p>