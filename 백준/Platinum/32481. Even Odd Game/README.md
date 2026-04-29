# [Platinum IV] Even Odd Game - 32481

[문제 링크](https://www.acmicpc.net/problem/32481)

### 성능 요약

시간 제한: 4 초 (추가 시간 없음), 메모리 제한: 1024 MB

### 통계

제출: 168, 정답: 58, 맞힌 사람: 49, 정답 비율: 38.583%

### 분류

게임 이론, 구현, 다이나믹 프로그래밍

### 문제 설명

<p>As every Saturday, Eve is paying her local game club a visit. Today, Bob has brought a new game he has designed on his own. After thorough investigation, you claim that there exists a dominant strategy, so one player can always win. Bob is hesitant to accept that his game is boring to play, so he challenges you to play a round! Since you claim that there exists a dominant strategy, you may determine who begins the game.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/32481.%E2%80%85Even%E2%80%85Odd%E2%80%85Game/abe413d8.png" data-original-src="https://boja.mercury.kr/assets/problem/32481-1.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 681px; height: 300px;"></p>

<p style="text-align: center;">Figure E.1: The cards in the two sample interactions.</p>

<p>The rules are as follows. There are $n$ cards on the table, each containing a maths operation (<code>+</code> or <code>*</code>) and an integer, as shown in Figure E.1. Eve and Bob alternate picking cards to manipulate a common number using one of the cards. For instance, if the current value of the number is $5$, and the card says $+3$, then the value gets updated to $8$. Each card can only be used once, and the game ends when all the cards have been used. The player who makes the first move wins if the final number is odd, and the other player wins if the final number is even. Given the list of cards and the starting value, help Eve win the game.</p>

### 입력



### 출력

