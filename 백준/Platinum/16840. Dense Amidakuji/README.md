# [Platinum I] Dense Amidakuji - 16840

[문제 링크](https://www.acmicpc.net/problem/16840)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 17, 정답: 12, 맞힌 사람: 12, 정답 비율: 80.000%

### 분류

(분류 없음)

### 문제 설명

<p>Amidakuji is a famous Japanese game. The game contains w (here w is even) long vertical segments and Snuke can add some short horizontal segments between them. Each horizontal segment connects two adjacent vertical segments. There are h layers and each horizontal segment lies on one of the layers. Thus, there are h(w &minus; 1) candidate positions for horizontal segments in total. Let (a, b) be the candidate position that is a-th from the top and b-th from the left (1-based). Check the figure in the next page to see how it looks like.</p>

<p>First, Snuke adds horizontal segments to all positions (a, b) that satisfy a &equiv; b (mod 2). Then, he removed n horizontal segments at (a<sub>1</sub>, b<sub>1</sub>), . . . ,(a<sub>n</sub>, b<sub>n</sub>).</p>

<p>The game is played as follows. First, Snuke chooses one of the vertical segments. Then, he stands on the top end of the chosen vertical segment and starts moving downward. When he reaches an endpoint of a horizontal segment, he moves to the other end of the horizontal segment, and starts moving downward again. The game finishes when he reaches the bottom end. For each i (1-based), compute the final position of Snuke when he chooses the i-th vertical segment.</p>

### 입력

<p>First line of the input contains three integers h, w and n (1 &le; h, w, n &le; 2 &middot; 10<sup>5</sup>, w is an even number). Then n lines follow; i-th of them contains two integers a<sub>i</sub> and b<sub>i</sub> (1 &le; a<sub>i</sub> &le; h, 1 &le; b<sub>i</sub> &le; w &minus; 1, a<sub>i</sub> &equiv; b<sub>i</sub> (mod 2), (a<sub>i</sub>, b<sub>i</sub>) are pairwise distinct).</p>

### 출력

<p>Print w lines. In the i-th line, print the final position of Snuke when he chooses the i-th segment.</p>

### 힌트

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/16840.%E2%80%85Dense%E2%80%85Amidakuji/8fca9893.png" data-original-src="https://upload.acmicpc.net/ebf62cd5-053d-4079-a96f-d57b88548bf4/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 96px; height: 124px;" /></p>

<p>For example, if he initially chooses the leftmost segment in sample 1, he crosses (1, 1),(2, 2),(4, 2) and reach the bottom end of the segment that is second from the left.</p>