# [Platinum V] Tatami - 22622

[문제 링크](https://www.acmicpc.net/problem/22622)

### 성능 요약

시간 제한: 8 초 (추가 시간 없음), 메모리 제한: 512 MB

### 통계

제출: 13, 정답: 8, 맞힌 사람: 8, 정답 비율: 66.667%

### 분류

다이나믹 프로그래밍, 백트래킹

### 문제 설명

<p>A tatami mat, a Japanese traditional floor cover, has a rectangular form with aspect ratio 1:2. When spreading tatami mats on a floor, it is prohibited to make a cross with the border of the tatami mats, because it is believed to bring bad luck.</p>

<p>Your task is to write a program that reports how many possible ways to spread tatami mats of the same size on a floor of given height and width.</p>

### 입력

<p>The input consists of multiple datasets. Each dataset cosists of a line which contains two integers&nbsp;<i>H</i>&nbsp;and&nbsp;<i>W</i>&nbsp;in this order, separated with a single space.&nbsp;<i>H</i>&nbsp;and&nbsp;<i>W</i>&nbsp;are the height and the width of the floor respectively. The length of the shorter edge of a tatami mat is regarded as a unit length.</p>

<p>You may assume 0 &lt;&nbsp;<i>H</i>,&nbsp;<i>W</i>&nbsp;&le; 20.</p>

<p>The last dataset is followed by a line containing two zeros. This line is not a part of any dataset and should not be processed.</p>

### 출력

<p>For each dataset, print the number of possible ways to spread tatami mats in one line.</p>