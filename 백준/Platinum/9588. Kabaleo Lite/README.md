# [Platinum III] Kabaleo Lite - 9588

[문제 링크](https://www.acmicpc.net/problem/9588)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 57, 정답: 22, 맞힌 사람: 15, 정답 비율: 46.875%

### 분류

많은 조건 분기

### 문제 설명

<p>Kabaleo Lite is a board game. The board consists of several stacks of conical chips of various colors. Only the color of the top chip of the stack is visible.</p>

<p>Each player has a unique target color and a set of colored chips. The target color is hidden from other players, while the set of chips is visible to them. On his turn, player selects one of his chips and puts it on one of the board stacks, thus recoloring it to the color of the chosen chip.</p>

<p>After the last turn, the number of visible board chips of each color is calculated. The winning color is the color that occurs the maximum times. The player (if any) that has this color as his target color, wins the game. If there is no such player or if there are two or more colors that occur the maximum times, the game ends in a draw.</p>

<p>You are playing your last chip in the Kabaleo Lite game. Other players also have one chip left. You want to determine all possible moves that lead you to winning the game. You do not know the target colors of other players and you cannot predict their moves, so your move must guarantee your victory regardless of moves of your opponents.</p>

### 입력

<p>The first line contains four integers n, p, c and h &mdash; the number of stacks on the board (1 &le; n &le; 10<sup>6</sup>), the number of players (1 &le; p &le; 10<sup>6</sup>), the number of chips&rsquo; colors (p &le; c &le; 10<sup>6</sup>), and your hidden color (1 &le; h &le; c).</p>

<p>The second line contains n integers b<sub>i</sub> &mdash; the color of the visible board chip for each stack on the board (1 &le; b<sub>i</sub> &le; c).</p>

<p>The third line contains p integers l<sub>i</sub> &mdash; the color of the last chip for each player (1 &le; l<sub>i</sub> &le; c). The players are numbered from one (you) to n in the order of their turns.</p>

### 출력

<p>The first line must contain w &mdash; the number of winning moves.</p>

<p>The second line must contain w distinct numbers m<sub>i</sub> &mdash; the numbers of the stacks on which your chip should be put to win. Stacks are numbered starting from 1 in the order that their visible colors are given in the input file. You can output their numbers in any order on this line.</p>

<p>Remember, that your move should be winning regardless of the moves of all other players.</p>

### 힌트

<p>Note, that if you put the chip on the 4th stack, other players may place their chips on the 1st and the 3rd stack, which leads to a draw, because the number of visible chips of the first and the second colors is the same (three chips of each color).</p>