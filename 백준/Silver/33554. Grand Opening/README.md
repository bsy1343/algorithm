# [Silver IV] Grand Opening - 33554

[문제 링크](https://www.acmicpc.net/problem/33554)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 2048 MB

### 통계

제출: 51, 정답: 39, 맞힌 사람: 19, 정답 비율: 79.167%

### 분류

구현, 문자열, 브루트포스 알고리즘

### 문제 설명

<p>Working at a lock recycling company can be a pain, especially when the locks need to be unlocked and reusable and people forgot to turn in their keys. A friend that works at such a company has found a solution to this problem: a bump key. Your friend has a list of specifications for the tumblers in each lock, and needs your help. You are tasked with finding out which locks he should attempt to open using a bump key, and which locks are for the furnace.</p>

<p>The key and locks are made of the character "#", and the rest is indicated by a dot. In the example below, you can see that the key on the left doesn't fit the lock on the right. The parts where the key doesn't fit are marked with a "■".</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Silver/33554.%E2%80%85Grand%E2%80%85Opening/5e7361d4.png" data-original-src="https://boja.mercury.kr/assets/problem/33554-1.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc"></p>

### 입력

<ul>
	<li>A line with three space-separated integers $n$ $w$ and $h$ $(1 \leq n\leq 1000, 1 \leq w,h \leq 100)$, indicating the number of locks, and the width and height of the key and locks.</li>
	<li>$n$ locks, where each lock consists of $h$ lines of $w$ characters "#" or ".".</li>
	<li>$h$ lines of $w$ character "#" or ".", representing the key.</li>
</ul>

### 출력

<p>A single integer, the number of locks the given key fits in.</p>