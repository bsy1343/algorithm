# [Gold III] Guessing Circle - 22040

[문제 링크](https://www.acmicpc.net/problem/22040)

### 성능 요약

시간 제한: 6 초 (추가 시간 없음), 메모리 제한: 512 MB

### 통계

제출: 16, 정답: 4, 맞힌 사람: 4, 정답 비율: 44.444%

### 분류

(분류 없음)

### 문제 설명

<p>Alf and Beata were two young adults living together a long, long time ago, before you could spend all your afternoons competing in programming. Their lives were thus much more boring than those of today&#39;s young adults. How could you even survive back then, you might ask yourself. The answer is simple: you write down numbers on pieces of paper! Our two cohabitants loved writing integers on papers, and often had huge piles of them each afternoon. To avoid filling their entire living room with integers, Beata challenged her friend to a game every evening to determine who should take the trash out -- the Guessing Circle game.</p>

<p>The Guessing Circle game is played by two players (in our case, Alf and Beata) using a large circle of $n$ pieces of papers, each paper labelled with some integer. Alf starts by choosing an integer $x$ that appears on some piece of paper. Beata then tries to figure out what this integer is by asking a series of questions. In each question, Beata picks an integer $y$ that appears on a piece of paper and asks if $y$ is closest to $x$ on the circle when going clockwise or counter-clockwise (measured in the number of pieces of paper between them). If both directions give the same distance, for instance if $y = x$, Alf can choose which one of the two possible answers to provide.</p>

<p>They had initially agreed that no two pieces of paper may have the same integer written on them, but Alf found this hugely unfair -- it was quite easy for Beata to figure out $x$. Instead, he suggested a variant where some integers can appear multiple times in the circle. When providing the answer to a question $y$ from Beata, he is instead allowed to choose <em>any</em> pair of papers on which $x$ and $y$ appear, and give his answer for these two papers.</p>

<p>Beata reluctantly agreed to play the new variant, as long as Alf promises to choose an integer in the circle such that Beata can eventually figure it out. Knowing which these integers are turned out to be quite a tricky task for Alf, and he often had to spend hours before the game proving that Beata would be able to deduce which number he had chosen. Write a program to help Alf determine which numbers he can choose.</p>

### 입력

<p>The first line of integers contains $n$ ($2 \le n \le 15\,000$), the number of pieces of paper in the circle. The next line contains $n$ integers, the integers written on the pieces of paper, each between $1$ and $15\,000$. They are given clockwise in the order they appear on the circle, and are not necessarily unique.</p>

### 출력

<p>Output all integers $x$ that Alf can choose in the game such that given enough guesses, Beata can uniquely determine the value of $x$. &nbsp;List these values in increasing order. If there is no such integer $x$, output &quot;<code>none</code>&quot;.</p>