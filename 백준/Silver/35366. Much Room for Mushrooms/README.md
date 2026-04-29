# [Silver III] Much Room for Mushrooms - 35366

[문제 링크](https://www.acmicpc.net/problem/35366)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 2048 MB

### 통계

제출: 10, 정답: 8, 맞힌 사람: 8, 정답 비율: 80.000%

### 분류

많은 조건 분기, 사칙연산, 수학, 해 구성하기

### 문제 설명

<p>When botany proves too challenging, you can always switch to <em>mycology</em> – the study of mushrooms! As one of your first experiments, you plan to grow many mushrooms inside an infinitely large 2D exhibit, which can be modeled as a grid of tiles.</p>

<p>As it turns out, this specific species of mushroom that you are growing has a consistent shape. Each mushroom can be represented as a vertical stem (of any height) that is exactly one tile wide. Then, the very top tile in the stem juts outwards by one tile to the left, right, and up to form the <em>cap</em> of the mushroom. The cap of the mushroom must be completely above the ground. The figure below shows three such mushrooms:</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Silver/35366.%E2%80%85Much%E2%80%85Room%E2%80%85for%E2%80%85Mushrooms/3b6e3ad5.jpg" data-original-src="https://boja.mercury.kr/assets/problem/35366-1.jpg" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 300px; height: 263px;"></p>

<p style="text-align: center;"><b>Figure 1</b>: A visualization of the first sample case.</p>

<p>You’ve noticed that for each mushroom to survive, two conditions must be met in your exhibit:</p>

<ol>
<li>No tile can be shared by more than one mushroom.</li>
<li>Every mushroom must begin growing on the same row.</li>
</ol>

<p>To make your exhibit more interesting, you’d like to grow mushrooms so that there exists an $r \times c$ rectangle in your exhibit where every tile is occupied by a mushroom. But in this exhibit, there is <em>not much room for mushrooms</em>. What is the minimum number of mushrooms needed to completely fill an $r \times c$ rectangle with mushrooms, assuming you can control the position and height of each mushroom you plant?</p>

### 입력

<p>The first line of input contains two integers $r$ and $c$ ($1 \le r, c \le 1\, 000$), the number of rows and columns of the rectangle in your exhibit you want to completely fill with mushrooms.</p>

### 출력

<p>Output a single integer, the minimum number of mushrooms that are needed to completely fill an $r \times c$ rectangle, or $-1$ if it is not possible.</p>