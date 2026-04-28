# [Platinum II] It Can Be Arranged - 9590

[문제 링크](https://www.acmicpc.net/problem/9590)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 128 MB

### 통계

제출: 48, 정답: 32, 맞힌 사람: 26, 정답 비율: 68.421%

### 분류

최대 유량, 그래프 이론

### 문제 설명

<p>Every year, several universities arrange inter-university national programming contests. ACM ICPC Dhaka site regional competition is held every year in Dhaka and one or two teams are chosen for ACM ICPC World Finals.</p>

<p>By observing these, MMR (Mission Maker Rahman) has made a plan to open a programming school. In that school, N courses are taught. Each course is taught every day (otherwise, programmers may forget DP while learning computational geometry!). You will be given the starting time A<sub>i</sub> and finishing time B<sub>i</sub> (inclusive) of each course i (1 &le; i &le; N). You will be also given the number of students registered for each course, S<sub>i</sub> (1 &le; i &le; N). You can safely assume no student has registered to two different courses. MMR wants to hire some rooms of a building, named Sentinel Tower, for running that school. Each room of Sentinel Tower has a capacity to hold as much as M students. The programmers (students) are very restless and a little bit filthy! As a result, when course<sub>i</sub> is taken in a class room, after the class is finished, it takes clean<sub>ij</sub> time to clean the room to make it tidy for starting teaching course<sub>j</sub> immediately just after course<sub>i</sub> in the same room.</p>

<p>Your job is to help MMR to decide the minimum number of rooms need to be hired to run the programming school.</p>

### 입력

<p>Input starts with an integer T (T &le; 100) denoting the number of test cases. Each case starts with two integers N (1 &le; N &le; 100), number of courses and M (1 &le; M &le; 10000), capacity of a room. Next N lines will contain three integers A<sub>i</sub>, B<sub>i</sub> (0 &le; A<sub>i</sub> &le; B<sub>i</sub> &le; 10000000) and S<sub>i</sub> (1 &le; S<sub>i</sub> &le; 10000), starting and finishing time of a course. Next N lines will contain the clean time matrix, where the i<sup>th</sup> row will contain N integers clean<sub>ij</sub> (1 &le; i &le; N, 1 &le; j &le; N, 0 &le; clean<sub>ij</sub> &le; 10000000, clean<sub>ii</sub> = 0).</p>

### 출력

<p>For each case, print the test case number, starting from 1, and the answer, minimum number of rooms needed to be hired.</p>