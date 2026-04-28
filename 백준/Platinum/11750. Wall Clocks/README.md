# [Platinum II] Wall Clocks - 11750

[문제 링크](https://www.acmicpc.net/problem/11750)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 256 MB

### 통계

제출: 87, 정답: 50, 맞힌 사람: 44, 정답 비율: 55.696%

### 분류

구현, 그리디 알고리즘, 스위핑

### 문제 설명

<p>You are the manager of a chocolate sales team. Your team customarily takes tea breaks every two hours, during which varieties of new chocolate products of your company are served. Everyone looks forward to the tea breaks so much that they frequently give a glance at a wall clock.</p>

<p>Recently, your team has moved to a new office. You have just arranged desks in the office. One team member asked you to hang a clock on the wall in front of her desk so that she will not be late for tea breaks. Naturally, everyone seconded her.</p>

<p>You decided to provide an enough number of clocks to be hung in the field of view of everyone. Your team members will be satisfied if they have at least one clock (regardless of the orientation of the clock) in their view, or, more precisely, within 45 degrees left and 45 degrees right (both ends inclusive) from the facing directions of their seats. In order to buy as few clocks as possible, you should write a program that calculates the minimum number of clocks needed to meet everyone&rsquo;s demand.</p>

<p>The office room is rectangular aligned to north-south and east-west directions. As the walls are tall enough, you can hang clocks even above the door and can assume one&rsquo;s eyesight is not blocked by other members or furniture. You can also assume that each clock is a point (of size zero), and so you can hang a clock even on a corner of the room.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/11750.%E2%80%85Wall%E2%80%85Clocks/168b21cf.png" data-original-src="https://onlinejudgeimages.s3-ap-northeast-1.amazonaws.com/problem/11750/1.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:186px; width:598px" /></p>

<p style="text-align: center;">Figure D.1. Arrangements of seats and clocks. Gray area indicates field of view.</p>

<p>For example, assume that there are two members. If they are sitting facing each other at positions shown in Figure D.1(A), you need to provide two clocks as they see distinct sections of the wall. If their seats are arranged as shown in Figure D.1(B), their fields of view have a common point on the wall. Thus, you can meet their demands by hanging a single clock at the point. In Figure D.1(C), their fields of view have a common wall section. You can meet their demands with a single clock by hanging it anywhere in the section. Arrangements (A), (B), and (C) in Figure D.1 correspond to Sample Input 1, 2, and 3, respectively.</p>

### 입력

<p>The input consists of a single test case, formatted as follows.</p>

<pre>
n w d
x<sub>1</sub> y<sub>1</sub> f<sub>1</sub>
.
.
.
x<sub>n</sub> y<sub>n</sub> f<sub>n</sub></pre>

<p>All numbers in the test case are integers. The first line contains the number of team members n (1 &le; n &le; 1, 000) and the size of the office room w and d (2 &le; w, d &le; 100, 000). The office room has its width w east-west, and depth d north-south. Each of the following n lines indicates the position and the orientation of the seat of a team member. Each member has a seat at a distinct position (x<sub>i</sub>, y<sub>i</sub>) facing the direction f<sub>i</sub>, for i = 1, . . . , n. Here 1 &le; x<sub>i</sub> &le; w &minus; 1, 1 &le; y<sub>i</sub> &le; d &minus; 1, and f<sub>i</sub> is one of N, E, W, and S, meaning north, east, west, and south, respectively. The position (x, y) means x distant from the west wall and y distant from the south wall.</p>

### 출력

<p>Print the minimum number of clocks needed.</p>