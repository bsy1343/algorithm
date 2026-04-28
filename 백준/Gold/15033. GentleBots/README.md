# [Gold III] GentleBots - 15033

[문제 링크](https://www.acmicpc.net/problem/15033)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 512 MB

### 통계

제출: 94, 정답: 14, 맞힌 사람: 14, 정답 비율: 20.588%

### 분류

그리디 알고리즘, 해 구성하기, 무작위화

### 문제 설명

<p>Rainforest Inc. is opening a large new automated warehouse in the far Northern reaches of the UK&mdash;some place they call &ldquo;Walthamstow&rdquo;.</p>

<p>The robotic worker drones inside will operate in not just one or two, but three dimensions, and can move in any one of the 6 cardinal dimensions in steps of 1 metre at a time. For example, a robot looking to move from position (X<sub>1</sub>, Y<sub>1</sub>, Z<sub>1</sub>) to position (X<sub>2</sub>, Y<sub>2</sub>, Z<sub>2</sub>) will, assuming no obstacles, need to take (|X<sub>2</sub> &minus; X<sub>1</sub>| + |Y<sub>2</sub> &minus; Y<sub>1</sub>| + |Z<sub>2</sub> &minus; Z<sub>1</sub>|) steps in total.</p>

<p>Since this warehouse is in Britain, and because every stereotype is true, the robotic denizens are all impeccably polite. When two robots travelling in opposite directions meet, they wordlessly negotiate for one of the robots to step aside somehow so the other can pass.</p>

<p>Multiple robots cannot occupy the same integer co-ordinates, and no two robots can swap positions in one move. All moves are instantaneous.</p>

<p>We have prepared a test run of the warehouse with just two machines installed. Write a program to pass this test.</p>

### 입력

<p>Two lines, one for each robot, each containing six space-separated integers (X<sub>0</sub>Y<sub>0</sub>Z<sub>0</sub>) and (X<sub>&infin;</sub>Y<sub>&infin;</sub>Z<sub>&infin;</sub>), the intended start and end locations of a robot respectively (&minus;1000 &le; X, Y, Z &le; 1000).</p>

<p>The robots will start in different places from each other, and will also end in different places from each other.</p>

### 출력

<p>Output up to 7000 lines, giving one possible list of locations of the robots over time. The position of both robots at time T must be given as bracketed space-separated (X, Y, Z) co-ordinate tuples on line T.</p>

<p>Co-ordinates must not exceed an absolute value of 10<sup>6</sup>.</p>