# [Silver V] Barabashka - 31291

[문제 링크](https://www.acmicpc.net/problem/31291)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 1024 MB

### 통계

제출: 138, 정답: 40, 맞힌 사람: 34, 정답 비율: 32.692%

### 분류

구현, 문자열, 파싱

### 문제 설명

<p><em>The tests for this problem are open. In this problem, you have to choose one of the five items according to a textual description of an image.</em></p>

<p>&quot;Barabashka&quot; (originally named &quot;Geistesblitz&quot;) is a board game that favors fast reaction. Below are the rules of the game for this problem. Please read them carefully, as they are slightly different from the original game rules.</p>

<p>The game set includes five items of different colors: a white ghost named Barabashka, a green bottle, a gray mouse, a blue book and a red chair, and also special cards. Each card contains an image with exactly two of these five items. Each of the items also has one of the aforementioned five colors, but the color of each item may be wrong. The colors of these two items are different. The image can contain other objects, but their colors are guaranteed to be different from the five colors above.</p>

<p>A single move in the game proceeds as follows. All items are put on the table, and after that, a card is drawn from the deck and shown to the players. If the card contains an item of the right color (the color on the picture matches the color of the real item on the table), the players have to grab that item. Otherwise, the players have to grab the item which is not present on the picture, and the true color of which also does not appear on the picture. The winner is the player who grabs the right item earlier than the others. The winner gets the card as a reward. It is guaranteed that all cards contain images for which there exists a unique right answer.</p>

<p>In this problem, each test consists of exactly five sentences. A sentence is a textual description of one card in English. The right answer for a sentence is the description of the item to grab when the players see such card.</p>

<p>Each sentence is written in English and can contain English letters, spaces and characters &quot;<code>&#39;</code>&quot;, &quot;<code>,</code>&quot;, &quot;<code>-</code>&quot; and &quot;<code>.</code>&quot; (ASCII codes 39, 44, 45 and 46). The names and the right colors of the items are the following: &quot;<code>white Barabashka</code>&quot;, &quot;<code>blue book</code>&quot;, &quot;<code>red chair</code>&quot;, &quot;<code>gray mouse</code>&quot; and &quot;<code>green bottle</code>&quot;.</p>

<p>Let a word be a sequence of English letters surrounded from both ends by line ends or non-letter characters. Then we can formulate the following restrictions on the sentences:</p>

<ul>
	<li>A sentence contains exactly two positions of the form &quot;<code>color name</code>&quot; where the word &quot;<code>color</code>&quot; is one of the five colors mentioned above, and the word &quot;<code>name</code>&quot; is one of the five item names.</li>
	<li>No other word in the sentence is equal to the name or the color of some of the items on the table.</li>
</ul>

<p>The tests in this problem are open for contestants and can be downloaded at the following addresses:</p>

<ul>
	<li><a href="https://upload.acmicpc.net/a8853ad9-923b-4311-a272-8bf861652499/">tests.zip</a> (Windows line breaks),</li>
	<li><a href="https://upload.acmicpc.net/a7dd5f43-5e6c-49bf-9284-7d629d5fea38/">tests.tar.gz</a> (Linux line breaks).</li>
</ul>

<p>The problem contains $24$ tests, that is, $24 \cdot 5 = 120$ card descriptions: one description for each possible combination of items and their colors on a card.</p>

### 입력

<p>The input consists of five lines. Each line contains one sentence of length from $1$ to $80$ characters. The exact format of each sentence is given in the problem description. Uppercase and lowercase letters are considered different.</p>

### 출력

<p>For each sentence, print a line containing two words separated by a space: the right color and name of the item to grab when the players see the card described by that sentence. Uppercase and lowercase letters are considered different.</p>

### 힌트

<p>The first, third and fifth sentences of the example describe items of the right colors. So, their colors and names must be printed. In the second and fourth sentences, this is not the case, so we must choose such an item that neither its name nor its color appear as words in the sentence.</p>