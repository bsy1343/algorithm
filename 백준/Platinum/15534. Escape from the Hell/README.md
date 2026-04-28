# [Platinum I] Escape from the Hell - 15534

[문제 링크](https://www.acmicpc.net/problem/15534)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 62, 정답: 26, 맞힌 사람: 22, 정답 비율: 51.163%

### 분류

자료 구조, 그리디 알고리즘, 세그먼트 트리, 이분 탐색, 누적 합, 매개 변수 탐색

### 문제 설명

<p>One day, Buddha looked into the hell and found an office worker. He did evil, such as enforcing hard work on his subordinates. However, he made only one good in his life. He refused an unreasonable request from his customer to save the lives of his subordinates. Buddha thought that, as the reward of the good, the office worker should have had a chance to escape from the hell. Buddha took a spider silk and put down to the hell.</p>

<p>The office worker climbed up with the spider silk, however the length of the way L meters was too long to escape one day. He had N energy drinks and drunk one of them each day. The day he drunk the i-th energy drink he could climb A<sub>i</sub> meters in the daytime and after that slided down B<sub>i</sub> meters in the night. If he could reach at the height greater than or equal to the L meters in the daytime, he could escape without sliding down. After the N days the silk would be cut.</p>

<p>He realized that other sinners climbed the silk in the night. They climbed C<sub>i</sub> meters in the i-th night without sliding down in the daytime. If they catched up with the office worker, they should have conflicted and the silk would be cut. Therefore he needed to escape before other sinners catched him. Your task is to write a program computing the best order of energy drink and output the earliest day which he could escape. If he could not escape, your program should output &minus;1.</p>

### 입력

<p>The input consists of a single test case.</p>

<pre>
N L
A<sub>1</sub> B<sub>1</sub>
...
A<sub>N</sub> B<sub>N</sub>
C<sub>1</sub>
...
C<sub>N</sub></pre>

<p>The first line contains two integers N (1 &le; N &le; 10<sup>5</sup>) and L (1 &le; L &le; 10<sup>9</sup>), which mean the number of energy drinks and the length of the spider silk respectively. The following N lines&nbsp;show the information of the drinks: the i-th of them indicates the i-th energy drink, he climbed up A<sub>i</sub> (1 &le; A<sub>i</sub> &le; 10<sup>9</sup>) meters and slided down B<sub>i</sub> (1 &le; B<sub>i</sub> &le; 10<sup>9</sup>) meters. Next N lines show how far other sinners climbed: the i-th of them contains an integer C<sub>i</sub> (1 &le; C<sub>i</sub> &le; 10<sup>9</sup>), which means they climbed up C<sub>i</sub> meters in the i-th day.</p>

### 출력

<p>Print the earliest day which he could escape. If he could not escape, print -1 instead.</p>