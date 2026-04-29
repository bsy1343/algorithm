# [Gold I] Explosive Slabstones Rearrangement - 34588

[문제 링크](https://www.acmicpc.net/problem/34588)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 2048 MB

### 통계

제출: 54, 정답: 38, 맞힌 사람: 38, 정답 비율: 70.370%

### 분류

그래프 이론, 그래프 탐색, 너비 우선 탐색, 매개 변수 탐색, 이분 탐색, 자료 구조

### 문제 설명

<p>Barbara has a garden. The garden can be represented as a $n \times m$ grid. She has placed $k$ slabstones in the garden, so she can enjoy stepping slabstones from one to another every day. The slabstones are indexed from $1$ to $k$. Each slabstone fully occupies some cell of the garden, and no two slabstones are placed at the same cell.</p>

<p>However, an evil person, Babara, is going to place a special device that will occupy a rectangular region in the garden. If any slabstone overlaps with the device, it will explode and destroy the whole garden!</p>

<p>To avoid the explosion, Barbara wants to rearrange the slabstones by shifting the slabstones within the garden. The slabstones should remain non-overlapping <strong>during slabstone rearrangement</strong>. The energy spent is equal to the largest index among all slabstones that have been moved. Now Barbara wants to know the minimum energy required to rearrange the slabstones, so she can save her energy for “other purposes”.</p>

<p>For example, suppose the device will be placed at the blue rectangle. Then Barbara can rearrange the slabstones as follows. Please note that the slabstones do not overlap during the whole process, not only after the rearrangement. All slabstones that have been moved have index at most $4$, so the energy spent is $4$.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/34588.%E2%80%85Explosive%E2%80%85Slabstones%E2%80%85Rearrangement/ce90631d.png" data-original-src="https://boja.mercury.kr/assets/problem/34588-1.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 388px; height: 341px;"></p>

### 입력

<p>The first line contains three integers $n$, $m$ and $k$.</p>

<p>Followed by $k$ lines, the $i$-th of which contains two integers $x_i$ and $y_i$, representing that the $i$-th slabstone is located at the $y_i$-th cell of the $x_i$-th row.</p>

<p>The last line contains four integers $u_1$, $v_1$, $u_2$ and $v_2$, representing that the top-left corner of the device is located at the $v_1$-th cell of the $u_1$-th row, and the bottom-right corner of the device is located at the $v_2$-th cell of the $u_2$-th row.</p>

### 출력

<p>Print the minimum energy required to rearrange the slabstones. If no slabstones need to be moved, the energy spent is $0$. If the explosion cannot be avoided, just output $-1$.</p>

### 제한

<ul>
<li>$1 ≤ n ≤ 500$</li>
<li>$1 ≤ m ≤ 500$</li>
<li>$1 ≤ k ≤ n \times m$</li>
<li>$1 ≤ x_i ≤ n$</li>
<li>$1 ≤ y_i ≤ m$</li>
<li>$1 ≤ u_1 ≤ u_2 ≤ n$</li>
<li>$1 ≤ v_1 ≤ v_2 ≤ m$</li>
<li>All $(x_i , y_i)$ pairs are distinct.</li>
</ul>