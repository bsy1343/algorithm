# [Platinum IV] Mountain - 34684

[문제 링크](https://www.acmicpc.net/problem/34684)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 2048 MB

### 통계

제출: 97, 정답: 82, 맞힌 사람: 68, 정답 비율: 81.928%

### 분류

가장 긴 증가하는 부분 수열 문제

### 문제 설명

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/34684.%E2%80%85Mountain/cee43fe6.png" data-original-src="https://boja.mercury.kr/assets/problem/34684-1.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 338px; height: 99px;"></p>

<p style="text-align: center;"><strong>Figure 1</strong> A mountain with four peaks</p>

<p>See Figure 1. What do you see? Yes, it is a mountain. Let’s call such a figure a mountain. To be more precise, a mountain is an $x$-monotone polygonal chain consisting of at least two line segments whose slopes alternate between $+1$ and $−1$; the leftmost segment is a half-line (ray) of slope $+1$, and the rightmost segment is a half-line of slope $−1$. Every mountain has one or more peaks, which are endpoints incident to a segment of slope $+1$ to the left and a segment of slope $−1$ to the right; in other words, a peak is a locally highest point. In Figure 1, you can see a mountain consisting of eight segments, and it has four peaks, marked by small dots.</p>

<p>In this problem, you are given a set $P$ of $n$ points in the plane as input, and your task is to find a mountain with the maximum number of peaks that are chosen from $P$.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/34684.%E2%80%85Mountain/8e66b526.png" data-original-src="https://boja.mercury.kr/assets/problem/34684-2.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 679px; height: 99px;"></p>

<p style="text-align: center;"><strong>Figure 2</strong> Two mountains with four and seven peaks, respectively, chosen from a given set $P$ of $15$ points</p>

<p>An example is illustrated in Figure 2, in which the input set $P$ of $n = 15$ points, marked by small circles, is given, and to the left you can see a mountain with four peaks that belong to $P$, while to the right there is a mountain with seven peaks that belong to $P$. Since there is no such mountain with eight peaks chosen from $P$, the one to the right is a correct answer for the problem. See Sample Input/Output 2 below</p>

### 입력

<p>Your program is to read from standard input. The input starts with a line containing a single integer $n$ ($1 ≤ n ≤ 500\,000$), where $n$ is the number of points in the input set $P$ of points in the plane. In each of the following $n$ lines, given are two integers $x$ and $y$, both ranging from $−10^6$ to $10^6$, inclusively, that represent the $x$- and $y$-coordinates of an input point $(x, y)$ in $P$. You may assume that no two input points have the same coordinates.</p>

### 출력

<p>Your program is to write to standard output. Print exactly one line. The line should contain an integer that represents the number of peaks of a mountain with the maximum number of peaks that are chosen from $P$.</p>