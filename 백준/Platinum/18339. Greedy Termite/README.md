# [Platinum III] Greedy Termite - 18339

[문제 링크](https://www.acmicpc.net/problem/18339)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 170, 정답: 44, 맞힌 사람: 36, 정답 비율: 23.077%

### 분류

자료 구조, 세그먼트 트리

### 문제 설명

<p>There are n wooden rods vertically placed over a horizontal line. The rods are numbered 1 through n from left to right. Each rod i (1 ⩽ i ⩽ n) is placed at position x<sub>i</sub> and has a height h<sub>i</sub>.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/18339.%E2%80%85Greedy%E2%80%85Termite/a85f2b7a.png" data-original-src="https://upload.acmicpc.net/cc0b9913-8e6a-46c4-bda4-4bef56be912b/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 337px; height: 232px;" /></p>

<p>A termite wants to eat all the rods one by one. It starts eating from an arbitrary rod s (1 ⩽ s ⩽ n). Then, after eating a rod i, the termite selects the next rod to eat based on the following method. Among the remaining rods j, the one with maximum h<sub>j</sub> &minus;|x<sub>i</sub> &minus;x<sub>j</sub>| is selected. If there are ties, the one with minimum |x<sub>i</sub> &minus;x<sub>j</sub>| is selected. If there are still ties, the left-most rod is selected.</p>

<p>Your task is to calculate the total (horizontal) distance traveled by the termite to eat all the rods.</p>

### 입력

<p>The first line of the input contains two space-separated integers n, the number of rods, and s, the starting rod number (1 ⩽ s ⩽ n ⩽ 100 000). The rods are described in the next n lines. On the line 1 + i (1 ⩽ i ⩽ n), the i-th rod is specified with two space-separated integers x<sub>i</sub> (|x<sub>i</sub>| ⩽ 10<sup>9</sup>) and h<sub>i</sub> (1 ⩽ h<sub>i</sub> ⩽ 10<sup>9</sup>). Additionally, for each i (1 ⩽ i ⩽ n &minus; 1), x<sub>i</sub> &lt; x<sub>i+1</sub>.</p>

### 출력

<p>You should print a single integer denoting the total distance traveled by the termite.</p>