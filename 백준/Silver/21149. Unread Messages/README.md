# [Silver III] Unread Messages - 21149

[문제 링크](https://www.acmicpc.net/problem/21149)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 512 MB

### 통계

제출: 151, 정답: 63, 맞힌 사람: 59, 정답 비율: 48.760%

### 분류

자료 구조, 집합과 맵, 해시를 사용한 집합과 맵

### 문제 설명

<p>There is a group of people in an internet email message group. Messages are sent to all members of the group, and no two messages are sent at the same time.</p>

<p>Immediately before a person sends a message, they read all their unread messages up to that point. Each sender also reads their own message the moment it is sent. Therefore, a person&rsquo;s unread messages are exactly the set of messages sent after that person&rsquo;s last message.</p>

<p>Each time a message is sent, compute the total number of unread messages over all group members.</p>

### 입력

<p>The first line of input contains two integers $n$ ($1 \le n \le 10^9$) and $m$ ($1 \le m \le 1,000$), where $n$ is the number of people in the group, and $m$ is the number of messages sent. The group members are identified by number, $1$ through $n$.</p>

<p>Each of the next $m$ lines contains a single integer $s$ ($1 \le s \le n$), which is the sender of that message. These lines are in chronological order.</p>

### 출력

<p>Output $m$ lines, each with a single integer, indicating the total number of unread messages over all group members, immediately after each message is sent.</p>