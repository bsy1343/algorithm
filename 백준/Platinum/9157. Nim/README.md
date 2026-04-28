# [Platinum V] Nim - 9157

[문제 링크](https://www.acmicpc.net/problem/9157)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 71, 정답: 41, 맞힌 사람: 38, 정답 비율: 66.667%

### 분류

다이나믹 프로그래밍, 게임 이론

### 문제 설명

<p>Let&#39;s play a traditional game Nim. You and I are seated across a table and we have a hundred stones on the table (we know the number of stones exactly). We play in turn and at each turn, you or I can remove one to four stones from the heap. You play first and the one who removed the last stone loses.</p>

<p>In this game, you have a winning strategy. To see this, you first remove four stones and leave 96 stones. No matter how I play, I will end up with leaving 92-95 stones. Then you will in turn leave 91 stones for me (verify this is always possible). This way, you can always leave 5 + 1 stones for me and finally I get the last stone, sigh. If we initially had 101 stones, on the other hand, I have a winning strategy and you are doomed to lose.</p>

<p>Let&#39;s generalize the game a little bit. First, let&#39;s make it a team game. Each team has n players and the 2n players are seated around the table, with each player having opponents at both sides. Turns round the table so the two teams play alternately. Second, let&#39;s vary the maximum number of stones each player can take. That is, each player has his/her own maximum number of stones he/she can take at each turn (The minimum is always one). So the game is asymmetric and may even be unfair.</p>

<p>In general, when played between two teams of experts, the outcome of a game is completely determined by the initial number of stones and the maximum number of stones each player can take at each turn. In other words, either team has a winning strategy.</p>

<p>You are the head-coach of a team. In each game, the umpire shows both teams the initial number of stones and the maximum number of stones each player can take at each turn. Your team plays first. Your job is, given those numbers, to instantaneously judge whether your team has a winning strategy.</p>

<p>Incidentally, there is a rumor that Captain Future and her officers of Hakodate-maru love this game, and they are killing their time playing it during their missions. You wonder where the stones are? Well, they do not have stones but do have plenty of balls in the fuel containers!</p>

### 입력

<p>The input is a sequence of lines, followed by the last line containing a zero. Each line except the last is a sequence of integers and has the following format.</p>

<pre>
n S M<sub>1</sub> M<sub>2</sub> ... M<sub>2n</sub></pre>

<p>where n is the number of players in a team, S the initial number of stones, and Mi the maximum number of stones ith player can take. 1st, 3rd, 5th, ... players are your team&#39;s players and 2nd, 4th, 6th, ... the opponents. Numbers are separated by a single space character. You may assume 1 &le;&nbsp;n &le; 10, 1 &le; M<sub>i</sub> &le; 16, and 1 &le; S &le; 2<sup>13</sup>.</p>

### 출력

<p>The output should consist of lines each containing either a one, meaning your team has a winning strategy, or a zero otherwise.</p>