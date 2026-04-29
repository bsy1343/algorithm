# [Bronze I] Crazy Forks - 34448

[문제 링크](https://www.acmicpc.net/problem/34448)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 2048 MB

### 통계

제출: 107, 정답: 49, 맞힌 사람: 29, 정답 비율: 38.667%

### 분류

구현

### 문제 설명

<p>John runs a shop selling antique silverware. He recently got some great publicity, and now lots of people are bringing in old collections of spoons, knives, and forks. He wants to sort the forks by size, shape, and type, but there are simply too many of them. John decides to use a camera and a computer program to label the forks automatically, but he isn't much of a programmer. John needs <em>your</em> crazy image-processing skills.</p>

<p>You helped Jon set up a camera which is reliably snapping a $50 \times 50$ black-and-white image of each fork. But John needs numerical measurements. Write some code to read in each image, and output the lengths of the handle and each of the tines.</p>

### 입력

<p>Every input is an image of some fork, drawn out with spaces ("<code> </code>") as white pixels and hashes ("<code>#</code>") as black pixels.</p>

<p>Each line of the input is a mix of $s$ ($0 \leq s \leq 50$) white pixels and $h$ ($1 \leq h \leq 50$) black pixels. These lines are the rows of our image.</p>

<p><strong>Note:</strong> The lines may each be less than $50$ characters long, since extra spaces at the end of the line have all been removed. There may also be fewer than $50$ lines of input, since empty rows have all been removed.</p>

<p>Every input starts with $p$ ($1 \leq p \leq 48$) rows showing the handle of the fork. This handle section has $0$ or more white columns and then a black column.</p>

<p>After the end of the handle section, there is a single row of $w$ ($3 \leq w \leq 50$) black pixels, with no white pixels between them.</p>

<p>The remaining $r$ ($1 \leq r \leq 48$) rows show the tines of the fork. There are $t$ ($2 \leq t &lt; w$) tines, each a column of back pixels separated by columns of white pixels. The left-most column will always be a tine. Likewise, the rightmost tine aligns with the right side of the horizontal line above.</p>

### 출력

<p>The output consists of two lines. The first line prints the length in rows, $p$, of the handle.</p>

<p>The second line is a space delineated list of $t$ numbers, each in the range $1 \leq x \leq r$. Each number is the length of a tine in rows, with the numbers ordered left-to-right according to the tines' positions in the input.</p>