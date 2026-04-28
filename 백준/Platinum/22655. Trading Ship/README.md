# [Platinum V] Trading Ship - 22655

[문제 링크](https://www.acmicpc.net/problem/22655)

### 성능 요약

시간 제한: 8 초 (추가 시간 없음), 메모리 제한: 512 MB

### 통계

제출: 39, 정답: 23, 맞힌 사람: 16, 정답 비율: 55.172%

### 분류

자료 구조, 그래프 이론, 그래프 탐색, 기하학, 이분 탐색, 분리 집합, 매개 변수 탐색

### 문제 설명

<p>The ship is now going to pass through a strait notorious for many pirates often robbing ships. The Maritime Police has attempted to expel those pirates many times, but failed their attempts as the pirates are fairly strong. For this reason, every ship passing through the strait needs to defend themselves from the pirates.</p>

<p>The navigator has obtained a sea map on which the location of every hideout of pirates is shown. The strait is considered to be a rectangle of W &times; H on an xy-plane, where the two opposite corners have the coordinates of (0, 0) and (<i>W</i>,&nbsp;<i>H</i>). The ship is going to enter and exit the strait at arbitrary points on&nbsp;<i>y</i>&nbsp;= 0 and&nbsp;<i>y</i>&nbsp;=&nbsp;<i>H</i>&nbsp;respectively.</p>

<p>To minimize the risk of attack, the navigator has decided to take a route as distant from the hideouts as possible. As a talented programmer, you are asked by the navigator to write a program that finds the best route, that is, the route with the maximum possible distance to the closest hideouts. For simplicity, your program just needs to report the distance in this problem.</p>

### 입력

<p>The input begins with a line containing three integers&nbsp;<i>W</i>,&nbsp;<i>H</i>, and&nbsp;<i>N</i>. Here,&nbsp;<i>N</i>&nbsp;indicates the number of hideouts on the strait. Then&nbsp;<i>N</i>&nbsp;lines follow, each of which contains two integers&nbsp;<i>x<sub>i</sub></i>&nbsp;and&nbsp;<i>y<sub>i</sub></i>, which denote the coordinates the&nbsp;<i>i</i>-th hideout is located on.</p>

<p>The input satisfies the following conditions: 1 &le;&nbsp;<i>W</i>,&nbsp;<i>H</i>&nbsp;&le; 10<sup>9</sup>, 1 &le;&nbsp;<i>N</i>&nbsp;&le; 500, 0 &le;&nbsp;<i>x<sub>i</sub></i>&nbsp;&le;&nbsp;<i>W</i>, 0 &le;&nbsp;<i>y<sub>i</sub></i>&nbsp;&le;&nbsp;<i>H</i>.</p>

### 출력

<p>There should be a line containing the distance from the best route to the closest hideout(s). The distance should be in a decimal fraction and should not contain an absolute error greater than 10<sup>-3</sup>.</p>