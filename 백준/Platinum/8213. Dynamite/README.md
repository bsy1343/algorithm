# [Platinum I] Dynamite - 8213

[문제 링크](https://www.acmicpc.net/problem/8213)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 128 MB

### 통계

제출: 155, 정답: 54, 맞힌 사람: 34, 정답 비율: 33.333%

### 분류

이분 탐색, 다이나믹 프로그래밍, 트리에서의 다이나믹 프로그래밍, 그리디 알고리즘, 매개 변수 탐색, 트리

### 문제 설명

<p>The Byteotian Cave is composed of n chambers and n-1 corridors that connect them. For every pair of chambers there is unique way to move from one of them to another without leaving the cave. Dynamite charges are set up in certain chambers. A fuse is laid along every corridor. In every chamber the fuses from the adjacent corridors meet at one point, and are further connected to the dynamite charge if there is one in the chamber. It takes exactly one unit of time for the fuse between two neighbouring chambers to burn, and the dynamite charge explodes in the instant that fire reaches the chamber it is inside.</p>

<p>We would like to light the fuses in some m chambers (at the joints of fuses) in such a way that all the dynamite charges explode in the shortest time possible since the fuses are lit. Write a program that will determine the minimum such time possible.</p>

### 입력

<p>The first line of the standard input holds two integers n and m (1 &le; m &le; n &le; 300,000), separated by a single space, that denote, respectively, the number of chambers in the cave and the number of chambers in which fire can be set to the fuses. The chambers are numbered from 1 to n. The next line contains n integers d<sub>1</sub>,d<sub>2</sub>,&hellip;,d<sub>n</sub> (d<sub>i</sub> &isin; {0,1}), separated by single spaces. If d<sub>i</sub>=1, then there is dynamite in the i-th chamber, and if d<sub>i</sub>=0, there is none. The following n-1 lines specify the corridors of the cave. Each of them holds two integers a,b (1 &le; a &lt; b &le; n), separated by a single space, denoting that there is a corridor connecting the chambers &nbsp;and . Every corridor appears exactly once in the description.</p>

<p>You may assume that in tests worth 10% of the points it holds additionally that n &le; 10, while in tests worth 40% of the points it holds that n &le; 1,000.</p>

<p>&nbsp;</p>

### 출력

<p>The first and only line of the standard output should hold a single integer, equal to the minimum time it takes from lighting the fuses to the explosion of all the charges.</p>

### 힌트

<p>For the sample input:<img alt="" src="https://onlinejudgeimages.s3.amazonaws.com/problem/8213/1.gif" style="height:84px; width:179px" /></p>

<p>We light the fuses in chambers 3 and 5. The charge in chamber 3 explodes at time zero, and the charges in chambers 1, 4, 6 and 7 explode after a single time unit.</p>

<p>&nbsp;</p>