# [Gold II] Pick-up sticks - 4288

[문제 링크](https://www.acmicpc.net/problem/4288)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 29, 정답: 9, 맞힌 사람: 6, 정답 비율: 60.000%

### 분류

기하학, 선분 교차 판정

### 문제 설명

<p>Stan has <em>n</em> sticks of various length. He throws them one at a time on the floor in a random way. After finishing throwing, Stan tries to find the top sticks, that is these sticks such that there is no stick on top of them. Stan has noticed that the last thrown stick is always on top but he wants to know all the sticks that are on top. Stan sticks are very, very thin such that their thickness can be neglected.</p>

### 입력

<p>Input consists of a number of cases. The data for each case start with <em>1 &le; n &le; 100000</em>, the number of sticks for this case. The following <em>n</em> lines contain four numbers each, these numbers are the planar coordinates of the endpoints of one stick. The sticks are listed in the order in which Stan has thrown them. You may assume that there are no more than 1000 top sticks. The input is ended by the case with <em>n=0</em>. This case should not be processed.</p>

### 출력

<p>For each input case, print one line of output listing the top sticks in the format given in the sample. The top sticks should be listed in order in which they were thrown.</p>

<p>The picture to the right below illustrates the first case from input.<img alt="" src="/upload/images2/C.jpg" style="float:right; height:270px; width:333px" /></p>