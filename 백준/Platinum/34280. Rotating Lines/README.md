# [Platinum II] Rotating Lines - 34280

[문제 링크](https://www.acmicpc.net/problem/34280)

### 성능 요약

시간 제한: 3 초, 메모리 제한: 2048 MB

### 통계

제출: 15, 정답: 9, 맞힌 사람: 8, 정답 비율: 57.143%

### 분류

애드 혹, 정렬

### 문제 설명

<p>Asadullo is an outstanding researcher at APIO (Alliance for Power and Industrial Optimization). Recently, he has been studying a method to generate energy using an unknown material.</p>

<p>This unknown material does not produce energy on its own, but if there are several extremely long rods made of this material, they can generate energy through their interactions.</p>

<p>Specifically, there are $n$ rods, given by an array $v[0], v[1], \dots , v[n − 1]$. The $i$-th rod can be positioned at an angle of $a[i] = 360 \cdot \frac{v[i]}{100000}^\circ$, with respect to the positive direction of the x-axis, in counterclockwise. The energy efficiency by these $n$ rods is defined as $$\displaystyle\sum_{i &lt; j}{\text{acute}(i, j)}$$ where $\text{acute}(i, j)$ represents the acute angle formed between the $i$-th rod and the $j$-th rod. In this problem, we consider $90^\circ$ as an acute angle.</p>

<p>More formally, $\text{acute}(i, j) = \min( v[i] − v[j] , 50000 − v[i] − v[j] )$.</p>

<p>In other words, the energy efficiency is calculated by adding the acute angles between every pair of rods.For example, if $v = [5000, 12500, 37500]$ and correspondingly, $a = [18, 45, 135]$, we would get the following graph:</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/34280.%E2%80%85Rotating%E2%80%85Lines/fb964776.png" data-original-src="https://boja.mercury.kr/assets/problem/34280-1.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 400px; height: 406px;"></p>

<p>Here, $\text{acute}(0, 1) = 7500$ (i.e. $27^\circ$), $\text{acute}(0, 2) = 17500$ (i.e. $63^\circ$), and $\text{acute}(1, 2) = 25000$ (i.e. $90^\circ$). Therefore, the energy efficiency of these rods equals $7500 + 17500 + 25000 = 50000$.</p>

<p>Asadullo wants to adjust the arrangement of these n rods to maximize their energy efficiency. However, there are several constraints:</p>

<ul>
	<li>First, since this material is extremely hazardous to living beings, the rods can only be rotated using a specialized mechanical device in a controlled manner. This device allows selecting multiple rods at once and rotating them by the same angle simultaneously.</li>
	<li>Asadullo does not want the energy efficiency of the rods to decrease. Therefore, after any operation using the device, the energy efficiency must not be lower than before.</li>
	<li>Since operating the device consumes a large amount of energy, the total number of rods selected across all operations must not exceed $2\, 000\, 000$.</li>
</ul>

<p>Under these constraints, Asadullo wants to perform operations optimally to maximize the energy efficiency of the rods. Write a program to help Asadullo achieve the highest possible energy efficiency.</p>

### 입력



### 출력



### 제한

<ul>
	<li>$2 ≤ n ≤ 100\, 000$</li>
	<li>$0 ≤ v[i] ≤ 49\, 999$ for each $0 ≤ i &lt; n$</li>
	<li>elements of $v$ are <strong>not</strong> necessarily distinct</li>
</ul>