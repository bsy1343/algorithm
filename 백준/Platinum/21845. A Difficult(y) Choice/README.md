# [Platinum II] A Difficult(y) Choice - 21845

[문제 링크](https://www.acmicpc.net/problem/21845)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 512 MB

### 통계

제출: 203, 정답: 38, 맞힌 사람: 27, 정답 비율: 20.930%

### 분류

수학, 애드 혹, 이분 탐색

### 문제 설명

<p>Immortal glory goes to those who win a medal at BOI. As you are keen on being one of them, this is your way to go<sup>*</sup>: training, training, training!</p>

<p>As a first step in your training program, you decided to buy some computer science books. Luckily, your local book store has a special offer with a hefty discount when you buy exactly $K$ books.</p>

<p>Now you are to select the $K$ books to buy from the set of $N$ computer science books (numbered 1 to $N$) offered in the book store. Your key selection factor is difficulty: Each book $i$ has an individual (and fully objective) difficulty $x_i$, and the <em>total difficulty</em> of a set of books is the sum of their individual difficulties. You don&rsquo;t want the selected books to be too easy (then you wouldn&rsquo;t learn enough to win that precious medal) or too difficult (then you wouldn&rsquo;t understand them before the contest starts). To be precise, you want the total difficulty of the selected books to be at least $A$, but not more than $2A$.</p>

<p>Judging the actual difficulty of a book requires you to skim through it, but the store owner won&rsquo;t be happy if you read many books without buying them. She allows you to skim through at most $S$ books. Fortunately, she also tells you that the books are sorted by increasing difficulty.</p>

<p>Write a program that assists you in deciding on which books to skim through, and in the end tells you which books to buy.</p>

<p><sup>*</sup>&nbsp;&ldquo;Is it, really?,&rdquo; says a tiny voice in your head&hellip;</p>

### 입력



### 출력



### 제한

<ul>
	<li>$K \le N$</li>
	<li>$3 \le N, S \le 10^5$</li>
	<li>$1 \le A, x_i &le; 10^{17}$</li>
	<li>$3 \le 𝐾 \le 10$</li>
</ul>