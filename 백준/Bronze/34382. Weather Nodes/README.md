# [Bronze III] Weather Nodes - 34382

[문제 링크](https://www.acmicpc.net/problem/34382)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 2048 MB

### 통계

제출: 151, 정답: 105, 맞힌 사람: 102, 정답 비율: 69.388%

### 분류

사칙연산, 수학

### 문제 설명

<p>As part of a research initiative, a series of weather sensors have been put up all around the Mines campus. The idea is to help the local meteorologists more accurately track weather patterns along the front range by reporting precise temperature values at many different locations on the Mines campus.</p>

<p>The day comes when all the devices have been hooked together in a network, and you are tasked with compiling all the data and sending it to the local meteorologists. However, just as you are about to submit the data, something jumps out at you: some of the reported temperature values are way outside of the expected range! Some of the weather sensors must have been set up incorrectly, and are reporting erroneous outliers in the data.</p>

<p>It's too late to fix the sensors now, so you'll have to filter the erroneous readings out of the data you already have. Each temperature reading given is a real number representing the temperature in degrees Celsius as read by one of the weather sensors. All of the readings are taken at the same time. You note that all the correct temperature values are always within $10.0$ degrees of the average of all the values. Everything else must be an erroneous reading.</p>

<p>How many of the weather sensors have reported erroneous values?</p>

### 입력

<p>The first line of the input is an integer, $0 \leq N \leq 1\,000$ specifying the total number of weather sensors. The remaining $N$ lines each contain a single real number $-10\,000 \le f \le 10\,000$ with at most $5$ digits after the decimal point, representing the reading from a single weather sensor.</p>

<p>You are guaranteed that all valid readings will be at most $9.999$ away from the average and that all invalid readings will be at least $10.001$ away from the average.</p>

### 출력

<p>Print a single integer representing how many weather sensors gave erroneous readings.</p>