# [Gold III] Closest Pick - 22896

[문제 링크](https://www.acmicpc.net/problem/22896)

### 성능 요약

시간 제한: 10 초 (추가 시간 없음), 메모리 제한: 1024 MB (추가 메모리 없음)

### 통계

제출: 72, 정답: 44, 맞힌 사람: 43, 정답 비율: 60.563%

### 분류

그리디 알고리즘, 수학, 확률론, 정렬

### 문제 설명

<p>You are entering a raffle for a lifetime supply of pancakes. N tickets have already been sold. Each ticket contains a single integer between 1 and K, inclusive. Different tickets are allowed to contain the same integer. You know exactly which numbers are on all of the tickets already sold and would like to maximize your odds of winning by purchasing two tickets (possibly with the same integer on them). You are allowed to choose which integers between 1 and K, inclusive, are on the two tickets.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/22896.%E2%80%85Closest%E2%80%85Pick/8088be40.png" data-original-src="%EB%B0%B1%EC%A4%80/Gold/22896.%E2%80%85Closest%E2%80%85Pick/8088be40.png" data-original-src="https://upload.acmicpc.net/16bff1a3-2ea5-437c-a489-93e882b5958f/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 300px; height: 84px;" /></p>

<p>You know you are the last customer, so after you purchase your tickets, no more tickets will be purchased. Then, an integer c between 1 and K, inclusive, is chosen uniformly at random. If one of your tickets is strictly closer to c than all other tickets or if both of your tickets are the same distance to c and strictly closer than all other tickets, then you win the raffle. Otherwise, you do not win the raffle.</p>

<p>Given the integers on the N tickets purchased so far, what is the maximum probability of winning the raffle you can achieve by choosing the integers on your two tickets optimally?</p>

### 입력

<p>The first line of the input gives the number of test cases, T. T test cases follow. Each test case consists of two lines. The first line of a test case contains two integers N and K: the number of tickets already sold and the limit of the range of integers to pick from, respectively. The second line contains N integers P<sub>1</sub>, P<sub>2</sub>, &hellip;, P<sub>N</sub>, representing the integers on the tickets that have already been purchased.</p>

### 출력

<p>For each test case, output one line containing&nbsp;<code>Case #x:&nbsp;y</code>, where&nbsp;<code>x</code>&nbsp;is the test case number (starting from 1) and&nbsp;<code>y</code>&nbsp;is the maximum win probability you can achieve if you choose your tickets optimally.</p>

<p><code>y</code>&nbsp;will be considered correct if it is within an absolute or relative error of&nbsp;10<sup>&minus;6</sup>&nbsp;of the correct answer.</p>

### 제한

<ul>
	<li>1 &le; T &le; 100.</li>
	<li>1 &le; N &le; 30.</li>
	<li>1 &le; P<sub>i</sub> &le; K, for all i.</li>
</ul>

### 힌트

<p>In Sample Case #1, you can purchase tickets with the integers 4 and 8 on them and then win if 4,5,8,9, or 10 are chosen giving you 5/10=0.5 probability of winning. Purchasing tickets with the integers 6 and 8 on them also yields a 0.5 probability of winning, but no combination yields more.</p>

<p>In Sample Case #2, 6 and 8 is a possible optimal pair of tickets, which wins when c is one of 6,8,9, or 10. Note that the integers on the tickets are not necessarily given in sorted order.</p>

<p>In Sample Case #3, every possible c is at distance 0 from an already purchased ticket, so you cannot win regardless of your choices.</p>

<p>In Sample Case #4, if you pick 3 for at least one of your tickets, you win on c=3, for 1/4=0.25 win probability. There is no way to win when c is any other integer, so that is the best you can do.</p>