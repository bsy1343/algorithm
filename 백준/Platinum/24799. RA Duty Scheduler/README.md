# [Platinum III] RA Duty Scheduler - 24799

[문제 링크](https://www.acmicpc.net/problem/24799)

### 성능 요약

시간 제한: 1 초 (추가 시간 없음), 메모리 제한: 1024 MB

### 통계

제출: 85, 정답: 17, 맞힌 사람: 11, 정답 비율: 28.947%

### 분류

그래프 이론, 최대 유량, 이분 매칭

### 문제 설명

<p>Resident Advisors (or RAs) at Virginia Tech are student leaders who are responsible for helping freshmen transition smoothly to college life. Mr. Friedel is trying to design a system to assist him in the process of scheduling Resident Advisors (RAs) to be on duty every month. On each day there are exactly 2 RAs on duty. Unfortunately for Mr. Friedel, each RA is available only on specific days and can only be scheduled then. &nbsp;Before the end of each month, each RA submits a list of days with their availability to Mr. Friedel. &nbsp;</p>

<p>Your goal is to help him write a program that will take a list of RAs and their availabilities and assign two RAs for duty on each day. &nbsp;</p>

<p>While there is no limit for how many days each RA can be on duty, Mr. Friedel wants to reduce unfairness by limiting the imbalance between the number of days each RA is assigned.</p>

<p>Towards that goal, your program needs to minimize the maximum number of days to which any RAs may be assigned.</p>

### 입력

<p>The input consists of a single test case. The first line contains $2$ numbers $m$ ($2 \le m \le 60$) and $n$ ($28 \le n \le 31$) where $m$ is the number of RAs and $n$ is the total number of days this month. This is followed by $m$ lines where each line consists of the name of the RA followed by an integer $d$ ($1 \le d \le n$) denoting the number of days this RA is available. &nbsp;The remainder of the line consists of $d$ unique integers $i$ ($1 \le i \le n$) denoting the days on which this RA is available. Each RA&#39;s name is a string between $1$ and $30$ characters consisting only of letters. You may assume that there is at least one possible assignments of RAs!</p>

### 출력

<p>On the first line, output the maximum number of days on which any RA is assigned. Following that, you should output $n$ lines starting with <code>Day k:</code> where $k$ is the number of the day ranging from $1$ to $n$ (inclusive and in order), followed by a space, followed by the names of two RAs scheduled for that day, separated by spaces. &nbsp;The two RAs scheduled for a given day can be listed in any order.</p>

<p>If there are multiple valid assignments, you may output any of them!</p>