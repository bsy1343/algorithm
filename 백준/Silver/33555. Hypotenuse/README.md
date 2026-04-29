# [Silver III] Hypotenuse - 33555

[문제 링크](https://www.acmicpc.net/problem/33555)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 2048 MB

### 통계

제출: 80, 정답: 44, 맞힌 사람: 40, 정답 비율: 56.338%

### 분류

기하학, 많은 조건 분기, 수학, 정수론, 피타고라스 정리

### 문제 설명

<p>Martijn is a math teacher and next weeks class is about geometry. He would like to have some tools for his pupils to practice the course material. One of his ideas is to have a program that can solve calculate the unknown length of one side of a right angled triangle, given the other two sides. Pythagorean theorem states that, in a right angled triangle, the square of the hypotenuse is equal to sum of the squares of the other two sides. Your task is to make a solver that uses Pythagorean theorem.</p>

<p>\begin{align*} &amp;\text{AB}^2 + \text{AC}^2 = \text{BC}^2\\ \\ &amp;a^2 + b^2 = c^2 \end{align*}</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Silver/33555.%E2%80%85Hypotenuse/fcf5782f.png" data-original-src="https://boja.mercury.kr/assets/problem/33555-1.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 200px; height: 145px;"></p>

### 입력

<p>The input consists out of two integers ($0 &lt; x, y \leq 2.3 \cdot 10^4$) and a question mark ('?'), in any order. The order of the three parts of the input match with $a$, $b$ and $c$.</p>

### 출력

<p>The solution to '?' in its most simple form and in LaTeX notation. For example: $\sqrt{20}$ needs to be simplified to $2 \cdot \sqrt{5}$. The formula $2 \cdot \sqrt{5}$ is in LaTeX written as "<code>2 \cdot \sqrt{5</code>}".</p>