# [Gold I] Jet Lag - 31904

[문제 링크](https://www.acmicpc.net/problem/31904)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 1024 MB

### 통계

제출: 29, 정답: 19, 맞힌 사람: 18, 정답 비율: 64.286%

### 분류

구현, 그리디 알고리즘, 시뮬레이션

### 문제 설명

<p>The ICPC World Finals are here and they are packed full of activities you want to attend &mdash; speeches, presentations, fun events, not to mention the contest itself. There is only one problem: when are you going to sleep?</p>

<p>When you fall asleep, you always set a timer because otherwise you would be able to sleep forever. Using the timer, you can choose to sleep for any positive integer amount of minutes. After sleeping for $k$ minutes, you will be rested for another $k$ minutes (and so you will not be able to fall asleep again); and then you will be able to function for a third $k$ minutes (so you can stay awake, but you can also go to sleep if you want to).</p>

<p>You know the times of all the activities at the Finals; you should plan your sleep schedule to not miss any part of any event. Just before the Finals start (at minute $0$), you will arrive in your hotel room after a long journey and you will need to sleep immediately.</p>

### 입력

<p>The first line of input contains a positive integer $n$ ($1&le;n&le;200\,000$), the number of activities planned for the Finals.</p>

<p>The $i$th of the remaining $n$ lines contains two positive integers $b_i$ and $e_i$ ($b_i&lt;e_i$, $e_i&le;b_i+1$, $0&le;b_1, e_n&le;10^{10}$), the beginning and end time of the activity, counted in minutes from the beginning of the Finals.</p>

### 출력

<p>If it is possible to find a sleep schedule that allows you to participate in all planned activities in their entirety, then output such a schedule in the format described below. Otherwise, output <code>impossible</code>.</p>

<p>A sleep schedule is specified by a line containing the number $p$ ($1&le;p&le;10^6$) of sleep periods, followed by $p$ lines. The $i$th of these lines contains two integers $s_i$ and $t_i$ &mdash; the beginning and end time of the $i$th sleep period, counted in minutes from the beginning of the Finals. Note that you should not output any sleep period after the last activity.</p>

<p>The sleep periods must satisfy $0=s_1&lt;t_1&lt;s_2&lt;t_2&lt;\dots &lt;t_p&le;b_n$ as well as the condition described in the statement that does not allow you to fall asleep for some time after a sleep period. You may fall asleep immediately after an activity (so it may be that $s_i=e_j$) and you may wake up just before an activity (so it may be that $t_i=b_j$).</p>

<p>If there are multiple valid sleep schedules, any one will be accepted. It can be shown that if there is a valid sleep schedule, then there is also one with at most $10^6$ sleep periods.</p>