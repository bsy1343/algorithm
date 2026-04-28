# [Gold II] Restaurant Orders - 11192

[문제 링크](https://www.acmicpc.net/problem/11192)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 256 MB

### 통계

제출: 38, 정답: 18, 맞힌 사람: 17, 정답 비율: 50.000%

### 분류

다이나믹 프로그래밍

### 문제 설명

<p>A friend of yours who is working as a waiter has a problem. A group of xkcd-fans have started to come to the restaurant and order food as in the comic strip below. Each order takes him a lot of time to figure out, but maybe you can help him.</p>

<p style="text-align:center"><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/11192.%E2%80%85Restaurant%E2%80%85Orders/0a0878e1.png" data-original-src="https://imgs.xkcd.com/comics/np_complete.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:414px; width:640px" /></p>

<p style="text-align:center">Figure G.1: Comic strip <a href="https://xkcd.com/287">xkcd.com/287</a>.</p>

<p>You are to write a program that finds out what was ordered given the total cost of the order and the cost of each item on the menu.</p>

### 입력

<p>The input starts with a line containing one integer n (1 &le; n &le; 100), the number of items on the menu. The next line contains n space-separated positive integers c<sub>1</sub>, c<sub>2</sub>, . . . , c<sub>n</sub>, denoting the cost of each item on the menu in Swedish kronor. No item costs more than 1 000 SEK.</p>

<p>This is followed by a line containing m (1 &le; m &le; 1 000), the number of orders placed, and a line with m orders. Each order is given as an integer s (1 &le; s &le; 30 000), the total cost of all ordered items in SEK.</p>

### 출력

<p>For each order in the input output one line as follows. If there is one unique order giving the specified total cost, output a space-separated list of the numbers of the items on that order in ascending order. If the order contains more than one of the same item, print the corresponding number the appropriate number of times. The first item on the menu has number 1, the second 2, and so on.</p>

<p>If there doesn&rsquo;t exist an order that gives the specified sum, output Impossible. If there are more than one order that gives the specified sum, output Ambiguous.</p>