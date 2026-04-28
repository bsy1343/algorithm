# [Platinum IV] Snowball Fight - 7010

[문제 링크](https://www.acmicpc.net/problem/7010)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 12, 정답: 2, 맞힌 사람: 2, 정답 비율: 40.000%

### 분류

수학, 다이나믹 프로그래밍, 비트마스킹, 게임 이론, 확률론, 비트필드를 이용한 다이나믹 프로그래밍

### 문제 설명

<p>One of the best things to do when there is a thick layer of snow on the ground is to pack the snow into balls and throw it at other people. This is what is known as a snowball fight.</p>

<p>Currently, there is a snowball fight breaking out between two equally numbered teams. We will call them team A and team B. Because they have been fighting for some time and the sun is beginning to set, these teams have decided to determine the winning team of the fight through a sort of team duel.</p>

<p>Each person on each team will have one chance to throw a snowball at a member of the other team. The order in which people throw snowballs is set before the duel begins. Let a<sub>i</sub> denote the ith person on team A, and the same for team B. Then the initial order is a<sub>1</sub>, b<sub>1</sub>, a<sub>2</sub>, b<sub>2</sub>, ...</p>

<p>The duel starts when a member of team A makes his or her shot. When a team member is hit by a snowball they are knocked out of the duel. When it is someone&rsquo;s turn to take a shot and they are out of the duel their turn is skipped and the next person in the initial ordering who is not knocked out gets to take a shot. For example, if a<sub>1</sub> knocks out b<sub>1</sub> then the next person to throw will be a<sub>2</sub>. The team with the most members remaining at the end wins the duel. If both teams have the same number of members remaining then the duel ends in a draw.</p>

<p>Furthermore, each participant in the snowball fight knows the probability that each person has of making his or her shot (we assume the probability is the same no matter the target). Each person will choose his or her target to maximize the probability of his or her team winning. If there are multiple targets with the highest probability of granting his or her team the win, he or she will choose the target among them that leads to the lowest probability of the other team winning. Your job is to write a program to find out what the odds are of either team winning, or of the duel ending in a draw.</p>

### 입력

<p>The first line is the number K of input data sets, followed by the K data sets, each of the following form:</p>

<p>The first line of each data set contains the number of players on each team, 2 &le; N &le; 8. This followed by 2 lines. These lines each contain N floating point numbers, each printed to two decimal places. The ith number on the first line is the probability that the ith person on team A will make his or her shot. The ith number on the second line is the same for people on team B. For each probability p, 0 &le; p &le; 1.</p>

### 출력

<p>For each data set, output &ldquo;Data Set x:&rdquo; on a line by itself, where x is its number. On the next line, output the probability that team A will win, the probability that team B will win, and the probability that the fight ends in a draw. Each probability should have two digits after the decimal. Output a single blank space between two consecutive probabilities. Each data set should be followed by a blank line.</p>