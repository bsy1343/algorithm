# [Platinum IV] Dominance - 3324

[문제 링크](https://www.acmicpc.net/problem/3324)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 128 MB

### 통계

제출: 11, 정답: 6, 맞힌 사람: 6, 정답 비율: 54.545%

### 분류

이분 탐색, 값 / 좌표 압축, 기하학, 구현, 수학, 누적 합, 정렬

### 문제 설명

<p>Imagine the land of Bugtopia as a grid of W &times; H squares. Bugtopia is inhabited by white and black bugs. Each square is either inhabited by white bugs only (we call it &ldquo;white square&rdquo; then) or by black bugs only (a &ldquo;black square&rdquo;) or not inhabited at all. White bugs are pretty aggressive against black bugs, and vice versa. Each kind wants to dominate Bugtopia. For that purpose, the bugs move along the grid; a move to a vertically or horizontally adjacent square is counted as one step. Thus, the bugs of one square are able to attack other squares if they can reach them with no more than a certain number of steps. This &ldquo;range&rdquo; depends on their square; different squares provide different living conditions. We say that a square is dominated by the white bugs if it can be attacked from more white squares than black squares. Similarly, a square is dominated by the black bugs if it can be attacked from more black than white squares. Note that a square is called neutral if it can be attacked from no square or from equally many white and black squares.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/3324.%E2%80%85Dominance/33acdd31.png" data-original-src="https://upload.acmicpc.net/6fd91f89-b546-45f9-814d-b406db0d17b7/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 282px; height: 282px;" /></p>

<p>This picture shows two white squares (marked with a white circle) with ranges 3 and 2, as well as one black square (marked with a black circle) with range 2. The white bugs dominate 30 squares, the black bugs dominate 9 squares. The three squares colored in light gray can be attacked, but are neutral and therefore not dominated by any kind of bugs.</p>

<p>Given the size of the grid and the positions, colors, and ranges of the inhabited squares, output the total number of squares dominated by each kind of bugs.</p>

### 입력

<p>The first line contains two integers, W and H, that determine the size of the grid (1 &le; W, H &le; 1 000 000 000). The next line contains a single integer N (0 &le; N &le; 3 000), the number of inhabited squares.</p>

<p>The following N lines each describe an inhabited square. That is, line i+ 2 contains values c<sub>i</sub>, x<sub>i</sub> (0 &le; x<sub>i</sub> &lt; W), y<sub>i</sub> (0 &le; y<sub>i</sub> &lt; H), and r<sub>i</sub> (0 &le; r<sub>i</sub> &lt; 500 000 000), separated by single spaces: The square&rsquo;s color, its coordinates, and its range, respectively. The square&rsquo;s color is either &lsquo;W&rsquo; (a white square) or &lsquo;B&rsquo; (a black square). Note that the squares&rsquo; ranges will never reach beyond the&nbsp;borders of Bugtopia. The bottom-left square of the grid has coordinates (0, 0), and the top-right square has coordinates (W &minus; 1, H &minus; 1).</p>

### 출력

<p>Output one line with two integers separated by a single space: the number of squares dominated by the white bugs, followed by the number of squares dominated by the black bugs.</p>