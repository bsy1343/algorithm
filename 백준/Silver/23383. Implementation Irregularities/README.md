# [Silver I] Implementation Irregularities - 23383

[문제 링크](https://www.acmicpc.net/problem/23383)

### 성능 요약

시간 제한: 1 초 (추가 시간 없음), 메모리 제한: 1024 MB

### 통계

제출: 281, 정답: 120, 맞힌 사람: 110, 정답 비율: 47.210%

### 분류

수학, 정렬

### 문제 설명

<p>Impressed by the performance of the top teams at the recent BAPC preliminaries, you started to wonder whether teams were allowed to use one or multiple computers to implement their solutions.</p>

<p>Instead of unnecessarily bothering the organization with more questions, you will figure this out by yourself. Being a jury member, you already have estimates for the computer time required to solve each problem.</p>

<p>Using this information, and the time in the contest at which the top team solved each of their solved problems, compute the minimal number of computers used by the team.</p>

<p>The team may work on multiple problems before getting any one of them accepted. Furthermore, the contestants are great multitaskers and can work on a single problem using multiple computers at the same time, but each computer can only be used for one problem at a time.</p>

### 입력

<p>The input consists of:</p>

<ul>
	<li>One line containing an integer $n$ ($1\leq n\leq 10^5$), the number of problems in the contest.</li>
	<li>One line containing $n$ integers $t_1, t_2, \dots, t_n$ ($1\leq t_i \leq 10^4$), the computer time required to solve problem $i$.</li>
	<li>One line containing $n$ integers $s_1, s_2, \dots, s_n$ ($1\leq s_i \leq 10^9$ or $s_i = -1$), the time at which problem $i$ was solved, or $-1$ if it was not solved.</li>
</ul>

<p>It is guaranteed that the team solved at least one problem.</p>

### 출력

<p>Output the minimum number of computers used by the team.</p>