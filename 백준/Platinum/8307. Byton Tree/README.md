# [Platinum III] Byton Tree - 8307

[문제 링크](https://www.acmicpc.net/problem/8307)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 29, 정답: 9, 맞힌 사람: 8, 정답 비율: 66.667%

### 분류

다이나믹 프로그래밍, 그래프 이론, 그리디 알고리즘, 그래프 탐색, 트리, 깊이 우선 탐색, 트리에서의 다이나믹 프로그래밍

### 문제 설명

<p>Bytons grow on a byton tree. They are rare fruits and they can only be found on branches from which no other branches grow.</p>

<p>All bytons growing on a single branch have the same time interval in which they can be picked. If they are picked too early, they will be unripe, and if too late, they will be rotten. Every person owning a byton tree wonders how many cuts need to be performed for all bytons to be collected and for each collected byton to be eatable in the moment it is picked. Cuts can be performed at each branch, near its beginning. When a cut is performed, all bytons growing directly or indirectly on the corresponding branch are picked. We assume that an arbitrary number of cuts can be performed in one unit of time and that the trunk is also a branch.</p>

### 입력

<p>The first and only line of the standard input contains a description of a byton tree, written in a recursive manner. The first integer denotes the number of branches growing on the trunk; it is followed by the descriptions of these branches. A description of a branch consists of the number of branches that grow on it, followed by descriptions of these branches. If any bytons grow on a branch, 0 is written as the number of branches growing on it and it is followed by two integers a<sub>i</sub>, b<sub>i</sub> (1 &le; a<sub>i</sub> &le; b<sub>i</sub> &le; 10<sup>9</sup>)&nbsp;which denote the time interval when the bytons can be collected. The total number of all branches does not exceed 1,000,000.</p>

### 출력

<p>The first and only line of the standard output should contain a single integer denoting the minimal number of cuts that need to be performed for all the picked bytons to be eatable.</p>

### 힌트

<p><img alt="" src="https://onlinejudgeimages.s3-ap-northeast-1.amazonaws.com/problem/8307/1.gif" style="height:215px; width:247px" /></p>

<p><strong>Explanation of the example:</strong>&nbsp;The byton tree from the example contains 3 branches on which bytons grow - the intervals in the figure represent their periods of eatability. In order to collect all bytons, 2 cuts are sufficient: the first one can be performed e.g. in moment 5, the second one in moment 8.</p>