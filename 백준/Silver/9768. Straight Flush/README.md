# [Silver II] Straight Flush - 9768

[문제 링크](https://www.acmicpc.net/problem/9768)

### 성능 요약

시간 제한: 5 초, 메모리 제한: 512 MB

### 통계

제출: 21, 정답: 17, 맞힌 사람: 15, 정답 비율: 83.333%

### 분류

정렬

### 문제 설명

<p>In a standard poker game, a player is given a hand of five cards. Each card consists of a rank, which is a number from 1 to 13, and a suit which is one of four symbols. For example, a card 7&hearts; has a rank of 7 and a suit of &hearts; (called heart). The strength of a hand depends on the combination of the cards.</p>

<p>One type of a hand that is considerably strong is called Straight Flush. A Straight Flush is a hand with sequential rank and the same suit. For example, a hand of 3&clubs;, 4&clubs;, 5&clubs;, 6&clubs; and 7&clubs; is called a Straight Flush of &clubs; (club), because all of them are of the club suit.</p>

<p>In this problem, you are playing a &ldquo;Super Poker Game&rdquo; which uses a special deck of cards. This deck of has n ranks, numbered from 1 to n, and has m suits, numbered from 1 to m. Additionally, there can be multiple cards of the same rank and suit in the deck. Your hand consists of k cards. A straight flush of this &ldquo;Super Poker Game&rdquo; is a combination of at least two cards with sequential ranks and the same suit.</p>

<p>Your task is to find a straight flush that consists of the largest number of cards. Multiple cards of the same rank and suit are counted as a single card.</p>

### 입력

<p>The first line contains an integer T (1 &le; T &le; 22) which is the number of test cases. The following lines give T test cases. Each test case is formatted as follow.</p>

<ul>
	<li>the first line contains three integers n, m, and k, (1 &le; n &le; 10<sup>9</sup>; 1 &le; m &le; 10; 1 &le; k &le; 10<sup>6</sup>) giving the number of suits and the number of ranks of the deck and the size of the hand, respectively.</li>
	<li>the following k lines describes the hand. Each line describes one card and consists of two integers r and s where r is the rank of the card and s is the suit of the card (1 &le; r &le; n; 1 &le; s &le; m). Be noted that there can be many cards of the same rank and suit in the deck.</li>
</ul>

### 출력

<p>For each test case, you have to print a line containing an integer that gives the number of card of the largest straight flush (Multiple cards of the same rank and suit are counted as a single card). If there is no straight flush, the size of the largest straight flush is 0.</p>

### 힌트

<p>The Straight Flush of the first test case has two cards which are the card 5-1 and the card 6-1. Even though there are three copies of the card 5-1, we still count the card 5-1 as one single card. For the second test case, The Straight Flush consists of 96-10, 97-10, 98-10 and 99-10, with the size of four cards. For the last test case, there is no straight flush.</p>