# [Platinum III] Greetings! - 13053

[문제 링크](https://www.acmicpc.net/problem/13053)

### 성능 요약

시간 제한: 3 초, 메모리 제한: 512 MB

### 통계

제출: 83, 정답: 44, 맞힌 사람: 40, 정답 비율: 54.054%

### 분류

다이나믹 프로그래밍, 비트마스킹, 비트필드를 이용한 다이나믹 프로그래밍

### 문제 설명

<p>Your greeting card company makes unique greeting cards. The sizes of these greeting cards vary widely because of the whims of card designers. There are a lot of different types of cards, and each has a specific quantity that you need to manufacture.</p>

<p>Your job is to determine what envelopes to order for these greeting cards. You have a strict limit on the different number of different sizes of envelopes, which may be less than the number of distinct sizes of cards. You need to have envelopes so that every card fits in some envelope, possibly with room to spare, and the amount of waste paper is minimized. Measure the waste paper by the area of the envelope that is in excess of the area of the card, for each card. For example, a 10 &times; 4 card in a 10 &times; 4 envelope has no wasted paper, but a 10 &times; 4 card in a 12 &times; 5 envelope has waste of 20. You may not rotate the cards to fit them in the envelopes better.</p>

<p>Suppose that you have 5 types of cards: 10 &times; 10 (5 of these), 9 &times; 8 (10 of these), 4 &times; 12 (20 of these), 12 &times; 4 (8 of these), and 2 &times; 3 (16 of these).</p>

<p>Now, suppose that you can only buy one type of envelope. Since all cards have to fit in that one envelope size, the smallest envelope size you can use is 12&times;12, with an area of 144. The wastes by each type of card are 144&minus;10 &middot; 10 = 44, 144&minus;9 &middot; 8 = 72, 144&minus;4 &middot; 12 = 96, 144&minus;12 &middot; 4 = 96, and 144&minus;2 &middot; 3 = 138, respectively. The total waste is 44 &middot; 5+72 &middot; 10+96 &middot; 20+96 &middot; 8+138 &middot; 16 = 5836.</p>

<p>Suppose that you can buy 2 types of envelopes. The best you can do is to put the 10 &times; 10, 9 &times; 8 and 12 &times; 4 cards in 12 &times; 10 envelopes, and the 4 &times; 12 and 2 &times; 3 cards in 4 &times; 12 envelopes. That adds up to waste of 1828.</p>

<p>If you can buy 5 types of envelopes, then you can match one envelope type to each card type, and there&rsquo;s no waste!</p>

<p>Given a list of card types and the number of types of envelopes you can buy, what is the smallest amount of wasted paper you can achieve?</p>

### 입력

<p>Each input will consist of a single test case. Note that your program may be run multiple times on different inputs. The first line of the input will consist of two space-separated integers n and k (1 &le; n, k &le; 15), where n is the number of different types of cards, and k is the maximum number of types of envelopes you can order. Each of the following n lines will consist of three integers, describing a type of card. The integers are w, h and q (1 &le; w, h, q &le; 10,000), where w is the width of the cards of this type, h is the height of the cards, and q is the quantity of cards of this type.</p>

### 출력

<p>Output a single integer, representing the smallest possible total amount of wasted paper.</p>