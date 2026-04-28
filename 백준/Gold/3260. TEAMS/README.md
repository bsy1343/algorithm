# [Gold I] TEAMS - 3260

[문제 링크](https://www.acmicpc.net/problem/3260)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 44, 정답: 11, 맞힌 사람: 10, 정답 비율: 58.824%

### 분류

다이나믹 프로그래밍, 그래프 이론, 그래프 탐색

### 문제 설명

<p>Friends from the neighbourhood gathered on the school playground to play a football match. They need to be divided into two teams. Players have T-shirts numbered 1 to N in a way that the best player has number 1 and the worst player has number N.</p>

<p>Teams must have an equal number of players and are formed in the following way. Each of the players makes a list of his colleagues with whom he doesn&rsquo;t want to be in the same team. Naturally, everyone wants to play with those who are better players than him and therefore his list contains only players worse than he is.</p>

<p>Your task is to write a program that will separate friends into two teams having an equal number of players in order that each player&rsquo;s wishes are respected.&nbsp;</p>

### 입력

<p>First line of the input file contains of an even integer N, 2 &le; N &le; 1000, a number of friends.</p>

<p>Each of the next N lines has a single player&rsquo;s wish-list, (i+1)-th line having an i-th player&rsquo;s wish-list in the following form:</p>

<pre>
K A<sub>1</sub> A<sub>2</sub> ... A<sub>K</sub></pre>

<p>This means that i-th player doesn&rsquo;t want any of A<sub>1</sub>, A<sub>2</sub>, ..., A<sub>K</sub> in his team.&nbsp;</p>

### 출력

<p>The first and only line of the output file should contain T-shirt numbers of players of either of the teams, separated by a single space. Ordering of the players is irrelevant.</p>

<p>Test data will be such that the solution will always exist, although it may not be necessarily unique.</p>