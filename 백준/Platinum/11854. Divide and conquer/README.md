# [Platinum III] Divide and conquer - 11854

[문제 링크](https://www.acmicpc.net/problem/11854)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 256 MB

### 통계

제출: 100, 정답: 46, 맞힌 사람: 41, 정답 비율: 48.810%

### 분류

자료 구조, 세그먼트 트리, 이분 탐색, 누적 합

### 문제 설명

<p>Mansur plays the new computer strategic game. The main task in such games is mining resources. Fortunately in this game only one resource is necessary for development &mdash; the gold, and also there is one supplementary resource type &mdash; energy.</p>

<p>In this game there are mining camps, which provide certain amount of gold and energy. Аll camps are located along the straight line. To protect the mining camps one can build a forcefield (a closed line segment containing mining camps), which needs energy amount equal to it&rsquo;s length.</p>

<p>Mansur wants to build one forcefield in such way, that energy of protected mining camps is enough for the forcefield, and amount of gold provided by these mining camps is maximal possible.</p>

<p>Write a program to help Mansur find the maximal amount of gold which he can obtain from protected mining camps.</p>

### 입력

<p>First line of the input file contains one integer N &mdash; number of mining camps. Following N lines contain three space separated integers x<sub>i</sub>, g<sub>i</sub>, d<sub>i</sub>, 0 &le; x<sub>i</sub> &le; 10<sup>9</sup> , 1 &le; g<sub>i</sub> &le; 10<sup>9</sup> , 1 &le; d<sub>i</sub> &le; 10<sup>9</sup>: mine coordinates, amount of gold and energy provided by the mine. All x<sub>i</sub> are different and given in increasing order.</p>

### 출력

<p>Output only one number &mdash; maximal amount of gold which Mansur can mine.</p>