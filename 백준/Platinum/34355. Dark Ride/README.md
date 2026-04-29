# [Platinum III] Dark Ride - 34355

[문제 링크](https://www.acmicpc.net/problem/34355)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 2048 MB

### 통계

제출: 15, 정답: 11, 맞힌 사람: 8, 정답 비율: 66.667%

### 분류

비트마스킹, 애드 혹, 이분 탐색, 홀짝성

### 문제 설명

<p>Erika recently got a summer job at the amusement park Phantasialand near Bonn. She was hired to control the lights in the rooms through which a dark ride passes.</p>

<p>The ride passes through $N$ rooms, numbered from $0$ to $N-1$. The rooms are traversed in order, starting in room $0$ and ending in room $N-1$. The lights in the rooms are controlled by $N$ switches (also numbered from $0$ to $N-1$), one for each room. Switch $s$ (where $0\le s &lt; N$) controls the light in room $p_{s}$.</p>

<p>Erika's boss has asked her to turn on the lights in the first and last rooms and turn off all the others. Sounds easy, right? She just needs to turn on the two switches $A$ and $B$ such that $p_{A} = 0$ and $p_{B} = N-1$ (or $p_{B} = 0$ and $p_{A} = N-1$). Unfortunately, Erika did not fully pay attention when her boss described the controls, and <strong>she does not remember the array $p$ -- that is, which switch controls which room</strong>.</p>

<p>Erika needs to figure this out before her boss notices. Before the start of each ride, Erika turns off all the lights and can then turn on a subset of the switches. As the ride goes from room to room, whenever the ride goes from a lit room to an unlit room or vice versa, Erika will hear the passengers scream in excitement. The speed of the ride can vary, so Erika cannot directly infer which rooms are lit but at least she will hear the number of screams. That is, she will learn the number of times the ride passes from lit to unlit room, or unlit to lit room.</p>

<p>Can you help Erika figure out which two switches control the lights for the first and last rooms before her boss notices? You can use at most $30$ rides.</p>

### 입력



### 출력



### 제한

<ul>
	<li>$3 \le N \le 30\,000$.</li>
	<li>You can issue at most $30$ rides (printing the final answer does not count as a ride). If you exceed this, you will get the verdict 'Wrong Answer'.</li>
</ul>