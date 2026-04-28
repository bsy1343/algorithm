# [Silver IV] Shiritori - 24793

[문제 링크](https://www.acmicpc.net/problem/24793)

### 성능 요약

시간 제한: 2 초 (추가 시간 없음), 메모리 제한: 1024 MB

### 통계

제출: 154, 정답: 111, 맞힌 사람: 92, 정답 비율: 69.697%

### 분류

구현, 자료 구조, 문자열, 집합과 맵, 해시를 사용한 집합과 맵

### 문제 설명

<figure style="width: 300px; float: right;"><img alt="" src="%EB%B0%B1%EC%A4%80/Silver/24793.%E2%80%85Shiritori/fd6e969a.png" data-original-src="%EB%B0%B1%EC%A4%80/Silver/24793.%E2%80%85Shiritori/fd6e969a.png" data-original-src="https://upload.acmicpc.net/4bb02293-8500-44da-b67f-44f0bf4a7cde/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 300px; height: 302px;" />
<figcaption>The original version of Shiritori is played using Japanese hiragana, katakana, or kanji characters. Source <a href="https://commons.wikimedia.org/wiki/File:Shiritori.png">WikiMedia</a></figcaption>
</figure>

<p>The Japanese game of Shiritori is the perfect game for a long car ride. The rules are simple: the first player picks any word to say, then the second player must choose a new word that begins with the last letter of the word that the first player just said. Your job is to determine if the game was played according to these rules, given a history of the words used in a particular game. In a game, player $1$ always starts first.</p>

### 입력

<p>Input consists of one test case that begins with an integer $N$ ($2 \leq N \leq 100\,000$) on a single line. &nbsp;Each of the following $N$ lines contains $1$ word. &nbsp;The words are presented in the order in which the players called them out, starting with player $1$. All words consist of between $1$ and $120$ lowercase English letters.</p>

### 출력

<p>If the game was played according to the rules, output &quot;<code>Fair Game</code>&quot;. Otherwise, find out which player first violated the rules of the game. &nbsp;That player lost the game, so output &quot;<code>Player &lt;i&gt; lost</code>&quot;. For example, if player $1$ violated the rules first, output &quot;<code>Player 1 lost</code>&quot;.</p>