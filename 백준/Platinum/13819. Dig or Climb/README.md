# [Platinum II] Dig or Climb - 13819

[문제 링크](https://www.acmicpc.net/problem/13819)

### 성능 요약

시간 제한: 8 초 (추가 시간 없음), 메모리 제한: 512 MB

### 통계

제출: 8, 정답: 1, 맞힌 사람: 1, 정답 비율: 100.000%

### 분류

다이나믹 프로그래밍, 그래프 이론, 자료 구조, 기하학, 최단 경로, 스택

### 문제 설명

<p>Benjamin Forest VIII is a king of a country. One of his best friends Nod lives in a village far from his castle. Nod gets seriously sick and is on the verge of death. Benjamin orders his subordinate Red to bring good medicine for him as soon as possible. However, there is no road from the castle to the village. Therefore, Red needs to climb over mountains and across canyons to reach the village. He has decided to get to the village on the shortest path on a map, that is, he will move on the straight line between the castle and the village. Then his way can be considered as polyline with n points (x<sub>1</sub>, y<sub>1</sub>) . . . (x<sub>n</sub>, y<sub>n</sub>) as illustlated in the following figure.</p>

<p><img alt="" src="https://onlinejudgeimages.s3.amazonaws.com/problem/13819/%EC%8A%A4%ED%81%AC%EB%A6%B0%EC%83%B7%202016-11-23%20%EC%98%A4%ED%9B%84%201.49.51.png" style="height:204px; width:350px" /></p>

<p>Figure 1: An example route from the castle to the village</p>

<p>Here, x<sub>i </sub>indicates the distance between the castle and the point i, as the crow flies, and y<sub>i</sub> indicates the height of the point i. The castle is located on the point (x<sub>1</sub>, y<sub>1</sub>), and the village is located on the point (x<sub>n</sub>, y<sub>n</sub>).</p>

<p>Red can walk in speed v<sub>w</sub>. Also, since he has a skill to cut a tunnel through a mountain horizontally, he can move inside the mountain in speed v<sub>c</sub>.</p>

<p>Your job is to write a program to the minimum time to get to the village.</p>

### 입력

<p>The input is a sequence of datasets. Each dataset is given in the following format:</p>

<pre>
v<sub>w</sub> v<sub>c</sub> 
x<sub>1</sub> y<sub>1</sub> 
. . . 
x<sub>n</sub> y<sub>n</sub></pre>

<p>You may assume all the following: n &le; 1,000, 1 &le; v<sub>w</sub>, v<sub>c</sub> &le; 10, &minus;10,000 &le; x<sub>i</sub> , y<sub>i </sub>&le; 10,000, and x<sub>i</sub> &lt; x<sub>j </sub>for all i &lt; j.</p>

<p>The input is terminated in case of n = 0. This is not part of any datasets and thus should not be processed.</p>

### 출력

<p>For each dataset, you should print the minimum time required to get to the village in a line. Each minimum time should be given as a decimal with an arbitrary number of fractional digits and with an absolute error of at most 10<sup>&minus;6</sup> . No extra space or character is allowed.</p>