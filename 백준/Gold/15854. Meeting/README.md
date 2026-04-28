# [Gold III] Meeting - 15854

[문제 링크](https://www.acmicpc.net/problem/15854)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 50, 정답: 20, 맞힌 사람: 18, 정답 비율: 42.857%

### 분류

그리디 알고리즘

### 문제 설명

<p>You are the boss of company X and have N subordinates. Today, the -th subordinate will come to the office A<sub>i</sub> seconds later than you.</p>

<p>You will have a team meeting today. Due to the capacity of the meeting room, there must be exactly K people (excluding you) attending the team meeting. You can start the meeting S seconds after you come to the office. You can choose the value of S whatever you like, but it must be a positive real non-integer number. Everyone who is already present at the office at that start time will attend the meeting.</p>

<p>You can adjust the arrival time of your subordinates. By paying $1 (one dollar) and choosing a subordinate, you can change the subordinate&#39;s arrival time by one second earlier or one second later. However, a subordinate must not arrive at the office strictly before you&mdash;that would be shameful for you. Also, a subordinate must not arrive strictly later than T seconds after you&mdash;the subordinate could get fired. You can adjust the arrival time of as many subordinates as you want. You can also adjust the arrival time of the same subordinate more than once.</p>

<p>Determine the minimum amount of dollars needed such that you can have a meeting of exactly K people (excluding you). If it is impossible to do so, output -1.</p>

### 입력

<p>The first line contains three integers: N K T (1 &le; K &le; N &le; 100,000; 0 &le; T &le; 1,000,000,000) in a line denoting the number of subordinates, the number of subordinates attending the meeting, and the maximum arrival time. The second line contains N integers: A<sub>1</sub> A<sub>2</sub> ... A<sub>N</sub> (0 &le; A<sub>i</sub> &le; T) in a line denoting the arrival time of each subordinate.&nbsp;</p>

### 출력

<p>The output contains the minimum amount of dollars needed such that you can have a meeting of exactly K people (excluding you), in a line. If it is impossible to do, the output contains -1 instead.</p>

### 힌트

<p>Explanation for the 1st sample case</p>

<p>For the first sample, if you start the meeting 2.5 seconds after you arrived, the meeting will be attended by the first two subordinates.</p>

<p>Explanation for the 2nd sample case</p>

<p>For the second sample, you can adjust the arrival time of the third subordinate to become one second later.</p>

<p>Explanation for the 3rd sample case</p>

<p>For the third sample, you can adjust the arrival time of the second subordinate to become one second later and start the meeting 0.71863781 seconds after you arrived.</p>

<p>Explanation for the 4th sample case</p>

<p>For the fourth sample, you cannot adjust any of the arrival time to satisfy your needs.</p>