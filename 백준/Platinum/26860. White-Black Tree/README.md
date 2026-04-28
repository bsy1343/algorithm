# [Platinum I] White-Black Tree - 26860

[문제 링크](https://www.acmicpc.net/problem/26860)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 117, 정답: 35, 맞힌 사람: 33, 정답 비율: 32.353%

### 분류

애드 혹, 트리, 게임 이론, 홀짝성, 불변량 찾기

### 문제 설명

<p>The White-Black Tree is a game played by two players on a rooted tree of N nodes. The nodes are numbered from 1 to N and node 1 is the root. Each node in the tree has a color C<sub>i</sub> of either 0 (representing black) or 1 (representing white) that can be changed according to the rule of the game.</p>

<p>Two opposing players play alternatingly. In their turn, the player chooses a white node in the tree; let the chosen node be x. First, the color of node x (C<sub>x</sub>) is changed from white to black. Then, in the same turn, the player is allowed to change the color of zero or more nodes that are a descendant of node x from white to black or black to white. A node y is a descendant of a node x if and only if the parent of node y is either node x or a descendant of node x. The player who cannot make any move loses and the opposing player wins the game.</p>

<p>Your task in this problem is to determine who will win the game assuming both players play optimally; it means that if there exists a move that guarantees their win, then they will surely play that move.</p>

<p>For example, consider the following game with a rooted tree of N = 7 nodes and let the initial colors be C<sub>1..7</sub> = {0, 1, 1, 0, 0, 0, 1}.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/26860.%E2%80%85White-Black%E2%80%85Tree/8c2ab000.png" data-original-src="https://upload.acmicpc.net/ea6d49ec-ba08-4c91-b1dc-e4bdd5adabcc/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 197px; height: 200px;" /></p>

<p>There are three white nodes (node 2, 3, and 7) in which the first player can choose for their first move. In this example, there is a strategy for the first player to win the game. One of the optimal plays for the first player is to choose node 3, change C<sub>3</sub> into 0 (black), and then change the color of node 6 and node 7 (both are node 3&rsquo;s descendant), i.e. C<sub>6</sub> becomes 1 (white) and C<sub>7</sub> becomes 0 (black). When it&rsquo;s the second player&rsquo;s turn, there are only two white nodes to choose from (node 2 and 6) and both of them do not have any descendants. No matter what the second player chooses for their turn, the first player will simply choose the remaining one white node so that the second player will not be able to make any move. Therefore, the second player loses and the first player wins this example game.</p>

### 입력

<p>Input begins with a line containing an integer N (2 &le; N &le; 100 000) representing the number of nodes in the given tree. The second line contains N &minus; 1 integers P<sub>i</sub> (1 &le; P<sub>i</sub> &lt; i) for i = 2..N representing the parent of node i. The third line contains N integers C<sub>i</sub> (C<sub>i</sub> &isin; {0, 1}) representing the initial color of node i. The color black is represented by the integer 0 while the color white is represented by the integer 1.</p>

### 출력

<p>Output a string &ldquo;<code>First</code>&rdquo; in a line if the first player will win the game assuming both players play the game optimally. Otherwise, output a string &ldquo;<code>Second</code>&rdquo; in a line.</p>