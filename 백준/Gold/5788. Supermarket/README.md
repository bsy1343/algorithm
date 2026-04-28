# [Gold I] Supermarket - 5788

[문제 링크](https://www.acmicpc.net/problem/5788)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 78, 정답: 24, 맞힌 사람: 13, 정답 비율: 25.490%

### 분류

다이나믹 프로그래밍

### 문제 설명

<p>Mr. Jones is an exemplary husband. Every Saturday morning Mrs. Jones gives him a list of goods to be bought from the supermarket and he buys exactly what he has been asked for, always choosing the brands with lowest prices. But Mr. Jones hates going to the supermarket on a Saturday, since its aisles are packed with shoppers. He wants to change the way he does his shopping. Instead of going to and fro to buy the products on his wife&rsquo;s list, he will try to get the goods on the list going through each aisle only once, picking up the products in the exact order given in the list. So he asked you to write a program to help him with his new style of shopping.</p>

<p>Given the information about products available in the supermarket together with their prices in the order in which they appear in Mr. Jones&rsquo; way and the list of products given by his wife, your program must determine the least cost that he would pay.</p>

<p>Mr. Jones buys the products in the order in which they appear in Mrs. Jones&rsquo; list and he never goes back as he walks down the aisles. Therefore, if he buys the i-th product on his way as the j-th item on the list, the next product to be bought is the (j+1)-th item of the list &ndash; and it must be bought from the products that come after i in his path. The figure below shows an example where products are identified by integers. Note that different brands of the same product may appear separately. In the example Mr. Jones must buy products 1,1,2,20 (notice that product 1 appears twice in the list). For the example, the least cost for Mr. Jones following his constraints is 21.30. Notice that with this new way of shopping it may be impossible for Mr. Jones to buy all the goods on Mrs. Jones list; in that case, your program should warn Mr. Jones.</p>

<p><img alt="" src="https://onlinejudgeimages.s3.amazonaws.com/problem/5788/%EC%8A%A4%ED%81%AC%EB%A6%B0%EC%83%B7%202016-06-13%20%EC%98%A4%ED%9B%84%205.25.23.png" style="height:70px; width:50px" /></p>

<p>(a) Mrs.Jones&rsquo;list&nbsp;</p>

<p><img alt="" src="https://onlinejudgeimages.s3.amazonaws.com/problem/5788/%EC%8A%A4%ED%81%AC%EB%A6%B0%EC%83%B7%202016-06-13%20%EC%98%A4%ED%9B%84%205.25.45.png" style="height:62px; width:368px" /></p>

<p>(b) List of products with respective prices, and order they appear on Mr. Jones&rsquo; way down the aisles</p>

### 입력

<p>Your program should process data for several shopping sessions. The first line in the description of a shopping session contains two integers M and N; M indicates the number of items in Mrs. Jones&rsquo; list (1 &le; M &le; 100) and N represents the total number of products available in the supermarket (1 &le; N &le; 100,000). The next line contains M integers X<sub>i</sub> representing the list of products in Mrs. Jones&rsquo; list (1 &le; X<sub>i</sub> &le; 100,000, 1 &le; i &le; M). Then N lines follow, representing the supermarket products in the order in which they appear in Mr. Jones&rsquo; way. Each of those lines contains an integer K and a real P which represent respectively a product identifier and its price (1 &le; K &le; 100,000). The end of input is indicated by M = N = 0.</p>

### 출력

<p>For each shopping session in the input, your program should produce one line of output, containing the least cost that Mr. Jones would pay. If it is not possible to buy all the goods for the session, print the word &lsquo;Impossible&rsquo;. The cost must be printed as a real number with two-digit precision, and the last decimal digit must be rounded. The input will not contain test cases where differences in rounding are significant.</p>