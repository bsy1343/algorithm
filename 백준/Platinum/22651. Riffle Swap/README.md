# [Platinum I] Riffle Swap - 22651

[문제 링크](https://www.acmicpc.net/problem/22651)

### 성능 요약

시간 제한: 8 초 (추가 시간 없음), 메모리 제한: 512 MB

### 통계

제출: 13, 정답: 11, 맞힌 사람: 8, 정답 비율: 88.889%

### 분류

수학, 정수론, 조합론, 페르마의 소정리, 오일러 피 함수, 번사이드 보조정리

### 문제 설명

<p>You have a deck of 2<sup><i>N</i></sup>&nbsp;cards (1 &le;&nbsp;<i>N</i>&nbsp;&le; 1000000) and want to have them shuffled.</p>

<p>The most popular shuffling technique is probably the riffle shuffle, in which you split a deck into two halves, place them in your left and right hands, and then interleave the cards alternatively from those hands. The shuffle is called perfect when the deck is divided exactly in half and the cards are interleaved one-by-one from the bottom half. For example, the perfect riffle shuffle of a deck of eight cards &lt;0, 1, 2, 3, 4, 5, 6, 7&gt; will result in a deck &lt;0, 4, 1, 5, 2, 6, 3, 7&gt;.</p>

<p>Since you are not so good at shuffling that you can perform the perfect riffle shuffle, you have decided to simulate the shuffle by swapping two cards as many times as needed. How many times you will have to perform swapping at least? As the resultant number will obviously become quite huge, your program should report the number modulo&nbsp;<i>M</i>&nbsp;= 1000003.</p>

### 입력

<p>The input just contains a single integer&nbsp;<i>N</i>.</p>

### 출력

<p>Print the number of swaps in a line. No extra space or empty line should occur.</p>