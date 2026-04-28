# [Gold II] Lucky Controller - 7491

[문제 링크](https://www.acmicpc.net/problem/7491)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 9, 정답: 4, 맞힌 사람: 3, 정답 비율: 60.000%

### 분류

다이나믹 프로그래밍, 수학

### 문제 설명

<p>Egor works as a conductor in the bus. Each day he is given a pack of tickets which he then sells. Recently he has become interested about how many tickets in the pack are lucky. He thinks that the more tickets are lucky the luckier day he will have. Now he wants to find out how lucky for him the next day is going to be. Each ticket number consist of&nbsp;<strong>n</strong>&nbsp;digits. The ticket is considered to be lucky if the sum of the first&nbsp;<strong>n</strong>/<strong>2</strong>&nbsp;digits equals to the sum of the last&nbsp;<strong>n</strong>/<strong>2</strong>&nbsp;digits. Egor knows that the numbers in the pack that he will be given can start with equal probability from any number in the interval from&nbsp;<strong>a</strong>&nbsp;to&nbsp;<strong>b</strong>&nbsp;inclusively. The pack holds&nbsp;<strong>k</strong>&nbsp;tickets. The numbers of the tickets are consecutive. Help Egor to find an expected quantity of lucky tickets in the pack.</p>

### 입력

<p>The input file consists of a single line with three integers&nbsp;<strong>a</strong>,&nbsp;<strong>b</strong>&nbsp;and&nbsp;<strong>k</strong>&nbsp;(<strong>0</strong>&nbsp;&le;&nbsp;<strong>a</strong>&nbsp;&le;&nbsp;<strong>b</strong>&nbsp;&lt;&nbsp;<strong>10</strong><strong><sup>12</sup></strong>,&nbsp;<strong>1</strong>&nbsp;&le;&nbsp;<strong>k</strong>&nbsp;&le;&nbsp;<strong>100000</strong>). Integers&nbsp;<strong>a</strong>&nbsp;and&nbsp;<strong>b</strong>&nbsp;consist of same amount of digits, and this amount equals to the amount of digits in the number of each ticket. They may start with zeroes. The amount of digits in&nbsp;<strong>a</strong>&nbsp;and&nbsp;<strong>b</strong>&nbsp;is always even.</p>

### 출력

<p>Output the expected quantity of lucky tickets in the pack in the form of irreducible fraction. In case the result is an integer &ndash; no slash should appear in the output.</p>