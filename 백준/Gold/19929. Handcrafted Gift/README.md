# [Gold I] Handcrafted Gift - 19929

[문제 링크](https://www.acmicpc.net/problem/19929)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 78, 정답: 33, 맞힌 사람: 32, 정답 비율: 42.105%

### 분류

자료 구조, 해 구성하기, 누적 합, 분리 집합

### 문제 설명

<p>Adam is making Bob a hand-crafted necklace as a gift. A necklace consists of $n$ beads, numbered $0$ to $n-1$ from left to right. Each bead can either be&nbsp;<strong>red</strong>&nbsp;or&nbsp;<strong>blue</strong>&nbsp;in colour. Bob has sent Adam a list of $r$ requirements for the necklace. The $i$th requirement ($0 \leq i \lt r$) states that the beads from positions $a[i]$ to $b[i]$ inclusive should have $x[i]$ unique colours.&nbsp;</p>

<p>Help Adam find a possible configuration of beads that satisfies all of Bob&#39;s requirements, or determine that it is impossible.</p>

### 입력



### 출력



### 제한

<ul>
	<li>$1 \leq n, r \leq 500\;000$</li>
	<li>$0 \leq a[i] \leq b[i] \leq n-1$ (for all $0 \leq i \leq n-1$)</li>
	<li>$1 \leq x[i] \leq 2$ (for all $0 \leq i \leq n-1$)</li>
</ul>