# [Platinum V] Robots - 26051

[문제 링크](https://www.acmicpc.net/problem/26051)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 24, 정답: 11, 맞힌 사람: 11, 정답 비율: 45.833%

### 분류

그래프 이론, 그래프 탐색, 너비 우선 탐색, 최단 경로, 게임 이론, 홀짝성, 이분 그래프

### 문제 설명

<p>Cimrman&rsquo;s robot producing company Cimrman Dynamics is testing their new model, Long Range Autonomous Trekking Bot (LRATB). LRATB has to find its way from village S to village F in the region. For environmental and safety reasons, LRATB moves only at night and each night its movement is limited to relocation from one village to some adjacent village along a cycling path between the villages.</p>

<p>Another company, Overseas Dynamics, is testing their similar product in the same area. Their humanoid robot called AtlasTiger also travels only at night and it always relocates itself from a village to an adjacent one in one night.</p>

<p>Cimrman Dynamics programmers have no clue about the planned route of the competing company robot. They suspect that if the two robots stay for the whole day (from dawn till dusk) in one village, the signal interference may damage their own robot navigation systems. Thus, they want to plan the sequence of visited villages in such way that the two robots will never meet in the same village in one day. They know only the location of AtlasTiger on the first day of testing and know nothing about its further movements. Sometimes, if it helps the strategy, LRATB may stay overnight in a village without leaving it at all. If the two robots meet briefly at night travelling the same path in opposite directions, it poses no risk to their navigation.</p>

<p>Now, Cimrman Dynamics programmers want to plan the path of LRATB from village S to village F so that it takes the shortest possible time and it is guaranteed that no signal interference will occur, no matter how AtlasTiger will organise its own movements. Both robots start their journeys at the dawn of the same day in their correponding starting villages (and spend the day there by charging batteries etc).</p>

### 입력

<p>The first line of input contains five integers N, M, F, T, S (1 &le; N &le; 10<sup>5</sup>, 0 &le; M &le; 2 &middot; 10<sup>5</sup>, 0 &le; F &le; N &minus; 1, 0 &le; T &le; N &minus; 1, 0 &le; S &le; N &minus; 1). N is the number of villages, M is the number of paths between pairs of villages, F is the label of the destination village, T is the label of village in which AtlasTiger is originally located, S is the label of village in which LRATB is originally located. The villages are labelled 0, 1, . . . , N &minus; 1. Each of the next M lines contain a description of one path between adjacent villages, the description consists of the labels of the villages separated by space. No path connects a village to itself, no two paths connect the same villages.</p>

### 출력

<p>Output either minimal number of nights for LRATB to reach destination or output string death if it is not possible, that is, if there is no path that can guarantee interference-free journey for LRATB from S to F.</p>