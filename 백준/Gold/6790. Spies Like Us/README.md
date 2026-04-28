# [Gold I] Spies Like Us - 6790

[문제 링크](https://www.acmicpc.net/problem/6790)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 43, 정답: 25, 맞힌 사람: 17, 정답 비율: 60.714%

### 분류

비트 집합, 브루트포스 알고리즘

### 문제 설명

<p>The Ultrasecret Spy Organization is very concerned about recent leads concerning a secret conspiracy involving the use of the Comic Sans font.</p>

<p>In order to avoid groupthink, the Ultrasecret Spy Organization has decided to divide its agents in two groups. Each of the two groups will carry its own investigation. However, occassionally interaction between members of different groups will happen through some previously designated contact points (i.e. two people on different teams that are allowed to speak with each other in special circumstances). This has to be made in a way that preserves the fact that there is not much communication between the teams. To make this rule more exact, two people on the same team can have no more than one common contact on the other team.</p>

<p>You are given a plan for the contact points between the two groups. Your task is to determine whether this actually satisfies the constraint that two people on the same team can have no more than one common contact in the other team.</p>

### 입력

<p>The first line of the input file will contain two space-separated integers N and M, (1 &le; N, M &le; 2000). They represent the number of people in each of the teams. The next line will contain an integer K, (0 &le; K &le; NM). Each of the following K lines will containg two integers i and j, with (1 &le; i &le; N, 1 &le; j &le; M). This input will represent that person i of the first team and person j of the second team are allowed to communicate with each other.</p>

### 출력

<p>For each input, you will output one line. Its content will be <code>YES</code>, if the proposal satifies the constraint that two people on the same team can have no more than one common contact on the other team, and <code>NO</code> otherwise.</p>