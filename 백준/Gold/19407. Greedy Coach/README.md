# [Gold III] Greedy Coach - 19407

[문제 링크](https://www.acmicpc.net/problem/19407)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 72, 정답: 25, 맞힌 사람: 17, 정답 비율: 50.000%

### 분류

그리디 알고리즘, 해 구성하기

### 문제 설명

<p>A certain contest system contains $n$ problemsets, numbered from 1 to $n$. Sometimes, the coach wants to hold a training for a team of three of his students. Every training uses exactly one problemset. The coach has to assign a problemset for the training such that none of the students on the team took part in a training with the same set before. In case this is impossible, the training is not conducted.</p>

<p>Consider the following two greedy strategies of assigning a problemset to a team of students for training.</p>

<p>The first strategy, which we&#39;ll call <em>strategy A</em>, is to assign the lowest-numbered problemset which hasn&#39;t yet been seen by any of the students on the team.</p>

<p>The second strategy, which we&#39;ll call <em>strategy B</em>, is to assign the problemset which has been seen by the largest number of students in total during the previous trainings and, at the same time, has not yet been seen by any of the students on the team. In case there are several such problemsets, strategy B is to assign the lowest-numbered of those.</p>

<p>We want to find out if one of the strategies is strictly better than the other. First, you&#39;re asked to report there&#39;s none or find such integer $n$ and such a sequence of team formations that strategy A allows to assign problemsets for all trainings, while strategy B doesn&#39;t allow to assign a problemset for at least one training. Second, the same question is asked with regard to a situation where strategy B allows to assign problemsets for all trainings while strategy A doesn&#39;t.</p>

### 입력

<p>The only line of the input contains a single integer $t$ ($0 \le t \le 2$). If $t = 0$, you&#39;re allowed to output either $-1$ or any valid sequence of team formations. If $t = 1$, you have to find a situation where strategy A allows to assign problemsets for all trainings, while strategy B doesn&#39;t. If $t = 2$, you have to find a situation where strategy B allows to assign problemsets for all trainings, while strategy A doesn&#39;t.</p>

<p>Test case 1 has $t = 0$, test case 2 has $t = 1$, and test case 3 has $t = 2$.</p>

### 출력

<p>If the required situation is impossible, output a single integer $-1$. Otherwise, output two integers $n$ and $q$ ($1 \le n \le 100$; $1 \le q \le 10^4$) --- the number of problemsets and the number of trainings. Each of the following $q$ lines must contain three non-empty strings $a_i$, $b_i$ and $c_i$ --- the identificators of students on the team. These lines should correspond to teams going for a training in chronological order. Student identificators must consist of lowercase English letters and digits. Different identificators must belong to different students, and each team must consist of three different students. It&#39;s guaranteed that if the required situation is possible, there also exists one with $n \le 100$ and $q \le 10^4$.</p>

### 힌트

<p>In the example test case, if the coach follows any of the two strategies, the first and the third trainings will be held on problemset 1, while the second and the fourth trainings will be held on problemset 2.</p>