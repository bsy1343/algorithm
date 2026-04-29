# [Platinum II] Coherency - 35206

[문제 링크](https://www.acmicpc.net/problem/35206)

### 성능 요약

시간 제한: 8 초, 메모리 제한: 2048 MB

### 통계

제출: 12, 정답: 8, 맞힌 사람: 8, 정답 비율: 66.667%

### 분류

기하학, 애드 혹, 자료 구조, 정렬, 집합과 맵

### 문제 설명

<p>It is the 25th of March, 40025 CE in the world of <em>Battle Axe Player Clash 40,000</em> (BAPC40K). This futuristic table-top miniatures wargame is played with endearing figurines called <em>models</em>, each of which is placed on a circular <em>base</em>. The models are placed on a $100\,\text{km} \times 100\,\text{km}$ gaming board. A collection of such models forms a <em>coherent unit</em> if between any pair of models there is an unbroken chain of models that have a Euclidean distance of at most two inches<sup>1</sup> between the edges of their bases. Moreover, if the unit contains seven models or more, each model must be within two inches of at least <em>two</em> other models. Given the positions of a collection of models with varying base diameters, determine whether they form a single coherent unit.</p>

<p>One can prove that for any valid input for this problem, if the diameters of the circular bases differ from the given diameter by at most $10^{-5}\,\text{mm}$, the coherency of a unit of models does not change.</p>

<hr>
<p><sup>1</sup>Recall that an inch equals $25.4\,\text{mm}$.</p>

### 입력

<p>The input consists of:</p>

<ul>
<li>One line with an integer $n$ ($2\leq n \leq 2\cdot 10^5$), the number of models.</li>
<li>$n$ lines, each with three integers $x$, $y$, and $d$ ($0 \leq x, y \leq 10^8$, $d\in\{25, 28, 32, 40, 50, 65, 80, 90, 100, 130, 160\}$), describing a model that has its center coordinates at $(x,y)$ and a base diameter of $d$, all given in millimeters.</li>
</ul>

<p>Each model (including the base) fits on the gaming board.</p>

<p>It is guaranteed that no two models are overlapping, but the models can touch.</p>

### 출력

<p>If the $n$ models form a single coherent unit, output "<code>yes</code>". Otherwise, output "<code>no</code>".</p>

### 힌트

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/35206.%E2%80%85Coherency/1ee32229.jpg" data-original-src="https://boja.mercury.kr/assets/problem/35206-1.jpg" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 768px; height: 582px;"></p>

<p style="text-align: center;">Figure C.1: Illustration of the samples. Samples 1 and 4 are coherent. Sample 2 is not coherent, because the two models are too far away. Sample 3 is not coherent, because not all models are within two inches of two other models.</p>