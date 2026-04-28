# [Silver II] Complete Naebbirac’s sequence - 15054

[문제 링크](https://www.acmicpc.net/problem/15054)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 150, 정답: 78, 맞힌 사람: 64, 정답 비율: 48.855%

### 분류

구현, 브루트포스 알고리즘, 많은 조건 분기

### 문제 설명

<p>Naebbirac is a young and easy-to-get-bored sailor. He likes sequences of integers and to come up with ways to classify them. Naebbirac says that a sequence is complete for a chosen integer K, if the sequence only contains integers between 1 and K, and each integer between 1 and K appears the same number of times.</p>

<p>Based on that, Naebbirac created a game to entertain himself and his peers, when the waters calm down and there&rsquo;s not much they can do to spend their time in the middle of the ocean.</p>

<p>First he chooses a positive integer K and then he uses chalk to draw on the deck a sequence S having N integers between 1 and K. After that he challenges one of his peers. The goal of the challenged peer is to turn the sequence S into a complete sequence by performing exactly one of the following three possible operations:</p>

<ul>
	<li>&ldquo;-x&rdquo;: remove one occurrence of integer x from S;</li>
	<li>&ldquo;+x&rdquo;: add a new integer with value x in S; or</li>
	<li>&ldquo;-x +y&rdquo;: replace one occurrence of integer x from S by an integer with value y.</li>
</ul>

<p>Naebbirac is quite smart. He never writes a sequence that is already complete and often the written integers don&rsquo;t follow a pattern, making it quite hard to find an operation that solves the puzzle. One of your friends, that usually sails with Naebbirac, is tired of always losing the game. Are you able to help your friend and create a computer program that can find a solution to Naebbirac&rsquo;s game before they go on their next trip?</p>

### 입력

<p>The first line contains two integers K (3 &le; K &le; 1000) and N (1 &le; N &le; 10<sup>4</sup>), indicating respectively the integer that Naebbirac chooses at the beginning of the game, and the length of the sequence written on the deck. The second line contains N integers S<sub>1</sub>, S<sub>2</sub>, . . . , S<sub>N</sub> (1 &le; S<sub>i</sub> &le; K for i = 1, 2, . . . , N) representing the written sequence; you can safely assume that the sequence is not complete.</p>

### 출력

<p>Output a single line with the description of the operation that allows your friend to win the game or an &ldquo;*&rdquo; (asterisk) if there is no way to win. The description of the operation must follow the format shown on the statement, i.e. &ldquo;-x&rdquo;, &ldquo;+x&rdquo; or &ldquo;-x +y&rdquo;.</p>