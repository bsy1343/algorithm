# [Gold III] Avant-garde - 33219

[문제 링크](https://www.acmicpc.net/problem/33219)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 2048 MB

### 통계

제출: 41, 정답: 28, 맞힌 사람: 19, 정답 비율: 65.517%

### 분류

기하학, 무작위화, 미적분학, 수학

### 문제 설명

<p>A new style of painting has recently exploded in popularity. The artist will start with some famous artwork as the background, and proceeds to splash big blobs of paint on the canvas. You think this new art form is terrible. To prove a point, you want to estimate the area of the nice background picture that gets ruined, because it gets covered by the blobs. </p>

<p>The artist has splashed $n$ big blobs on the canvas, which are shaped like perfect circles. All the centres of the blobs lie on the $x$-axis, so each blob is defined by a radius and $x$-coordinate. The second sample input is visualized in Figure A.1.</p>

<p>Calculate the area of the background that is no longer visible, because of the blobs. Your answer is correct if its relative error is less than $10\%$. So your answer is correct if: $$0.9 \times A_\textrm{actual} \leq A_\textrm{your output} \leq 1.1 \times A_\textrm{actual} $$</p>

### 입력

<p>The input consists of:</p>

<ul>
	<li>One line containing a single integer $n$ ($1\leq n\leq 10$), the number of blobs.</li>
	<li>$n$ lines follow, one for each blob, each containing two integers: $x$ ($|x| \leq 10$), the $x$-coordinate of the centre of the blob and $r$ ($1 \leq r \leq 10 $), the radius of the the blob.</li>
</ul>

### 출력

<p>Output the area of the background that is covered by the blobs as a decimal number. Your answer should have a relative error of at most $10\%$.</p>

### 힌트

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/33219.%E2%80%85Avant-garde/43e5404a.jpg" data-original-src="https://boja.mercury.kr/assets/problem/33219-1.jpg" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 300px; height: 300px;"></p>

<p style="text-align: center;">Figure A.1: Visualization of Sample Input 2. The covered area is roughly equal to 42.</p>