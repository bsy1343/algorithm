# [Gold I] Futon - 13810

[문제 링크](https://www.acmicpc.net/problem/13810)

### 성능 요약

시간 제한: 8 초 (추가 시간 없음), 메모리 제한: 512 MB

### 통계

제출: 24, 정답: 15, 맞힌 사람: 15, 정답 비율: 65.217%

### 분류

구현, 자료 구조, 그래프 이론, 그래프 탐색, 집합과 맵, 너비 우선 탐색, 깊이 우선 탐색, 해시를 사용한 집합과 맵, 트리를 사용한 집합과 맵, 이분 그래프

### 문제 설명

<p>The sales department of Japanese Ancient Giant Corp. is visiting a hot spring resort for their recreational trip. For deepening their friendships, they are staying in one large room of a Japanese-style hotel called a ryokan.</p>

<p>In the ryokan, people sleep in Japanese-style beds called futons. They all have put their futons on the floor just as they like. Now they are ready for sleeping but they have one concern: they don&rsquo;t like to go into their futons with their legs toward heads &mdash; this is regarded as a bad custom in Japanese tradition. However, it is not obvious whether they can follow a good custom. You are requested to write a program answering their question, as a talented programmer.</p>

<p>Here let&rsquo;s model the situation. The room is considered to be a grid on an xy-plane. As usual, x-axis points toward right and y-axis points toward up. Each futon occupies two adjacent cells. People put their pillows on either of the two cells. Their heads come to the pillows; their foots come to the other cells. If the cell of some person&rsquo;s foot becomes adjacent to the cell of another person&rsquo;s head, regardless their directions, then it is considered as a bad case. Otherwise people are all right.</p>

### 입력

<p>The input is a sequence of datasets. Each dataset is given in the following format:</p>

<pre>
n 
x<sub>1</sub> y<sub>1</sub> dir<sub>1</sub> 
.. . 
x<sub>n</sub> y<sub>n</sub> dir<sub>n</sub></pre>

<p>n is the number of futons (1 &le; n &le; 20, 000); (x<sub>i</sub> ,y<sub>i</sub>) denotes the coordinates of the left-bottom corner of the i-th futon; diri is either &lsquo;x&rsquo; or &lsquo;y&rsquo; and denotes the direction of the i-th futon, where &lsquo;x&rsquo; means the futon is put horizontally and &lsquo;y&rsquo; means vertically. All coordinate values are non-negative integers not greater than 10<sup>9</sup> .</p>

<p>It is guaranteed that no two futons in the input overlap each other.</p>

<p>The input is terminated by a line with a single zero. This is not part of any dataset and thus should not be processed.</p>

### 출력

<p>For each dataset, print &ldquo;Yes&rdquo; in a line if it is possible to avoid a bad case, or &ldquo;No&rdquo; otherwise.</p>