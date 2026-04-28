# [Gold II] Bookshelf Building - 20902

[문제 링크](https://www.acmicpc.net/problem/20902)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 108, 정답: 49, 맞힌 사람: 47, 정답 비율: 46.078%

### 분류

다이나믹 프로그래밍, 배낭 문제

### 문제 설명

<p>Anna just came home from her favourite furniture store <em>Ikey Yeah!</em> where she bought a new bookshelf designed by her favourite artist <em>Bill Lee</em>. The shelf has a rectangular shape with a width of $x$ and a height of $y$. Included in the box of the shelf is one board that Anna may put horizontally inside the shelf. For this purpose the frame of the shelf already contains pre-drilled holes at heights $1,2,\ldots,y-1$. Anna may attach the board to the frame at any of these heights. She can also decide not to install it at all.</p>

<p>Anna owns $n$ books, which all have the same depth. The books&#39; depth matches that of the shelf exactly. However, due to differences in the formats and the numbers of pages, her books may have different widths and heights. Anna does not want to flip her books or stack several of them on top of each other. Instead, she wants to store all of them in an upright fashion inside her bookshelf, such that the width and height of each book are aligned with the width and height of the bookshelf. Help Anna to find the perfect position for the board (or tell her not to use it at all) so that she can store all her books in her new bookshelf.</p>

<p>For this problem you may assume that the frame and the board of the shelf are infinitely thin.</p>

### 입력

<p>The input consists of:</p>

<ul>
	<li>One line with three integers $n$, $x$ and $y$, where&nbsp;
	<ul>
		<li>$n$ ($1 \le n \le 10^4$) is the number of books that Anna owns;</li>
		<li>$x$ ($1 \le x \le 10^4$) is the width of the bookshelf frame;</li>
		<li>$y$ ($1 \le y \le 10^4$) is the height of the bookshelf frame.</li>
	</ul>
	</li>
	<li>$n$ lines, the $i$th of which contains two integers $w_i$ and $h_i$, where
	<ul>
		<li>$w_i$ ($1 \le w_i \le 10^4$) is the width of the $i$th book;</li>
		<li>$h_i$ ($1 \le h_i \le 10^4$) is the height of the $i$th book.</li>
	</ul>
	</li>
</ul>

### 출력

<p>If there is no possibility to store Anna&#39;s books in the shelf, print out <code>impossible</code>. In case Anna decides not to install the board, output $-1$. Otherwise, output the height at which the board should be installed. If there are multiple possible heights, you may output any one of them.</p>