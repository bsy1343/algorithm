# [Silver III] Scribble - 6897

[문제 링크](https://www.acmicpc.net/problem/6897)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 26, 정답: 12, 맞힌 사람: 12, 정답 비율: 48.000%

### 분류

구현

### 문제 설명

<p><em>Nixed, he placed the flong into the calathi halfway through the yuga.</em></p>

<p>Huh?</p>

<p>Believe it or not, the above sentence is actually a valid English sentence. It also has two other features: it looks like spam, and the words are very valuable.</p>

<p>Valuable, you say? (For some reason, you are doing lots of talking to yourself today).</p>

<p>Yes, valuable, if you are playing Scribble. In the standard game of Scribble, calathi (which means &quot;a vase-shaped basket represented in Greek painting and sculpture&quot;) is worth $72$ points, nixed (meaning &quot;refused&quot;) is worth $26$ points, flong (which is &quot;a compressed mass of paper sheets, forming a matrix or mold for stereotype plates&quot;) is worth $18$ points, and yuga which is &quot;any one of the four ages, Krita, or Satya, Treta, Dwapara, and Kali, into which the Hindus divide the duration or existence of the world&quot; is worth $33$ points.</p>

<p>Specifically, as you may know, each letter in Scribble is worth a given number of points. The goal is to get the most points with a given set of letters.</p>

<p>For this question, we will modify the game slightly. Suppose you have $7$ tiles/letters and you have scores for each letter (where the score $s_\alpha$ for each letter $\alpha$ satisfies $0 \le s_\alpha \le 26$), and also you have a dictionary of valid words that you can consult before you play (this is different than the &quot;normal&quot; Scribble play). Your task is to find the highest scoring word.</p>

### 입력

<p>You are given a number $k$ $(1 \le k \le 7)$ on the first line of input. On the next $k$ lines, you will be given triples $\alpha\ s_\alpha\ r_\alpha$, where $\alpha$ is a letter, $s_\alpha$ is the score for that letter, and $r_\alpha$ is the number of times that letter occurs as a tile. You can assume that $$\displaystyle \sum_\alpha r_\alpha=7.$$ For example, the triple <code>a 7 2</code> means you have two tiles marked <code>a</code> and each is worth $7$ points. On the next (the $k + 2$nd) line, there is the number $N$ $(0 \le N \le 100\,000)$. On each of the next $N$ lines, there is a word (you can assume the length of each word is at least one).</p>

### 출력

<p>The output is one line long, containing one integer, which is the maximum score. That is, the maximum number of points that can be attained by using the tiles to form one complete word. If no word can be formed, the maximum number of points is zero.</p>