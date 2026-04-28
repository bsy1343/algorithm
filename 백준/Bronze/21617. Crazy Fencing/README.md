# [Bronze II] Crazy Fencing - 21617

[문제 링크](https://www.acmicpc.net/problem/21617)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 272, 정답: 193, 맞힌 사람: 168, 정답 비율: 71.795%

### 분류

수학, 기하학

### 문제 설명

<p>You need to paint a wooden fence between your house and your neighbour&rsquo;s house. You want to determine the area of the fence, in order to determine how much paint you will use.</p>

<p>However, the fence is made out of N non-uniform pieces of wood, and your neighbour believes that they have an artistic flair. In particular, the pieces of wood may be of various widths. The bottom of each piece of wood will be horizontal, both sides will be vertical, but its top may be cut on an angle. Two such pieces of wood are shown below:</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Bronze/21617.%E2%80%85Crazy%E2%80%85Fencing/4f3d21be.png" data-original-src="%EB%B0%B1%EC%A4%80/Bronze/21617.%E2%80%85Crazy%E2%80%85Fencing/4f3d21be.png" data-original-src="https://upload.acmicpc.net/75da34c5-330f-4648-944a-e95cea3b7493/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 126px; height: 123px;" /></p>

<p>Thankfully, the fence has been constructed so that adjacent pieces of wood have the same height on the sides where they touch, which makes the fence more visually appealing.</p>

### 입력

<p>The first line of the input will be a positive integer N, where N &le; 10 000.</p>

<p>The second line of input will contain N + 1 space-separated integers h<sub>1</sub>, . . . , h<sub>N+1</sub> (1 &le; h<sub>i</sub> &le; 100, 1 &le; i &le; N + 1) describing the left and right heights of each piece of wood. Specifically, the left height of the i<sup>th</sup> piece of wood is h<sub>i</sub> and the right height of the i<sup>th</sup> piece of wood is h<sub>i+1</sub>.</p>

<p>The third line of input will contain N space-separated integers w<sub>i</sub> (1 &le; w<sub>i</sub> &le; 100, 1 &le; i &le; N) describing the width of the i<sup>th</sup> piece of wood.</p>

### 출력

<p>Output the total area of the fence.&nbsp;If the correct answer is&nbsp;C, the grader will view&nbsp;A&nbsp;correct if |A &minus; C|&le;10<sup>&minus;6</sup>.</p>