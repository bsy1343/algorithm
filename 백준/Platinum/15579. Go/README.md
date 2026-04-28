# [Platinum IV] Go - 15579

[문제 링크](https://www.acmicpc.net/problem/15579)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 512 MB

### 통계

제출: 106, 정답: 37, 맞힌 사람: 31, 정답 비율: 38.272%

### 분류

다이나믹 프로그래밍

### 문제 설명

<p>Branimirko is still a passionate player of the world-renowned game Pok&eacute;mon Go. Recently, he decided to organize a competition in catching Pok&eacute;mon. It will be held in Ilica street in Zagreb, and the main sponsor is his friend Slavko. The reward is, of course, candy!</p>

<p>Ilica is, as we all know, the longest street in Zagreb. There are N houses on the same side of the street, and each house has a house number between 1 and N. The competition begins at house number K.</p>

<p>Before the competition, Branimirko looked at the map and saw M Pok&eacute;mon. Each Pok&eacute;mon is located at its (distinct) house number A<sub>i</sub>, is valued at B<sub>i</sub> candy, and can be caught only in the next T<sub>i</sub> seconds, after which it disappears from the map and is impossible to catch.</p>

<p>Branimirko can visit one house number per second. Also, when he catches a Pok&eacute;mon, that Pok&eacute;mon disappears from the map.</p>

<p>Since Branimirko really likes candy, he asked for your help.</p>

<p>Help him and determine the maximal amount of candy he can get!</p>

### 입력

<p>The first line of input contains integers N, K (1 &le; K &le; N &le; 1 000) and M (1 &le; M &le; 100), the number of houses, the starting house number and the number of Pok&eacute;mon.</p>

<p>Each of the following M lines contains integers A<sub>i</sub> (1 &le; A<sub>i</sub> &le; N), B<sub>i</sub> (1 &le; B<sub>i</sub> &le; 100) and T<sub>i</sub> (1 &le; T<sub>i</sub> &le; 2 000) from the task.</p>

<p>In the input data, the Pok&eacute;mon will always be in a strictly ascending order by house number A<sup>i</sup>.</p>

### 출력

<p>You must output the required maximal amount of candy from the task.</p>

### 힌트

<p><strong>Clarification of the first test case:</strong></p>

<p>One strategy is that Branimirko first catches the Pok&eacute;mon at house number 3 (5 candy), then, respectively, house numbers 7 (10 candy) and 9 (100 candy) for a total of 115 candy.</p>

<p>Notice that Branimirko can&rsquo;t catch the Pok&eacute;mon at house number 1, because he can&rsquo;t reach it in time from his starting position (house number 5).</p>