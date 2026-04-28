# [Gold IV] SEGWAY - 17148

[문제 링크](https://www.acmicpc.net/problem/17148)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 512 MB

### 통계

제출: 12, 정답: 12, 맞힌 사람: 12, 정답 비율: 100.000%

### 분류

다이나믹 프로그래밍, 정렬

### 문제 설명

<p>There is a Segway race in the city of Dubrovnik. The race track consists of three sections, each of which is 100 meters long &ndash; therefore, the total length of the track is 300 meters. Based on the limitations of her/his Segway battery, each rider has a strategy: the speed at which he rides on the first 100 meters, the speed on the next 100 meters, and the speed on the last 100 meters, except when allowed to speed up the Segway to the maximum speed (explained in the next paragraph). Unfortunately, the Segways are very slow, taking between 1 and 50 seconds for each meter. Therefore, the speeds in this task are given in seconds per meter (instead of meters per second).</p>

<p>Along the track there are several acceleration points (accelerators). When a rider reaches an accelerator, his Segway gets extra power to ride at the maximum speed of 1 second per meter for the next X mod 20 meters, where X is the number of riders strictly ahead of him at the moment he reached the accelerator (including those who have already completed the race). The rider is unable to use another accelerator before he has spent all extra power from the previous accelerator. At that moment, if there are no new accelerators, the rider continues to move at his default speed for the corresponding track section.</p>

<p>Assume that a rider will always use an available accelerator, even if it might not be the optimal strategy. An accelerator can be use by multiple riders, even at the same time. Your task is to write a program that simulates this race. Assuming that all Segway riders start at the same time, print the finish time for each rider in seconds.</p>

### 입력

<p>The first line contains an integer N (2 &le; N &le; 20 000), the number of riders.</p>

<p>The K<sup>th</sup> of the following N lines contains three integers between 1 and 50: the default speed of the K<sup>th</sup> rider on the first 100 meters, the next 100 meters, and the last 100 meters of the track.</p>

<p>The next line contains an integer M (0 &le; M &le; 299), the number of acceleration points.</p>

<p>If M &gt; 0, the following line contains a strictly increasing sequence of M integers between 1 and 299: the distances of the accelerators from the beginning of the track in meters</p>

### 출력

<p>You should print N lines, where the K<sup>th</sup> line contains the required time for the K<sup>th</sup> rider.</p>