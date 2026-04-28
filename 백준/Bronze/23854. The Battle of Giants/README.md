# [Bronze II] The Battle of Giants - 23854

[문제 링크](https://www.acmicpc.net/problem/23854)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 512 MB

### 통계

제출: 384, 정답: 244, 맞힌 사람: 195, 정답 비율: 62.300%

### 분류

수학, 그리디 알고리즘, 사칙연산

### 문제 설명

<p>The famous programming contest organizer decided to hold competition for champions &quot;The Battle of Giants&quot;. There are two teams competing in the battle. Several matches are organized for the competition.</p>

<p>Each match can end with a win for one of the teams, or with a draw. When a team wins the match it scores 3 points, in this case the opposite team doesn&#39;t score any point. In the case of a draw, teams score 1 point each. After all the matches end, the final score $a$:$b$ is calculated: $a$ and $b$ --- the number of points scored by the first and second team, respectively.&nbsp;</p>

<p>For example, if the first match is won by the first team, the second match ended with a draw, and the third match is also won by the first team, the final score is 7:1.</p>

<p>You are given the final score. Find out whether the given score is possible, and what is the minimum number of matches could be. Print the number of matches won by the first team, the number of matches ended with a draw, and the number of matches won by the second team.</p>

### 입력

<p>The first line contains a single integer $a$ --- the number of points scored by the first team.</p>

<p>The first line contains a single integer $b$ --- the number of points scored by the second team.</p>

<p>The given $a$ and $b$ are nonnegative and don&#39;t exceed $10^9$.</p>

### 출력

<p>If the given final score isn&#39;t possible, print $-1$.</p>

<p>Otherwise, print three integers: the number of matches won by the first team, the number of matches ended with a draw, and the number of matches won by the second team, respectively. Find any solution with the minimum number of matches played.</p>