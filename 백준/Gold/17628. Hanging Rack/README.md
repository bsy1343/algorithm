# [Gold II] Hanging Rack - 17628

[문제 링크](https://www.acmicpc.net/problem/17628)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 512 MB

### 통계

제출: 26, 정답: 19, 맞힌 사람: 17, 정답 비율: 70.833%

### 분류

수학, 애드 혹, 비트마스킹

### 문제 설명

<p>A hanging rack is composed of <em>n</em> levels of connected rods. Level <em>i</em> (for <em>i</em> &isin; {0, 1, ..., <em>n</em>-1}) consists of 2<em><sup>i</sup></em> rods. The midpoint of the rod at level 0 is fixed to the wall. At all other levels, the midpoint of the <em>j</em>-th rod (for j &isin; {1, ..., 2<em><sup>i</sup></em>}) is fixed to the left endpoint of the &lceil;<em>j</em>/2&rceil;-th rod at the previous level if <em>j</em> is odd and to the right endpoint of the same rod if <em>j</em> is even. At the last level, there is a hook for hanging a coat on both endpoints of each rod. The hooks are numbered from 1 to 2<em><sup>n</sup></em> in the left-to-right order.</p>

<p>For example, the rack for <em>n</em> = 3 looks as follows:</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/17628.%E2%80%85Hanging%E2%80%85Rack/5ae83fd9.png" data-original-src="%EB%B0%B1%EC%A4%80/Gold/17628.%E2%80%85Hanging%E2%80%85Rack/5ae83fd9.png" data-original-src="https://upload.acmicpc.net/94b3e118-7300-465c-91b5-68f212a7a603/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 387px; height: 208px;" /></p>

<p>Mojca would like to hang all her coats on the rack. Every coat weighs exactly 1 unit. To avoid breaking the delicate structure, she has to hang them in such an order that the difference between the total weight <em>w<sub>l</sub></em> placed on the left endpoint of any given rod and the total weight <em>w<sub>r</sub></em> placed on the right endpoint of the same rod is either 0 or 1 (<em>w<sub>l</sub></em> - <em>w<sub>r</sub></em> &isin; {0, 1}). (By the laws of physics, the difference could also be -1, but a right-leaning rack looks really ugly to Mojca.) The rods are so thin that their weight can be neglected.</p>

<p>Having heard about your problem-solving proficience, Mojca asks you for help. Write a program that reads the integer <em>n</em> and an integer <em>k</em> and prints the sequential number (modulo (10<sup>9</sup> + 7)) of the hook on which Mojca has to hang her <em>k</em>-th coat.</p>

### 입력

<p>The input consists of a single line, which contains the integers <em>n</em> and <em>k</em>, separated by a space.</p>

### 출력

<p>Print the number (modulo (10<sup>9</sup> + 7)) of the hook to be used in the <em>k</em>-th step.</p>

### 제한

<ul>
	<li><em>n</em>&nbsp;&isin; [1, 10<sup>6</sup>]</li>
	<li><em>k</em>&nbsp;&isin; [1, min{2<em><sup>n</sup></em>, 10<sup>18</sup>}]</li>
</ul>