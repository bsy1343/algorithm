# [Silver III] Knitting Pattern - 32559

[문제 링크](https://www.acmicpc.net/problem/32559)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 90, 정답: 42, 맞힌 사람: 36, 정답 비율: 43.373%

### 분류

수학

### 문제 설명

<p>Jörmunrekur had found himself with some extra time on his hands, so he decided to try to find a new hobby. After discussing this with some of his relatives, his grandparents lent him a book with knitting guides and knitting patterns.</p>

<p>He wants to start with something big, so he decides to make a sweater. He has also picked out a pattern from the book that he will repeat around the circumference of the sweater. He wants the pattern to be centered and then repeat out towards the back in either direction, but never wants to have less than the full pattern on the sweater. He will not place any patterns that leaves the placements of patterns asymmetric. Now he has to know how much empty space he should leave at the back of the sweater to achieve this.</p>

<p>The empty space that is not covered by the patterns must be a contiguous (possibly empty) section at the back of the sweater.</p>

### 입력

<p>The input contains two positive integers $N$, the length of the sweater, and $P$, the length of the pattern. They satisfy $1 \leq P \leq N \leq 10^{18}$ and they have the same parity, as otherwise the pattern could never be perfectly centered.</p>

### 출력

<p>Print a single integer, the amount of empty space left on the back of the sweater.</p>

### 힌트

<p>In the first sample the sweater is 13 loops in circumference. Thus the centered pattern is placed at loops 6, 7 and 8. There's space for another pattern in either direction at loops 3, 4, 5 and 9, 10, 11. There's not enough space to place two more, and a single pattern would make things asymmetric. Thus loops 1, 2, 12 and 13 are empty, so the answer is 4.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Silver/32559.%E2%80%85Knitting%E2%80%85Pattern/02fbaba8.png" data-original-src="https://boja.mercury.kr/assets/problem/32559-1.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 100px; height: 100px;"></p>

<p style="text-align: center;">Figure K.1: A possible pattern for sample 1</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Silver/32559.%E2%80%85Knitting%E2%80%85Pattern/24e81386.png" data-original-src="https://boja.mercury.kr/assets/problem/32559-2.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 415px; height: 100px;"></p>

<p style="text-align: center;">Figure K.2: Applying the pattern to the full width for sample 1</p>

<p>In the second sample the sweater is 16 loops in circumference. The first pattern is placed at loops 7, 8, 9 and 10. Two more are placed at 3, 4, 5, 6 and 11, 12, 13, 14. This leaves 1, 2, 15 and 16, which exactly fits one more pattern that will be perfectly centered at the back of the sweater, creating no asymmetry. Thus that pattern is placed, leaving no empty space.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Silver/32559.%E2%80%85Knitting%E2%80%85Pattern/102b88d4.png" data-original-src="https://boja.mercury.kr/assets/problem/32559-3.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 133px; height: 100px;"></p>

<p style="text-align: center;">Figure K.3: A possible pattern for sample 2</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Silver/32559.%E2%80%85Knitting%E2%80%85Pattern/8d8951cf.png" data-original-src="https://boja.mercury.kr/assets/problem/32559-4.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 508px; height: 100px;"></p>

<p style="text-align: center;">Figure K.4: Applying the pattern to the full width for sample 2</p>