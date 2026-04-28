# [Platinum III] Lone Rook - 24588

[문제 링크](https://www.acmicpc.net/problem/24588)

### 성능 요약

시간 제한: 11 초 (추가 시간 없음), 메모리 제한: 1024 MB

### 통계

제출: 44, 정답: 14, 맞힌 사람: 13, 정답 비율: 59.091%

### 분류

너비 우선 탐색, 그래프 이론, 그래프 탐색

### 문제 설명

<figure style="float: right;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/24588.%E2%80%85Lone%E2%80%85Rook/347f68f0.png" data-original-src="%EB%B0%B1%EC%A4%80/Platinum/24588.%E2%80%85Lone%E2%80%85Rook/347f68f0.png" data-original-src="https://upload.acmicpc.net/9a7e9868-8fca-4162-a661-0373323e931e/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 242px; height: 244px;" />
<figcaption style="text-align:right;"><small>Rook and knight icons by <a href="https://en.wikipedia.org/wiki/Chess_piece">Cburnett</a></small></figcaption>
</figure>

<p>On a chess board of r rows and c columns there is a lone white rook surrounded by a group of opponent&rsquo;s black knights. Each knight attacks 8 squares as in a typical chess game, which are shown in the figure &ndash; the knight on the red square attacks the 8 squares with a red dot. The rook can move horizontally and vertically by any number of squares. The rook can safely pass through an empty square that is attacked by a knight, but it must move to a square that is not attacked by any knight. The rook cannot jump over a knight while moving. If the rook moves to a square that contains a knight, it may capture it and remove it from the board. The black knights never move. Can the rook eventually safely move to the designated target square?</p>

<p>The figure illustrates how the white rook can move to the blue target square at the top-right corner in the first sample case. The rook captures one black knight at the bottom-right of the board on its way.</p>

### 입력

<p>The first line of input contains two integers r and c (2 &le; r, c &le; 750). Each of the next r lines describes one row of the board using c characters: the letter &lsquo;<code>R</code>&rsquo; represents the white rook, a &lsquo;<code>K</code>&rsquo; represents a black knight, a dot &lsquo;<code>.</code>&rsquo; represents an empty square, and the letter &lsquo;<code>T</code>&rsquo; represents the white rook&rsquo;s target square. There is exactly one &lsquo;<code>R</code>&rsquo;, exactly one &lsquo;<code>T</code>&rsquo;, and at least one &lsquo;<code>K</code>&rsquo; on the board. It is guaranteed that the white rook starts in a square that is not attacked by any knight. The target square may be attacked by a knight, in which case the knight must be captured before the rook can safely move to the target square.</p>

### 출력

<p>Output <code>yes</code> if the white rook can move to the target square, or <code>no</code> otherwise.</p>