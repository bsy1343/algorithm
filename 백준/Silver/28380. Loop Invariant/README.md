# [Silver I] Loop Invariant - 28380

[문제 링크](https://www.acmicpc.net/problem/28380)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 136, 정답: 79, 맞힌 사람: 74, 정답 비율: 66.667%

### 분류

문자열, 애드 혹

### 문제 설명

<p>Luna, a historian, was exploring the archives of an old monastery when she stumbled on a mysterious scroll of parchment. On it were only two types of symbols: &#39;<code>(</code>&#39; and &#39;<code>)</code>&#39;. Soon she noticed that the sequence of symbols satisfies an interesting property: It can be constructed by repeatedly inserting &#39;<code>()</code>&#39; at some position into an initially empty sequence. Historians call such sequences <em>balanced</em>. Figure L.1 gives an example of a balanced sequence.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Silver/28380.%E2%80%85Loop%E2%80%85Invariant/378e7c18.png" data-original-src="%EB%B0%B1%EC%A4%80/Silver/28380.%E2%80%85Loop%E2%80%85Invariant/378e7c18.png" data-original-src="https://upload.acmicpc.net/a7000f77-3955-4776-808e-0088db25ed1a/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 450px; height: 20px;" /></p>

<p style="text-align: center;">Figure L.1: Sample Input 2 derived by successively inserting &#39;<code>()</code>&#39; into an initially empty sequence.</p>

<p>The chief librarian of the monastery recently told Luna that some of the more elitist monks in the region had a habit of writing on circular pieces of parchment. In their minds, anyone incapable of immediately telling where the text on such a scroll started was also unworthy of knowing its content. Consequently, Luna quickly inspected the edges of her parchment strip. And sure enough, the edges at the left and right end of the parchment strip fit together perfectly, indicating that the parchment once actually was circular. While holding the left and right edges together and looking at the now circular parchment, she wonders whether the balanced sequence starting at the tear is the only such sequence that could have resulted from tearing the parchment apart. After all, it makes little sense trying to decrypt a text when you do not even know where it starts.</p>

### 입력

<p>The input consists of:</p>

<ul>
	<li>One line with a balanced sequence $s$ ($2\leq |s|\leq 10^6$), the sequence on Luna&#39;s strip of parchment.</li>
</ul>

### 출력

<p>Output &quot;<code>no</code>&quot; if there is no way to obtain a different balanced sequence by cutting the circular sequence, otherwise give any such sequence.</p>