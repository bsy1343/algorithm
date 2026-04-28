# [Platinum III] Doktor - 15324

[문제 링크](https://www.acmicpc.net/problem/15324)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 116, 정답: 55, 맞힌 사람: 41, 정답 비율: 43.158%

### 분류

정렬, 애드 혹, 누적 합

### 문제 설명

<blockquote>
<p>And the Mrs, Ms, says:<br />
&ldquo;I&rsquo;ve been riding horses for fifteen years, and it is impossible to shoe a horse upside down!&rdquo; (...)</p>
</blockquote>

<p>&ldquo;Yes, that&rsquo;s upside down&rdquo; - whispers Domagoj, looking at Mate&rsquo;s hand while playing, for the purposes of this task, a heavily modified version of the card game Hanabi. For the sake of simplicity, Mate is holding N cards in his hands, numbered from 1, 2, &hellip;, N in a certain order. (Each number from 1 to N appears exactly once.) As when playing the real game, he cannot voluntarily change the card order.</p>

<p>Just so the task is at least somewhat related to the story, Domagoj will point for Mate to a contiguous subarray of cards. (He can point to a single card too, but he will point to at least one card.) Mate will then &ldquo;rotate&rdquo; that contiguous subarray and put it back.</p>

<p>(The rotating can be thought of as taking all the cards in the given subarray and rotating all of them for 180 degrees. This means that the first and last card swap places, as well as the second and the second to last card, and so on.)</p>

<p>Like all of us, Domagoj is very fond of fixed points. In other words, cards whose numbers match their position in hand, counting from Domagoj&rsquo;s left side. Therefore, he&rsquo;d like the number of fixed points to be as great as possible after rotating the given subarray.</p>

<p>Help Domagoj find out which contiguous subarray he needs to point out so that the number of fixed points in Mate&rsquo;s hand after rotating that subarray is maximal.</p>

### 입력

<p>The first line of input contains the positive integer N (1 &le; N &le; 500 000), the number of cards in Mate&rsquo;s hand.</p>

<p>The following line contains the numbers on the cards in Mate&rsquo;s hand in the order that Domagoj sees them.</p>

### 출력

<p>You must output a single line containing A and B, the numbers on the cards that are the beginning and the end of the required contiguous subarray, in that order. If there are multiple options, output any of them.</p>

### 힌트

<p>In the first test case, after rotating the contiguous subarray that starts with 3 and ends with 1, the cards will be ordered 1 2 3 4, and now all the cards are fixed points. In this example, the given output is the only correct output.</p>

<p>In the second test case, rotating any subarray consisting of only one card results with the same card order, the one that produces the maximal number of fixed points.</p>