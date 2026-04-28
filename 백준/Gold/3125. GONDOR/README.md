# [Gold IV] GONDOR - 3125

[문제 링크](https://www.acmicpc.net/problem/3125)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 50, 정답: 32, 맞힌 사람: 28, 정답 비율: 68.293%

### 분류

구현, 그래프 이론, 자료 구조, 기하학, 시뮬레이션, 최단 경로, 데이크스트라, 우선순위 큐, 피타고라스 정리

### 문제 설명

<p>The legendary land of Gondor had a network of sparks to quickly alert the entire land of an emergency.</p>

<p>Every spark is manned by an archer with several arrows and instruction in which order to light the other sparks.&nbsp;</p>

<p>More precisely, when his own spark is lit, the archer next to it lights his arrows and shoots one at every other spark that has not yet been lit, in the order in which his instructions say. The archer does so until he is out of arrows (or sparks to shoot at). The archers are very precise so every arrow hits its target. The time for an arrow to travel some distance is equal to that distance, while the time for anarcher to shoot all his arrows is negligible.&nbsp;</p>

<p>Sauron&#39;s army is approaching Gondor so the spark at Minas Tirith has been lit.&nbsp;</p>

<p>Write a program that, given the layout of sparks in the coordinate plane, the number of arrows and instructions for every archer, calculates the time indices at which each of the sparks will be lit.&nbsp;</p>

### 입력

<p>The first line contains an integer N (1 &le; N &le; 100), the number of sparks. The sparks are numbered 1 to N. The spark in Minas Tirith, which has been lit at time 0, is spark number 1.&nbsp;</p>

<p>Each of the following N lines describes one spark. The description of one spark is composed of:&nbsp;</p>

<ul>
	<li>The integers X and Y (1 &le; X, Y &le; 1000), the coordinates of the spark;&nbsp;</li>
	<li>An integer S (1 &le; S &le; 100), the number of arrows;&nbsp;</li>
	<li>N&minus;1 distinct integers between 1 and N, the instructions for the archer. The instructions are the order in which, once his spark is lit, the archer will consider shooting arrows at other sparks. No number will appear more than once in the list, nor will an archer be instructed to shoot an arrow at his own spark.&nbsp;</li>
</ul>

<p>Note: The input will be such that no two sparks will be lit at the same time.&nbsp;</p>

### 출력

<p>Output N decimal numbers, each on a single line, the times at which the sparks light up, in order from spark 1 to N. Your output must be accurate to &plusmn;0.001.&nbsp;</p>