# [Gold III] Bus Ticket - 17981

[문제 링크](https://www.acmicpc.net/problem/17981)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 512 MB

### 통계

제출: 42, 정답: 15, 맞힌 사람: 12, 정답 비율: 33.333%

### 분류

이분 탐색, 다이나믹 프로그래밍, 누적 합

### 문제 설명

<p>Dang it! Your period ticket for the local Bus-Go-Onsystem (BGO) has expired. At first you wanted to buy a new period already today, but you suddenly realize that your next ticket would then expire a few days before your vacation starts, leaving a few trips you need to pay for individually anyways. Perhaps it is cheaper to pay for an individual trip now, allowing the next period ticket to cover more trips of the future?</p>

### 입력

<p>The first line of input contains four positive integers s, p, m, and n. s (1 &le; s &le; 10<sup>9</sup>) is the price of a single trip with the BGO, p (1 &le; p &le; 10<sup>9</sup>) is the price of a period ticket, m (1 &le; m &le; 10<sup>9</sup>) is the number of days the period ticket will cover, and n (1 &le; p &le; 10<sup>6</sup>) is the number of trips you plan to make in the future (until you die, and hence won&rsquo;t need to pay for any further trips).</p>

<p>On the second line follows n non-negative integers in non-decreasing order, t<sub>1</sub>, t<sub>2</sub>, . . . , t<sub>n</sub>, where t<sub>i</sub> (0 &le; t<sub>i</sub> &le; 10<sup>9</sup>) is the number of days until you will make your i-th trip with the BGO.</p>

### 출력

<p>The smallest possible cost of making the trips.</p>