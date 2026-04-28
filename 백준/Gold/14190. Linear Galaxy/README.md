# [Gold II] Linear Galaxy - 14190

[문제 링크](https://www.acmicpc.net/problem/14190)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 64, 정답: 9, 맞힌 사람: 9, 정답 비율: 20.000%

### 분류

정렬

### 문제 설명

<p>The government of the &ldquo;Linear&rdquo; galaxy plans to redesign the public-transportation system in the galaxy. The Linear galaxy, which is very far away from our galaxy Milky Way, consists of 2<sup>n</sup> + 1 stars located on a single line. The i-th star in the galaxy is placed at position x<sub>i</sub> on the line assuming the origin of the line is the starting point of the galaxy. Thus, the distance between stars i and j equals |x<sub>i</sub> &minus; x<sub>j</sub>|.</p>

<p>There are two types of transportation systems in the Linear galaxy, namely TRT and SRT.</p>

<p>Teleport Rapid Transit (TRT) is an advanced transportation system, by which one can be instantly teleported from one star to another one within the TRT network. However, due to limited equipment, TRT stations can be installed in only 2<sup>n&minus;1</sup> + 1 stars.</p>

<p>In order to make the whole transportation network connected, one of the stars in the TRT network and all stars not being in TRT network (a total of 2<sup>n&minus;1</sup> + 1 stars) must be connected via the traditional Spacecraft Rapid Transit (SRT) system. A standard SRT network over m stars is a cycle of length m passing through each star exactly once. Interestingly, spacecrafts work more efficiently on longer flights. Therefore, the efficiency of an SRT network is defined as the minimum of its flight distances (i.e. distances between every two consecutive stars in the cycle).</p>

<p>Now, the government of the linear galaxy looks for an SRT network with the maximum efficiency constructed over 2<sup>n&minus;1</sup>+1 of the stars.</p>

### 입력

<p>There are multiple test cases in the input. The first line of each test case contains a single integer n, where 2<sup>n</sup> + 1 is the number of stars in the Linear galaxy (1 &le; n &le; 10). The next line contains 2<sup>n</sup> + 1 distinct positive integers not exceeding 10<sup>9</sup> denoting the position of stars. The input terminates with a line containing 0 which should not be processed.</p>

### 출력

<p>For each test case, output a line containing a single integer, the maximum efficiency among all possible SRT/TRT networks.</p>