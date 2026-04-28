# [Platinum II] Odometer - 10034

[문제 링크](https://www.acmicpc.net/problem/10034)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 101, 정답: 47, 맞힌 사람: 28, 정답 비율: 46.667%

### 분류

다이나믹 프로그래밍, 자릿수를 이용한 다이나믹 프로그래밍

### 문제 설명

<p>Farmer John&apos;s cows are on a road trip!  The odometer on their car displays an integer mileage value, starting at X (100 &lt;= X &lt;= 10^18) miles at the beginning of their trip and ending at Y (X &lt;= Y &lt;= 10^18) miles at the end of their trip.  Whenever the odometer displays an &apos;interesting&apos; number (including at the start and end of the trip) the cows will moo.  A number is &apos;interesting&apos; if when you look at all its digits except for leading zeros, at least half of these should be the same.  For example, the numbers 3223 and 110 are interesting, while the numbers 97791 and 123 are not.</p><p>Help FJ count how many times the cows will moo during the trip.</p>

### 입력

<ul><li>Line 1: The first line will contain two integers, X and Y, separated by a space.</li></ul>

### 출력

<ul><li>Line 1: A single integer containing how many times the cows will moo during the trip.</li></ul>

### 힌트

<h4>Input Details</h4><p>The trip starts with the odometer at 110 and ends at 133.</p><h4>Output Details</h4><p>The cows moo when the odometer reads 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 121, 122, 131, and 133.</p>