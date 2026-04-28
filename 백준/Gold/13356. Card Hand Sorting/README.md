# [Gold III] Card Hand Sorting - 13356

[문제 링크](https://www.acmicpc.net/problem/13356)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 512 MB

### 통계

제출: 72, 정답: 51, 맞힌 사람: 42, 정답 비율: 73.684%

### 분류

브루트포스 알고리즘, 다이나믹 프로그래밍, 가장 긴 증가하는 부분 수열 문제

### 문제 설명

<p>When dealt cards in the card game Plump it is a good&nbsp;idea to start by sorting the cards in hand by suit and&nbsp;rank. The different suits should be grouped and the&nbsp;ranks should be sorted within each suit. But the order&nbsp;of the suits does not matter and within each suit, the&nbsp;cards may be sorted in either ascending or descending&nbsp;order on rank. It is allowed for some suits to be sorted&nbsp;in ascending order and others in descending order.&nbsp;</p>

<p>Sorting is done by moving one card at a time from&nbsp;its current position to a new position in the hand, at&nbsp;the start, end, or in between two adjacent cards. What&nbsp;is the smallest number of moves required to sort a&nbsp;given hand of cards?</p>

### 입력

<p>The first line of input contains an integer n (1 &le; n &le; 52), the number of cards in the hand.&nbsp;The second line contains n pairwise distinct space-separated cards, each represented by two&nbsp;characters. The first character of a card represents the rank and is either a digit from 2 to 9 or&nbsp;one of the letters T, J, Q, K, and A representing Ten, Jack, Queen, King and Ace, respectively,&nbsp;given here in increasing order. The second character of a card is from the set {s, h, d, c}&nbsp;representing the suits spades &spades;, hearts &hearts;, diamonds &diams;, and clubs &clubs;</p>

### 출력

<p>Output the minimum number of card moves required to sort the hand as described above.</p>