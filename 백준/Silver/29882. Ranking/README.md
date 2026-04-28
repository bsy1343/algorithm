# [Silver III] Ranking - 29882

[문제 링크](https://www.acmicpc.net/problem/29882)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 71, 정답: 57, 맞힌 사람: 39, 정답 비율: 90.698%

### 분류

자료 구조, 해시를 사용한 집합과 맵, 정렬, 집합과 맵

### 문제 설명

<p>Charlotte Michelle Simone is organizing the Especially Interesting Olympiad. Now she has the solutions of all the participants and needs to compile the ranking.</p>

<p>There are several tasks in the olympiad. Each participant can submit any number of solutions for each task, and each solution scores some number of points. The score of a participant for a task is the maximum of the scores of their solutions for that task (or zero, if they did not submit any solutions for that task). The total score of a participant is the sum of their scores over all tasks.</p>

<p>Write a program to compile the ranking of the participants according to their total scores.</p>

### 입력

<p>The first line contains an integer $N$, the number of solutions submitted ($1 \le N \le 200\,000$).</p>

<p>Each of the following $N$ lines describes one solution, giving the account name of the participant, the name of the task, and the number of points the solution scored, separated from each other by spaces. Each account name and each task name consists of 1 to 20 lower-case letters of the Latin alphabet. Each solution may score 0 to 100 points (always an integer).</p>

<p>You may assume that there are no more than $10\,000$ participants and no more than $10$ tasks.</p>

### 출력

<p>Output one line per participant, listing their account name and total score, separated by a space. The lines should be ordered in the non-increasing order of the scores. The lines with equal scores may be listed in any order.</p>