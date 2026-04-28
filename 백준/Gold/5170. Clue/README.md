# [Gold IV] Clue - 5170

[문제 링크](https://www.acmicpc.net/problem/5170)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 62, 정답: 12, 맞힌 사람: 12, 정답 비율: 23.077%

### 분류

구현, 시뮬레이션

### 문제 설명

<p>You may know the board game Clue, in which you put together logical clues to solve a murder mystery. You need to figure out the location, weapon, and murderer. Here are the candidates:</p>

<ul>
	<li>Location : Ballroom, Billiard Room, Conservatory, Dining Room, Hall, Kitchen, Library, Lounge, Study</li>
	<li>Weapon : Candlestick, Gun, Knife, Lead Pipe, Rope, Wrench</li>
	<li>Murderer : Colonel Mustard, Miss Scarlet, Reverend Green, Mrs. Peacock, Mrs. White, Professor Plum</li>
</ul>

<p>Each of these locations, weapons, and suspects is printed on a card. One card of each type (location, weapon, murderer) is hidden: those are the actual ones you want to figure out. The remainder are completely distributed over all n players. Players in turn ask queries<sup>2</sup>.</p>

<p>Each query consists of a location, a weapon, and a suspect. If player i asks such a query, then in order, players i + 1,i + 2,... ,n, 1,... ,i &minus; 1 must try to disprove the query by showing one of the three cards to player i. If the player has at least one of the three cards, then they must show one of the cards, but can choose which one to show. If they don&rsquo;t have any of the three cards, then obviously they cannot show any card, and must say so. Once one player shows a card to player i, the query is aborted, and the other players will not be queried. In this way, players gradually learn which other players have which cards, and thereby figure out which three cards are hidden.</p>

<p>You are to write a program that will use the information from queries and responses to figure out as much as possible about the candidates. We will assume here that you are player 1, and can learn only from queries submitted by yourself<sup>3</sup>. Therefore, all the data sets will contain as input only your own queries and the corresponding answers, never the queries by other players.</p>

<p><sup>2</sup>To do so, they need to roll dice and move around, but we&rsquo;ll ignore that part here.</p>

<p><sup>3</sup>While this is not quite true in practice, it simplifies the problem a bit.</p>

### 입력

<p>The first line contains the number K of data sets. This is followed by K data sets, each of the following form:</p>

<p>The first line of each data set contains three numbers n,c,q, the number of players, cards you received, and queries, with 2 &le; n &le; 6, 0 &le; c &le; 18 and 0 &le; q &le; 1000. This is followed by c lines, each giving the name for one card you hold yourself. Next come the q queries, each of the following form. The first line of a query is the proposed location, the second line the weapon, and the third the murderer. All of these, as well as the c cards, will be spelled exactly as given above (including capitalization). This is followed by up to n &minus; 1 lines, the responses by the other players. Each response i is either the word &ldquo;Nothing&rdquo; (if player i has none of the three cards), or otherwise the name of one of the cards that player i holds. If it is the name of a card, then the next line begins a new query.</p>

### 출력

<p>For each data set, output &ldquo;Data Set x:&rdquo; on a line by itself, where x is its number. On the subsequent lines, output, one by one, the locations, weapons, and suspects not yet ruled out. Each group should be in alphabetical order. Each data set should be followed by one empty line.</p>