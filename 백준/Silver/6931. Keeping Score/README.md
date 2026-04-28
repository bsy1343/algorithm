# [Silver IV] Keeping Score - 6931

[문제 링크](https://www.acmicpc.net/problem/6931)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 38, 정답: 28, 맞힌 사람: 24, 정답 비율: 77.419%

### 분류

구현, 문자열

### 문제 설명

<p>In a card game, each player&#39;s hand is made up of $13$ cards. Each hand has a total point value determined by the number of cards that have a point value. The cards which are worth points are the <code>Ace</code> ($4$ points), <code>King</code> ($3$ points), <code>Queen</code> ($2$ points) and <code>Jack</code> ($1$ point). The other cards <code>(2, 3, 4, 5, 6, 7, 8, 9, 10)</code> have no point value.</p>

<p>There are four of each type of card, one in each of the four suits. The suits are called clubs (<code>C</code>), diamonds (<code>D</code>), hearts (<code>H</code>), and spades (<code>S</code>). As well, points are assigned for each suit which has a <code>void</code> ($3$ points), a <code>singleton</code> ($2$ points), or a <code>doubleton</code> ($1$ point). A void in a suit means that there are no cards of that suit (e.g. a hand with no spades). A singleton in a suit means that there is only one card in that suit (e.g. a hand with only one diamond). A doubleton in a suit means that there are only two cards in that suit.</p>

<p>Write a program to read a set of thirteen cards in the form of a string, then evaluate the number of points in the hand. The suits will appear in increasing alphabetical order. Within each suit there will be no duplicate cards.</p>

<p>The output is to be the hand and the point value shown in a table form as below. Your output should list the cards in the same order as the input. Note that <code>10</code> is represented by the character <code>T</code> in both the input and the output.</p>

### 입력



### 출력



### 힌트

<p><strong>Note</strong>: your output does not need to match exactly. The spacing is up to you.</p>