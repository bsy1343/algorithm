# [Gold IV] Tower - 14061

[문제 링크](https://www.acmicpc.net/problem/14061)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 64, 정답: 33, 맞힌 사람: 27, 정답 비율: 54.000%

### 분류

자료 구조, 스택

### 문제 설명

<p>City X consists of N buildings, ordered in a row from west to east and numbered from 1 to N. Each building has a different height &ndash; an integer number, respectively h<sub>1</sub>, h<sub>2</sub>, &hellip;, h<sub>N</sub>. The city government plans to build a tower, which will be in the same row as the buildings (it can be before the first building, between any two of the buildings or after the last building). The tower will broadcast messages to the citizens. The tower must have height H, which should be different from all other buildings&rsquo; heights.</p>

<p>Due to some strange engineering ideas, the tower will be able to broadcast signals only to the west (to the beginning of the buildings&rsquo; row). The signals are also strange &ndash; they are rays which travel horizontally (parallel to the ground, which we consider as a straight line) and are emitted out of the whole body of the tower (from the top to the bottom). Therefore, we can imagine that the tower radiates a continuous band of signals with width equal to the tower&rsquo;s height. When a ray hits a building, it stops. Each building receives the signals using a receiver located on its top. A building receives a message if at least one ray reaches its receiver.</p>

<p>In other words, a building numbered i will receive messages from the tower only when: the building i is to the west of the tower; i is not higher than the tower; and there is no other building j between them (j &gt; i), which is higher than building i.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/14061.%E2%80%85Tower/a5c37b95.png" data-original-src="https://onlinejudgeimages.s3.amazonaws.com/problem/14061/%EC%8A%A4%ED%81%AC%EB%A6%B0%EC%83%B7%202016-12-22%20%EC%98%A4%ED%9B%84%208.34.52.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:189px; width:580px" /></p>

<p>Look at the example in the figure above: the buildings, which are able to receive messages, are with numbers 2, 5, 6, and 9.</p>

<p>Write a program tower to determine the maximum number of buildings, which would receive messages. You will be given the row of buildings in the town (actually, their heights) and the height of the tower. Certainly, you have to consider the optimal placement for the tower.</p>

### 입력

<p>Two, space separated, positive integers are given on the first row of the standard input: N and H &ndash; the number of buildings and the height of the tower.</p>

<p>N, space separated, positive integers are input from the second row &ndash; the heights of the buildings in the town, ordered by the building numbers (from the first to the N-th)</p>

### 출력

<p>On a single row of the standard output print a single integer &ndash; the maximal number of buildings, which would receive messages, if the tower were built, assuming optimal placement.</p>

### 제한

<ul>
	<li>1 &le; N &le; 1 000 000;</li>
	<li>1 &le; height of each building and tower &le; 10<sup>9</sup></li>
</ul>

### 힌트

<p>Explanation: On the picture below, the optimal location of the tower is given. Messages are received by buildings with numbers 2, 5, 6, 7 and 8.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/14061.%E2%80%85Tower/8c8b168f.png" data-original-src="https://onlinejudgeimages.s3.amazonaws.com/problem/14061/%EC%8A%A4%ED%81%AC%EB%A6%B0%EC%83%B7%202016-12-22%20%EC%98%A4%ED%9B%84%208.36.18.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:196px; width:580px" /></p>