# [Platinum III] Domino on Torus - 31326

[문제 링크](https://www.acmicpc.net/problem/31326)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 1024 MB

### 통계

제출: 5, 정답: 3, 맞힌 사람: 3, 정답 비율: 60.000%

### 분류

애드 혹, 많은 조건 분기, 홀짝성

### 문제 설명

<p>Imagine we take a stretchable square paper and cut a rectangle of size $A \times B$ along the grid lines. All squares are numbered from $1$ to $A \cdot B$. From this rectangle, we cut another rectangle of size $C \times D$, again along the grid lines, so that sides of length $C$ are parallel to sides of length $A$. Then, we glue the sides of length $B$ together, and finally, glue the sides of length $A$ together. What we got is a torus with a rectangular hole of $C \times D$ squares cut from it. (A torus is the surface of a bagel.)</p>

<p>The squares of the torus are considered different if they have different numbers.</p>

<p>We shall now tile the external surface of this torus with a hole using stretchable dominoes. Each domino consists of two squares of two different colors: one white and one black. The squares share a common side.</p>

<p>Our tiling has to satisfy the following condition: if two squares of the torus which are adjacent by side belong to different dominoes, they have to be the same color: both white or both black.</p>

<p>Two tilings are considered different if at least one of the following two conditions is satisfied:</p>

<ol>
	<li>at least one square of the torus is white in one tiling and black in another;</li>
	<li>at least one square of the torus is covered by dominoes in such a way that the other square covered by the same domino is $Y_{1}$ in one tiling and $Y_{2}$ in another, and $Y_{1} \ne Y_{2}$.</li>
</ol>

### 입력

<p>The first line of input contains four integers $A$, $B$, $C$ and $D$ ($4 \le A, B \le 10^9$, $2 \le C &lt; A$, $2 \le D &lt; B$, all numbers are even).</p>

### 출력

<p>Output the number of tilings.</p>

### 힌트

<p>The following picture shows one of the possible tilings in the given example.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/31326.%E2%80%85Domino%E2%80%85on%E2%80%85Torus/7f930709.png" data-original-src="%EB%B0%B1%EC%A4%80/Platinum/31326.%E2%80%85Domino%E2%80%85on%E2%80%85Torus/7f930709.png" data-original-src="https://upload.acmicpc.net/071a899f-b821-471a-b152-ed8c1c0a2d2d/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 198px; height: 136px;" /></p>