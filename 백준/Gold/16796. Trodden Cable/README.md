# [Gold III] Trodden Cable - 16796

[문제 링크](https://www.acmicpc.net/problem/16796)

### 성능 요약

시간 제한: 5 초, 메모리 제한: 512 MB

### 통계

제출: 7, 정답: 6, 맞힌 사람: 6, 정답 비율: 85.714%

### 분류

구현, 그래프 이론, 시뮬레이션, 최단 경로, 데이크스트라

### 문제 설명

<p>Nathan O. Davis is running a company. His company owns a web service which has a lot of users. So his office is full of servers, routers and messy LAN cables.</p>

<p>He is now very puzzling over the messy cables, because they are causing many kinds of problems. For example, staff working at the company often trip over a cable. No damage if the cable is disconnected. It&rsquo;s just lucky. Computers may fall down and get broken if the cable is connected. He is about to introduce a new computer and a new cable. He wants to minimize staff&rsquo;s steps over the new cable.</p>

<p>His office is laid-out in a two-dimensional grid with <var>H \times W</var> cells. The new cable should weave along edges of the cells. Each end of the cable is at a corner of a cell. The grid is expressed in zero-origin coordinates, where the upper left corner is (0, 0).</p>

<p>Each staff starts his/her work from inside a certain cell and walks in the office along the grid in a fixed repeated pattern every day. A walking pattern is described by a string of four characters <code>U</code>, <code>D</code>, <code>L</code> and <code>R</code>. <code>U</code> means moving up, <code>D</code> means moving down, <code>R</code> means moving to the right, and <code>L</code> means moving to the left. For example, <code>UULLDDRR</code> means moving up, up, left, left, down, down, right and right in order. The staff repeats the pattern fixed <var>T</var> times. Note that the staff stays in the cell if the staff is going out of the grid through the wall.</p>

<p>You have the moving patterns of all staff and the positions of both ends of the new cable. Your job is to find an optimal placement of the new cable, which minimizes the total number his staff would step over the cable.</p>

### 입력

<p>The first line of the input contains three integers which represent the dimension of the office <var>W</var>, <var>H</var> (<var>1 &le; W, H &le; 500</var>), and the number of staff <var>N</var> (<var>1 &le;N &le;1000</var>), respectively. The next line contains two <var>x-y</var> pairs (<var>0 &le; x &le;W</var>, <var>0 &le; y &le; H</var>), which mean the position of two endpoints of a LAN cable to be connected. These values represents the coordinates of the cells to which the cable is plugged in its top-left corner. Exceptionally, <var>x = W</var> means the right edge of the rightmost cell, and <var>y = H</var> means the bottom edge of the bottommost cell.</p>

<p>Following lines describe staff&rsquo;s initial positions and their moving patterns. The first line includes an <var>x</var>-<var>y</var> pair (<var>0 &le; x &le; W</var>, <var>0 &le; y &le; H</var>), which represents the coordinate of a staff&#39;s initial cell. The next line has an integer <var>T</var> (<var>1 &le; T &le;100</var>) and a string which consists of <code>U</code>, <code>D</code>, <code>L</code> and <code>R</code>, whose meaning is described as above. The length of a pattern string is greater than or equal to <var>1</var>, and no more than <var>1,000</var>. These two lines are repeated <var>N</var> times.</p>

### 출력

<p>Output the minimum number of times his staff step over the cable in a single line.</p>