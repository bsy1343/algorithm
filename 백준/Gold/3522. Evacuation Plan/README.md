# [Gold II] Evacuation Plan - 3522

[문제 링크](https://www.acmicpc.net/problem/3522)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 149, 정답: 22, 맞힌 사람: 21, 정답 비율: 16.031%

### 분류

다이나믹 프로그래밍, 그리디 알고리즘, 정렬, 역추적

### 문제 설명

<p>Flatland government is building a new highway that will be used to transport weapons from its main weapon plant to the frontline in order to support the undergoing military operation against its neighbor country Edgeland. Highway is a straight line and there are n construction teams working at some points on it.</p>

<p>During last days the threat of a nuclear attack from Edgeland has significantly increased. Therefore the construction office has decided to develop an evacuation plan for the construction teams in case of a nuclear attack. There are m shelters located near the constructed highway. This evacuation plan must assign each team to a shelter that it should use in case of an attack.</p>

<p>Each shelter entrance must be securely locked from the inside to prevent any damage to the shelter itself. So, for each shelter there must be some team that goes to this shelter in case of an attack. The office must also supply fuel to each team, so that it can drive to its assigned shelter in case of an attack. The amount of fuel that is needed is proportional to the distance from the team&rsquo;s location to the assigned shelter. To minimize evacuation costs, the office would like to create a plan that minimizes the total fuel needed.</p>

<p>Your task is to help them develop such a plan</p>

### 입력

<p>The first line of the input file contains n &mdash; the number of construction teams (1 &le; n &le; 4000). The second line contains n integer numbers &mdash; the locations of the teams. Each team&rsquo;s location is a positive integer not exceeding 10<sup>9</sup>, all team locations are different.</p>

<p>The third line of the input file contains m &mdash; the number of shelters (1 &le; m &le; n). The fourth line contains m integer numbers &mdash; the locations of the shelters. Each shelter&rsquo;s location is a positive integer not exceeding 10<sup>9</sup>, all shelter locations are different.</p>

<p>The amount of fuel that needs to be supplied to a team at location x that goes to a shelter at location y is equal to |x &minus; y|.</p>

### 출력

<p>The first line of the output file must contain z &mdash; the total amount of fuel needed. The second line must contain n integer numbers: for each team output the number of the shelter that it should be assigned to. Shelters are numbered from 1 to m in the order they are listed in the input file.</p>