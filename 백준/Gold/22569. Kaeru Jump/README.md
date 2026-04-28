# [Gold V] Kaeru Jump - 22569

[문제 링크](https://www.acmicpc.net/problem/22569)

### 성능 요약

시간 제한: 8 초 (추가 시간 없음), 메모리 제한: 512 MB

### 통계

제출: 27, 정답: 21, 맞힌 사람: 17, 정답 비율: 73.913%

### 분류

백트래킹

### 문제 설명

<p>There is a frog living in a big pond. He loves jumping between lotus leaves floating on the pond. Interestingly, these leaves have strange habits. First, a leaf will sink into the water after the frog jumps from it. Second, they are aligned regularly as if they are placed on the grid points as in the example below.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/22569.%E2%80%85Kaeru%E2%80%85Jump/e3053862.png" data-original-src="%EB%B0%B1%EC%A4%80/Gold/22569.%E2%80%85Kaeru%E2%80%85Jump/e3053862.png" data-original-src="https://upload.acmicpc.net/a8b93a97-be3b-4ede-8375-99f9384c2726/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" /></p>

<center><b>Figure 1: Example of floating leaves</b></center>

<center style="text-align: left;">
<p>Recently, He came up with a puzzle game using these habits. At the beginning of the game, he is on some leaf and faces to the upper, lower, left or right side. He can jump forward or to the left or right relative to his facing direction, but not backward or diagonally. For example, suppose he is facing to the left side, then he can jump to the left, upper and lower sides but not to the right side. In each jump, he will land on the nearest leaf on his jumping direction and face to that direction regardless of his previous state. The leaf he was on will vanish into the water after the jump. The goal of this puzzle is to jump from leaf to leaf until there is only one leaf remaining.</p>

<p>See the example shown in the figure below.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/22569.%E2%80%85Kaeru%E2%80%85Jump/c504cdbf.png" data-original-src="%EB%B0%B1%EC%A4%80/Gold/22569.%E2%80%85Kaeru%E2%80%85Jump/c504cdbf.png" data-original-src="https://upload.acmicpc.net/7c245f9a-97ad-4961-9cd1-276b05d016a8/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" /></p>

<p>In this situation, he has three choices, namely, the leaves A, B and C. Note that he cannot jump to the leaf D since he cannot jump backward. Suppose that he choose the leaf B. After jumping there, the situation will change as shown in the following figure.</p>

<p>He can jump to either leaf E or F next.</p>

<p>After some struggles, he found this puzzle difficult, since there are a lot of leaves on the pond. Can you help him to find out a solution?</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/22569.%E2%80%85Kaeru%E2%80%85Jump/40f42fb7.png" data-original-src="%EB%B0%B1%EC%A4%80/Gold/22569.%E2%80%85Kaeru%E2%80%85Jump/40f42fb7.png" data-original-src="https://upload.acmicpc.net/bbd3e6b8-9d51-475a-81a9-53b39800c344/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" /></p>
</center>

### 입력

<pre>
<i>H W</i>
<i>c</i><sub>1,1</sub> ... <i>c</i><sub>1,<i>W</i></sub>
.
.
.
<i>c</i><sub><i>H</i>,1</sub> ... <i>c</i><sub><i>H</i>,<i>W</i></sub></pre>

<p>The first line of the input contains two positive integers&nbsp;<i>H</i>&nbsp;and&nbsp;<i>W</i>&nbsp;(1 &le;&nbsp;<i>H</i>,<i>W</i>&nbsp;&le; 10). The following&nbsp;<i>H</i>&nbsp;lines, which contain&nbsp;<i>W</i>&nbsp;characters each, describe the initial configuration of the leaves and the frog using following characters:</p>

<ul>
	<li>&#39;.&rsquo; : water</li>
	<li>&lsquo;o&rsquo; : a leaf</li>
	<li>&lsquo;U&rsquo; : a frog facing upward (i.e. to the upper side) on a leaf</li>
	<li>&lsquo;D&rsquo; : a frog facing downward (i.e. to the lower side) on a leaf</li>
	<li>&lsquo;L&rsquo; : a frog facing leftward (i.e. to the left side) on a leaf</li>
	<li>&lsquo;R&rsquo; : a frog facing rightward (i.e. to the right side) on a leaf</li>
</ul>

<p>You can assume that there is only one frog in each input. You can also assume that the total number of leaves (including the leaf the frog is initially on) is at most 30.</p>

### 출력

<p>Output a line consists of the characters &lsquo;U&rsquo; (up), &lsquo;D&rsquo; (down), &lsquo;L&rsquo; (left) and &lsquo;R&rsquo; (right) that describes a series of movements. The output should not contain any other characters, such as spaces. You can assume that there exists only one solution for each input.</p>