# [Silver I] Memory Match - 13348

[문제 링크](https://www.acmicpc.net/problem/13348)

### 성능 요약

시간 제한: 5 초, 메모리 제한: 512 MB

### 통계

제출: 209, 정답: 85, 맞힌 사람: 80, 정답 비율: 42.328%

### 분류

구현, 많은 조건 분기

### 문제 설명

<p>You are playing the game &ldquo;Memory Match&rdquo;.</p>

<p>This game revolves around a set of N picture cards. The cards are organized in pairs: there&nbsp;are N/2 different pictures, each picture occurring on exactly two cards.</p>

<p>At the beginning of the game, the cards are shuffled and laid face down on the table. Players&nbsp;then take turns in guessing a pair of cards with the same picture. Each turn consists of picking&nbsp;a face-down card and turning it over to reveal its picture, then picking another face-down&nbsp;card and turning that card over as well. If the pictures on the two turned cards are identical,&nbsp;the cards remain face-up, the player scores a point and may take another turn. If the pictures&nbsp;are different, both cards are turned face-down again and the turn goes to the next player.</p>

<p>It is now your turn! Given a description of all previous actions in the game, pick as many&nbsp;matching pairs as possible.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Silver/13348.%E2%80%85Memory%E2%80%85Match/c0d2944b.png" data-original-src="https://onlinejudgeimages.s3.amazonaws.com/problem/13348/%EC%8A%A4%ED%81%AC%EB%A6%B0%EC%83%B7%202016-10-10%20%EC%98%A4%ED%9B%84%204.05.17.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:91px; width:500px" /><br />
Figure 1: Illustration of the first example input. Only cards 3 and 6 have been matched&nbsp;correctly, all other cards are face-down. How many pairs can you score?</p>

### 입력

<p>The first line contains an even integer N, the number of cards on the table (2 &le; N &le; 1000).</p>

<p>The second line contains an integer K, the number of turns played thus far in the game&nbsp;(0 &le; K &le; 1000).</p>

<p>The following K lines each describe a turn. A turn is described by integers C<sub>1</sub> and C<sub>2&nbsp;</sub>followed by words P<sub>1</sub> and P<sub>2</sub>. The numbers C<sub>1</sub> and C<sub>2</sub> refer to card positions on the table&nbsp;(1 &le; C<sub>1</sub>, C<sub>2</sub> &le; N and C<sub>1</sub>&nbsp;&ne;&nbsp;C<sub>2</sub>). The words describe the pictures on the two selected cards.&nbsp;Each word consists of between 1 and 20 lowercase letters in range &lsquo;a&rsquo; . . . &lsquo;z&rsquo;. If P<sub>1</sub> = P<sub>2</sub>, the&nbsp;two cards stay face-up and the corresponding positions C<sub>1</sub> and C<sub>2</sub> may not be chosen again.</p>

<p>The input is such that at least two cards are still in face-down position.</p>

### 출력

<p>Output one line with an integer S, the number of matching pairs you can score with certainty.</p>