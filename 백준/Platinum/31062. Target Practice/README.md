# [Platinum IV] Target Practice - 31062

[문제 링크](https://www.acmicpc.net/problem/31062)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 1024 MB

### 통계

제출: 153, 정답: 62, 맞힌 사람: 55, 정답 비율: 46.218%

### 분류

구현, 시뮬레이션, 누적 합, 많은 조건 분기

### 문제 설명

<p>Bessie is a robovine, also known as a cowborg. She is on a number line trying to shoot a series of $T$ $(1 \leq T \leq 10^5)$ targets located at distinct positions. Bessie starts at position $0$ and follows a string of $C$ $(1 \leq C \leq 10^5)$ commands, each one of L, F, or R:</p>

<ul>
	<li>L: Bessie moves one unit to the left.</li>
	<li>R: Bessie moves one unit to the right.</li>
	<li>F: Bessie fires. If there is a target at Bessie&#39;s current position, it is hit and destroyed, and cannot be hit again.</li>
</ul>

<p>If you are allowed to change up to one command in the string to a different command before Bessie starts following it, what is the maximum number of targets that Bessie can hit?</p>

### 입력

<p>The first line contains $T$ and $C$.</p>

<p>The next line contains the locations of the $T$ targets, distinct integers in the range $[-C,C]$.</p>

<p>The next line contains the command string of length $C$, containing only the characters F, L, and R.</p>

### 출력

<p>Print the maximum number of targets that Bessie can hit after changing up to one command in the string.</p>