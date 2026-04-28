# [Gold IV] “Roman” corridor - 7767

[문제 링크](https://www.acmicpc.net/problem/7767)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 33, 정답: 6, 맞힌 사람: 6, 정답 비율: 18.182%

### 분류

그래프 이론, 그래프 탐색, 너비 우선 탐색, 최단 경로, 데이크스트라, 백트래킹

### 문제 설명

<p>Let&rsquo;s remind the notation of Roman numerals. The notation is for natural numbers from 1 to 3999. Capital Latin letters &lsquo;I&rsquo;, &lsquo;V&rsquo;, &lsquo;X&rsquo;, &lsquo;L&rsquo;, &lsquo;C&rsquo;, &lsquo;D&rsquo;, &lsquo;M&rsquo; and their combinations are used to represent so called atomic numbers (see the table below).</p>

<ul>
	<li>1 &ndash; I</li>
	<li>4 &ndash; IV</li>
	<li>5 &ndash; V</li>
	<li>9 &ndash; IX</li>
	<li>10 &ndash; X</li>
	<li>40 &ndash; XL</li>
	<li>50 &ndash; L</li>
	<li>90 &ndash; XC</li>
	<li>100 &ndash; C</li>
	<li>400 &ndash; CD</li>
	<li>500 &ndash; D</li>
	<li>900 &ndash; CM</li>
	<li>1000 &ndash; M</li>
</ul>

<p>To put down a number N it is necessary to find the greatest atomic number K which is not greater then N. The Roman notation of the found number K is put down, and the process is repeated for (N-K).</p>

<p>The Roman numerals are put down from left to right without spaces. Thus, the number 999 in the Roman notation is CMXCIX (but not IM, as somebody may think).</p>

<p>You need to pass through a rectangular corridor. The corridor is n meters width and m meters long (1 &le; n, m &le; 15, n*m &le; 100). It is laid out by square tiles. Each tile is 1 meter width and has a &lsquo;Roman&rsquo; symbol on it: &lsquo;I&rsquo;, &lsquo;V&rsquo;, &lsquo;X&rsquo;, &lsquo;L&rsquo;, &lsquo;C&rsquo;, &lsquo;D&rsquo; or &lsquo;M&rsquo;. When passing the corridor, you move from one tile to another. From the current tile you may only move to one of adjacent tiles, vertically or horizontally (but not across). You start at the left and end at the right (see the picture below).&nbsp;</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/7767.%E2%80%85%E2%80%9CRoman%E2%80%9D%E2%80%85corridor/37be1ad1.png" data-original-src="%EB%B0%B1%EC%A4%80/Gold/7767.%E2%80%85%E2%80%9CRoman%E2%80%9D%E2%80%85corridor/37be1ad1.png" data-original-src="https://upload.acmicpc.net/e27e0e09-e2fc-4cb4-ad2d-2bc8d6ed7982/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 200px; height: 143px;" /></p>

<p>Can you pass through the corridor so that the sequence of symbols on the tiles composing your path was a correct number in the Roman notation? Among all possible solutions you need to find the minimal number.</p>

### 입력

<p>The first line contains numbers n and m, separated by one or more spaces. Each of the next n lines consists of m characters describing tiles.</p>

### 출력

<p>The output contains one line with the found Roman number or the word NO if it is impossible to pass through the corridor in the required way.&nbsp;</p>