# [Silver III] IQ - 23542

[문제 링크](https://www.acmicpc.net/problem/23542)

### 성능 요약

시간 제한: 1 초 (추가 시간 없음), 메모리 제한: 64 MB

### 통계

제출: 87, 정답: 80, 맞힌 사람: 72, 정답 비율: 93.506%

### 분류

그리디 알고리즘, 정렬

### 문제 설명

<p>$2n$ newbie students came to competitive programming practice. Each student is characterized by his IQ level: the $i$-th student has IQ $a_i$.</p>

<p>The coach wants to break students up into teams of two people. Each team is characterized by a <em>team</em> IQ that is equal to the sum of the team members IQ levels. For example, if a team is formed from students $i$ and $j$, the team IQ is $a_i + a_j$. One team is stronger than the other if its team IQ is greater.</p>

<p>By the coach&#39;s opinion, practice will be much more productive if the difference between team IQs of the strongest and the weakest team is as small as possible. Help the coach determine the minimum value $A$ for which it is possible to form teams in such a way that difference of team IQs between the strongest and the weakest team is equal to $A$.</p>

### 입력

<p>The first line contains integer $n$ ($1 \le n \le 100$).</p>

<p>The second line contains $2n$ integers, the $i$-th of which is equal to the IQ of the $i$-th student $a_i$ ($1 \le a_i \le 200$, $1 \le i \le 2n$).</p>

### 출력

<p>Output the minimum value $A$ for which the forming of teams is possible.</p>