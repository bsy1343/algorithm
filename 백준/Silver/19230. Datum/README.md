# [Silver III] Datum - 19230

[문제 링크](https://www.acmicpc.net/problem/19230)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 512 MB

### 통계

제출: 88, 정답: 45, 맞힌 사람: 23, 정답 비율: 44.231%

### 분류

구현, 브루트포스 알고리즘

### 문제 설명

<p>The exam season at University of Zagreb is over and students are doing what they love the most &ndash; sleeping. In the rare moments of wakefulness, they usually scroll over their Instagram feed. Fabijan is one of those students.</p>

<p>Recently, he read the following caption &ndash; the date <code>02.02.2020.</code> is the first palindromic date in the last 909 years.</p>

<p>He realized the caption was incorrect and this made him wonder about palindromic dates so he asked himself for each of the N dates what is the first palindromic date that comes after that date. The date is considered palindromic if , when disregarding the dots, it is the same when read from left-to-right as if it was read from right-to-left. For example, dates <code>02.02.2020.</code> and <code>12.10.0121.</code> are palindromic, while <code>03.02.2020.</code> and <code>12.07.1993.</code> are not.</p>

<p>Note: In this task it is important to take account of leap years which have 29 days in February. For the purposes of this task, we consider a year to be a leap year if it is divisible by 4. Otherwise, months have 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30 and 31 days in order.</p>

### 입력

<p>The first line contains an integer N (1 &le; N &le; 10 000) from the task description.</p>

<p>The next N lines contain a valid date in format <code>DD.MM.YYYY.</code></p>

### 출력

<p>For each date from the input, you should output the first palindromic date that comes strictly after it. That date should be printed in the DD.MM.YYYY. and we guarantee that the solution exists in this format.</p>