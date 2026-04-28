# [Silver III] Snap - 4394

[문제 링크](https://www.acmicpc.net/problem/4394)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 78, 정답: 34, 맞힌 사람: 14, 정답 비율: 35.000%

### 분류

구현, 자료 구조, 문자열, 시뮬레이션

### 문제 설명

<p>Snap is a 2-player card game. The deck of cards contains several of each type of card. Initially each player has one half of the deck, in some random sequence, face down in a pile, and plays them in sequence from top to bottom, placing each card face-up in another pile. When the face-down pile is exhausted, the face-up pile is turned over to become the face-down pile and play continues.</p>

<p>The two players play their cards concurrently and synchronously. That is, each places a card face up at exactly the same time. If two cards turned up at the same time are the same type, each player calls &quot;Snap!&quot; and the player who calls first takes the other&#39;s face-up pile and places it on top of his or her own.</p>

<p>Play proceeds until one player has all the cards. This player is the winner.</p>

<p>Your job is to simulate a game of snap to determine whether it will end within 1000 turns and, if so, to determine the winner.</p>

### 입력

<p>Each type of card is denoted by a single letter or digit. The first line of input Jane&#39;s initial pile of cards, from top to bottom. The second line of input is John&#39;s initial pile. Jane and John start with the same number of cards; not more than 50 each.</p>

<p>&nbsp;</p>

### 출력

<p>During play, whenever it comes time to call &quot;Snap!&quot; the builtin function &quot;random&quot; is used to determine who calls first: if the expression</p>

<pre>
&nbsp; &nbsp;random()/141%2 &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; {in C or C++}
&nbsp; &nbsp;random div 141 mod 2 &nbsp; &nbsp; {in Pascal; see note below}</pre>

<p>yields 0, Jane calls first; otherwise John calls first. Whenever Jane calls first, print &quot;Snap! for Jane: &quot; followed by Jane&#39;s face-up pile, from top to bottom. Whenever John calls first, print &quot;Snap! for John: &quot; followed by John&#39;s face-up pile. If the game ends, print &quot;John wins.&quot; or &quot;Jane wins.&quot;, whichever is appropriate. If the game does not end when each player has turned over 1000 cards, print &quot;Keeps going and going ...&quot;</p>