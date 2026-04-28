# [Gold IV] Ideal Pyramid - 18075

[문제 링크](https://www.acmicpc.net/problem/18075)

### 성능 요약

시간 제한: 2 초 (추가 시간 없음), 메모리 제한: 512 MB

### 통계

제출: 78, 정답: 54, 맞힌 사람: 47, 정답 비율: 68.116%

### 분류

기하학, 수학

### 문제 설명

<p>Every pharaoh cares about his legacy. Reigning pharaoh Inaros the Great wants to be remembered for a long time. He is going to build the largest pyramid the humankind has ever seen.</p>

<p>Of course, the proper pyramid should have four sides at the bottom, oriented to the cardinal directions &mdash; two sides of the pyramid should go exactly from north to south, and two sides should go from east to west. The perfectly balanced pyramid should have the slope angle of the side equal to 45<sup>◦</sup>, no more, no less. To simplify construction, the pyramid should have integer height and integer coordinates of the center.</p>

<p>There are n obelisks at the construction site. The i-th obelisk is a pillar with coordinates (x<sub>i</sub>, y<sub>i</sub>) and height h<sub>i</sub>. Inaros wants to build a pyramid so that each existing obelisk would be inside the pyramid. The obelisk is inside the pyramid if the height of the pyramid at the obelisk position is greater than or equal to the height of the obelisk.</p>

<p>Since the pharaoh wants to finish the construction of the pyramid during his life, he wants to find the smallest possible pyramid that contains all of the obelisks.</p>

### 입력

<p>The first line contains a single integer n &mdash; the number of obelisks (1 &le; n &le; 1000).</p>

<p>Each of the following n lines contains three integers x<sub>i</sub>, y<sub>i</sub>, h<sub>i</sub> &mdash; the coordinates of the i-th obelisk and its height (&minus;10<sup>8</sup> &le; x<sub>i</sub>, y<sub>i</sub> &le; 10<sup>8</sup>; 1 &le; h<sub>i</sub> &le; 10<sup>8</sup>).</p>

### 출력

<p>Output three integers x, y, h &mdash; the coordinates of the center (x, y) of the optimal pyramid and its height.</p>