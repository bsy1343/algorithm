# [Platinum III] Trampoline - 21972

[문제 링크](https://www.acmicpc.net/problem/21972)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 39, 정답: 9, 맞힌 사람: 9, 정답 비율: 32.143%

### 분류

값 / 좌표 압축, 자료 구조, 희소 배열

### 문제 설명

<p>Little Square has started jumping on trampolines from his school&rsquo;s gym. In the gym there are R &times; C trampolines arranged in a rectangular grid with R rows and C columns. Each trampoline is either green or blue. There are exactly N green trampolines. Let (i, j) denote the trampoline in the i<sup>th</sup> row and j<sup>th</sup> column. We index the rows from 1 to R and the columns from 1 to C.</p>

<p>Little Square&rsquo;s teacher has asked him to practice T gymnastics routines. The i<sup>th</sup> routine has the following rules:</p>

<ul>
	<li>The routine starts at trampoline (x<sub>i</sub><sup>start</sup>, y<sub>i</sub><sup>start</sup>).</li>
	<li>The routine ends at trampoline (x<sub>i</sub><sup>stop</sup>, y<sub>i</sub><sup>stop</sup>).</li>
	<li>If Little Square jumps on a green trampoline at position (i, j) then he may go to trampolines (i + 1, j) or (i, j + 1), as long as these are not outside the grid.</li>
	<li>If Little Square jumps on a blue trampoline at position (i, j) then he may go to trampoline (i, j+1), as long as it is not outside the grid.</li>
</ul>

<p>Little Square wants to know, for each routine, if it is possible to accomplish his teacher&rsquo;s request.</p>

### 입력

<p>On the first line of the input you will find R, C and N. On the next N lines you will find the positions of the green trampolines. If a line contains integers a b then there is a green trampoline at position (a, b). On the next line you will find T. On the next T lines you will find the descriptions of the gymnastics routines. On the i<sup>th</sup> of these lines you will find x<sub>i</sub><sup>start</sup>, y<sub>i</sub><sup>start</sup>, x<sub>i</sub><sup>stop</sup>, y<sub>i</sub><sup>stop</sup>.</p>

### 출력

<p>Output T lines. The i<sup>th</sup> line should contain <code>Yes</code> if it possible to accomplish the i<sup>th</sup> routine, and <code>No</code> if it is not.</p>

### 제한

<ul>
	<li>1 &le; R, C &le; 1,000,000,000</li>
	<li>1 &le; N, T &le; 200,000</li>
	<li>1 &le; x<sub>i</sub><sup>start</sup>, x<sub>i</sub><sup>stop</sup>&nbsp;&le; R</li>
	<li>1 &le;&nbsp;y<sub>i</sub><sup>start</sup>, y<sub>i</sub><sup>stop</sup> &le; C</li>
	<li>The coordinates of green trampolines are pairwise distinct.</li>
</ul>

### 힌트

<p>The trampolines are placed like so:</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/21972.%E2%80%85Trampoline/29e5cfa0.png" data-original-src="https://upload.acmicpc.net/cfdd008c-14e9-4693-81b7-e3be5a81970b/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 328px; height: 252px;" /></p>

<p>In the first routine Little Square can go on the following route: (2, 1) &rarr; (2, 2) &rarr; (3, 2) &rarr; (3, 3) &rarr; (3, 4) &rarr; (4, 4) &rarr; (4, 5).</p>

<p>In the second routine Little Square can go on the following route: (1, 2) &rarr; (1, 3) &rarr; (1, 4).</p>

<p>The third routine cannot be accomplished. No route exists from (2, 3) to (4, 4) that respects Little Square&rsquo;s teacher&rsquo;s rules.</p>