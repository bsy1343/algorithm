# [Platinum I] Schools - 11848

[문제 링크](https://www.acmicpc.net/problem/11848)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 256 MB

### 통계

제출: 441, 정답: 110, 맞힌 사람: 91, 정답 비율: 30.743%

### 분류

자료 구조, 그리디 알고리즘, 정렬, 우선순위 큐

### 문제 설명

<p>Recently Akim of some state decided to open exactly M music and S sports schools to support education in the state. There are N different cities in the state. For each of the cities both the number of students ready to study in music school and the number of students ready to study in sports school is known. Being a big fan of efficiency, Akim doesn&#39;t want to open more than one school in any city (it&#39;s possible that he won&#39;t open any school in some cities).</p>

<p>You, as Akim&#39;s consultant, are given a task of developing a plan that would maximize the number of students that would study in the newly opened schools in the state.</p>

### 입력

<p>First line of input contains three integer numbers: N (1 &le; N &le; 300000), M, S (0 &le; min(M, S), M + S &le; N) - the number of cities in the state, the number of music and sports schools that Akim wishes to open respectively.</p>

<p>Each of the following N lines contains two integer numbers: A<sub>i</sub> (1 &le; A<sub>i</sub> &le; 10<sup>5</sup>) and B<sub>i</sub> (1 &le; B<sub>i</sub> &le; 10<sup>5</sup>) - the number of students in the i-th city that wish to study in music and sports school respectively.</p>

### 출력

<p>Output one integer number - the number of students that will study in the newly opened schools in an optimal plan.</p>