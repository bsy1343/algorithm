# [Gold II] Pimp My Ride - 7533

[문제 링크](https://www.acmicpc.net/problem/7533)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 13, 정답: 7, 맞힌 사람: 4, 정답 비율: 57.143%

### 분류

다이나믹 프로그래밍, 비트마스킹, 비트필드를 이용한 다이나믹 프로그래밍

### 문제 설명

<p>Today, there are quite a few cars, motorcycles, trucks and other vehicles out there on the streets that would seriously need some refurbishment. You have taken on this job, ripping off a few dollars from a major TV station along the way.</p>

<p>Of course, there&rsquo;s a lot of work to do, and you have decided that it&rsquo;s getting too much. Therefore you want to have the various jobs like painting, interior decoration and so on done by garages. Unfortunately, those garages are very specialized, so you need different garages for different jobs. More so, they tend to charge you the more the better the overall appearance of the car is. That is, a painter might charge more for a car whose interior is all leather. As those &ldquo;surcharges&rdquo; depend on what job is done and which jobs have been done before, you are currently trying to save money by finding an optimal order for those jobs.</p>

<p>Individual jobs are numbered 1 through n. Given the base price p for each job and a surcharge s (in US\$) for every pair of jobs (i, j) with i &ne; j, meaning that you have to pay additional \$s for job i, if and only if job j was completed before, you are to compute the minimum total costs needed to finish all jobs.</p>

### 입력

<p>The first line contains the number of scenarios. For each scenario, an integer number of jobs n, 1 &le; n &le; 14, is given. Then follow n lines, each containing exactly n integers. The i-th line contains the surcharges that have to be paid in garage number i for the i-th job and the base price for job i. More precisely, on the i-th line, the i-th integer is the base price for job i and the j-th integer (j &ne; i) is the surcharge for job i that applies if job j has been done before. The prices will be non-negative integers smaller than or equal to 100000.</p>

### 출력

<p>The output for every scenario begins with a line containing &ldquo;Scenario #i:&rdquo;, where i is the number of the scenario starting at 1. Then print a single line:&nbsp;</p>

<p>&ldquo;You have officially been pimped for only \$p&rdquo;&nbsp;</p>

<p>with p being the minimum total price. Terminate the output for the scenario with a blank line.</p>