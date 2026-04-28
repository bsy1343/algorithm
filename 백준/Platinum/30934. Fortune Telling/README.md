# [Platinum I] Fortune Telling - 30934

[문제 링크](https://www.acmicpc.net/problem/30934)

### 성능 요약

시간 제한: 5 초 (추가 시간 없음), 메모리 제한: 1024 MB

### 통계

제출: 104, 정답: 58, 맞힌 사람: 49, 정답 비율: 57.647%

### 분류

수학, 다이나믹 프로그래밍, 조합론, 확률론

### 문제 설명

<p>Your fortune is to be told by a famous fortune teller. She has a number of tarot cards and a six-sided die. Using the die, she will choose one card as follows and that card shall tell your future.</p>

<p>Initially, the cards are lined up in a row from left to right. The die is thrown showing up one of the numbers from one through six with equal probability. When $x$ is the number the die shows up, the $x$-th card from the left and every sixth card following it, i.e., the $(x + 6k)$-th cards for $k = 0, 1, 2, \dots$, are removed and then remaining cards are slid left to eliminate the gaps. Note that if the number of cards remaining is less than $x$, no cards are removed. This removing and sliding procedure is repeated until only one card remains.</p>

<p>Figure G.1 illustrates how cards are removed and slid when the die shows up two.</p>

<p style="text-align: center;"><img alt="" src="https://upload.acmicpc.net/5d05a015-436b-4b21-9ff0-96d85a808475/-/preview/" style="width: 666px; height: 170px;" /></p>

<p style="text-align: center;">Figure G.1. Removing and sliding cards</p>

<p>You are given the number of initial tarot cards. For each card initially placed, compute the probability that the card will remain in the end.</p>

### 입력

<p>The input is a single line containing an integer $n$, indicating the number of tarot cards, which is between $2$ and $3 \times 10^5$, inclusive.</p>

### 출력

<p>Output $n$ lines, the $i$-th of which should be an integer that is determined, as follows, by the probability of the $i$-th card from the left to remain in the end.</p>

<p>It can be proved that the probability is represented as an irreducible fraction $a/b$, where $b$ is not divisible by a prime number $998\, 244\, 353 = 2^{23} \times 7 \times 17 + 1$. There exists a unique integer $c$ such that $bc \equiv a \pmod {998\, 244\, 353}$ and $0 &le; c &lt; 998\, 244\, 353$. What should be output is this integer $c$.</p>

### 힌트

<p>For Sample Input 1, the probabilities to remain in the end for all the cards are equal, that are $1/3$.</p>

<p>For Sample Input 2, let us consider the probability of the leftmost card to remain in the end. To make this happen, the first number the die shows up should not be one. After getting a number other than one, six cards will remain. Each of these six cards will remain in the end with the same probability. From this observation, the probability of the leftmost card to remain in the end is computed as $(5/6) \times (1/6) = 5/36$. The same argument holds for the rightmost card. As for the rest of the cards, the probabilities are equal, and they are $(1 - 2 \times 5/36)/5 = 13/90$.</p>