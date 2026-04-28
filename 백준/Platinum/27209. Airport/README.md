# [Platinum II] Airport - 27209

[문제 링크](https://www.acmicpc.net/problem/27209)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 57, 정답: 17, 맞힌 사람: 17, 정답 비율: 34.694%

### 분류

자료 구조, 그리디 알고리즘, 집합과 맵, 트리를 사용한 집합과 맵

### 문제 설명

<p>In EGOI Airport, there are $N$ runways, numbered from $1$ to $N$. In this airport, for an airplane, it takes $K$ minutes to take off, and $L$ minutes to land. During a takeoff or landing of an airplane, a runway is occupied by the airplane for a duration of $K$ or $L$ minutes.</p>

<p>JOI-kun is working at EGOI Airport. His job is to arrange the schedule of takeoffs and landings for a contiguous time slot of $T$ minutes. The beginning of the time slot is time $0$. The time when $t$ minutes passed after the beginning of the time slot is time $t$. The end of the time slot is time $T$.</p>

<p>In the time slot, $M$ airplanes will arrive at EGOI Airport. They are numbered from $1$ to $M$. The ($1 &le; i &le; M$) will start landing at time $A_i$. But the runway used by airplane $i$ is not yet fixed. It will be fixed by JOI-kun. The schedule for the takeoffs is not fixed at all. JOI-kun will decide the number of airplanes which will take off, the time of a takeoff of each airplane, and the runway used by it.</p>

<p>In summary, the schedule has to obey the following <strong>rules</strong>.</p>

<ul>
	<li>It is not allowed that more than one airplane take off or land at the same time in the same runway. However, it is allowed that an airplane starts taking off or landing, just after another airplane finished taking off or landing in the same runway.</li>
	<li>All takeoffs and landings should be finished in the time slot of $T$ minutes. Namely, it is not allowed for an airplane to start taking off or landing before time $0$. It is not allowed for an airplane to finish taking off or landing after time $T$.</li>
</ul>

<p>JOI-kun wants to arrange the schedule so that it obeys the above rules, and the number of airplanes which will take off is maximized.</p>

<p>Write a program which, given the number of runways, the number of airplanes which will land, the length of the time slot, the time required for a takeoff, the time required for a landing, and the time when each airplane will start landing, calculates the maximum possible number of airplanes which will take off from EGOI Airport. If it is not possible to arrange the schedule so that it obeys the rules, your program should report it.</p>

### 입력

<p>Read the following data from the standard input. Given values are all integers.</p>

<blockquote>
<p>$N$ $M$ $T$ $K$ $L$</p>

<p>$A_1$ $A_2$ $\cdots$ $A_M$</p>
</blockquote>

### 출력

<p>Write one line to the standard output. The output should contain the maximum possible number of airplanes which will take off from EGOI Airport. If it is not possible to arrange the schedule so that it obeys the rules, output -1.</p>

### 제한

<ul>
	<li>$1 &le; N &le; 100\,000$.</li>
	<li>$1 &le; M &le; 100\,000$.</li>
	<li>$1 &le; T &le; 1\,000\,000\,000 (= 10^9)$.</li>
	<li>$1 &le; K &le; T$.</li>
	<li>$1 &le; L &le; T$.</li>
	<li>$0 &le; A_i &le; T - L$ ($1 &le; i &le; M$).</li>
</ul>