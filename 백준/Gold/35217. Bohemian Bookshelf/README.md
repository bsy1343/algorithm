# [Gold I] Bohemian Bookshelf - 35217

[문제 링크](https://www.acmicpc.net/problem/35217)

### 성능 요약

시간 제한: 4 초, 메모리 제한: 2048 MB

### 통계

제출: 14, 정답: 9, 맞힌 사람: 9, 정답 비율: 64.286%

### 분류

다이나믹 프로그래밍

### 문제 설명

<p>When it comes to shelving books, bibliophiles and interior decorators rarely agree: vertical or horizontal---what’s the right way? Ever skeptical of orthodoxy, you embrace both! Your bookshelf displays a composed mix: upright volumes standing with quiet discipline next to a single, neatly arranged stack, like a literary ziggurat. The effect signals bohemian chic with a touch of endearing academic absent-mindedness and just enough polish to suggest you’ve definitely read some of the books.</p>

<p>A book is characterised by its spine height and thickness. It can fit upright if its height does not exceed the bookshelf's height. Alternatively, books can form a stack by being laid flat on their sides on top of each other; for aesthetic reasons the books forming such a stack must be arranged in nonincreasing order of spine height. Their total thickness may not exceed the height of the bookshelf. The total thickness of the upright books and the width of the stack may not exceed the width of the bookshelf.</p>

<p>The books in Sample $1$ can be arranged like this:</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/35217.%E2%80%85Bohemian%E2%80%85Bookshelf/c6ca8e4d.jpg" data-original-src="https://boja.mercury.kr/assets/problem/35217-1.jpg" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 180px; height: 127px;"></p>

### 입력

<p>The input consists of:</p>

<ul>
<li>One line with integers $N$, $H$, $W$ ($2\leq N\leq 100$, $130 \leq H\leq 350$, $300\leq W\leq 900$), the number of books you want to display, the height of the bookshelf in millimeters, and the width of the bookshelf in millimeters,</li>
<li>$N$ lines, one for each book, with two integers $h$, $t$ ($76\leq h\leq 483$, $5\leq t\leq 60$), the book's spine height and thickness in millimeters. On its own, every book fits on the shelf either standing up or on its side, so we also have $h\leq \max(W, H)$.</li>
</ul>

### 출력

<p>Output two lines.</p>

<p>The first line starts with the word "<code>upright</code>", followed by the indices of the upright books. The second line starts with the word "<code>stacked</code>", followed by the indices of the books in the stack, in order from bottom to top. There must be at least one upright book and at least one stacked book. Books are indexed $1$, $\ldots$, $N$.</p>

<p>If there is more than one solution, you may output any one of them. If no such arrangement is possible, print "<code>impossible</code>".</p>