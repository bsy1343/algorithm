# [Platinum III] Imagine - 5450

[문제 링크](https://www.acmicpc.net/problem/5450)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 256 MB

### 통계

제출: 28, 정답: 15, 맞힌 사람: 13, 정답 비율: 54.167%

### 분류

자료 구조, 다차원 세그먼트 트리, 세그먼트 트리

### 문제 설명

<p>In some imaginary city made up especially for this problem, there are two fictional political parties that were named A and B (because these names are conveniently short and also nobody really cared).</p>

<p>In the centre of this non-existent city you are supposed to imagine a large billboard of 10.24 metres in width and 10.24 metres in height, essentially a 1024 &times; 1024 grid of square centimetres. Every now and then a political activist comes around and puts a 1cm &times; 1cm sticker with either an A or a B, depending on his or her assumed political orientation, on the grid. Any sticker that was put on that particular position before, no matter from which of the parties, becomes invisible. This might all sound a wee bit unrealistic, but you need to keep in mind that it is in fact not real. It is just for the problem.</p>

<p>Now, for some obscure reason, that could have been totally justified had someone put a bit more effort into writing this assignment, a list is maintained with the exact location and denomination of every single sticker that was put up, in chronological order.</p>

<p>At any moment one might wonder how many A&rsquo;s and B&rsquo;s there currently are within some subrectangle of the grid. Such question may come up, for example, when someone looks at the billboard from a large distance, with a rectangular telescope. You will find such queries in the input, mixed with the information about when what kind of sticker was put where, all in chronological order. Can you write a program that can handle such queries quickly?</p>

<p>You may assume that the grid has been initialized like a checker board with an A in the top left corner at x = y = 1, hence in the following way:</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/5450.%E2%80%85Imagine/4fe0aa7f.png" data-original-src="%EB%B0%B1%EC%A4%80/Platinum/5450.%E2%80%85Imagine/4fe0aa7f.png" data-original-src="https://www.acmicpc.net/upload/images2/imagine.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:112px; width:193px" /></p>

### 입력

<p>The input consists of a single test case, which has the following format:</p>

<ul>
	<li>One line with an integer N, satisfying 1 &le; N &le; 1, 000, 000: the total number of stickers and queries in the input.</li>
	<li>N lines, each of which is formatted as one of two alternatives:
	<ul>
		<li>A line starting with the character &rsquo;A&rsquo; or &rsquo;B&rsquo; followed by two integers x and y, satisfying 1 &le; x,y &le; 1024, denoting a sticker which is put on the grid.</li>
		<li>A line with the character &rsquo;R&rsquo; followed by four integers x1, y1, x2 and y2, satisfying 1 &le; x1 &le; x2 &le; 1024 and 1 &le; y1 &le; y2 &le; 1024, denoting the top left and bottom right coordinates of a queried subrectangle.</li>
	</ul>
	</li>
</ul>

<p>Alphabetic characters and integers on the same line are separated by single spaces. You can make no assumptions about the way the stickers and queries are interleaved in the input.</p>

### 출력

<p>For every query in the input, the output should contain two numbers, on a single line: the numbers of A&rsquo;s and B&rsquo;s in the queried subrectangle at the moment of the query, separated by a single space.</p>