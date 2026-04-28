# [Gold I] Video Clips - 21348

[문제 링크](https://www.acmicpc.net/problem/21348)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 1024 MB

### 통계

제출: 90, 정답: 25, 맞힌 사람: 24, 정답 비율: 33.333%

### 분류

자료 구조, 희소 배열

### 문제 설명

<p>On a popular web site, the $N$ KATT contestants can spend time watching video clips in between solving problems.</p>

<p>On the site, there are $K$ funny videos of cats jumping around on the keyboard, numbered between $0$ and $K - 1$. When one of the videos has been viewed, a suggestion for the next funny cat video is shown, which you of course click on and start watching.</p>

<p>For each contestant, you will be given the initial cat video he or she views. Determine what the $M$:th video that each contestant watches will be.</p>

### 입력

<p>The sample judge reads input in the following format:</p>

<ul>
	<li>line $1$: <code>K M</code></li>
	<li>line $2$: <code>S[0] ... S[K - 1]</code></li>
	<li>line $3$: <code>N</code>: the number of calls made to <code>clip(I)</code>.</li>
	<li>line $4$ <code>I1 ... IN</code>: the parameters of the $N$ calls to <code>clip(I)</code>.</li>
</ul>

### 출력

<p>The sample judge will write $N$ lines with the return values of <code>clip(I)</code>.</p>

### 제한

<ul>
	<li>$N, K \le 100\,000$</li>
	<li>$2 \le M \le 10^9$</li>
</ul>