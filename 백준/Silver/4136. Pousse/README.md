# [Silver III] Pousse - 4136

[문제 링크](https://www.acmicpc.net/problem/4136)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 77, 정답: 30, 맞힌 사람: 28, 정답 비율: 40.000%

### 분류

구현, 시뮬레이션

### 문제 설명

<p>Recently, the organizers of the International Conference on Functional Programming had a programming contest for people to show that their language was best. The contest main web page is at http://www.ai.mit.edu/extra/icfp-contest/. Each entrant had to write an implementation of the game &quot;pouse&quot;, for which the description went as follows:</p>

<p>Description of the game</p>

<p>The name of the game is &quot;pousse&quot; (which is French for &quot;push&quot;). It is a 2 person game, played on an N by N board (the original game was 4x4 but NxN is a simple generalisation to adjust the difficulty of the game, and its implementation). Initially the board is empty, and the players take turns inserting one marker of their color (X or O) on the board. The color X always goes first. The columns and rows are numbered from 1 to N, starting from the top left, as in:</p>

<pre>
   1 2 3 4
  +-+-+-+-+
1 | | | | |
  +-+-+-+-+
2 | | | | |
  +-+-+-+-+
3 | | | | |
  +-+-+-+-+
4 | | | | |
  +-+-+-+-+
</pre>

<p>A marker can only be inserted on the board by sliding it onto a particular row from the left or from the right, or onto a particular column from the top or from the bottom. So there are 4*N possible &quot;moves&quot; (ways to insert a marker). They will be named &quot;Li&quot;, &quot;Ri&quot;, &quot;Ti&quot;, &quot;Bi&quot; respectively, where &quot;i&quot; is the number of the row or column where the insertion takes place.</p>

<p>When a marker is inserted, there may be a marker on the square where the insertion takes place. In this case, all markers on the insertion row or column from the insertion square upto the first empty square are moved one square further to make room for the inserted marker. Note that the last marker of the row or column will be pushed off the board (and must be removed from play) if there are no empty squares on the insertion row or column.</p>

<p>A row or a column is a &quot;straight&quot; of a given color, if it contains N markers of the given color.&nbsp;</p>

<p>The game ends when an insertion creates a configuration with more straights of one color than straights of the other color; the player whose color is dominant (in number of straights) WINS.</p>

### 입력

<p>The standard input of the program will contain a number N &lt;= 100 on the first line and this will be followed by a sequence of moves (in the notation previously described) with one move per line. There are no intervening spaces or empty lines.</p>

<p>The program can assume that all moves in the sequence are valid.</p>

### 출력

<p>The organizers then want to play one submitted program against the others to see which is best. So they need to know when one program wins.</p>

<p>Your job is to write a program to determine when a game has been won. The input to your program is the same as described above: an initial number followed by a sequence of moves. As soon as a move produces a winning board position, your program should print out whether &quot;X WINS&quot; or &quot;O WINS&quot;, and exit. If a line containing QUIT is read before a winner is declared, your program should print out &quot;TIE GAME&quot; and exit. As a failsafe, the last line of every input will be a QUIT line.</p>