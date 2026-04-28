# [Gold III] School Olympiad - 19834

[문제 링크](https://www.acmicpc.net/problem/19834)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 512 MB

### 통계

제출: 28, 정답: 8, 맞힌 사람: 7, 정답 비율: 30.435%

### 분류

누적 합, 정렬, 두 포인터

### 문제 설명

<p>School olympiad in informatics will take place in the capital of Lineland tomorrow.</p>

<p>All houses in the capital are located at integer points along the straight Main street. The Olympiad will take place at three locations at the Main street. Every location has a limit on the maximum number of participants.</p>

<p>The first location is at the point with coordinate $a$, it&#39;s limit is $n_a$ participants. The second location is at the point with coordinate $b$, it&#39;s limit is $n_b$ participants. The third location is at the point with coordinate $c$, it&#39;s limit is $n_c$ participants.</p>

<p>There are $n$ students that are going to participate in the Olympiad, the $i$-th of them lives in the house that is located at the point with coordinate $x_i$. Organizers need to choose a participation location for each student. It&#39;s forbidden to exceed the limit of a location. It&#39;s guaranteed that the total limit is enough for all students to participate.</p>

<p>If a student lives at a point with coordinate $p$, and a location that he would participate at is at a point with coordinate $q$, they must walk a distance of $|p - q|$ before the Olympiad. Help organizers to find the minimum total distance that the students would have to walk before the Olympiad in case of optimal assignment of students to the three locations.</p>

### 입력

<p>The first line contains two integers $a$ and $n_a$  --- the coordinate of the first location and its participation limit, the second line contains two integers $b$ and $n_b$  --- the coordinate of the second location and its participation limit, the third line contains two integers $c$ and $n_c$  --- the coordinate of the third location and its participation limit ($-10^9 \le a, b, c \le 10^9$; $1 \le n_a, n_b, n_c \le 100\,000$).</p>

<p>The fourth line contains an integer $n$  --- the number of students ($1 \le n \le 100\,000$, $n \le n_a + n_b + n_c$).</p>

<p>The next line contains $n$ integers $x_i$  --- the coordinates of the students&#39; houses ($-10^9 \le x_i \le 10^9$).</p>

### 출력

<p>Output one integer  --- the minimum possible total distance that the students would have to walk before the Olympiad.</p>