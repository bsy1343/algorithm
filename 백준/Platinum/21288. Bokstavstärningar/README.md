# [Platinum IV] Bokstavstärningar - 21288

[문제 링크](https://www.acmicpc.net/problem/21288)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 38, 정답: 35, 맞힌 사람: 31, 정답 비율: 96.875%

### 분류

비트마스킹, 이분 매칭

### 문제 설명

<p>Klara has $N$ dices with letters written on them. Each die has a letter on each of its $K$ sides. By throwing the dice and rearranging them in some arbitrary order, you can make construct a word with $N$ letters.</p>

<p>Write a program to count the number of valid words that can be constructed using Klara&#39;s dice. You will get a wordlist, that contains all the $M$ valid $N$-letter words.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/21288.%E2%80%85Bokstavst%C3%A4rningar/ab8e0a8f.png" data-original-src="https://upload.acmicpc.net/6fc7a973-f97c-43b6-9c68-ca7c9e1e658f/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 322px; height: 265px;" /></p>

<p style="text-align: center;">Figure 1:&nbsp;An illustration of the first example. Since $K = 3$, each die has three sides. You can also write <code>STOL</code> and <code>MASK</code>, but not <code>NATT</code> or <code>KOST</code>.</p>

### 입력

<p>The first line of input contains three space-separated integers $N$, $K$ and $M$.</p>

<p>The next $N$ lines each describe a die. Line $i$ will contain $K$ letters, the letters on the sides of the $i$:th die.</p>

<p>Finally, there will be $M$ lines, the valid words. Each line will contain an $N$-letter word.</p>

<p>All words will only capital letters <code>A-Z</code>.</p>

<p>No letter will appear on more than one side of a die.</p>

### 출력

<p>Your program should print a single integer: the number of valid words that can be written.</p>