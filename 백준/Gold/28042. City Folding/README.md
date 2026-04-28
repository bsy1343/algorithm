# [Gold I] City Folding - 28042

[문제 링크](https://www.acmicpc.net/problem/28042)

### 성능 요약

시간 제한: 0.1 초, 메모리 제한: 1024 MB

### 통계

제출: 125, 정답: 69, 맞힌 사람: 54, 정답 비율: 61.364%

### 분류

수학, 구현, 애드 혹, 시뮬레이션

### 문제 설명

<p>Joe&rsquo;s bedroom is so dirty that the germs have developed civilization! They have communities and cities everywhere, and the bedroom is their world: Joe&rsquo;s shoes are giant caves, his fishbowl is an ocean, his moldy pizza boxes are jungles, etc.</p>

<p>One of the biggest germ metropolis, Long City, is built on a long strip of paper left on the floor. It&rsquo;s an awkward city layout, so the inhabitants decided to go three-dimensional: they will fold the strip several times and turn it into a stack! This way, transportation across the city will be much easier, by moving up and down across layers.</p>

<p>Specifically, the germs will repeat the following procedure $N$ times:</p>

<ul>
	<li>find the exact middle of the current strip;</li>
	<li>then either fold the left side on top of the right side, or vice versa.</li>
</ul>

<p>The result will be a stack of $2^N$ paper layers.</p>

<p>Amelia is a powerful and wealthy amoeba who inhabits Long City, and like everyone else, she&rsquo;s looking forward to the folding. However, she has a particular preference: after the folding process is complete, she would like her home to end up in the $H$-th layer from the ground, because $H$ is her lucky number. To achieve this, Amelia can influence the folding process: at each of the $N$ steps, she can decide whether to fold the left side over the right side, or vice versa.</p>

<p>Now she needs your help to decide the exact sequence of folds to perform. According to Amelia, if you were to divide Long City into $2^N$ sections of equal length, her home would be on the $P$-th section from left to right. Given $N$, $P$, and $H$, find the answer she wants.</p>

<p>The figure below illustrates the first sample. Amelia&rsquo;s home is on the fourth section of the strip, and after the three shown folds it ends up in the seventh layer from the ground.</p>

<p style="text-align: center;"><img alt="" src="https://upload.acmicpc.net/440c06d1-03d9-4b88-b61c-03e33b47cbf0/-/preview/" style="width: 425px; height: 268px;" /></p>

### 입력

<p>The input consists of a single line that contains three integers $N$ ($1 &le; N &le; 60$), $P$ and $H$ ($1 &le; P, H &le; 2^N$), indicating respectively the number of folds, the initial position of Amelia&rsquo;s home on the strip, and the desired final height in the stack.</p>

### 출력

<p>Output a single line with a string of length $N$ such that its i-th character indicates how to perform the $i$-th fold. The uppercase letter &ldquo;<code>L</code>&rdquo; means folding the left side on top of the right side, while the uppercase letter &ldquo;<code>R</code>&rdquo; means folding the right side on top of the left side. It is guaranteed that a unique solution exists.</p>