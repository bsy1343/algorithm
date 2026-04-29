# [Silver III] Flag Rotation - 32589

[문제 링크](https://www.acmicpc.net/problem/32589)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 1024 MB

### 통계

제출: 35, 정답: 29, 맞힌 사람: 23, 정답 비율: 79.310%

### 분류

수학, 자료 구조, 정렬, 트리를 사용한 집합과 맵, 해시를 사용한 집합과 맵

### 문제 설명

<p>A common pattern for country flags is three stripes. Some flags are really similar, and have exactly the same stripes in the same order, but the flag is rotated by $90$ degrees. Using a sequence of colours, we can make a flag on a square grid, covering each row with the colours in the sequence. Another way to make a similar flag (that is rotated by $90$ degrees), is by covering each column with the colours in the sequence.</p>

<p>In preparation for the Flags You Paint for Countries meeting, you notice a mistake for one of the flags: it should have been rotated counter-clockwise by $90$ degrees! The square canvas is already stuck to a wall using super glue, so you can not simply take it off and rotate it. Therefore, you want to know how much work it would be to repaint one flag to the other. In one second, you can repaint one of the $1 \times 1$ squares to any colour. What is the minimum number of seconds you need to repaint the flag? As an example, for the flag in the first sample input (shown in Figure F.1), $34$ squares need to be repainted.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Silver/32589.%E2%80%85Flag%E2%80%85Rotation/e7e1fed5.png" data-original-src="https://boja.mercury.kr/assets/problem/32589-1.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 211px; height: 211px;"> <img alt="" src="%EB%B0%B1%EC%A4%80/Silver/32589.%E2%80%85Flag%E2%80%85Rotation/422cab21.png" data-original-src="https://boja.mercury.kr/assets/problem/32589-2.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 211px; height: 211px;"></p>

<p style="text-align: center;">Figure F.1: Two flags corresponding to the first sample input. Colour $1$ corresponds to yellow, $2$ to red, $3$ to white, and $1000$ to blue. When the first flag should be rotated counter-clockwise by $90$ degrees without actually rotating the canvas, $34$ squares need to be repainted.</p>

### 입력

<p>The input consists of:</p>

<ul>
	<li>One line with an integer $n$ ($1\leq n\leq 2 \cdot 10^5$), the number of stripes in the flag.</li>
	<li>One line with $n$ integers $a$ ($1\leq a\leq 10^9$), the colours of the stripes.</li>
</ul>

### 출력

<p>Output the number of cells that need to be repainted when the flag should be rotated counter-clockwise by $90$ degrees.</p>