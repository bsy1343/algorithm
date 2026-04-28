# [Gold II] String Art - 21626

[문제 링크](https://www.acmicpc.net/problem/21626)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 512 MB

### 통계

제출: 16, 정답: 9, 맞힌 사람: 8, 정답 비율: 53.333%

### 분류

그래프 이론, 그래프 탐색

### 문제 설명

<p>Dan and Sasha are creating and selling pictures in string art technique. A picture in this technique consists of $n$ nails driven into a special board, $m$ pairs of nails are connected by strings. To make the picture look as a whole, you can get from each nail to each other by strings.</p>

<p>Dan and Sasha want to produce string art kits, that would allow their customers to create a picture by themselves according to the instructions. Unfortunately, they found out that if you just send $n$ nails, $m$ strings and the final picture to a customer, many customers can&#39;t do it. So, they decided to sell <em>templates</em> for the pictures.&nbsp;</p>

<p>A template for a picture consists of $m$ strings connecting beads. The strings connect the beads in such way that there is exactly one path along the strings from any bead to any other. Each bead has some color. To get a picture from the template, the customer lays the template down on the board so that the beads of the same color are at one point, and then nails them down. The picture originally conceived by the artists should be the result.</p>

<p>Dan and Sasha have developed a very beautiful picture, and want to make a template for it now. Help them!</p>

### 입력

<p>The first line of input contains two natural numbers $n$ and $m$ ($1 \leq n \leq 10^5$, $1 \leq m \leq 2 \cdot 10^5$) --- number of nails on the picture and number of strings on it.</p>

<p>Each of the following $m$ lines contains two integers $u$ and $v$ each ($1 \leq u, v \leq n$) --- indices of nails connected by the corresponding string. No pair of nails is connected by more than one string and no nail is connected by a string to itself. Each nail can be reached from any other one by strings.&nbsp;</p>

### 출력

<p>Print the description of the picture template.</p>

<p>The first line of output should contain one integer $c$ --- number of beads in the template.</p>

<p>The second line of output should contain $c$ integers $a_1, a_2, \ldots, a_c$ ($1 \leq a_i \leq n$) --- colors of beads, the beads of color $k$ will be nailed to the board with the $k$-th nail of the picture described in the input.</p>

<p>Each of the following $m$ lines should contain two integers, beads connected by the corresponding string. There must be exactly one path from any bead to any other bead along the strings.</p>

<p>If there are several suitable templates, print the description of any of them.</p>