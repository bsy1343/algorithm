# [Silver V] VLAK - 8978

[문제 링크](https://www.acmicpc.net/problem/8978)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 85, 정답: 59, 맞힌 사람: 51, 정답 비율: 67.105%

### 분류

구현, 문자열, 시뮬레이션

### 문제 설명

<p>An empty train on a train station is waiting for passengers to board. The train consists of N cars and each car can accommodate K passengers.&nbsp;</p>

<p>The train station is swamped with strange demands. Passengers board the train one by one and go to one of the cars in which there are free seats left. Each passenger chooses a car to board according to the following rules:&nbsp;</p>

<ol>
	<li>Of all the cars which are not full, the passenger chooses the one which has the fewest passengers whose names start with the same letter as his.&nbsp;</li>
	<li>If there are multiple cars which have the same fewest number of such passengers, the passenger chooses the one with the smallest total number of passengers.&nbsp;</li>
	<li>If there are still multiple cars, the passenger boards the first of these.&nbsp;</li>
</ol>

<p>Write a program that, given the list of passengers which are boarding the train, determines the number of passengers in each car after boarding has completed.&nbsp;</p>

### 입력

<p>The first line contains two integers N and K, 1 &le; N &le; 10, 1 &le; K &le; 10, the number of cars and the number of passengers each car can accomodate.&nbsp;</p>

<p>The second line contains an integer P, 1 &le; P &le; N&middot;K, the number of passengers waiting to board.&nbsp;</p>

<p>The next P lines contain the names of all passengers, in order in which they will board. The name of each passenger is a string of at most 10 lowercase letters of the English alphabet. No two passengers will have the same name.&nbsp;</p>

### 출력

<p>Output N integers separated by single spaces on a single line, the number of passengers in each car, in order from first car to last.&nbsp;</p>

### 힌트

<p>Clarification for first example: When Anka is boarding, the train is empty; according to rules 1 and 2 she can choose any car, so she chooses the first car according to rule 3. Rule 1 also allows Branko to entery any car, but rule 2 limits him to the second and third. By rule 3 he enters the second car. Cvjetko enters the third car by rule 3, since it is empty.</p>