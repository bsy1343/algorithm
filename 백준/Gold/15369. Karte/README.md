# [Gold I] Karte - 15369

[문제 링크](https://www.acmicpc.net/problem/15369)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 76, 정답: 40, 맞힌 사람: 34, 정답 비율: 50.000%

### 분류

해 구성하기, 그리디 알고리즘, 정렬

### 문제 설명

<p>&hellip; Take these cards, I tell ya, my cousin from Sweden sent them when the hunger for war was at its peak, and we stayed playing rummy in the trenches.</p>

<blockquote>
<p>Daniel: &ldquo;Are we playin&rsquo; rummy, eh?&rdquo;</p>

<p>Domagoj: &ldquo;Well ok then.&rdquo;</p>

<p>Daniel: &ldquo;Watch this now. You have a deck of N cards, where the i th card has a claim written on it in the form of &lsquo;At least a<sub>i</sub> cards beneath this one contain a false claim.&rsquo; You have to shuffle them so that exactly K cards contain a false claim.&rdquo;</p>

<p>Domagoj: &ldquo;You destroy me in this game every time, where did you get these cards, son?!&rdquo;</p>

<p>Daniel: &ldquo;Ah, my old man organizes card tournaments, so each day he gives me free cards, ten bucks per deck.&rdquo;</p>
</blockquote>

<p>Your task is to help Domagoj solve Daniel&rsquo;s task. Output the order in which Domagoj must place the cards. It is also possible that this is a bad joke on Daniel&rsquo;s part, and that there is no possible order to place the cards in. In that case, output -1.</p>

### 입력

<p>The first line contains integers N and K (1 &le; N &le; 5&middot;10<sup>5</sup>, 0 &le; K &le; N).</p>

<p>The ith of the following N lines contains an integer a<sub>i</sub> (0 &le; a<sub>i</sub> &le; 5&middot;10<sup>5</sup>).</p>

### 출력

<p>If the required order does not exist, output -1.</p>

<p>Otherwise, in a single line, output N integers separated by spaces, the numbers on the cards in the order from the top to the bottom​ of the deck. If there are multiple solutions, output any.</p>

### 힌트

<p>Clarification of the second test case:</p>

<p>For simplicity&rsquo;s sake, we&rsquo;ll label the cards as true/false, depending on the claims written on them.</p>

<p>Beneath the fifth card there are 0 false cards, so it is false.</p>

<p>Beneath the fourth card there is 1 false card, so it is true.</p>

<p>Beneath the third card there is 1 false card, so it is true.</p>

<p>Beneath the second card there is 1 false card, so it is false.</p>

<p>Beneath the first card there are 2 false cards, so it is false.</p>

<p>Therefore, we have a total of 3 false cards.</p>