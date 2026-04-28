# [Gold II] Homework - 9053

[문제 링크](https://www.acmicpc.net/problem/9053)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 128 MB

### 통계

제출: 31, 정답: 6, 맞힌 사람: 6, 정답 비율: 54.545%

### 분류

비트마스킹, 브루트포스 알고리즘, 다이나믹 프로그래밍, 비트필드를 이용한 다이나믹 프로그래밍

### 문제 설명

<p>Professor Bae teaches a class titled &ldquo;Problem Solving&rdquo; in Gyeryong University. In his class, the attendants discuss with each other about problems assigned as homework the day just before the class. Thus, the attendants should complete the homework just in one day.</p>

<p>Professor Bae, who is lazy, announces the homework problems to only one of the attendants and he wishes every attendant inform the homework via phone calls by each other. Fortunately, every attendant knows every other&rsquo;s phone number. Each attendant, however, does not immediately broadcast this announcement of homework to others because every attendant is crazy for score, but informs others after completing the homework.</p>

<p>Assume that N students (s<sub>1</sub>, s<sub>2</sub>, &hellip;, s<sub>N</sub>) are enrolled as the attendants of this strange class and s<sub>i</sub> takes t<sub>i </sub>hours to complete a homework assignment. Also, after a student completes the homework, he makes a phone call to students who have not been informed yet, one per every hour.</p>

<p>Write a program to compute the shortest time (in hours) for every attendant to complete homework under assuming the above.</p>

<p>For example, if Professor Bae announces a homework assignment to s<sub>1</sub> at 3 o&rsquo;clock, where N = 3, t<sub>1</sub> = 1(hour), t<sub>2</sub> = 1 and t3 = 3, then s<sub>1</sub> completes his homework at 4 o&rsquo;clock. If s<sub>1</sub> informs s<sub>2</sub> at 4 o&rsquo;clock, then at 5 o&rsquo;clock s<sub>1</sub> or s<sub>2</sub> can inform it to s<sub>3</sub> after s<sub>2</sub> completes the homework. Finally s<sub>3</sub> completes his homework at 8 o&rsquo;clock. In this case it takes 5 hours for every attendant to complete the homework. But it can be completed in 4 hours if s<sub>1</sub> informs it to s<sub>3</sub> first at 4 o&rsquo;clock.&nbsp;</p>

### 입력

<p>Your program is to read from standard input. The input consists of T test cases. The number of test cases T (1 &le; T &le; 20) is given in the first line of the input. The first line of each test case contains an integer N (1 &le; N &le; 10) which is the number of students. The next line contains N integers t<sub>1</sub>, t<sub>2</sub>, &hellip;, t<sub>N</sub> (1 &le; t<sub>i</sub> &le; 10). Assume that Professor Bae first announces his homework to s<sub>1</sub>.</p>

### 출력

<p>Your program is to write to standard output. Print exactly one line for each test case. The line should contain an integer that is time every student can complete homework in the shortest.&nbsp;</p>