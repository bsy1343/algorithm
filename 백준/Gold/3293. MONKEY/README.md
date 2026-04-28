# [Gold III] MONKEY - 3293

[문제 링크](https://www.acmicpc.net/problem/3293)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 13, 정답: 7, 맞힌 사람: 7, 정답 비율: 58.333%

### 분류

그래프 이론, 그래프 탐색, 너비 우선 탐색, 비트마스킹, 최단 경로

### 문제 설명

<p>A hungry monkey wants to eat banana. The monkey and banana are in a labyrinth consisting of rooms and corridors connecting them. Rooms can be in one of two states: locked or unlocked. If a room is locked, then the monkey cannot enter that room, but can leave it. Unlocked rooms can be freely entered and left.</p>

<p>Some rooms contain a switch. Pressing a switch changes states of a group of rooms, i.e. locked rooms from that groups become unlocked and vice versa. Same switch always changes states of the same group of rooms.</p>

<p>Upon entering a room having a switch, the monkey can press it if he chooses to do so.</p>

<p>Write a program that will help the monkey to find the room with banana as soon as possible, i.e. to find the smallest number of corridors the monkey has to pass to find the room with banana, possibly by pressing some of the switches.</p>

<p>Input data contain description of rooms and corridors in the labyrinth, initial states of all rooms, a list of switches and for each switch a list of rooms whose states can changed by it.</p>

### 입력

<p>The first line of input file contains two integers N, total number of rooms (1 &le; N &le; 100), and S, number of switches, i.e. number of rooms having switches, in labyrinth (1 &le; S &le; 8). Switches are located in the rooms with numbers from 1 to S.</p>

<p>The next N lines contain descriptions of rooms. The room number i is described with (i+1)th line which begins with either 0 (if the corresponding room is initially unlocked) or 1 (if initially locked). An integer K follows, total number of rooms connected via corridors with the room being described by that line. After it follows K numbers denoting those K rooms. A space character separates successive numbers in same line.</p>

<p>The following S lines describe switches, from first to Sth switch.</p>

<p>Each of those lines begins with an integer L, the number of rooms in a group whose states can be changed by switch being described. Following are L numbers &ndash; numbers of rooms in the group.</p>

<p>The last line of input file contains two numbers A and B; A is number of a room where the monkey starts its search for banana and B is number of room containing banana.</p>

### 출력

<p>The first and only line of output file should contain the smallest number of corridors the monkey has to pass to find banana.</p>

<p>Note: Each test data will have a solution, i.e. there will always be a way to come to room B from room A.</p>