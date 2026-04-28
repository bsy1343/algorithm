# [Silver V] Infected Computer - 22614

[문제 링크](https://www.acmicpc.net/problem/22614)

### 성능 요약

시간 제한: 8 초 (추가 시간 없음), 메모리 제한: 512 MB

### 통계

제출: 82, 정답: 66, 맞힌 사람: 60, 정답 비율: 82.192%

### 분류

구현, 정렬, 시뮬레이션

### 문제 설명

<p>Adam Ivan is working as a system administrator at Soy Group, Inc. He is now facing at a big trouble: a number of computers under his management have been infected by a computer virus. Unfortunately, anti-virus system in his company failed to detect this virus because it was very new.</p>

<p>Adam has identified the first computer infected by the virus and collected the records of all data packets sent within his network. He is now trying to identify which computers have been infected. A computer is infected when receiving any data packet from any infected computer. The computer is not infected, on the other hand, just by sending data packets to infected computers.</p>

<p>It seems almost impossible for him to list all infected computers by hand, because the size of the packet records is fairly large. So he asked you for help: write a program that can identify infected computers.</p>

### 입력

<p>The input consists of multiple datasets. Each dataset has the following format:</p>

<pre>
<i>N M</i>
<i>t</i><sub>1</sub> <i>s</i><sub>1</sub> <i>d</i><sub>1</sub>
<i>t</i><sub>2</sub> <i>s</i><sub>2</sub> <i>d</i><sub>2</sub>
...
<i>t<sub>M</sub> s<sub>M</sub> d<sub>M</sub></i></pre>

<p><i>N</i>&nbsp;is the number of computers;&nbsp;<i>M</i>&nbsp;is the number of data packets;&nbsp;<i>t<sub>i</sub></i>&nbsp;(1 &le;&nbsp;<i>i</i>&nbsp;&le;&nbsp;<i>M</i>) is the time when the&nbsp;<i>i</i>-th data packet is sent;&nbsp;<i>s<sub>i</sub></i>&nbsp;and&nbsp;<i>d<sub>i</sub></i>&nbsp;(1 &le;&nbsp;<i>i</i>&nbsp;&le;&nbsp;<i>M</i>) are the source and destination computers of the&nbsp;<i>i</i>-th data packet respectively. The first infected computer is indicated by the number 1; the other computers are indicated by unique numbers between 2 and&nbsp;<i>N</i>.</p>

<p>The input meets the following constraints: 0 &lt;&nbsp;<i>N</i>&nbsp;&le; 20000, 0 &le;&nbsp;<i>M</i>&nbsp;&le; 20000, and 0 &le;&nbsp;<i>t<sub>i</sub></i>&nbsp;&le; 10<sup>9</sup>&nbsp;for 1 &le;&nbsp;<i>i</i>&nbsp;&le;&nbsp;<i>N</i>; all&nbsp;<i>t<sub>i</sub></i>&nbsp;&#39;s are different; and the source and destination of each packet are always different.</p>

<p>The last dataset is followed by a line containing two zeros. This line is not a part of any dataset and should not be processed.</p>

### 출력

<p>For each dataset, print the number of computers infected by the computer virus.</p>