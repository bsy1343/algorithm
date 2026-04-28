# [Gold I] Invited Speakers - 18724

[문제 링크](https://www.acmicpc.net/problem/18724)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 20, 정답: 17, 맞힌 사람: 17, 정답 비율: 85.000%

### 분류

자료 구조, 브루트포스 알고리즘, 정렬, 해 구성하기, 스택

### 문제 설명

<p>At a big conference, there are n invited speakers &ndash; leading researchers in the area. Unfortunately, they hate each other wholeheartedly and passionately. None of them would bear to speak later than anyone else &ndash; so they all must have lectures at the same time, right after the welcome party. You managed to arrange n different rooms for them to speak, and n tables at the party. The conference site is very big, so we can treat it as an Euclidean plane, and all the tables and rooms can be considered points on this plane.</p>

<p>All the rooms, as well as all the tables are, of course, identical, so you can assign any room or table to any of the scientists. The only problem remaining is how do they get from one of these spots to the other &ndash; if any two speakers cross paths, a serious scandal is guaranteed. You can give them very detailed instructions on what path they should take, but they seem to only travel along straight lines. Therefore you must connect n tables with n speaking rooms with polygonal chains (connected series of line segments) such that no two of them cross each other.</p>

### 입력

<p>The first line of input contains the number of test cases z (1 &le; z &le; 200). The descriptions of the test cases follow.</p>

<p>The first line of each test case contains a single integer n (1 &le; n &le; 6) &ndash; the number of invited speakers. The next 2n lines contain two integers x<sub>i</sub>, y<sub>i</sub> each (|x<sub>i</sub>|, |y<sub>i</sub>| &le; 100) &ndash; coordinates of the i-th spot. The first n spots are tables, and the remaining ones are lecture rooms.</p>

<p>You may assume that all x<sub>i</sub> are distinct, all y<sub>i</sub> are distinct, and no three points are collinear.</p>

### 출력

<p>For each test case, output n polygonal chains in the following format: for each chain, output first the number k of its vertices. Then, in k following lines, output the coordinates of consecutive vertices of this chain. The ends of each chain must be two input points: a table and a lecture room. No chain may self-cross, and no two chains can have common points (in particular, every input point must appear at the end of some chain). Also, k should not exceed 100 and the coordinates of all points should be between &minus;1000 and 1000.</p>