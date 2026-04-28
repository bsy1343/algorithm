# [Platinum III] Decorative Dominoes - 20904

[문제 링크](https://www.acmicpc.net/problem/20904)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 512 MB

### 통계

제출: 95, 정답: 51, 맞힌 사람: 46, 정답 비율: 61.333%

### 분류

이분 매칭

### 문제 설명

<p>Marie likes Dominoes. She is too young to fully understand the game, so she just creates arrangements based on the following simple rule: Each of the two ends of a domino must be adjacent to an end of another domino with the same number on it.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/20904.%E2%80%85Decorative%E2%80%85Dominoes/b602a0b1.png" data-original-src="%EB%B0%B1%EC%A4%80/Platinum/20904.%E2%80%85Decorative%E2%80%85Dominoes/b602a0b1.png" data-original-src="https://upload.acmicpc.net/787090dc-8f1c-4188-b5a8-a8cb266177fd/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 247px; height: 247px;" /></p>

<p style="text-align: center;">Figure D.1: Visualization of the first sample test case.</p>

<p>Today, Marie found a large box of blank dominoes. This is very exciting for her because now she can show her full creativity by first creating an unrestricted arrangement and then, in a second step, painting numbers on both ends of all dominoes so that her simple rule is fulfilled.</p>

<p>She already decided that putting the same number on each end of every domino is not satisfying enough for her. She only wants to use each number at most twice. However, she does not restrict herself to numbers between $0$ and $6$, and she also does not care if two dominoes have the same pair of numbers on them.</p>

<p>Marie positions the dominoes along an integer grid, so that each domino occupies exactly two neighbouring grid squares. Note that Marie&#39;s arrangement does not necessarily have to be connected.</p>

<p>After Marie decided on an arrangement, she notices that choosing suitable numbers is harder than initially anticipated. Help her to find a valid numbering for her given arrangement or state that this is impossible.</p>

### 입력

<p>The input consists of:</p>

<ul>
	<li>One line with an integer $n$ ($2 \leq n \leq 5\,000$), the number of dominoes in Marie&#39;s arrangement.</li>
	<li>$n$ lines, each with four integers $x_1$, $y_1$, $x_2$, $y_2$ ($1 \le x_1, y_1, x_2, y_2 \le 10\,000$), where $(x_1, y_1)$ and $(x_2, y_2)$ are the grid positions of the two ends of one of the dominoes.</li>
</ul>

<p>It is guaranteed that all dominoes occupy two neighbouring positions in the integer grid and no two dominoes overlap.</p>

### 출력

<p>If a valid numbering exists, print $n$ lines, the $i$th of which contains two numbers, the integers that Marie should write on the two ends of the $i$th domino, respectively. Output the numbers in the same order as the dominoes (including their two ends) appear in the input. All numbers in the output should be integers between $0$ and $10^6$ inclusive. In case multiple valid numberings exist, you may output any one of them. If there does not exist a valid numbering, output <code>impossible</code> instead.</p>