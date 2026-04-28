# [Silver V] Margaret’s Minute Minute Manipulation - 11287

[문제 링크](https://www.acmicpc.net/problem/11287)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 256 MB

### 통계

제출: 153, 정답: 92, 맞힌 사람: 80, 정답 비율: 60.606%

### 분류

수학, 구현, 사칙연산

### 문제 설명

<p>Margaret has always been a good maths student. She has been trying to apply the principles of binary quantum refraction to time travel in her free time. By encoding time in a binary format and adding a non negative time difference, &delta;, she is hoping to create a singularity in the fabric of space and time allowing one to jump by the amount &delta; into the future.</p>

<p>Time&rsquo;s usual representation is the well known 24h format - e.g. 03:14:15. Although there is several possible ways to represent time in a binary form, the convention used throughout this exercise is as follows.</p>

<p style="text-align:center"><img alt="" src="%EB%B0%B1%EC%A4%80/Silver/11287.%E2%80%85Margaret%E2%80%99s%E2%80%85Minute%E2%80%85Minute%E2%80%85Manipulation/fc1b6c2a.png" data-original-src="https://onlinejudgeimages.s3-ap-northeast-1.amazonaws.com/problem/11287/1.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:115px; width:337px" /></p>

<p style="text-align:center">Figure 1: Binary Clock Format of time 03:14:15.</p>

<p>A 4 &times; 6 matrix can be used to represent time in a binary format. Each decimal digit of the 24h format is encoded separately using 4 bits. The decimal digits are encoded in binary with the most significant bit on top, and the least significant at the bottom. For instance, the decimal number 3<sub>10</sub> can be represented as 0011<sub>2</sub> in a 4-digit binary format, i.e. (0 &times; 2<sup>3</sup>) + (0 &times; 2<sup>2</sup>) + (1 &times; 2<sup>1</sup>) + (1 &times; 2<sup>0</sup>) = 3.</p>

<p>Provided a time of day T and a time difference &delta;, both in the Binary Clock format, you are to compute the time of day resulting from their summation, i.e. T + &delta;.</p>

### 입력

<p>The first 4 lines represent the time of day and the subsequent 4 lines represent the time delta. Both clocks are guaranteed to be a valid time ranging from 00:00:00 to 23:59:59 inclusively. We further assume a naive implementation of time in which we do not care about time zones, leap seconds, nor the shifting effects of daylight saving time.</p>

### 출력

<p>The output should consist of the resulting time (T +&delta;) in the 4&times;6 matrix Binary Clock format. This should immediately be followed by a newline.</p>