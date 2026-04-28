# [Gold II] STUDENTSKO - 10547

[문제 링크](https://www.acmicpc.net/problem/10547)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 64 MB

### 통계

제출: 154, 정답: 84, 맞힌 사람: 74, 정답 비율: 52.482%

### 분류

다이나믹 프로그래밍, 가장 긴 증가하는 부분 수열 문제

### 문제 설명

<p>The annual student team competition in table tennis of students enrolled in University of Zagreb takes place next Saturday! Each team consists of K students. The excited students, N of them, are waiting in queue to register.</p>

<p>Kre&scaron;o works at the registration desk. He doesn&rsquo;t really feel like doing his job so he decided not to allow students to choose a team. He decided that the first team will consist of the first K students standing in queue, the second team the following K students, the third one the following K students and so on. . . (N will be divisible by K so nobody is left hanging.)</p>

<p>Ante has estimated the skill of each player with an integer. He would like to have the K strongest players in the first team, the following K strongest in the second team and so on. . .</p>

<p>Kre&scaron;o has just taken a break and Ante decided to shift the students standing in queue so that he achieves his goal. The way he shifts them is that he tells a student to step out of the queue and go back in queue after another student or to go to the front of the queue. It takes him one minute to do this.</p>

<p>It&rsquo;s possible that Kre&scaron;o is going to return from his break any moment so Ante needs to achieve his goal as soon as possible. Help Ante determine the minimal number of minutes necessary for him to achieve his goal.</p>

### 입력

<p>The first line of input contains the integers N and K (1 &le; K &le; N &le; 5 000). The integer N is going to divisible by K.</p>

<p>The second line contains N space separated integers v<sub>i</sub> (1 &le; v<sub>i</sub> &le; 10<sup>9</sup>), ith number denotes the skill of the ith player standing in queue.</p>

<p>All contestants are going to have distinct levels of skill.</p>

### 출력

<p>The first and only line of output must contain the minimal required number of minutes.</p>

### 힌트

<p>Clarification of the third example: Ante should move the students with skill levels 5, 6 and 3 to the front of the queue. It takes him three minutes to do that.</p>