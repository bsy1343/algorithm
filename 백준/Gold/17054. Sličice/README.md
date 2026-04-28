# [Gold III] Sličice - 17054

[문제 링크](https://www.acmicpc.net/problem/17054)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 512 MB

### 통계

제출: 34, 정답: 20, 맞힌 사람: 20, 정답 비율: 74.074%

### 분류

다이나믹 프로그래밍

### 문제 설명

<p>Nikola is a passionate collector of albums with images of football players. He and his friends compete with each other in a game they invented based on the albums whose images are currently being collected. The images in that album are divided into N teams, each of which has exactly M football players. The main rule of the game is that the total number of points a person wins for i<sup>th</sup> team is B<sub>x</sub>, where x is the total number of unique pictures of football players of that team collected by the person. They have also agreed that the array B is growing, i.e. having more unique images of football players of a team means having more or equal points.</p>

<p>Nikola would like to win as many points as possible in the game. For each team x the amount of unique images Nikola currently owns of that team, P<sub>x</sub>, is known.</p>

<p>Ivan is a friend of Nikola who has already collected the entire album twice and when he heard about the game Nikola plays with his friends, he decided to give him any K images that Nikola wants. After finding out about this joyful news, Nikola wondered what is the maximal number of points he could have after Ivan gives him K images. Too excited for this news, he is not able to count and begs you to answer his question.</p>

### 입력

<p>In the first line there are integer numbers N, M and K (1 &le; N, M &le; 500, 1 &le; K &le; min(N&middot;M, 500)), numbers from the task&#39;s text.</p>

<p>In the second line there is an array P consisting of N non-negative integer numbers (0 &le; P<sub>i</sub> &le; M).</p>

<p>In the third line there is an array B consisting of M+1 non-negative integer numbers (0 &le; B<sub>i</sub> &le; 100 000), amount of points Nikola gets for i (0 &le; i &le; M) unique images of a team.</p>

<p>For every t between 0 and M-1 it holds B<sub>t</sub> &le; B<sub>t+1</sub>.</p>

<p>It is also holds that K &le; N&middot;M - (P<sub>1</sub> + P<sub>2</sub> + &hellip; + P<sub>N</sub>).</p>

### 출력

<p>In the only line print the answer to Nikola&#39;s question.</p>